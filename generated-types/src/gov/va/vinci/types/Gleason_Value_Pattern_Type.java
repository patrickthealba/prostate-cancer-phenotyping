
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
public class Gleason_Value_Pattern_Type extends AnnotationPatternType_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Gleason_Value_Pattern.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("gov.va.vinci.types.Gleason_Value_Pattern");
 
  /** @generated */
  final Feature casFeat_Primary;
  /** @generated */
  final int     casFeatCode_Primary;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getPrimary(int addr) {
        if (featOkTst && casFeat_Primary == null)
      jcas.throwFeatMissing("Primary", "gov.va.vinci.types.Gleason_Value_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Primary);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPrimary(int addr, String v) {
        if (featOkTst && casFeat_Primary == null)
      jcas.throwFeatMissing("Primary", "gov.va.vinci.types.Gleason_Value_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Primary, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Secondary;
  /** @generated */
  final int     casFeatCode_Secondary;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSecondary(int addr) {
        if (featOkTst && casFeat_Secondary == null)
      jcas.throwFeatMissing("Secondary", "gov.va.vinci.types.Gleason_Value_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Secondary);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSecondary(int addr, String v) {
        if (featOkTst && casFeat_Secondary == null)
      jcas.throwFeatMissing("Secondary", "gov.va.vinci.types.Gleason_Value_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Secondary, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Total;
  /** @generated */
  final int     casFeatCode_Total;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public float getTotal(int addr) {
        if (featOkTst && casFeat_Total == null)
      jcas.throwFeatMissing("Total", "gov.va.vinci.types.Gleason_Value_Pattern");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_Total);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTotal(int addr, float v) {
        if (featOkTst && casFeat_Total == null)
      jcas.throwFeatMissing("Total", "gov.va.vinci.types.Gleason_Value_Pattern");
    ll_cas.ll_setFloatValue(addr, casFeatCode_Total, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Gleason_Value_Pattern_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Primary = jcas.getRequiredFeatureDE(casType, "Primary", "uima.cas.String", featOkTst);
    casFeatCode_Primary  = (null == casFeat_Primary) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Primary).getCode();

 
    casFeat_Secondary = jcas.getRequiredFeatureDE(casType, "Secondary", "uima.cas.String", featOkTst);
    casFeatCode_Secondary  = (null == casFeat_Secondary) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Secondary).getCode();

 
    casFeat_Total = jcas.getRequiredFeatureDE(casType, "Total", "uima.cas.Float", featOkTst);
    casFeatCode_Total  = (null == casFeat_Total) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Total).getCode();

  }
}



    