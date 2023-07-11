package gov.va.vinci.listeners;

/*
 * #%L
 * arthro
 * %%
 * Copyright (C) 2010 - 2015 Department of Veterans Affairs
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

import gov.va.vinci.leo.listener.BaseCsvListener;
import gov.va.vinci.leo.listener.SimpleCsvListener;
import gov.va.vinci.leo.tools.LeoUtils;
import org.apache.log4j.Logger;
import org.apache.uima.cas.*;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class BasicCsvListener extends BaseCsvListener {

  private static final Logger log = Logger.getLogger(LeoUtils.getRuntimeClass().toString());
  protected ArrayList<ArrayList<String>> fieldList;

  protected HashMap<String, Integer> fields = new HashMap<String, Integer>();
  protected ArrayList<String> headers = new ArrayList<String>();


  public BasicCsvListener(File outputFile, boolean includeHeaders, ArrayList<ArrayList<String>> fieldList, String... typeName) throws IOException {
    super(outputFile);
    this.fieldList = fieldList;
    setHeaders(fieldList);
    if (typeName != null) this.setInputType(typeName);
  }

  @Override
  protected List<String[]> getRows(CAS aCas) {

    List<String[]> rowList = new ArrayList<String[]>();
    int instanceId = 0;
    try {
      JCas aJCas = aCas.getJCas();

      // EchoExtractor has three potential output types -- Relation1, Relation2, and Relation3
      // In most cases only Relation1 is needed, but others are possible
      for (String incomingType : this.inputType) {

        org.apache.uima.cas.Type inputType = aJCas.getTypeSystem().getType(incomingType);
        Iterator<Annotation> lit = aJCas.getAnnotationIndex(inputType).iterator();
        // Make sure that at least one output annotation exists before creating a row
        if (lit.hasNext()) {


          HashMap<String, String> documentInfo = new HashMap<String, String>();
          // Step 1: set initial values to documentInfo attributes
          documentInfo.put("DocID", docInfo.getID());

          if (docInfo.getRowData() != null) {
            for (ArrayList<String> headerInfo : this.fieldList) {
              int index = -1;
              try {
                index = Integer.parseInt(headerInfo.get(1));
              } catch (Exception e) {
                // Nothing
              }
              if (index >= 0)
                documentInfo.put(headerInfo.get(0), docInfo.getRowData(index));
            }
          }
          while (lit.hasNext()) {
            instanceId++;
            HashMap<String, String> instanceData = new HashMap<String, String>();
            // Step 2. add all other values from the Logic
            // TODO: get fields from ListenerLogic
            instanceData.putAll(ListenerLogic.getInstanceData(aJCas, lit.next()));
            if (instanceData.size() > 0) {
              instanceData.put("InstanceID", "" + instanceId);
              instanceData.putAll(documentInfo);

              // Step 3: Convert from HashMap of fields for each instance to an array
              // add a new instance to the rowList for output
              Object[] tempArray = ListenerLogic.convertFromMapToArray(instanceData, this.fieldList);
              ArrayList<String> row = new ArrayList<String>();
              for (Object a : tempArray) {
                row.add((String) a);
              }
              rowList.add((String[]) row.toArray(new String[0] ));
            }
          } // end while
        }// end if type exists
      }// end for type
    } catch (org.apache.uima.cas.CASException e) {
      e.printStackTrace();
    }
    return rowList;
  }

  /**
   @param fieldList
   */
  protected void setHeaders(ArrayList<ArrayList<String>> fieldList) {
    fields = new HashMap<String, Integer>();
    for (ArrayList<String> entry : fieldList) {
      headers.add(entry.get(0));
      fields.put(entry.get(0), Integer.parseInt(entry.get(1)));
    }
  }

  @Override
  protected String[] getHeaders() {
    return headers.toArray(new String[headers.size()]);
  }

}