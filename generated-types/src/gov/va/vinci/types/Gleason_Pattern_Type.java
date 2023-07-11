
/* First created by JCasGen Tue Jun 08 09:59:36 CDT 2021 */
package gov.va.vinci.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import gov.va.vinci.leo.annotationpattern.types.AnnotationPatternType_Type;

/** 
 * Updated by JCasGen Tue Jun 08 09:59:36 CDT 2021
 * @generated */
public class Gleason_Pattern_Type extends AnnotationPatternType_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Gleason_Pattern.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("gov.va.vinci.types.Gleason_Pattern");
 
  /** @generated */
  final Feature casFeat_Gleason_Score;
  /** @generated */
  final int     casFeatCode_Gleason_Score;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public float getGleason_Score(int addr) {
        if (featOkTst && casFeat_Gleason_Score == null)
      jcas.throwFeatMissing("Gleason_Score", "gov.va.vinci.types.Gleason_Pattern");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_Gleason_Score);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGleason_Score(int addr, float v) {
        if (featOkTst && casFeat_Gleason_Score == null)
      jcas.throwFeatMissing("Gleason_Score", "gov.va.vinci.types.Gleason_Pattern");
    ll_cas.ll_setFloatValue(addr, casFeatCode_Gleason_Score, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Gleason_Modifier;
  /** @generated */
  final int     casFeatCode_Gleason_Modifier;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getGleason_Modifier(int addr) {
        if (featOkTst && casFeat_Gleason_Modifier == null)
      jcas.throwFeatMissing("Gleason_Modifier", "gov.va.vinci.types.Gleason_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Gleason_Modifier);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGleason_Modifier(int addr, String v) {
        if (featOkTst && casFeat_Gleason_Modifier == null)
      jcas.throwFeatMissing("Gleason_Modifier", "gov.va.vinci.types.Gleason_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Gleason_Modifier, v);}
    
  
 
  /** @generated */
  final Feature casFeat_PSA_in_Report;
  /** @generated */
  final int     casFeatCode_PSA_in_Report;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getPSA_in_Report(int addr) {
        if (featOkTst && casFeat_PSA_in_Report == null)
      jcas.throwFeatMissing("PSA_in_Report", "gov.va.vinci.types.Gleason_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_PSA_in_Report);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPSA_in_Report(int addr, String v) {
        if (featOkTst && casFeat_PSA_in_Report == null)
      jcas.throwFeatMissing("PSA_in_Report", "gov.va.vinci.types.Gleason_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_PSA_in_Report, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Gleason_Pattern_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Gleason_Score = jcas.getRequiredFeatureDE(casType, "Gleason_Score", "uima.cas.Float", featOkTst);
    casFeatCode_Gleason_Score  = (null == casFeat_Gleason_Score) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Gleason_Score).getCode();

 
    casFeat_Gleason_Modifier = jcas.getRequiredFeatureDE(casType, "Gleason_Modifier", "uima.cas.String", featOkTst);
    casFeatCode_Gleason_Modifier  = (null == casFeat_Gleason_Modifier) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Gleason_Modifier).getCode();

 
    casFeat_PSA_in_Report = jcas.getRequiredFeatureDE(casType, "PSA_in_Report", "uima.cas.String", featOkTst);
    casFeatCode_PSA_in_Report  = (null == casFeat_PSA_in_Report) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_PSA_in_Report).getCode();

  }
}



    