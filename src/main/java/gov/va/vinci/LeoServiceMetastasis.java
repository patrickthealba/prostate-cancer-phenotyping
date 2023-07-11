package gov.va.vinci;

/*
 * #%L
 * NLP Leo demonstation
 * %%
 * Copyright (C) 2010 - 2016 Department of Veterans Affairs
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import gov.va.vinci.leo.descriptors.LeoAEDescriptor;
import gov.va.vinci.leo.descriptors.LeoTypeSystemDescription;
import gov.va.vinci.leo.tools.LeoUtils;
import gov.va.vinci.pipeline.BasePipeline;
import groovy.util.ConfigObject;
import groovy.util.ConfigSlurper;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.util.HashMap;

public class LeoServiceMetastasis {

    private static final Logger log = Logger.getLogger(LeoUtils.getRuntimeClass().toString());

    @Option(name = "-serviceConfigFile", usage = "The groovy config file that defines the service properties. (only ONE allowed).", required = true)
    File[] serviceConfigFile;

    @Option(name = "-pipeline", usage = "Select pipeline.", required = false)
    String[] pipeline;

    int numberOfInstances = 1;
    boolean isAsync = false;
    boolean createTypes = false;
    HashMap<String, Object> serviceArgs;

    public LeoServiceMetastasis() {
        serviceArgs = new HashMap<String, Object>();
    }

    /**
     * @param args
     */

    public static void main(String[] args) {
        LeoServiceMetastasis current_service = new LeoServiceMetastasis();

        if (args.length == 0) {
            current_service.serviceConfigFile = new File[]{new File("config/ServiceConfig.groovy")};
            current_service.pipeline = new String[]{"gov.va.vinci.pipeline.Metastasis_Pipeline"};

        } else {

            CmdLineParser parser = new CmdLineParser(current_service);
            try {
                parser.parseArgument(args);
            } catch (CmdLineException e) {
                printUsage();
                System.exit(1);
            }
        }
        current_service.run();
    }

    public static void printUsage() {
        CmdLineParser parser = new CmdLineParser(new LeoServiceMetastasis());
        System.out.print("Usage: java " + LeoServiceMetastasis.class.getCanonicalName());
        parser.printSingleLineUsage(System.out);
        System.out.println();
        parser.printUsage(System.out);

    }

    public void run() {
        log.info(" \r\n \r\n ===  Starting Service " + LeoUtils.getTimestampDateDotTime() + " ====\r\n  ");

        gov.va.vinci.leo.Service service = null;

        try {
            service = new gov.va.vinci.leo.Service();
            setServerProperties(service);
            deleteFilesFromDescriptorDirectory(service);

            LeoAEDescriptor aggregate = new LeoAEDescriptor();
            LeoTypeSystemDescription types = new LeoTypeSystemDescription();

            /** Create an aggregate of the components. */
            for (String line : pipeline) {
                Class pipe = Class.forName(line);

                // BasePipeline pipeInstance = (BasePipeline) pipe.newInstance();
                Constructor<?> constructor = pipe.getConstructor(HashMap.class);
                BasePipeline pipeInstance = (BasePipeline) constructor.newInstance(serviceArgs);
                System.out.println("Adding pipeline: " + pipeInstance.getClass().getCanonicalName());
                aggregate.addDelegate(pipeInstance.getPipeline());

      /* create type system */
                types.addTypeSystemDescription(pipeInstance.getLeoTypeSystemDescription());
            }
            if (createTypes) {
                types.jCasGen("src/main/java/", "target/classes");
            }

            aggregate.setIsAsync(isAsync);
            aggregate.setNumberOfInstances(numberOfInstances);
            aggregate.setName("Basic_Leo_Service");
            service.setServiceName("LeoServiceStage");

      /* Deploy the service. */
            service.deploy(aggregate);

            System.out.println("Deployment: " + service.getDeploymentDescriptorFile());
            System.out.println("Aggregate: " + service.getAggregateDescriptorFile());

            System.out.println("Service running, press enter in this console to stop.");
            System.in.read();
            System.exit(0);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * Use this method with caution. It deletes ALL .xml files in the directory. Make sure you do not point to a wrong directory!!!
     *
     * @param service
     */
    private void deleteFilesFromDescriptorDirectory(gov.va.vinci.leo.Service service) {
        if (StringUtils.isNotBlank(service.getDescriptorDirectory())) {
            if (!(new File(service.getDescriptorDirectory()).exists())) {
                (new File(service.getDescriptorDirectory())).mkdirs();
            }
            if (!service.isDeleteOnExit()) {
                File files[] = new File(service.getDescriptorDirectory()).listFiles();
                if (files != null) {
                    for (int index = 0; index < files.length; index++) {
                        if ((files[index]).isFile() && (files[index]).getName().endsWith(".xml")) {
                            String path = (files[index]).getAbsolutePath();
                            if ((files[index]).delete()) {
                                System.out.println("Deleted : " + path);
                            } else {
                                System.out.println("Failed to delete : " + path);
                            }
                        }
                    }
                }
            }
        }
    }


    /**
     * Loading properties from configuration file
     *
     * @param leoServer
     * @return
     * @throws MalformedURLException
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    protected gov.va.vinci.leo.Service setServerProperties(gov.va.vinci.leo.Service leoServer) throws MalformedURLException,
            InvocationTargetException, IllegalAccessException {
        if (serviceConfigFile.length != 1) {
            return leoServer;
        }

        ConfigSlurper configSlurper = new ConfigSlurper();
        ConfigObject o = configSlurper.parse(serviceConfigFile[0].toURI().toURL());
        for (Object key : o.keySet()) {
            serviceArgs.put((String) key, o.get(key));
        }
        /** Not fixed yet in the latest Leo 2017.03.0
         Set<Map.Entry> entries = o.entrySet();
         for (Map.Entry e : entries) {
         System.out.println("Setting property " + e.getKey() + " on service to " + e.getValue() + ".");
         BeanUtils.setProperty(leoServer, e.getKey().toString(), e.getValue());
         }
         /**/

        if (o.keySet().contains("brokerURL"))
            leoServer.setBrokerURL(o.get("brokerURL").toString());

        if (o.keySet().contains("endpoint"))
            leoServer.setEndpoint(o.get("endpoint").toString());

        if (o.keySet().contains("deleteOnExit"))
            leoServer.setDeleteOnExit(Boolean.parseBoolean(o.get("deleteOnExit").toString()));

        if (o.keySet().contains("descriptorDirectory"))
            leoServer.setDescriptorDirectory(o.get("descriptorDirectory").toString());

        if (o.keySet().contains("casPoolSize"))
            leoServer.setCasPoolSize(Integer.parseInt(o.get("casPoolSize").toString()));

        if (o.keySet().contains("CCTimeout"))
            leoServer.setCCTimeout(Integer.parseInt(o.get("CCTimeout").toString()));

        if (o.keySet().contains("jamQueryIntervalInSeconds"))
            leoServer.setJamQueryIntervalInSeconds(Integer.parseInt(o.get("jamQueryIntervalInSeconds").toString()));

        if (o.keySet().contains("jamResetStatisticsAfterQuery"))
            leoServer.setJamResetStatisticsAfterQuery(Boolean.parseBoolean(o.get("jamResetStatisticsAfterQuery").toString()));

        if (o.keySet().contains("jamServerBaseUrl"))
            leoServer.setJamServerBaseUrl(o.get("jamServerBaseUrl").toString());

        if (o.keySet().contains("instanceNumber"))
            numberOfInstances = Integer.parseInt(o.get("instanceNumber").toString());

        if (o.keySet().contains("isAsync"))
            isAsync = Boolean.parseBoolean(o.get("isAsync").toString());


        if (o.keySet().contains("createTypes"))
            createTypes = Boolean.parseBoolean(o.get("createTypes").toString());

        return leoServer;
    }
}

