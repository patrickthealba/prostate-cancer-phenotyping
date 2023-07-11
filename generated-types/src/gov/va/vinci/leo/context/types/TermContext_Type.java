
/* First created by JCasGen Tue Jun 08 09:59:36 CDT 2021 */
package gov.va.vinci.leo.context.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Tue Jun 08 09:59:36 CDT 2021
 * @generated */
public class TermContext_Type extends Context_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = TermContext.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("gov.va.vinci.leo.context.types.TermContext");
 
  /** @generated */
  final Feature casFeat_Concept;
  /** @generated */
  final int     casFeatCode_Concept;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getConcept(int addr) {
        if (featOkTst && casFeat_Concept == null)
      jcas.throwFeatMissing("Concept", "gov.va.vinci.leo.context.types.TermContext");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Concept);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setConcept(int addr, String v) {
        if (featOkTst && casFeat_Concept == null)
      jcas.throwFeatMissing("Concept", "gov.va.vinci.leo.context.types.TermContext");
    ll_cas.ll_setStringValue(addr, casFeatCode_Concept, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Metastatic_term;
  /** @generated */
  final int     casFeatCode_Metastatic_term;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getMetastatic_term(int addr) {
        if (featOkTst && casFeat_Metastatic_term == null)
      jcas.throwFeatMissing("Metastatic_term", "gov.va.vinci.leo.context.types.TermContext");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Metastatic_term);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMetastatic_term(int addr, String v) {
        if (featOkTst && casFeat_Metastatic_term == null)
      jcas.throwFeatMissing("Metastatic_term", "gov.va.vinci.leo.context.types.TermContext");
    ll_cas.ll_setStringValue(addr, casFeatCode_Metastatic_term, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Experiencer;
  /** @generated */
  final int     casFeatCode_Experiencer;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getExperiencer(int addr) {
        if (featOkTst && casFeat_Experiencer == null)
      jcas.throwFeatMissing("Experiencer", "gov.va.vinci.leo.context.types.TermContext");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Experiencer);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setExperiencer(int addr, String v) {
        if (featOkTst && casFeat_Experiencer == null)
      jcas.throwFeatMissing("Experiencer", "gov.va.vinci.leo.context.types.TermContext");
    ll_cas.ll_setStringValue(addr, casFeatCode_Experiencer, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Negation;
  /** @generated */
  final int     casFeatCode_Negation;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getNegation(int addr) {
        if (featOkTst && casFeat_Negation == null)
      jcas.throwFeatMissing("Negation", "gov.va.vinci.leo.context.types.TermContext");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Negation);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNegation(int addr, String v) {
        if (featOkTst && casFeat_Negation == null)
      jcas.throwFeatMissing("Negation", "gov.va.vinci.leo.context.types.TermContext");
    ll_cas.ll_setStringValue(addr, casFeatCode_Negation, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Temporality;
  /** @generated */
  final int     casFeatCode_Temporality;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTemporality(int addr) {
        if (featOkTst && casFeat_Temporality == null)
      jcas.throwFeatMissing("Temporality", "gov.va.vinci.leo.context.types.TermContext");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Temporality);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTemporality(int addr, String v) {
        if (featOkTst && casFeat_Temporality == null)
      jcas.throwFeatMissing("Temporality", "gov.va.vinci.leo.context.types.TermContext");
    ll_cas.ll_setStringValue(addr, casFeatCode_Temporality, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Modifier_term;
  /** @generated */
  final int     casFeatCode_Modifier_term;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getModifier_term(int addr) {
        if (featOkTst && casFeat_Modifier_term == null)
      jcas.throwFeatMissing("Modifier_term", "gov.va.vinci.leo.context.types.TermContext");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Modifier_term);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setModifier_term(int addr, String v) {
        if (featOkTst && casFeat_Modifier_term == null)
      jcas.throwFeatMissing("Modifier_term", "gov.va.vinci.leo.context.types.TermContext");
    ll_cas.ll_setStringValue(addr, casFeatCode_Modifier_term, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Modifier;
  /** @generated */
  final int     casFeatCode_Modifier;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getModifier(int addr) {
        if (featOkTst && casFeat_Modifier == null)
      jcas.throwFeatMissing("Modifier", "gov.va.vinci.leo.context.types.TermContext");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Modifier);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setModifier(int addr, String v) {
        if (featOkTst && casFeat_Modifier == null)
      jcas.throwFeatMissing("Modifier", "gov.va.vinci.leo.context.types.TermContext");
    ll_cas.ll_setStringValue(addr, casFeatCode_Modifier, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Anatomy;
  /** @generated */
  final int     casFeatCode_Anatomy;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getAnatomy(int addr) {
        if (featOkTst && casFeat_Anatomy == null)
      jcas.throwFeatMissing("Anatomy", "gov.va.vinci.leo.context.types.TermContext");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Anatomy);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAnatomy(int addr, String v) {
        if (featOkTst && casFeat_Anatomy == null)
      jcas.throwFeatMissing("Anatomy", "gov.va.vinci.leo.context.types.TermContext");
    ll_cas.ll_setStringValue(addr, casFeatCode_Anatomy, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Hormone_modifier;
  /** @generated */
  final int     casFeatCode_Hormone_modifier;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getHormone_modifier(int addr) {
        if (featOkTst && casFeat_Hormone_modifier == null)
      jcas.throwFeatMissing("Hormone_modifier", "gov.va.vinci.leo.context.types.TermContext");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Hormone_modifier);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setHormone_modifier(int addr, String v) {
        if (featOkTst && casFeat_Hormone_modifier == null)
      jcas.throwFeatMissing("Hormone_modifier", "gov.va.vinci.leo.context.types.TermContext");
    ll_cas.ll_setStringValue(addr, casFeatCode_Hormone_modifier, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Hormone_modifier_term;
  /** @generated */
  final int     casFeatCode_Hormone_modifier_term;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getHormone_modifier_term(int addr) {
        if (featOkTst && casFeat_Hormone_modifier_term == null)
      jcas.throwFeatMissing("Hormone_modifier_term", "gov.va.vinci.leo.context.types.TermContext");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Hormone_modifier_term);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setHormone_modifier_term(int addr, String v) {
        if (featOkTst && casFeat_Hormone_modifier_term == null)
      jcas.throwFeatMissing("Hormone_modifier_term", "gov.va.vinci.leo.context.types.TermContext");
    ll_cas.ll_setStringValue(addr, casFeatCode_Hormone_modifier_term, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Treatment_modifier;
  /** @generated */
  final int     casFeatCode_Treatment_modifier;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTreatment_modifier(int addr) {
        if (featOkTst && casFeat_Treatment_modifier == null)
      jcas.throwFeatMissing("Treatment_modifier", "gov.va.vinci.leo.context.types.TermContext");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Treatment_modifier);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTreatment_modifier(int addr, String v) {
        if (featOkTst && casFeat_Treatment_modifier == null)
      jcas.throwFeatMissing("Treatment_modifier", "gov.va.vinci.leo.context.types.TermContext");
    ll_cas.ll_setStringValue(addr, casFeatCode_Treatment_modifier, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Treatment_term;
  /** @generated */
  final int     casFeatCode_Treatment_term;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTreatment_term(int addr) {
        if (featOkTst && casFeat_Treatment_term == null)
      jcas.throwFeatMissing("Treatment_term", "gov.va.vinci.leo.context.types.TermContext");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Treatment_term);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTreatment_term(int addr, String v) {
        if (featOkTst && casFeat_Treatment_term == null)
      jcas.throwFeatMissing("Treatment_term", "gov.va.vinci.leo.context.types.TermContext");
    ll_cas.ll_setStringValue(addr, casFeatCode_Treatment_term, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Castrate_term;
  /** @generated */
  final int     casFeatCode_Castrate_term;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getCastrate_term(int addr) {
        if (featOkTst && casFeat_Castrate_term == null)
      jcas.throwFeatMissing("Castrate_term", "gov.va.vinci.leo.context.types.TermContext");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Castrate_term);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCastrate_term(int addr, String v) {
        if (featOkTst && casFeat_Castrate_term == null)
      jcas.throwFeatMissing("Castrate_term", "gov.va.vinci.leo.context.types.TermContext");
    ll_cas.ll_setStringValue(addr, casFeatCode_Castrate_term, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Castrate_sensitive;
  /** @generated */
  final int     casFeatCode_Castrate_sensitive;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getCastrate_sensitive(int addr) {
        if (featOkTst && casFeat_Castrate_sensitive == null)
      jcas.throwFeatMissing("Castrate_sensitive", "gov.va.vinci.leo.context.types.TermContext");
    return ll_cas.ll_getIntValue(addr, casFeatCode_Castrate_sensitive);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCastrate_sensitive(int addr, int v) {
        if (featOkTst && casFeat_Castrate_sensitive == null)
      jcas.throwFeatMissing("Castrate_sensitive", "gov.va.vinci.leo.context.types.TermContext");
    ll_cas.ll_setIntValue(addr, casFeatCode_Castrate_sensitive, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Castrate_resistant;
  /** @generated */
  final int     casFeatCode_Castrate_resistant;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getCastrate_resistant(int addr) {
        if (featOkTst && casFeat_Castrate_resistant == null)
      jcas.throwFeatMissing("Castrate_resistant", "gov.va.vinci.leo.context.types.TermContext");
    return ll_cas.ll_getIntValue(addr, casFeatCode_Castrate_resistant);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCastrate_resistant(int addr, int v) {
        if (featOkTst && casFeat_Castrate_resistant == null)
      jcas.throwFeatMissing("Castrate_resistant", "gov.va.vinci.leo.context.types.TermContext");
    ll_cas.ll_setIntValue(addr, casFeatCode_Castrate_resistant, v);}
    
  
 
  /** @generated */
  final Feature casFeat_mPCa_flag;
  /** @generated */
  final int     casFeatCode_mPCa_flag;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getMPCa_flag(int addr) {
        if (featOkTst && casFeat_mPCa_flag == null)
      jcas.throwFeatMissing("mPCa_flag", "gov.va.vinci.leo.context.types.TermContext");
    return ll_cas.ll_getIntValue(addr, casFeatCode_mPCa_flag);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMPCa_flag(int addr, int v) {
        if (featOkTst && casFeat_mPCa_flag == null)
      jcas.throwFeatMissing("mPCa_flag", "gov.va.vinci.leo.context.types.TermContext");
    ll_cas.ll_setIntValue(addr, casFeatCode_mPCa_flag, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public TermContext_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Concept = jcas.getRequiredFeatureDE(casType, "Concept", "uima.cas.String", featOkTst);
    casFeatCode_Concept  = (null == casFeat_Concept) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Concept).getCode();

 
    casFeat_Metastatic_term = jcas.getRequiredFeatureDE(casType, "Metastatic_term", "uima.cas.String", featOkTst);
    casFeatCode_Metastatic_term  = (null == casFeat_Metastatic_term) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Metastatic_term).getCode();

 
    casFeat_Experiencer = jcas.getRequiredFeatureDE(casType, "Experiencer", "uima.cas.String", featOkTst);
    casFeatCode_Experiencer  = (null == casFeat_Experiencer) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Experiencer).getCode();

 
    casFeat_Negation = jcas.getRequiredFeatureDE(casType, "Negation", "uima.cas.String", featOkTst);
    casFeatCode_Negation  = (null == casFeat_Negation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Negation).getCode();

 
    casFeat_Temporality = jcas.getRequiredFeatureDE(casType, "Temporality", "uima.cas.String", featOkTst);
    casFeatCode_Temporality  = (null == casFeat_Temporality) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Temporality).getCode();

 
    casFeat_Modifier_term = jcas.getRequiredFeatureDE(casType, "Modifier_term", "uima.cas.String", featOkTst);
    casFeatCode_Modifier_term  = (null == casFeat_Modifier_term) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Modifier_term).getCode();

 
    casFeat_Modifier = jcas.getRequiredFeatureDE(casType, "Modifier", "uima.cas.String", featOkTst);
    casFeatCode_Modifier  = (null == casFeat_Modifier) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Modifier).getCode();

 
    casFeat_Anatomy = jcas.getRequiredFeatureDE(casType, "Anatomy", "uima.cas.String", featOkTst);
    casFeatCode_Anatomy  = (null == casFeat_Anatomy) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Anatomy).getCode();

 
    casFeat_Hormone_modifier = jcas.getRequiredFeatureDE(casType, "Hormone_modifier", "uima.cas.String", featOkTst);
    casFeatCode_Hormone_modifier  = (null == casFeat_Hormone_modifier) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Hormone_modifier).getCode();

 
    casFeat_Hormone_modifier_term = jcas.getRequiredFeatureDE(casType, "Hormone_modifier_term", "uima.cas.String", featOkTst);
    casFeatCode_Hormone_modifier_term  = (null == casFeat_Hormone_modifier_term) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Hormone_modifier_term).getCode();

 
    casFeat_Treatment_modifier = jcas.getRequiredFeatureDE(casType, "Treatment_modifier", "uima.cas.String", featOkTst);
    casFeatCode_Treatment_modifier  = (null == casFeat_Treatment_modifier) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Treatment_modifier).getCode();

 
    casFeat_Treatment_term = jcas.getRequiredFeatureDE(casType, "Treatment_term", "uima.cas.String", featOkTst);
    casFeatCode_Treatment_term  = (null == casFeat_Treatment_term) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Treatment_term).getCode();

 
    casFeat_Castrate_term = jcas.getRequiredFeatureDE(casType, "Castrate_term", "uima.cas.String", featOkTst);
    casFeatCode_Castrate_term  = (null == casFeat_Castrate_term) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Castrate_term).getCode();

 
    casFeat_Castrate_sensitive = jcas.getRequiredFeatureDE(casType, "Castrate_sensitive", "uima.cas.Integer", featOkTst);
    casFeatCode_Castrate_sensitive  = (null == casFeat_Castrate_sensitive) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Castrate_sensitive).getCode();

 
    casFeat_Castrate_resistant = jcas.getRequiredFeatureDE(casType, "Castrate_resistant", "uima.cas.Integer", featOkTst);
    casFeatCode_Castrate_resistant  = (null == casFeat_Castrate_resistant) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Castrate_resistant).getCode();

 
    casFeat_mPCa_flag = jcas.getRequiredFeatureDE(casType, "mPCa_flag", "uima.cas.Integer", featOkTst);
    casFeatCode_mPCa_flag  = (null == casFeat_mPCa_flag) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_mPCa_flag).getCode();

  }
}



    