
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
public class Involvement_Value_Pattern_Type extends AnnotationPatternType_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Involvement_Value_Pattern.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("gov.va.vinci.types.Involvement_Value_Pattern");
 
  /** @generated */
  final Feature casFeat_Value_1;
  /** @generated */
  final int     casFeatCode_Value_1;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getValue_1(int addr) {
        if (featOkTst && casFeat_Value_1 == null)
      jcas.throwFeatMissing("Value_1", "gov.va.vinci.types.Involvement_Value_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Value_1);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setValue_1(int addr, String v) {
        if (featOkTst && casFeat_Value_1 == null)
      jcas.throwFeatMissing("Value_1", "gov.va.vinci.types.Involvement_Value_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Value_1, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Value_2;
  /** @generated */
  final int     casFeatCode_Value_2;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getValue_2(int addr) {
        if (featOkTst && casFeat_Value_2 == null)
      jcas.throwFeatMissing("Value_2", "gov.va.vinci.types.Involvement_Value_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Value_2);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setValue_2(int addr, String v) {
        if (featOkTst && casFeat_Value_2 == null)
      jcas.throwFeatMissing("Value_2", "gov.va.vinci.types.Involvement_Value_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Value_2, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Involvement_Value_Pattern_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Value_1 = jcas.getRequiredFeatureDE(casType, "Value_1", "uima.cas.String", featOkTst);
    casFeatCode_Value_1  = (null == casFeat_Value_1) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Value_1).getCode();

 
    casFeat_Value_2 = jcas.getRequiredFeatureDE(casType, "Value_2", "uima.cas.String", featOkTst);
    casFeatCode_Value_2  = (null == casFeat_Value_2) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Value_2).getCode();

  }
}



    