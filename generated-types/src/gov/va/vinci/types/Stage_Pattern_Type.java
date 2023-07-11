
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
public class Stage_Pattern_Type extends AnnotationPatternType_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Stage_Pattern.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("gov.va.vinci.types.Stage_Pattern");
 
  /** @generated */
  final Feature casFeat_Stage;
  /** @generated */
  final int     casFeatCode_Stage;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getStage(int addr) {
        if (featOkTst && casFeat_Stage == null)
      jcas.throwFeatMissing("Stage", "gov.va.vinci.types.Stage_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Stage);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setStage(int addr, String v) {
        if (featOkTst && casFeat_Stage == null)
      jcas.throwFeatMissing("Stage", "gov.va.vinci.types.Stage_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Stage, v);}
    
  
 
  /** @generated */
  final Feature casFeat_T;
  /** @generated */
  final int     casFeatCode_T;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getT(int addr) {
        if (featOkTst && casFeat_T == null)
      jcas.throwFeatMissing("T", "gov.va.vinci.types.Stage_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_T);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setT(int addr, String v) {
        if (featOkTst && casFeat_T == null)
      jcas.throwFeatMissing("T", "gov.va.vinci.types.Stage_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_T, v);}
    
  
 
  /** @generated */
  final Feature casFeat_N;
  /** @generated */
  final int     casFeatCode_N;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getN(int addr) {
        if (featOkTst && casFeat_N == null)
      jcas.throwFeatMissing("N", "gov.va.vinci.types.Stage_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_N);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setN(int addr, String v) {
        if (featOkTst && casFeat_N == null)
      jcas.throwFeatMissing("N", "gov.va.vinci.types.Stage_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_N, v);}
    
  
 
  /** @generated */
  final Feature casFeat_M;
  /** @generated */
  final int     casFeatCode_M;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getM(int addr) {
        if (featOkTst && casFeat_M == null)
      jcas.throwFeatMissing("M", "gov.va.vinci.types.Stage_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_M);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setM(int addr, String v) {
        if (featOkTst && casFeat_M == null)
      jcas.throwFeatMissing("M", "gov.va.vinci.types.Stage_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_M, v);}
    
  
 
  /** @generated */
  final Feature casFeat_G;
  /** @generated */
  final int     casFeatCode_G;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getG(int addr) {
        if (featOkTst && casFeat_G == null)
      jcas.throwFeatMissing("G", "gov.va.vinci.types.Stage_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_G);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setG(int addr, String v) {
        if (featOkTst && casFeat_G == null)
      jcas.throwFeatMissing("G", "gov.va.vinci.types.Stage_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_G, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Stage_Type;
  /** @generated */
  final int     casFeatCode_Stage_Type;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getStage_Type(int addr) {
        if (featOkTst && casFeat_Stage_Type == null)
      jcas.throwFeatMissing("Stage_Type", "gov.va.vinci.types.Stage_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Stage_Type);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setStage_Type(int addr, String v) {
        if (featOkTst && casFeat_Stage_Type == null)
      jcas.throwFeatMissing("Stage_Type", "gov.va.vinci.types.Stage_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Stage_Type, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Stage_Value;
  /** @generated */
  final int     casFeatCode_Stage_Value;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getStage_Value(int addr) {
        if (featOkTst && casFeat_Stage_Value == null)
      jcas.throwFeatMissing("Stage_Value", "gov.va.vinci.types.Stage_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Stage_Value);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setStage_Value(int addr, String v) {
        if (featOkTst && casFeat_Stage_Value == null)
      jcas.throwFeatMissing("Stage_Value", "gov.va.vinci.types.Stage_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Stage_Value, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Stage_Modifier;
  /** @generated */
  final int     casFeatCode_Stage_Modifier;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getStage_Modifier(int addr) {
        if (featOkTst && casFeat_Stage_Modifier == null)
      jcas.throwFeatMissing("Stage_Modifier", "gov.va.vinci.types.Stage_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Stage_Modifier);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setStage_Modifier(int addr, String v) {
        if (featOkTst && casFeat_Stage_Modifier == null)
      jcas.throwFeatMissing("Stage_Modifier", "gov.va.vinci.types.Stage_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Stage_Modifier, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Other_Term;
  /** @generated */
  final int     casFeatCode_Other_Term;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getOther_Term(int addr) {
        if (featOkTst && casFeat_Other_Term == null)
      jcas.throwFeatMissing("Other_Term", "gov.va.vinci.types.Stage_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Other_Term);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setOther_Term(int addr, String v) {
        if (featOkTst && casFeat_Other_Term == null)
      jcas.throwFeatMissing("Other_Term", "gov.va.vinci.types.Stage_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Other_Term, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Stage_Pattern_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Stage = jcas.getRequiredFeatureDE(casType, "Stage", "uima.cas.String", featOkTst);
    casFeatCode_Stage  = (null == casFeat_Stage) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Stage).getCode();

 
    casFeat_T = jcas.getRequiredFeatureDE(casType, "T", "uima.cas.String", featOkTst);
    casFeatCode_T  = (null == casFeat_T) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_T).getCode();

 
    casFeat_N = jcas.getRequiredFeatureDE(casType, "N", "uima.cas.String", featOkTst);
    casFeatCode_N  = (null == casFeat_N) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_N).getCode();

 
    casFeat_M = jcas.getRequiredFeatureDE(casType, "M", "uima.cas.String", featOkTst);
    casFeatCode_M  = (null == casFeat_M) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_M).getCode();

 
    casFeat_G = jcas.getRequiredFeatureDE(casType, "G", "uima.cas.String", featOkTst);
    casFeatCode_G  = (null == casFeat_G) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_G).getCode();

 
    casFeat_Stage_Type = jcas.getRequiredFeatureDE(casType, "Stage_Type", "uima.cas.String", featOkTst);
    casFeatCode_Stage_Type  = (null == casFeat_Stage_Type) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Stage_Type).getCode();

 
    casFeat_Stage_Value = jcas.getRequiredFeatureDE(casType, "Stage_Value", "uima.cas.String", featOkTst);
    casFeatCode_Stage_Value  = (null == casFeat_Stage_Value) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Stage_Value).getCode();

 
    casFeat_Stage_Modifier = jcas.getRequiredFeatureDE(casType, "Stage_Modifier", "uima.cas.String", featOkTst);
    casFeatCode_Stage_Modifier  = (null == casFeat_Stage_Modifier) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Stage_Modifier).getCode();

 
    casFeat_Other_Term = jcas.getRequiredFeatureDE(casType, "Other_Term", "uima.cas.String", featOkTst);
    casFeatCode_Other_Term  = (null == casFeat_Other_Term) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Other_Term).getCode();

  }
}



    