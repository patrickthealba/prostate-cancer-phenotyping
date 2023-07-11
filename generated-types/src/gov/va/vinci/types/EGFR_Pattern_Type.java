
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
public class EGFR_Pattern_Type extends AnnotationPatternType_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = EGFR_Pattern.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("gov.va.vinci.types.EGFR_Pattern");
 
  /** @generated */
  final Feature casFeat_Term_Type;
  /** @generated */
  final int     casFeatCode_Term_Type;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTerm_Type(int addr) {
        if (featOkTst && casFeat_Term_Type == null)
      jcas.throwFeatMissing("Term_Type", "gov.va.vinci.types.EGFR_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Term_Type);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTerm_Type(int addr, String v) {
        if (featOkTst && casFeat_Term_Type == null)
      jcas.throwFeatMissing("Term_Type", "gov.va.vinci.types.EGFR_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Term_Type, v);}
    
  
 
  /** @generated */
  final Feature casFeat_NLP_Value;
  /** @generated */
  final int     casFeatCode_NLP_Value;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getNLP_Value(int addr) {
        if (featOkTst && casFeat_NLP_Value == null)
      jcas.throwFeatMissing("NLP_Value", "gov.va.vinci.types.EGFR_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_NLP_Value);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNLP_Value(int addr, String v) {
        if (featOkTst && casFeat_NLP_Value == null)
      jcas.throwFeatMissing("NLP_Value", "gov.va.vinci.types.EGFR_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_NLP_Value, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Snippet_Type;
  /** @generated */
  final int     casFeatCode_Snippet_Type;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSnippet_Type(int addr) {
        if (featOkTst && casFeat_Snippet_Type == null)
      jcas.throwFeatMissing("Snippet_Type", "gov.va.vinci.types.EGFR_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Snippet_Type);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSnippet_Type(int addr, String v) {
        if (featOkTst && casFeat_Snippet_Type == null)
      jcas.throwFeatMissing("Snippet_Type", "gov.va.vinci.types.EGFR_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Snippet_Type, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Annotated_Snippet;
  /** @generated */
  final int     casFeatCode_Annotated_Snippet;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getAnnotated_Snippet(int addr) {
        if (featOkTst && casFeat_Annotated_Snippet == null)
      jcas.throwFeatMissing("Annotated_Snippet", "gov.va.vinci.types.EGFR_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Annotated_Snippet);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAnnotated_Snippet(int addr, String v) {
        if (featOkTst && casFeat_Annotated_Snippet == null)
      jcas.throwFeatMissing("Annotated_Snippet", "gov.va.vinci.types.EGFR_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Annotated_Snippet, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Anchored_Sentence;
  /** @generated */
  final int     casFeatCode_Anchored_Sentence;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getAnchored_Sentence(int addr) {
        if (featOkTst && casFeat_Anchored_Sentence == null)
      jcas.throwFeatMissing("Anchored_Sentence", "gov.va.vinci.types.EGFR_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Anchored_Sentence);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAnchored_Sentence(int addr, String v) {
        if (featOkTst && casFeat_Anchored_Sentence == null)
      jcas.throwFeatMissing("Anchored_Sentence", "gov.va.vinci.types.EGFR_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Anchored_Sentence, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Value_in_Sentence;
  /** @generated */
  final int     casFeatCode_Value_in_Sentence;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getValue_in_Sentence(int addr) {
        if (featOkTst && casFeat_Value_in_Sentence == null)
      jcas.throwFeatMissing("Value_in_Sentence", "gov.va.vinci.types.EGFR_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Value_in_Sentence);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setValue_in_Sentence(int addr, String v) {
        if (featOkTst && casFeat_Value_in_Sentence == null)
      jcas.throwFeatMissing("Value_in_Sentence", "gov.va.vinci.types.EGFR_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Value_in_Sentence, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Value_Term;
  /** @generated */
  final int     casFeatCode_Value_Term;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getValue_Term(int addr) {
        if (featOkTst && casFeat_Value_Term == null)
      jcas.throwFeatMissing("Value_Term", "gov.va.vinci.types.EGFR_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Value_Term);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setValue_Term(int addr, String v) {
        if (featOkTst && casFeat_Value_Term == null)
      jcas.throwFeatMissing("Value_Term", "gov.va.vinci.types.EGFR_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Value_Term, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Tight_Window;
  /** @generated */
  final int     casFeatCode_Tight_Window;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTight_Window(int addr) {
        if (featOkTst && casFeat_Tight_Window == null)
      jcas.throwFeatMissing("Tight_Window", "gov.va.vinci.types.EGFR_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Tight_Window);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTight_Window(int addr, String v) {
        if (featOkTst && casFeat_Tight_Window == null)
      jcas.throwFeatMissing("Tight_Window", "gov.va.vinci.types.EGFR_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Tight_Window, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Term_Start;
  /** @generated */
  final int     casFeatCode_Term_Start;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getTerm_Start(int addr) {
        if (featOkTst && casFeat_Term_Start == null)
      jcas.throwFeatMissing("Term_Start", "gov.va.vinci.types.EGFR_Pattern");
    return ll_cas.ll_getIntValue(addr, casFeatCode_Term_Start);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTerm_Start(int addr, int v) {
        if (featOkTst && casFeat_Term_Start == null)
      jcas.throwFeatMissing("Term_Start", "gov.va.vinci.types.EGFR_Pattern");
    ll_cas.ll_setIntValue(addr, casFeatCode_Term_Start, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Term_End;
  /** @generated */
  final int     casFeatCode_Term_End;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getTerm_End(int addr) {
        if (featOkTst && casFeat_Term_End == null)
      jcas.throwFeatMissing("Term_End", "gov.va.vinci.types.EGFR_Pattern");
    return ll_cas.ll_getIntValue(addr, casFeatCode_Term_End);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTerm_End(int addr, int v) {
        if (featOkTst && casFeat_Term_End == null)
      jcas.throwFeatMissing("Term_End", "gov.va.vinci.types.EGFR_Pattern");
    ll_cas.ll_setIntValue(addr, casFeatCode_Term_End, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public EGFR_Pattern_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Term_Type = jcas.getRequiredFeatureDE(casType, "Term_Type", "uima.cas.String", featOkTst);
    casFeatCode_Term_Type  = (null == casFeat_Term_Type) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Term_Type).getCode();

 
    casFeat_NLP_Value = jcas.getRequiredFeatureDE(casType, "NLP_Value", "uima.cas.String", featOkTst);
    casFeatCode_NLP_Value  = (null == casFeat_NLP_Value) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_NLP_Value).getCode();

 
    casFeat_Snippet_Type = jcas.getRequiredFeatureDE(casType, "Snippet_Type", "uima.cas.String", featOkTst);
    casFeatCode_Snippet_Type  = (null == casFeat_Snippet_Type) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Snippet_Type).getCode();

 
    casFeat_Annotated_Snippet = jcas.getRequiredFeatureDE(casType, "Annotated_Snippet", "uima.cas.String", featOkTst);
    casFeatCode_Annotated_Snippet  = (null == casFeat_Annotated_Snippet) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Annotated_Snippet).getCode();

 
    casFeat_Anchored_Sentence = jcas.getRequiredFeatureDE(casType, "Anchored_Sentence", "uima.cas.String", featOkTst);
    casFeatCode_Anchored_Sentence  = (null == casFeat_Anchored_Sentence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Anchored_Sentence).getCode();

 
    casFeat_Value_in_Sentence = jcas.getRequiredFeatureDE(casType, "Value_in_Sentence", "uima.cas.String", featOkTst);
    casFeatCode_Value_in_Sentence  = (null == casFeat_Value_in_Sentence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Value_in_Sentence).getCode();

 
    casFeat_Value_Term = jcas.getRequiredFeatureDE(casType, "Value_Term", "uima.cas.String", featOkTst);
    casFeatCode_Value_Term  = (null == casFeat_Value_Term) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Value_Term).getCode();

 
    casFeat_Tight_Window = jcas.getRequiredFeatureDE(casType, "Tight_Window", "uima.cas.String", featOkTst);
    casFeatCode_Tight_Window  = (null == casFeat_Tight_Window) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Tight_Window).getCode();

 
    casFeat_Term_Start = jcas.getRequiredFeatureDE(casType, "Term_Start", "uima.cas.Integer", featOkTst);
    casFeatCode_Term_Start  = (null == casFeat_Term_Start) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Term_Start).getCode();

 
    casFeat_Term_End = jcas.getRequiredFeatureDE(casType, "Term_End", "uima.cas.Integer", featOkTst);
    casFeatCode_Term_End  = (null == casFeat_Term_End) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Term_End).getCode();

  }
}



    