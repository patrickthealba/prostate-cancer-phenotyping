package gov.va.vinci;

import gov.va.vinci.leo.annotationpattern.ae.AnnotationPatternAnnotator;
import gov.va.vinci.leo.context.ae.ContextAnnotator;
import gov.va.vinci.leo.descriptors.LeoTypeSystemDescription;
import gov.va.vinci.leo.descriptors.TypeDescriptionBuilder;
import gov.va.vinci.leo.merger.ae.MergeAnnotator;
import gov.va.vinci.leo.regex.ae.RegexAnnotator;
import gov.va.vinci.leo.whitespace.ae.WhitespaceTokenizer;
import gov.va.vinci.leo.sentence.ae.AnchoredSentenceAnnotator;
import gov.va.vinci.leo.sentence.ae.SentenceAnnotator;
import gov.va.vinci.leo.types.TypeLibrarian;
import gov.va.vinci.leo.window.ae.WindowAnnotator;
//import opennlp.tools.tokenize.WhitespaceTokenizer;

import java.io.File;

public class TypeSystem {
    //TYPE_SIMPLE_CONCEPT_TERM
    private static String TYPE_SIMPLE_CONCEPT_TERM = "gov.va.vinci.types.Simple_Concept";
    //Accession Types
    private static String TYPE_ACC_TITLE_TERM = "gov.va.vinci.types.ACC_Title_Term";
    private static String TYPE_ACC_TYPE_TERM = "gov.va.vinci.types.ACC_Type_Term";
    private static String TYPE_ACC_YEAR_TERM = "gov.va.vinci.types.ACC_Year_Term";
    private static String TYPE_ACC_MIDDLE_TERM = "gov.va.vinci.types.ACC_Middle_Term";
    private static String TYPE_ACC_IDENTIFIER_TERM = "gov.va.vinci.types.ACC_Identifier_Term";
    private static String TYPE_ACC_AFIP_IDENTIFIER_TERM = "gov.va.vinci.types.ACC_AFIP_Identifier_Term";
    private static String TYPE_ACC_PATTERN = "gov.va.vinci.types.ACC_Pattern";
    private static String TYPE_SECTION_HEADER = "gov.va.vinci.types.SectionHeader";
    private static String TYPE_SECTION = "gov.va.vinci.types.Section";
    //Gleason Types
    private static String TYPE_GLEASON_TERM = "gov.va.vinci.types.Gleason_Term";
    private static String TYPE_GLEASON_MIDDLE = "gov.va.vinci.types.Gleason_Middle";
    private static String TYPE_GLEASON_MIDDLE_CONNECTOR = "gov.va.vinci.types.Gleason_Middle_Connector";
    private static String TYPE_GLEASON_MIDDLE_VALUE = "gov.va.vinci.types.Gleason_Middle_Value";
    private static String TYPE_GLEASON_VALUE = "gov.va.vinci.types.Gleason_Value";
    private static String TYPE_GLEASON_VALUE_NUMERIC = "gov.va.vinci.types.Gleason_Value_Numeric";
    private static String TYPE_GLEASON_VALUE_COMPONENT = "gov.va.vinci.types.Gleason_Value_Component";
    private static String TYPE_GLEASON_VALUE_TOTAL = "gov.va.vinci.types.Gleason_Value_Total";
    private static String TYPE_GLEASON_EXCLUDE_TYPE = "gov.va.vinci.types.Gleason_Exclude_Type";
    private static String TYPE_GLEASON_MODIFIER = "gov.va.vinci.types.Gleason_Modifier";
    private static String TYPE_GLEASON_GRADE = "gov.va.vinci.types.Gleason_Grade";
    //Path_Report Concepts
    //Percent_Involvement
    private static String TYPE_INVOLVEMENT_TERM = "gov.va.vinci.types.Involvement_Term";
    private static String TYPE_INVOLVEMENT_VALUE_NUMERIC = "gov.va.vinci.types.Involvement_Value_Numeric";
    private static String TYPE_INVOLVEMENT_VALUE_MEASUREMENT = "gov.va.vinci.types.Involvement_Value_Measurement";
    private static String TYPE_INVOLVEMENT_VALUE_TEXT = "gov.va.vinci.types.Involvement_Value_Text";
    private static String TYPE_INVOLVEMENT_PERCENT = "gov.va.vinci.types.Involvement_Percent";
    private static String TYPE_INVOLVEMENT_UNIT = "gov.va.vinci.types.Involvement_Unit";
    private static String TYPE_INVOLVEMENT_EXCLUDE_VALUE = "gov.va.vinci.types.Involvement_Exclude_Value";
    private static String TYPE_INVOLVEMENT_MIDDLE = "gov.va.vinci.types.Involvement_Middle";
    private static String TYPE_INVOLVEMENT_ADJECTIVE = "gov.va.vinci.types.Involvement_Adjective";
    private static String TYPE_INVOLVEMENT_PATTERN = "gov.va.vinci.types.Involvement_Pattern";
    private static String TYPE_INVOLVEMENT_VALUE_PATTERN = "gov.va.vinci.types.Involvement_Value_Pattern";
    //Number of Cores
    private static String TYPE_CORE_TERM = "gov.va.vinci.types.Core_Term";
    private static String TYPE_CORE_VALUE = "gov.va.vinci.types.Core_Value";
    private static String TYPE_CORE_MIDDLE = "gov.va.vinci.types.Core_Middle";
    private static String TYPE_CORE_VERB = "gov.va.vinci.types.Core_Verb";
    private static String TYPE_CORE_PATTERN = "gov.va.vinci.types.Core_Pattern";
    //PSA
    private static String TYPE_PSA = "gov.va.vinci.types.PSA";
    private static String TYPE_PSA_VALUE = "gov.va.vinci.types.PSA_Value";
    private static String TYPE_PSA_MIDDLE = "gov.va.vinci.types.PSA_Middle";
    private static String TYPE_PSA_PATTERN = "gov.va.vinci.types.PSA_Pattern";
    //Depth of Invasion Terms
    private static String TYPE_INVASION_TERM = "gov.va.vinci.types.Invasion_Term";
    private static String TYPE_INVASION_MIDDLE= "gov.va.vinci.types.Invasion_Middle";
    private static String TYPE_INVASION_STATUS= "gov.va.vinci.types.Invasion_Status";
    private static String TYPE_INVASION_DEPTH= "gov.va.vinci.types.Invasion_Depth";
    private static String TYPE_INVASION_PATTERN = "gov.va.vinci.types.Invasion_Pattern";
    //EGFR Types
    private static String TYPE_EGFR_TERM = "gov.va.vinci.types.EGFR_Term";
    private static String TYPE_EGFR_MUTATION_TERM = "gov.va.vinci.types.EGFR_Mutation_Term";
    private static String TYPE_EGFR_PANEL_TERM = "gov.va.vinci.types.EGFR_Panel_Term";
    private static String TYPE_EGFR_MIDDLE = "gov.va.vinci.types.EGFR_Middle";
    private static String TYPE_EGFR_VALUE = "gov.va.vinci.types.EGFR_Value";
    private static String TYPE_EGFR_MODIFIER = "gov.va.vinci.types.EGFR_Modifier";
    //Metastatic Diagnosis Types
    private static String TYPE_METASTASIS_TERM = "gov.va.vinci.types.Metastasis_Term";
    private static String TYPE_METASTASIS_DEPTH = "gov.va.vinci.types.Metastasis_Depth";
    private static String TYPE_METASTASIS_DISEASE = "gov.va.vinci.types.Metastasis_Disease";
    private static String TYPE_METASTASIS_MIDDLE = "gov.va.vinci.types.Metastasis_Middle";
    private static String TYPE_METASTASIS_ANATOMY = "gov.va.vinci.types.Metastasis_Anatomy";
    private static String TYPE_METASTASIS_MODIFIER = "gov.va.vinci.types.Metastasis_Modifier";
    private static String TYPE_METASTASIS_MEDICATION = "gov.va.vinci.types.Metastasis_Medication";
    private static String TYPE_METASTASIS_MEDICATION_MODIFIER = "gov.va.vinci.types.Metastasis_Medication_Modifier";
    private static String TYPE_METASTASIS_HORMONE = "gov.va.vinci.types.Metastasis_Hormone";
    private static String TYPE_METASTASIS_HORMONE_TERM = "gov.va.vinci.types.Metastasis_Hormone_Term";
    private static String TYPE_METASTASIS_HORMONE_MODIFIER = "gov.va.vinci.types.Metastasis_Hormone_Modifier";
    private static String TYPE_METASTASIS_IMAGE = "gov.va.vinci.types.Metastasis_Image";
    private static String TYPE_METASTASIS_NEGATION = "gov.va.vinci.types.Metastasis_Negation";
    //Stage Types
    private static String TYPE_STAGE_TERM = "gov.va.vinci.types.Stage_Term";
    private static String TYPE_STAGE_MIDDLE = "gov.va.vinci.types.Stage_Middle";
    private static String TYPE_STAGE_VALUE = "gov.va.vinci.types.Stage_Value";
    private static String TYPE_STAGE_CRITERIA = "gov.va.vinci.types.Stage_Criteria";
    private static String TYPE_STAGE_CRITERIA_G = "gov.va.vinci.types.Stage_Criteria_G";
    private static String TYPE_STAGE_TYPE = "gov.va.vinci.types.Stage_Type";
    private static String TYPE_STAGE_MODIFIER = "gov.va.vinci.types.Stage_Modifier";
    private static String TYPE_STAGE_HEADER = "gov.va.vinci.types.Stage_Header";
    private static String TYPE_STAGE_LONG_FORM = "gov.va.vinci.types.Stage_Long_Form";
    private static String TYPE_STAGE_ANATOMY = "gov.va.vinci.types.Stage_Anatomy";
    //Exclude Regexes
    private static String TYPE_EXCLUDE = "gov.va.vinci.types.Exclude";
    private static String TYPE_EXCLUDE_STAGE_TYPE = "gov.va.vinci.types.Exclude_Stage_Type";
    private static String TYPE_EXCLUDE_STAGE_VALUE = "gov.va.vinci.types.Exclude_Stage_Value";
    private static String TYPE_EXCLUDE_STAGE_CRITERIA = "gov.va.vinci.types.Exclude_Stage_Criteria";
    private static String TYPE_EXCLUDE_GLEASON_VALUE = "gov.va.vinci.types.Exclude_Gleason_Value";
    private static String TYPE_MODIFIER = "gov.va.vinci.types.ConceptModifier";
    //Pattern Types
    private static String TYPE_GLEASON_PATTERN = "gov.va.vinci.types.Gleason_Pattern";
    private static String TYPE_RISK_PATTERN = "gov.va.vinci.types.Risk_Pattern";
    private static String TYPE_GLEASON_VALUE_PATTERN = "gov.va.vinci.types.Gleason_Value_Pattern";
    private static String TYPE_EGFR_PATTERN = "gov.va.vinci.types.EGFR_Pattern";
    private static String TYPE_STAGE_PATTERN = "gov.va.vinci.types.Stage_Pattern";
    private static String TYPE_STAGE_ANATOMY_PATTERN = "gov.va.vinci.types.Stage_Anatomy_Pattern";
    private static String TYPE_EXCLUDE_PATTERN = "gov.va.vinci.types.Exclude_Pattern";
    private static String TYPE_METASTASIS_PATTERN = "gov.va.vinci.types.Metastasis_Pattern";
    private static String TYPE_METASTASIS_MEDICATION_PATTERN = "gov.va.vinci.types.Metastasis_Medication_Pattern";
    private static String TYPE_METASTASIS_NEGATION_PATTERN = "gov.va.vinci.types.Metastasis_Negation_Pattern";
    //Window and Context
    private static String TYPE_EXCLUDE_WINDOW = "gov.va.vinci.types.Exclude_Window";
    private static String TYPE_SECTION_WINDOW = "gov.va.vinci.types.Section_Window";
    private static String TYPE_INPUT_WINDOW = "gov.va.vinci.types.Input_Window";
    private static String TYPE_CONTEXT = "gov.va.vinci.leo.context.types.TermContext";


