package gov.va.vinci.pipeline;

/*
 * #%L
 * CADR (Colonoscopy adenoma detection rate)	System
 * %%
 * Copyright (C) 2010 - 2016 VDepartment of Veterans Affairs
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
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

import java.util.HashMap;
import java.util.Properties;

public abstract class BasePipeline {
  protected LeoAEDescriptor pipeline = null;
  protected LeoTypeSystemDescription description = null;


  public BasePipeline(HashMap argsMap) throws NoSuchMethodException {
    super();
    System.out.println(this.getClass().getName());
    this.getClass().getConstructor(HashMap.class);
  }

  public BasePipeline() {

  }


  public LeoTypeSystemDescription getLeoTypeSystemDescription() throws Exception {
    if (description == null) {
      return defineTypeSystem();
    } else
      return description;
  }


  public LeoAEDescriptor getPipeline() {
    return pipeline;
  }

  protected abstract LeoTypeSystemDescription defineTypeSystem() throws Exception;
}
