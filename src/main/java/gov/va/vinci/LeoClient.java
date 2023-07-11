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

import gov.va.vinci.leo.Client;
import gov.va.vinci.leo.cr.BaseLeoCollectionReader;
import gov.va.vinci.leo.tools.JamService;
import groovy.util.ConfigObject;
import groovy.util.ConfigSlurper;
import org.apache.commons.lang3.time.StopWatch;
import org.apache.uima.aae.client.UimaAsBaseCallbackListener;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

/**
 * An example UIMA AS Client that takes command line arguments for its configuration.
 */
public class LeoClient {
  
  //new File("config/ClientConfig.groovy")
  public static final org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(gov.va.vinci.leo.tools.LeoUtils.getRuntimeClass().toString());
  // INFO: change the trainingModel path before running a process
  public static String trainingModel_FilePath = "";
  
  //new File("config/ClientConfig.groovy")
  @Option(name = "-clientConfigFile", usage = "The groovy config file that defines the client properties. (only ONE allowed).", required = true)
  File[] clientConfigFile;
  
  //new File("config/readers/FileCollectionReaderConfig.groovyample.groovy")
  @Option(name = "-readerConfigFile", usage = "The groovy config file that defines the reader (only ONE readerConfigFile allowed).", required = true)
  File[] readerConfigFile;
  
  // new File("config/listeners/SimpleXmiListenerener.groovy"),
  // new File("config/listeners/SimpleCsvListenerConfig.groovy.groovy")
  @Option(name = "-listenerConfigFile", usage = "The groovy config file that defines the listeners (one required, but can specify more than one).", required = true)
  File[] listenerConfigFileList;
  
  /**
   @param args
   */
  public static void main(String[] args) throws CmdLineException {
    if (args.length < 3) {
      
      runClient_withBasicConfigs();
      // runClient_withDbsConfigs();
    } else {
      LeoClient bean = new LeoClient();
      CmdLineParser parser = new CmdLineParser(bean);
      try {
        parser.parseArgument(args);
      } catch (CmdLineException e) {

        printUsage();
        System.exit(1);
      }
      bean.runClient();
    }
  }
  
  public LeoClient() {
    
  }
  
  public static void runClient_withBasicConfigs() {
    LeoClient myLeoClient = new LeoClient(new File("config/ClientConfig.groovy"),
        new File("config/readers/FileCollectionReaderConfig.groovy"
        ),
        new File[]{
            new File("config/listeners/SimpleXmiListenerConfig.groovy"),
            new File("config/listeners/CsvListenerConfig.groovy")
          
        });
    myLeoClient.runClient();
  }
  
  public static void runClient_withDbsConfigs() {
    LeoClient myLeoClient = new LeoClient(new File("config/ClientConfig.groovy"),
        new File("config/readers/BatchDatabaseCollectionReaderConfig.groovy"
        ),
        new File[]{
            new File("config/listeners/GleasonDatabaseListenerConfig.groovy.groovy")
          
        });
    myLeoClient.runClient();
  }
  
  
  public LeoClient(File clientConfigFile, File readerConfig, File[] listenerConfigFiles) {
    readerConfigFile = new File[]{readerConfig};
    listenerConfigFileList = listenerConfigFiles;
    this.clientConfigFile = new File[]{clientConfigFile};
  }
  
  /**
   Parse the groovy config files, and return the listeners objects that are defined in them.
   
   @param configs the groovy config files to slurp
   @return the list of listeners that are defined in the groovy configs.
   @throws MalformedURLException
   */
  public List<UimaAsBaseCallbackListener> getListeners(File... configs) throws MalformedURLException {
    ConfigSlurper configSlurper = new ConfigSlurper();
    List<UimaAsBaseCallbackListener> listeners = new ArrayList<UimaAsBaseCallbackListener>();
    
    for (File config : configs) {
      ConfigObject configObject = configSlurper.parse(config.toURI().toURL());
      if (configObject.get("listener") != null) {
        listeners.add((UimaAsBaseCallbackListener) configObject.get("listener"));
      }
    }
    
    return listeners;
  }
  
  /**
   Parse the groovy config file, and return the reader object. This must be a BaseLeoCollectionReader.
   
   @param config the groovy config file to slurp
   @return the reader defined in the groovy config.
   @throws MalformedURLException
   */
  public static BaseLeoCollectionReader getReader(File config) throws MalformedURLException {
    ConfigSlurper configSlurper = new ConfigSlurper();
    
    ConfigObject configObject = configSlurper.parse(config.toURI().toURL());
    if (configObject.get("reader") != null) {
      return (BaseLeoCollectionReader) configObject.get("reader");
    }
    return null;
  }
  
  public static void printUsage() {
    CmdLineParser parser = new CmdLineParser(new LeoClient());
    System.out.print("Usage: java " + LeoClient.class.getCanonicalName());
    parser.printSingleLineUsage(System.out);
    System.out.println();
    parser.printUsage(System.out);
    
  }
  
  protected gov.va.vinci.leo.Client setClientProperties(gov.va.vinci.leo.Client leoClient) throws MalformedURLException, InvocationTargetException, IllegalAccessException {
    if (clientConfigFile.length != 1) {
      return leoClient;
    }
    
    ConfigSlurper configSlurper = new ConfigSlurper();
    ConfigObject o = configSlurper.parse(clientConfigFile[0].toURI().toURL());
    
    if (o.keySet().contains("brokerURL"))
      leoClient.setBrokerURL((String) o.get("brokerURL").toString());
    
    if (o.keySet().contains("endpoint"))
      leoClient.setEndpoint(o.get("endpoint").toString());
    
    if (o.keySet().contains("casPoolSize"))
      leoClient.setCasPoolSize(Integer.parseInt(o.get("casPoolSize").toString()));
    
    return leoClient;
  }
  
  /**
   Actual run method that configures and runs the client.
   */
  public void runClient() {
    try {
      
      if (readerConfigFile.length > 1 || clientConfigFile.length > 1) {
        printUsage();
        return;
      }
      /**
       * These point to whichever readers/listeners configurations are needed in this particular client.
       * There can be many listeners, but only one reader.
       */
      List<UimaAsBaseCallbackListener> listeners = getListeners(listenerConfigFileList);
      BaseLeoCollectionReader reader = getReader(readerConfigFile[0]);
      
      /**
       * Create the client.
       */
      gov.va.vinci.leo.Client myClient = new gov.va.vinci.leo.Client();
      setClientProperties(myClient);
      
      System.out.println("Broker URL: " + myClient.getBrokerURL() + "    Endpoint name: " + myClient.getEndpoint());
      StopWatch stopWatch = new StopWatch();
      stopWatch.start();
      /**
       * Add the listeners from the groovy config.
       */
      
      // INFO: If one of the listeners is a LearningListener - add code to the client
      for (UimaAsBaseCallbackListener listener : listeners) {
        /**/
        
        myClient.addUABListener(listener);
      }
      
      /**
       * Run the client with the collection reader.
       */
      myClient.run(reader);
      /**/
         /**/
      
      System.out.println("Client finished in: " + stopWatch.getTime() + "ms.");
      log.info("Client finished in: " + stopWatch.toString() + ".");
      
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
