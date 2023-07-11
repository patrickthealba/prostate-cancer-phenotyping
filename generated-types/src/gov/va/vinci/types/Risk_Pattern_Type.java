
/* First created by JCasGen Tue Jun 08 09:59:37 CDT 2021 */
package gov.va.vinci.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import gov.va.vinci.leo.annotationpattern.types.AnnotationPatternType_Type;

/** 
 * Updated by JCasGen Tue Jun 08 09:59:37 CDT 2021
 * @generated */
public class Risk_Pattern_Type extends AnnotationPatternType_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Risk_Pattern.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("gov.va.vinci.types.Risk_Pattern");
 
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
      jcas.throwFeatMissing("Gleason_Score", "gov.va.vinci.types.Risk_Pattern");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_Gleason_Score);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGleason_Score(int addr, float v) {
        if (featOkTst && casFeat_Gleason_Score == null)
      jcas.throwFeatMissing("Gleason_Score", "gov.va.vinci.types.Risk_Pattern");
    ll_cas.ll_setFloatValue(addr, casFeatCode_Gleason_Score, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Cores;
  /** @generated */
  final int     casFeatCode_Cores;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getCores(int addr) {
        if (featOkTst && casFeat_Cores == null)
      jcas.throwFeatMissing("Cores", "gov.va.vinci.types.Risk_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Cores);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCores(int addr, String v) {
        if (featOkTst && casFeat_Cores == null)
      jcas.throwFeatMissing("Cores", "gov.va.vinci.types.Risk_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Cores, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Percent_Involved;
  /** @generated */
  final int     casFeatCode_Percent_Involved;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getPercent_Involved(int addr) {
        if (featOkTst && casFeat_Percent_Involved == null)
      jcas.throwFeatMissing("Percent_Involved", "gov.va.vinci.types.Risk_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Percent_Involved);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPercent_Involved(int addr, String v) {
        if (featOkTst && casFeat_Percent_Involved == null)
      jcas.throwFeatMissing("Percent_Involved", "gov.va.vinci.types.Risk_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Percent_Involved, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Risk_Pattern_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Gleason_Score = jcas.getRequiredFeatureDE(casType, "Gleason_Score", "uima.cas.Float", featOkTst);
    casFeatCode_Gleason_Score  = (null == casFeat_Gleason_Score) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Gleason_Score).getCode();

 
    casFeat_Cores = jcas.getRequiredFeatureDE(casType, "Cores", "uima.cas.String", featOkTst);
    casFeatCode_Cores  = (null == casFeat_Cores) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Cores).getCode();

 
    casFeat_Percent_Involved = jcas.getRequiredFeatureDE(casType, "Percent_Involved", "uima.cas.String", featOkTst);
    casFeatCode_Percent_Involved  = (null == casFeat_Percent_Involved) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Percent_Involved).getCode();

  }
}



    