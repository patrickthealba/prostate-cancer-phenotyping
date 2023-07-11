
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
public class Core_Pattern_Type extends AnnotationPatternType_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Core_Pattern.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("gov.va.vinci.types.Core_Pattern");
 
  /** @generated */
  final Feature casFeat_Cores_Involved;
  /** @generated */
  final int     casFeatCode_Cores_Involved;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getCores_Involved(int addr) {
        if (featOkTst && casFeat_Cores_Involved == null)
      jcas.throwFeatMissing("Cores_Involved", "gov.va.vinci.types.Core_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Cores_Involved);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCores_Involved(int addr, String v) {
        if (featOkTst && casFeat_Cores_Involved == null)
      jcas.throwFeatMissing("Cores_Involved", "gov.va.vinci.types.Core_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Cores_Involved, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Total_Cores;
  /** @generated */
  final int     casFeatCode_Total_Cores;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTotal_Cores(int addr) {
        if (featOkTst && casFeat_Total_Cores == null)
      jcas.throwFeatMissing("Total_Cores", "gov.va.vinci.types.Core_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Total_Cores);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTotal_Cores(int addr, String v) {
        if (featOkTst && casFeat_Total_Cores == null)
      jcas.throwFeatMissing("Total_Cores", "gov.va.vinci.types.Core_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Total_Cores, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Core_Pattern_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Cores_Involved = jcas.getRequiredFeatureDE(casType, "Cores_Involved", "uima.cas.String", featOkTst);
    casFeatCode_Cores_Involved  = (null == casFeat_Cores_Involved) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Cores_Involved).getCode();

 
    casFeat_Total_Cores = jcas.getRequiredFeatureDE(casType, "Total_Cores", "uima.cas.String", featOkTst);
    casFeatCode_Total_Cores  = (null == casFeat_Total_Cores) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Total_Cores).getCode();

  }
}



    