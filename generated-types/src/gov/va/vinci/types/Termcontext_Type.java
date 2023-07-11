
/* First created by JCasGen Thu May 09 09:08:56 CDT 2019 */
package gov.va.vinci.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import gov.va.vinci.leo.context.types.Context_Type;

/** 
 * Updated by JCasGen Thu May 09 09:08:56 CDT 2019
 * @generated */
public class Termcontext_Type extends Context_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Termcontext.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("gov.va.vinci.types.Termcontext");
 
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
      jcas.throwFeatMissing("Concept", "gov.va.vinci.types.Termcontext");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Concept);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setConcept(int addr, String v) {
        if (featOkTst && casFeat_Concept == null)
      jcas.throwFeatMissing("Concept", "gov.va.vinci.types.Termcontext");
    ll_cas.ll_setStringValue(addr, casFeatCode_Concept, v);}
    
  
 
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
      jcas.throwFeatMissing("Experiencer", "gov.va.vinci.types.Termcontext");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Experiencer);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setExperiencer(int addr, String v) {
        if (featOkTst && casFeat_Experiencer == null)
      jcas.throwFeatMissing("Experiencer", "gov.va.vinci.types.Termcontext");
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
      jcas.throwFeatMissing("Negation", "gov.va.vinci.types.Termcontext");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Negation);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNegation(int addr, String v) {
        if (featOkTst && casFeat_Negation == null)
      jcas.throwFeatMissing("Negation", "gov.va.vinci.types.Termcontext");
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
      jcas.throwFeatMissing("Temporality", "gov.va.vinci.types.Termcontext");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Temporality);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTemporality(int addr, String v) {
        if (featOkTst && casFeat_Temporality == null)
      jcas.throwFeatMissing("Temporality", "gov.va.vinci.types.Termcontext");
    ll_cas.ll_setStringValue(addr, casFeatCode_Temporality, v);}
    
  
 
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
      jcas.throwFeatMissing("Modifier", "gov.va.vinci.types.Termcontext");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Modifier);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setModifier(int addr, String v) {
        if (featOkTst && casFeat_Modifier == null)
      jcas.throwFeatMissing("Modifier", "gov.va.vinci.types.Termcontext");
    ll_cas.ll_setStringValue(addr, casFeatCode_Modifier, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Termcontext_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Concept = jcas.getRequiredFeatureDE(casType, "Concept", "uima.cas.String", featOkTst);
    casFeatCode_Concept  = (null == casFeat_Concept) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Concept).getCode();

 
    casFeat_Experiencer = jcas.getRequiredFeatureDE(casType, "Experiencer", "uima.cas.String", featOkTst);
    casFeatCode_Experiencer  = (null == casFeat_Experiencer) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Experiencer).getCode();

 
    casFeat_Negation = jcas.getRequiredFeatureDE(casType, "Negation", "uima.cas.String", featOkTst);
    casFeatCode_Negation  = (null == casFeat_Negation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Negation).getCode();

 
    casFeat_Temporality = jcas.getRequiredFeatureDE(casType, "Temporality", "uima.cas.String", featOkTst);
    casFeatCode_Temporality  = (null == casFeat_Temporality) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Temporality).getCode();

 
    casFeat_Modifier = jcas.getRequiredFeatureDE(casType, "Modifier", "uima.cas.String", featOkTst);
    casFeatCode_Modifier  = (null == casFeat_Modifier) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Modifier).getCode();

  }
}



    