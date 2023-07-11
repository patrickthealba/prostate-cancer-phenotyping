package gov.va.vinci.pipeline;

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
import gov.va.vinci.TypeSystem;
import gov.va.vinci.ae.MetastasisLogic;
import gov.va.vinci.leo.annotationpattern.ae.AnnotationPatternAnnotator;
import gov.va.vinci.leo.context.ae.ContextAnnotator;
import gov.va.vinci.leo.descriptors.LeoAEDescriptor;
import gov.va.vinci.leo.descriptors.LeoTypeSystemDescription;
import gov.va.vinci.leo.filter.ae.FilterAnnotator;
import gov.va.vinci.leo.merger.ae.MergeAnnotator;
import gov.va.vinci.leo.regex.ae.RegexAnnotator;
import gov.va.vinci.leo.sentence.ae.AnchoredSentenceAnnotator;

import java.util.ArrayList;
import java.util.HashMap;


public class Metastasis_Pipeline extends BasePipeline {
    //mPCa Types
    private  String TYPE_METASTASIS_TERM = "gov.va.vinci.types.Metastasis_Term";
    private  String TYPE_METASTASIS_MIDDLE = "gov.va.vinci.types.Metastasis_Middle";
    private  String TYPE_METASTASIS_MODIFIER = "gov.va.vinci.types.Metastasis_Modifier";
    private  String TYPE_METASTASIS_HORMONE_TERM = "gov.va.vinci.types.Metastasis_Hormone_Term";
    private  String TYPE_METASTASIS_ANATOMY = "gov.va.vinci.types.Metastasis_Anatomy";
    private  String TYPE_METASTASIS_HORMONE_MODIFIER = "gov.va.vinci.types.Metastasis_Hormone_Modifier";
    private  String TYPE_METASTASIS_DEPTH = "gov.va.vinci.types.Metastasis_Depth";
    private  String TYPE_METASTASIS_DISEASE = "gov.va.vinci.types.Metastasis_Disease";
    private String TYPE_METASTASIS_PATTERN = "gov.va.vinci.types.Metastasis_Pattern";
    private String TYPE_METASTASIS_MEDICATION_PATTERN = "gov.va.vinci.types.Metastasis_Medication_Pattern";
    private String TYPE_METASTASIS_NEGATION_PATTERN = "gov.va.vinci.types.Metastasis_Negation_Pattern";
    private String TYPE_METASTASIS_HORMONE_PATTERN = "gov.va.vinci.types.Metastasis_Hormone";
    //LEO Types
    private String TYPE_CONTEXT = "gov.va.vinci.leo.context.types.TermContext";
    private String SENTENCE_TYPE = "gov.va.vinci.leo.sentence.types.AnchoredSentence";
    private String RESOURCE_CONTEXT = "contextRules.txt";
    private String TYPE_WINDOW_FEATURE = "Anchor";
    //Resource Files
    private String RESOURCE_PATH = "src/main/java/resources/";
    private String RESOURCE_METASTASIS = "Metastasis_Terms.groovy";
    private String RESOURCE_EXCLUDE = "Exclude.groovy";
    private String RESOURCE_METASTASIS_PATTERN = "Metastasis_Pattern.pattern";
    private String RESOURCE_METASTASIS_MEDICATION_PATTERN = "Metastasis_Medication_Pattern.pattern";
    private String RESOURCE_METASTASIS_NEGATION_PATTERN = "Metastasis_Negation_Pattern.pattern";
    private String RESOURCE_METASTASIS_HORMONE_PATTERN = "Metastasis_Hormone_Pattern.pattern";
    /**
     * Constructor
     *
     * @throws Exception
     */
    public Metastasis_Pipeline(HashMap args) throws Exception {
    /* List for holding our annotators. This list, and the order of the list created the annotator pipeline. */
        ArrayList<LeoAEDescriptor> annotators = new ArrayList<LeoAEDescriptor>();


    //1. Regex annotation
        annotators.add(new RegexAnnotator()
                .setGroovyConfigFile(RESOURCE_PATH + RESOURCE_METASTASIS) //Gleason Score Terms
                .setName("Metastasis Regex")
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));
        annotators.add(new RegexAnnotator()
                .setGroovyConfigFile(RESOURCE_PATH + RESOURCE_EXCLUDE) //Gleason Score Terms
                .setName("Exclusion Regex")
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));
        annotators.add(new MergeAnnotator()
                .setTypesToMerge(new String[]{TYPE_METASTASIS_TERM})
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));
      //2. Merge overlapped annotations
        annotators.add(new MergeAnnotator()
                .setTypesToMerge(new String[]{TYPE_METASTASIS_ANATOMY})
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));
        annotators.add(new MergeAnnotator()
                .setTypesToMerge(new String[]{TYPE_METASTASIS_DEPTH})
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));
        annotators.add(new MergeAnnotator()
                .setTypesToMerge(new String[]{TYPE_METASTASIS_MODIFIER})
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));
        annotators.add(new MergeAnnotator()
                .setTypesToMerge(new String[]{TYPE_METASTASIS_HORMONE_TERM})
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));
        annotators.add(new MergeAnnotator()
                .setTypesToMerge(new String[]{TYPE_METASTASIS_HORMONE_MODIFIER})
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));
        annotators.add(new MergeAnnotator()
                .setTypesToMerge(new String[]{TYPE_METASTASIS_DISEASE})
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));
        annotators.add(new MergeAnnotator()
                .setTypesToMerge(new String[]{TYPE_METASTASIS_MIDDLE})
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));
        //3. mPCa component patterns
        //an mPCa pattern is made up of several smaller component patterns
        //Hormone patterns, a component of metastasis patterns
        annotators.add(new AnnotationPatternAnnotator()
                .setResource(RESOURCE_PATH + RESOURCE_METASTASIS_HORMONE_PATTERN)
                .setOutputType(TYPE_METASTASIS_HORMONE_PATTERN)
                .getLeoAEDescriptor().setName("Metastasis Pattern Annotator")
                .setTypeSystemDescription(getLeoTypeSystemDescription()));
        annotators.add(new MergeAnnotator()
                .setTypesToMerge(new String[]{TYPE_METASTASIS_HORMONE_PATTERN})
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));
        //Metastatis Pattern
        annotators.add(new AnnotationPatternAnnotator()
                .setResource(RESOURCE_PATH + RESOURCE_METASTASIS_PATTERN)
                .setOutputType(TYPE_METASTASIS_PATTERN)
                .getLeoAEDescriptor().setName("Metastasis Pattern Annotator")
                .setTypeSystemDescription(getLeoTypeSystemDescription()));
        //Additional Medication Pattern
        annotators.add(new AnnotationPatternAnnotator()
                .setResource(RESOURCE_PATH + RESOURCE_METASTASIS_MEDICATION_PATTERN)
                .setOutputType(TYPE_METASTASIS_MEDICATION_PATTERN)
                .getLeoAEDescriptor().setName("Metastasis Pattern Annotator")
                .setTypeSystemDescription(getLeoTypeSystemDescription()));
        annotators.add(new AnnotationPatternAnnotator()
                .setResource(RESOURCE_PATH + RESOURCE_METASTASIS_NEGATION_PATTERN)
                .setOutputType(TYPE_METASTASIS_NEGATION_PATTERN)
                .getLeoAEDescriptor().setName("Metastasis Pattern Annotator")
                .setTypeSystemDescription(getLeoTypeSystemDescription()));


        annotators.add(new MergeAnnotator()
                .setTypesToMerge(new String[]{TYPE_METASTASIS_PATTERN})
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));
        annotators.add(new MergeAnnotator()
                .setTypesToMerge(new String[]{TYPE_METASTASIS_MEDICATION_PATTERN})
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));
        annotators.add(new MergeAnnotator()
                .setTypesToMerge(new String[]{TYPE_METASTASIS_NEGATION_PATTERN})
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));

        //4. Create an anchored sentence around the terms
        annotators.add(new AnchoredSentenceAnnotator()
                .setSpanSize(200)
                .setAnchorFeature(TYPE_WINDOW_FEATURE)
                .setInputTypes(TYPE_METASTASIS_PATTERN, TYPE_METASTASIS_MEDICATION_PATTERN, TYPE_METASTASIS_NEGATION_PATTERN)
                .setOutputType(SENTENCE_TYPE)
                .setName("TermSentenceAnnotator")
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));
        //5. Apply context
        annotators.add(new ContextAnnotator()
                .setConceptFeatureName(TYPE_WINDOW_FEATURE)
                .setResourceFile(RESOURCE_PATH + RESOURCE_CONTEXT)
                .setInputTypes(new String[]{SENTENCE_TYPE})
                .setOutputType(TYPE_CONTEXT)
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));

        annotators.add(new MergeAnnotator()
                .setTypesToMerge(new String[]{TYPE_CONTEXT})
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));
        //6. Logic Annotator
        annotators.add(new MetastasisLogic()
                .setName("MetastasisLogicAnnotator")
                .getLeoAEDescriptor().setTypeSystemDescription(getLeoTypeSystemDescription()));

        this.pipeline = new LeoAEDescriptor(annotators);
        this.pipeline.setTypeSystemDescription(getLeoTypeSystemDescription());
    }


    protected LeoTypeSystemDescription defineTypeSystem() throws Exception {
        LeoTypeSystemDescription description = TypeSystem.getLeoTypeSystemDescription();
        return description;
    }
}