    public static void main(String[] args) {
        try {
            LeoTypeSystemDescription types = new LeoTypeSystemDescription();
            types.addTypeSystemDescription(getLeoTypeSystemDescription());

            File srcDir = new File("generated-types/src");
            srcDir.mkdirs();

            File classesDir = new File("generated-types/classes");
            classesDir.mkdirs();

            types.jCasGen(srcDir.getCanonicalPath(), classesDir.getCanonicalPath());

            File resDir = new File("generated-types/resources/types");
            resDir.mkdirs();

            types.toXML(resDir.getCanonicalPath() + "/TypeSystem.xml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static LeoTypeSystemDescription getLeoTypeSystemDescription() {
        LeoTypeSystemDescription types = new LeoTypeSystemDescription();
        /** Leo Bones **/
        types.addType(TypeLibrarian.getCSITypeSystemDescription());
        types.addTypeSystemDescription(new WindowAnnotator().getLeoTypeSystemDescription());
        types.addTypeSystemDescription(new RegexAnnotator().getLeoTypeSystemDescription());
        types.addTypeSystemDescription(new AnnotationPatternAnnotator().getLeoTypeSystemDescription());
        types.addTypeSystemDescription(new AnchoredSentenceAnnotator().getLeoTypeSystemDescription());
        types.addTypeSystemDescription(new SentenceAnnotator().getLeoTypeSystemDescription());
        types.addTypeSystemDescription(new ContextAnnotator().getLeoTypeSystemDescription());
        types.addTypeSystemDescription(new MergeAnnotator().getLeoTypeSystemDescription());
        types.addTypeSystemDescription(new WhitespaceTokenizer().getLeoTypeSystemDescription());

        /**  types needed for the LGB project **/
        types.addTypeSystemDescription(getSpecificTypeSystemDescription());
        types.addTypeSystemDescription(getHumanAnnotationTypeSystemDescription());

        return types;
    }

    public static LeoTypeSystemDescription getSpecificTypeSystemDescription() {
        LeoTypeSystemDescription types = new LeoTypeSystemDescription();

        try {
            //Simple Concept Extraction
            types.addType(TYPE_SIMPLE_CONCEPT_TERM, "", PARENT_CLASS.TYPE_REGEX.type);
            //Accession Concept
            types.addType(TYPE_ACC_TITLE_TERM, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_ACC_TYPE_TERM, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_ACC_YEAR_TERM, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_ACC_IDENTIFIER_TERM, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_ACC_MIDDLE_TERM, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_ACC_AFIP_IDENTIFIER_TERM, "", PARENT_CLASS.TYPE_REGEX.type);
            //Gleason Score
            types.addType(TYPE_SECTION_HEADER, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_GLEASON_TERM, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_GLEASON_MIDDLE, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_GLEASON_MIDDLE_CONNECTOR, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_GLEASON_MIDDLE_VALUE, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_GLEASON_VALUE, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_GLEASON_VALUE_NUMERIC, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_GLEASON_VALUE_COMPONENT, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_GLEASON_VALUE_TOTAL, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_GLEASON_EXCLUDE_TYPE, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_GLEASON_MODIFIER, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_GLEASON_GRADE, "", PARENT_CLASS.TYPE_REGEX.type);
            //Invasion Depth
            types.addType(TYPE_INVASION_TERM, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_INVASION_MIDDLE, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_INVASION_STATUS, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_INVASION_DEPTH, "", PARENT_CLASS.TYPE_REGEX.type);
            //Percent Involved
            types.addType(TYPE_INVOLVEMENT_TERM, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_INVOLVEMENT_VALUE_NUMERIC, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_INVOLVEMENT_VALUE_MEASUREMENT, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_INVOLVEMENT_VALUE_TEXT, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_INVOLVEMENT_PERCENT, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_INVOLVEMENT_UNIT, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_INVOLVEMENT_EXCLUDE_VALUE, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_INVOLVEMENT_MIDDLE, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_INVOLVEMENT_ADJECTIVE, "", PARENT_CLASS.TYPE_REGEX.type);
            //Cores Involved
            types.addType(TYPE_CORE_TERM, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_CORE_MIDDLE, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_CORE_VALUE, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_CORE_VERB, "", PARENT_CLASS.TYPE_REGEX.type);

            //PSA
            types.addType(TYPE_PSA, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_PSA_VALUE, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_PSA_MIDDLE, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_EGFR_TERM, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_EGFR_MIDDLE, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_EGFR_VALUE, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_EGFR_MODIFIER, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_EGFR_MUTATION_TERM, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_EGFR_PANEL_TERM, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_METASTASIS_TERM, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_METASTASIS_DISEASE, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_METASTASIS_MIDDLE, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_METASTASIS_MODIFIER, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_METASTASIS_DEPTH, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_METASTASIS_ANATOMY, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_METASTASIS_MEDICATION, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_METASTASIS_MEDICATION_MODIFIER, "", PARENT_CLASS.TYPE_REGEX.type);
           // types.addType(TYPE_METASTASIS_HORMONE, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_METASTASIS_HORMONE_TERM, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_METASTASIS_HORMONE_MODIFIER, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_METASTASIS_IMAGE, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_METASTASIS_NEGATION, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_STAGE_TERM, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_STAGE_MIDDLE, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_STAGE_VALUE, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_STAGE_CRITERIA, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_STAGE_CRITERIA_G, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_STAGE_TYPE, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_STAGE_MODIFIER, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_STAGE_HEADER, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_STAGE_LONG_FORM, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_STAGE_ANATOMY, "", PARENT_CLASS.TYPE_REGEX.type);
            //Exclusion Types
            types.addType(TYPE_EXCLUDE, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_EXCLUDE_STAGE_TYPE, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_EXCLUDE_STAGE_VALUE, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_EXCLUDE_STAGE_CRITERIA, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_EXCLUDE_GLEASON_VALUE, "", PARENT_CLASS.TYPE_REGEX.type);
            types.addType(TYPE_MODIFIER, "", PARENT_CLASS.TYPE_REGEX.type);
            //types.addType(TYPE_CONCEPT_PATTERN, "", PARENT_CLASS.TYPE_PATTERN.type);
            types.addType(TypeDescriptionBuilder.create(TYPE_GLEASON_PATTERN, "", PARENT_CLASS.TYPE_PATTERN.type)
                    .addFeature("Gleason_Score", "", "uima.cas.Float")
                    .addFeature("Gleason_Modifier", "", "uima.cas.String")
                    .addFeature("PSA_in_Report", "", "uima.cas.String")
                .getTypeDescription());
            types.addType(TypeDescriptionBuilder.create(TYPE_RISK_PATTERN, "", PARENT_CLASS.TYPE_PATTERN.type)
                    .addFeature("Gleason_Score", "", "uima.cas.Float")
                    .addFeature("Cores", "", "uima.cas.String")
                    .addFeature("Percent_Involved", "", "uima.cas.String")
                .getTypeDescription());
            types.addType(TypeDescriptionBuilder.create(TYPE_GLEASON_VALUE_PATTERN, "", PARENT_CLASS.TYPE_PATTERN.type)
                    .addFeature("Primary", "", "uima.cas.String")
                    .addFeature("Secondary", "", "uima.cas.String")
                    .addFeature("Total", "", "uima.cas.Float")
                    .getTypeDescription());
            types.addType(TypeDescriptionBuilder.create(TYPE_INVOLVEMENT_VALUE_PATTERN, "", PARENT_CLASS.TYPE_PATTERN.type)
                    .addFeature("Value_1", "", "uima.cas.String")
                    .addFeature("Value_2", "", "uima.cas.String")
                    .getTypeDescription());
            types.addType(TypeDescriptionBuilder.create(TYPE_PSA_PATTERN, "", PARENT_CLASS.TYPE_PATTERN.type)
                    .addFeature("PSA_Value", "", "uima.cas.String")
                    .getTypeDescription());
            types.addType(TypeDescriptionBuilder.create(TYPE_INVOLVEMENT_PATTERN, "", PARENT_CLASS.TYPE_PATTERN.type)
                    .addFeature("Value_1", "", "uima.cas.String")
                    .addFeature("Value_2", "", "uima.cas.String")
                    .addFeature("Percent_Involved", "", "uima.cas.String")
                    .getTypeDescription());
            types.addType(TypeDescriptionBuilder.create(TYPE_CORE_PATTERN, "", PARENT_CLASS.TYPE_PATTERN.type)
                    .addFeature("Cores_Involved", "", "uima.cas.String")
                    .addFeature("Total_Cores", "", "uima.cas.String")
                    .getTypeDescription());
            types.addType(TypeDescriptionBuilder.create(TYPE_INVASION_PATTERN, "", PARENT_CLASS.TYPE_PATTERN.type)
                    .addFeature("Invasion_Status", "", "uima.cas.String")
                    .addFeature("Invasion_Depth", "", "uima.cas.String")
                    .getTypeDescription());
            types.addType(TypeDescriptionBuilder.create(TYPE_EGFR_PATTERN, "", PARENT_CLASS.TYPE_PATTERN.type)
                    .addFeature("Term_Type", "", "uima.cas.String")
                    .addFeature("NLP_Value", "", "uima.cas.String")
                    .addFeature("Snippet_Type", "", "uima.cas.String")
                    .addFeature("Annotated_Snippet", "", "uima.cas.String")
                    .addFeature("Anchored_Sentence", "", "uima.cas.String")
                    .addFeature("Value_in_Sentence", "", "uima.cas.String")
                    .addFeature("Value_Term", "", "uima.cas.String")
                    .addFeature("Tight_Window", "", "uima.cas.String")
                    .addFeature("Term_Start", "", "uima.cas.Integer")
                    .addFeature("Term_End", "", "uima.cas.Integer")
                    .getTypeDescription());
            types.addType(TypeDescriptionBuilder.create(TYPE_ACC_PATTERN, "", PARENT_CLASS.TYPE_PATTERN.type)
                    .addFeature("Title", "", "uima.cas.String")
                    .addFeature("Specimen_Type", "", "uima.cas.String")
                    .addFeature("Year", "", "uima.cas.String")
                    .addFeature("Identifier", "", "uima.cas.String")
                    .getTypeDescription());
            types.addType(TypeDescriptionBuilder.create(TYPE_METASTASIS_PATTERN, "", PARENT_CLASS.TYPE_PATTERN.type)
                    .addFeature("Modifier", "", "uima.cas.String")
                    .getTypeDescription());

            types.addType(TypeDescriptionBuilder.create(TYPE_METASTASIS_HORMONE, "", PARENT_CLASS.TYPE_PATTERN.type)
                    .addFeature("Modifier", "", "uima.cas.String")
                    .getTypeDescription());
            types.addType(TypeDescriptionBuilder.create(TYPE_METASTASIS_MEDICATION_PATTERN, "", PARENT_CLASS.TYPE_PATTERN.type)
                    .addFeature("Modifier", "", "uima.cas.String")
                    .getTypeDescription());
            types.addType(TypeDescriptionBuilder.create(TYPE_METASTASIS_NEGATION_PATTERN, "", PARENT_CLASS.TYPE_PATTERN.type)
                    .addFeature("Modifier", "", "uima.cas.String")
                    .getTypeDescription());
            types.addType(TypeDescriptionBuilder.create(TYPE_STAGE_ANATOMY_PATTERN, "", PARENT_CLASS.TYPE_PATTERN.type)
                    .addFeature("Modifier", "", "uima.cas.String")
                    .getTypeDescription());
            types.addType(TypeDescriptionBuilder.create(TYPE_STAGE_PATTERN, "", PARENT_CLASS.TYPE_PATTERN.type)
                    .addFeature("Stage", "", "uima.cas.String")
                    .addFeature("T", "", "uima.cas.String")
                    .addFeature("N", "", "uima.cas.String")
                    .addFeature("M", "", "uima.cas.String")
                    .addFeature("G", "", "uima.cas.String")
                    .addFeature("Stage_Type", "", "uima.cas.String")
                    .addFeature("Stage_Value", "", "uima.cas.String")
                    .addFeature("Stage_Modifier", "", "uima.cas.String")
                    .addFeature("Other_Term", "", "uima.cas.String")
                    .getTypeDescription());
            types.addType(TYPE_INPUT_WINDOW, "", PARENT_CLASS.TYPE_WINDOW.type);
            types.addType(TYPE_EXCLUDE_PATTERN, "", PARENT_CLASS.TYPE_PATTERN.type);
            types.addType(TYPE_EXCLUDE_WINDOW, "", PARENT_CLASS.TYPE_WINDOW.type);
            types.addType(TYPE_INPUT_WINDOW, "", PARENT_CLASS.TYPE_WINDOW.type);
            types.addType(TYPE_SECTION_WINDOW, "", PARENT_CLASS.TYPE_WINDOW.type);
            types.addType(TypeDescriptionBuilder.create(TYPE_SECTION, "Section Type", "uima.tcas.Annotation")
                    .addFeature("SectionHeader", "Anchor annotation around which the section was created", "uima.tcas.Annotation")
                    .addFeature("SectionHeaderText", "text of the header", "uima.cas.String")
                    .addFeature("Experiencer", "text of the header", "uima.cas.String")
                    .addFeature("Negation", "text of the header", "uima.cas.String")
                    .addFeature("Temporality", "text of the header", "uima.cas.String")
                    .getTypeDescription());

            types.addType(TypeDescriptionBuilder.create(TYPE_CONTEXT, "", PARENT_CLASS.CONTEXT.type)
                    .addFeature("Concept", "", "uima.cas.String")
                    .addFeature("Metastatic_term", "", "uima.cas.String")
                    .addFeature("Experiencer", "text of the experiencer", "uima.cas.String")
                    .addFeature("Negation", "text of the negation", "uima.cas.String")
                    .addFeature("Temporality", "text of the temporality", "uima.cas.String")
                    .addFeature("Modifier_term", "text of the diagnosis term", "uima.cas.String")
                    .addFeature("Modifier", "text of the header", "uima.cas.String")
                    .addFeature("Anatomy", "text of the header", "uima.cas.String")
                    .addFeature("Hormone_modifier", "text of the header", "uima.cas.String")
                    .addFeature("Hormone_modifier_term", "text of the header", "uima.cas.String")
                    .addFeature("Treatment_modifier", "text of the header", "uima.cas.String")
                    .addFeature("Treatment_term", "text of the header", "uima.cas.String")
                    .addFeature("Castrate_term", "flag for castrate resistance", "uima.cas.String")
                    .addFeature("Castrate_sensitive", "flag for castrate resistance", "uima.cas.Integer")
                    .addFeature("Castrate_resistant", "flag for castrate resistance", "uima.cas.Integer")
                    .addFeature("mPCa_flag", "flag for mPCa diagnosis", "uima.cas.Integer")
                    //TODO set NLP_Diagnsosi to "mPCa flag"
                    .getTypeDescription());
            types.addType(TypeDescriptionBuilder.create("gov.va.vinci.types.ConceptType",
                    "Concept annotation", "uima.tcas.Annotation")
                    .addFeature("Concept", "", "uima.cas.String")
                    .addFeature("Pattern", "", "uima.cas.String")
                    .getTypeDescription());
            //Rush additions
            types.addType(TypeLibrarian.getCSITypeSystemDescription());
           types.addType(TypeDescriptionBuilder.create("org.apache.uima.examples.SourceDocumentInformation","", "uima.tcas.Annotation")
                       .addFeature("uri","","uima.cas.String")
                       .addFeature("offsetInSource", "", "uima.cas.Integer")
                       .addFeature("documentSize", "","uima.cas.Integer")
                       .addFeature("lastSegment", "", "uima.cas.Boolean").getTypeDescription());
            types.addType(TypeDescriptionBuilder.create("gov.va.vinci.types.RushSentence", "","uima.tcas.Annotation").getTypeDescription());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return types;
    }


    public static LeoTypeSystemDescription getHumanAnnotationTypeSystemDescription() {
        LeoTypeSystemDescription types = new LeoTypeSystemDescription();
        try {

            types.addType("gov.va.vinci.kttr.types.Gleason", "", "uima.tcas.Annotation");
            types.addType("gov.va.vinci.kttr.types.Cores_Present", "", "uima.tcas.Annotation");
            types.addType("gov.va.vinci.kttr.types.Percent_Involvement", "", "uima.tcas.Annotation");
            types.addType("gov.va.vinci.kttr.types.Invasion_Present", "", "uima.tcas.Annotation");
            types.addType("gov.va.vinci.kttr.types.PSA", "", "uima.tcas.Annotation");
            types.addType("gov.va.vinci.kttr.types.Accession_Number", "", "uima.tcas.Annotation");
            types.addType("gov.va.vinci.kttr.types.Specimen_not_Prostate", "", "uima.tcas.Annotation");
            types.addType("gov.va.vinci.kttr.types.Benign", "", "uima.tcas.Annotation");
            types.addType("gov.va.vinci.kttr.types.Review", "", "uima.tcas.Annotation");
            types.addType(TypeLibrarian.getRelationshipAnnotationTypeSystemDescription());
            //types.addType("gov.va.vinci.kttr.types.RelationshipAnnotation", "", "uima.tcas.Annotation");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return types;
    }


    public enum PARENT_CLASS {
        TYPE_WINDOW("gov.va.vinci.leo.window.types.Window"),
        TYPE_REGEX("gov.va.vinci.leo.regex.types.RegularExpressionType"),
        TYPE_PATTERN("gov.va.vinci.leo.annotationpattern.types.AnnotationPatternType"),
        CONTEXT("gov.va.vinci.leo.context.types.Context"),
        LINK("gov.va.vinci.leo.conceptlink.types.Link");

        public String type;

        private PARENT_CLASS(String type) {
            this.type = type;
        }

        public String getType() {
            return this.type;
        }

    }

}
