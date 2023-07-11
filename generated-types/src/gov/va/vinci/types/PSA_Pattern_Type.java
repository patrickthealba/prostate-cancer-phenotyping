
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
public class PSA_Pattern_Type extends AnnotationPatternType_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = PSA_Pattern.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("gov.va.vinci.types.PSA_Pattern");
 
  /** @generated */
  final Feature casFeat_PSA_Value;
  /** @generated */
  final int     casFeatCode_PSA_Value;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getPSA_Value(int addr) {
        if (featOkTst && casFeat_PSA_Value == null)
      jcas.throwFeatMissing("PSA_Value", "gov.va.vinci.types.PSA_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_PSA_Value);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPSA_Value(int addr, String v) {
        if (featOkTst && casFeat_PSA_Value == null)
      jcas.throwFeatMissing("PSA_Value", "gov.va.vinci.types.PSA_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_PSA_Value, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public PSA_Pattern_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_PSA_Value = jcas.getRequiredFeatureDE(casType, "PSA_Value", "uima.cas.String", featOkTst);
    casFeatCode_PSA_Value  = (null == casFeat_PSA_Value) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_PSA_Value).getCode();

  }
}



    