package gov.va.vinci.ae;


import gov.va.vinci.leo.AnnotationLibrarian;
import gov.va.vinci.leo.ae.LeoBaseAnnotator;
import gov.va.vinci.leo.context.types.Context;
import gov.va.vinci.leo.context.types.TermContext;
import gov.va.vinci.leo.descriptors.LeoTypeSystemDescription;
//import gov.va.vinci.types.*;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.CASException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;
import java.util.ArrayList;

public class MetastasisLogic extends LeoBaseAnnotator {

    /*@Override
    public void initialize(UimaContext context) throws ResourceInitializationException {
        super.initialize(context);
    }
*/
    @Override
    public void annotate(JCas aJCas) throws AnalysisEngineProcessException {
        FSIterator<Annotation> contextit = this.getAnnotationListForType(aJCas, TermContext.class.getCanonicalName());
        while (contextit.hasNext()) try {
            Context current_context = (TermContext) contextit.next();
            if (current_context != null) {


                ArrayList<Annotation> modifierList = new ArrayList<Annotation>();
                ArrayList<Annotation> anatomyList = new ArrayList<Annotation>();
                ArrayList<Annotation> medicationList = new ArrayList<Annotation>();
                ArrayList<Annotation> metastasisList = new ArrayList<Annotation>();
                ArrayList<Annotation> negationList = new ArrayList<Annotation>();
                ArrayList<Annotation> cancerList = new ArrayList<Annotation>();
                ArrayList<Annotation> depthList = new ArrayList<Annotation>();
                ArrayList<Annotation> castrateList = new ArrayList<Annotation>();
                ArrayList<Annotation> hormoneModifierList = new ArrayList<Annotation>();
                ArrayList<Annotation> medicationModifierList = new ArrayList<Annotation>();

                modifierList.addAll(AnnotationLibrarian.getAllCoveredAnnotationsOfType(current_context, gov.va.vinci.types.Metastasis_Modifier.type, false));
                negationList.addAll(AnnotationLibrarian.getAllCoveredAnnotationsOfType(current_context, gov.va.vinci.types.Metastasis_Negation_Pattern.type, false));
                metastasisList.addAll(AnnotationLibrarian.getAllCoveredAnnotationsOfType(current_context, gov.va.vinci.types.Metastasis_Term.type, false));
                depthList.addAll(AnnotationLibrarian.getAllCoveredAnnotationsOfType(current_context, gov.va.vinci.types.Metastasis_Depth.type, false));
                anatomyList.addAll(AnnotationLibrarian.getAllCoveredAnnotationsOfType(current_context, gov.va.vinci.types.Metastasis_Anatomy.type, false));
                medicationList.addAll(AnnotationLibrarian.getAllCoveredAnnotationsOfType(current_context, gov.va.vinci.types.Metastasis_Medication_Pattern.type, false));
                cancerList.addAll(AnnotationLibrarian.getAllCoveredAnnotationsOfType(current_context, gov.va.vinci.types.Metastasis_Disease.type, false));
                castrateList.addAll(AnnotationLibrarian.getAllCoveredAnnotationsOfType(current_context, gov.va.vinci.types.Metastasis_Hormone.type, false));
                hormoneModifierList.addAll(AnnotationLibrarian.getAllCoveredAnnotationsOfType(current_context, gov.va.vinci.types.Metastasis_Hormone_Modifier.type, false));
                medicationModifierList.addAll(AnnotationLibrarian.getAllCoveredAnnotationsOfType(current_context, gov.va.vinci.types.Metastasis_Medication.type, false));

                /*
                    Features Populated here:
                    "Experiencer"       -   Context
                    "Negation"          -   Context
                    "Temporality"       -   Context
                    "Metastatic_Term"   -   Overlapped text of the term that indicated the cancer was metastatic
                    "Modifier"          -   Diagnosis, History, negated, treated.  These are the project specific categories.
                    "Anatomy"           -   The Location of the cancer, 'prostate' or 'Other_Organ'
                    "NLP_Diagnosis"     -   A rolled up value that takes all of the values above into account and outputs a 1 for "Metastatic Prostate Cancer Diagnosis" or 0 for all others.

                 */

                //Output the metastatic term
                if (metastasisList.size() > 0) {
                    Annotation mets = metastasisList.get(0);
                    ((TermContext) current_context).setMetastatic_term(((gov.va.vinci.types.Metastasis_Term) mets).getCoveredText());
                } else if (depthList.size() > 0){
                    Annotation depth = depthList.get(0);
                    ((TermContext) current_context).setMetastatic_term(((gov.va.vinci.types.Metastasis_Depth) depth).getCoveredText());
                }
                //Check to see if there is anatomy terms in the pattern, if so, set the anatomy value here
                //If there is no anatomy value, but the metastatic or cancer term are prostate specific, set Anatomy to Prostate
                //to update, anatomy can liely just be cr erms as well
                if (anatomyList.size() > 0) {
                    Annotation anatomy = anatomyList.get(0);
                    ((TermContext) current_context).setAnatomy(((gov.va.vinci.types.Metastasis_Anatomy) anatomy).getConcept());
                }
                if (anatomyList.size() == 0 && metastasisList.size() > 0) {
                    Annotation mets = metastasisList.get(0);
                    if (((gov.va.vinci.types.Metastasis_Term) mets).getConcept() == "Prostate_Specific") {
                        ((TermContext) current_context).setAnatomy(((gov.va.vinci.types.Metastasis_Term) mets).getConcept());
                    }
                }
                if (anatomyList.size() == 0 && cancerList.size() > 0) {
                    Annotation cancer = cancerList.get(0);
                    if (((gov.va.vinci.types.Metastasis_Disease) cancer).getConcept() == "Prostate_Specific_Cancer" ||
                            ((gov.va.vinci.types.Metastasis_Disease) cancer).getConcept() == "cr_resistant_Specific_Cancer" ||
                            ((gov.va.vinci.types.Metastasis_Disease) cancer).getConcept() == "cr_sensitive_Specific_Cancer") {
                        ((TermContext) current_context).setAnatomy(((gov.va.vinci.types.Metastasis_Disease) cancer).getConcept());
                    }

                }

                //If the cancer description is a hormone specific abbreviation, update flags here  Later, castrate complete patterns will then update the flag
                //TODO review logic here, does a cr term overide a metastic term if both exist in the pattern? (I believe no)
                if (cancerList.size() > 0) {
                    Annotation cancer = cancerList.get(0);
                    if (((gov.va.vinci.types.Metastasis_Disease) cancer).getConcept() == "cr_resistant_Specific_Cancer") {
                        ((TermContext) current_context).setHormone_modifier("resistant");
                        ((TermContext) current_context).setHormone_modifier_term((cancer).getCoveredText());
                    }else if (((gov.va.vinci.types.Metastasis_Disease) cancer).getConcept() == "cr_sensitive_Specific_Cancer") {
                        ((TermContext) current_context).setHormone_modifier("sensitive");
                        ((TermContext) current_context).setHormone_modifier_term((cancer).getCoveredText());
                    }

                }



                //1. Set Concept modifier if found in medication Pattern
                if (medicationList.size() > 0) {
                    Annotation med = medicationList.get(0);
                    ArrayList<Annotation> medList = new ArrayList<Annotation>();
                    medList.addAll(AnnotationLibrarian.getAllCoveredAnnotationsOfType(med, gov.va.vinci.types.Metastasis_Medication.type, false));
                    //to do in the future, add another feature for the type of medication patient is treated with
                    ((TermContext) current_context).setModifier("Treated");
                    if (medList.size() > 0) {
                        Annotation medname = medList.get(0);
                        ((TermContext) current_context).setModifier_term(((gov.va.vinci.types.Metastasis_Medication) medname).getCoveredText());
                        ((TermContext) current_context).setTreatment_term(((gov.va.vinci.types.Metastasis_Medication) medname).getCoveredText());
                        ((TermContext) current_context).setTreatment_modifier(((gov.va.vinci.types.Metastasis_Medication) medname).getConcept());
                    }
                }
                //Then Check for negation patterns
                else if (negationList.size() > 0) {
                    Annotation neg = negationList.get(0);
                    ((TermContext) current_context).setModifier_term(neg.getCoveredText());
                    ((TermContext) current_context).setModifier("Negation");
                }
                //otherwise set the modifier if found in a different diagnosis pattern
                else if (modifierList.size() > 0) {

                    Annotation mod = modifierList.get(0);
                    ((TermContext) current_context).setModifier_term(mod.getCoveredText());
                    ((TermContext) current_context).setModifier(((gov.va.vinci.types.Metastasis_Modifier) mod).getConcept());
                }
                //Else, set the relevant context to the modifier position
                else {
                    if (current_context.getTemporality() == "Historical") {
                        ((TermContext) current_context).setModifier("Context_Historic");
                    }
                }

                //Sensitive/resistant terms updated here, Complete hormone pattern flag updated only when complete pattern exists

                if (hormoneModifierList.size() > 0) {
                    Annotation hormoneModifier = hormoneModifierList.get(0);
                    ((TermContext) current_context).setHormone_modifier(((gov.va.vinci.types.Metastasis_Hormone_Modifier) hormoneModifier).getConcept());
                    ((TermContext) current_context).setHormone_modifier_term((hormoneModifier).getCoveredText());
                }

                if (castrateList.size() > 0) {
                    Annotation castrate = castrateList.get(0);
                    ((TermContext) current_context).setCastrate_term(((gov.va.vinci.types.Metastasis_Hormone) castrate).getCoveredText());

                }
                //Final Logic, Set Castrate and mPCa flags

                if (    current_context.getExperiencer()    == "Patient" &&
                        current_context.getNegation()       == "Affirmed" &&
                        current_context.getTemporality()      != "Hypothetical" &&
                        ((TermContext) current_context).getModifier()      != "Negation"   &&
                        ((TermContext) current_context).getModifier()      != "Family_History"   &&
                        ((TermContext) current_context).getModifier()      != null   &&
                        ((TermContext) current_context).getAnatomy()      != "Other_Organ"   &&
                        ((TermContext) current_context).getAnatomy()      != "Family_History"   &&
                        //((TermContext) current_context).getAnatomy()      != null   &&
                        ((TermContext) current_context).getHormone_modifier()      == "resistant"
                )
                {
                    ((TermContext) current_context).setCastrate_resistant(1);

                } else {
                    ((TermContext) current_context).setCastrate_resistant(0);
                }


                if (    current_context.getExperiencer()    == "Patient" &&
                        current_context.getNegation()       == "Affirmed" &&
                        current_context.getTemporality()      != "Hypothetical" &&
                        ((TermContext) current_context).getModifier()      != "Negation"   &&
                        ((TermContext) current_context).getModifier()      != "Family_History"   &&
                        ((TermContext) current_context).getModifier()      != null   &&
                        ((TermContext) current_context).getAnatomy()      != "Other_Organ"   &&
                        ((TermContext) current_context).getAnatomy()      != "Family_History"   &&
                        //((TermContext) current_context).getAnatomy()      != null   &&
                        ((TermContext) current_context).getHormone_modifier()      == "sensitive"
                )
                {
                    ((TermContext) current_context).setCastrate_sensitive(1);

                } else {
                    ((TermContext) current_context).setCastrate_sensitive(0);
                }

                //Sum up all of the logic above to create a single output variable  "NLP_Diagnosis"
                if (    current_context.getExperiencer()    == "Patient" &&
                        current_context.getNegation()       == "Affirmed" &&
                        current_context.getTemporality()      != "Hypothetical" &&
                                ((TermContext) current_context).getModifier()      != "Negation"   &&
                                ((TermContext) current_context).getModifier()      != "Family_History"   &&
                                ((TermContext) current_context).getModifier()      != null   &&
                                ((TermContext) current_context).getAnatomy()      != "Other_Organ"   &&
                                ((TermContext) current_context).getAnatomy()      != "Family_History"   &&
                                ((TermContext) current_context).getAnatomy()      != null   &&
                                ((TermContext) current_context).getMetastatic_term()      != null
                        )
                                {
                                    ((TermContext) current_context).setMPCa_flag(1);

                } else {
                    ((TermContext) current_context).setMPCa_flag(0);
                }
            }



        } catch (CASException e) {
            logger.error(e.getStackTrace());


        }

    }
    @Override
    public LeoTypeSystemDescription getLeoTypeSystemDescription() {
        return new LeoTypeSystemDescription();
    }
}
