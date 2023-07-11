
/* First created by JCasGen Tue Apr 30 12:25:23 CDT 2019 */
package gov.va.vinci.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import gov.va.vinci.leo.annotationpattern.types.AnnotationPatternType_Type;

/** 
 * Updated by JCasGen Tue Apr 30 12:25:23 CDT 2019
 * @generated */
public class Output_Pattern_Type extends AnnotationPatternType_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Output_Pattern.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("gov.va.vinci.types.Output_Pattern");
 
  /** @generated */
  final Feature casFeat_Term;
  /** @generated */
  final int     casFeatCode_Term;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTerm(int addr) {
        if (featOkTst && casFeat_Term == null)
      jcas.throwFeatMissing("Term", "gov.va.vinci.types.Output_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Term);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTerm(int addr, String v) {
        if (featOkTst && casFeat_Term == null)
      jcas.throwFeatMissing("Term", "gov.va.vinci.types.Output_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Term, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Term_Pattern;
  /** @generated */
  final int     casFeatCode_Term_Pattern;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTerm_Pattern(int addr) {
        if (featOkTst && casFeat_Term_Pattern == null)
      jcas.throwFeatMissing("Term_Pattern", "gov.va.vinci.types.Output_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Term_Pattern);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTerm_Pattern(int addr, String v) {
        if (featOkTst && casFeat_Term_Pattern == null)
      jcas.throwFeatMissing("Term_Pattern", "gov.va.vinci.types.Output_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Term_Pattern, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Term_Category;
  /** @generated */
  final int     casFeatCode_Term_Category;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTerm_Category(int addr) {
        if (featOkTst && casFeat_Term_Category == null)
      jcas.throwFeatMissing("Term_Category", "gov.va.vinci.types.Output_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Term_Category);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTerm_Category(int addr, String v) {
        if (featOkTst && casFeat_Term_Category == null)
      jcas.throwFeatMissing("Term_Category", "gov.va.vinci.types.Output_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Term_Category, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Section;
  /** @generated */
  final int     casFeatCode_Section;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSection(int addr) {
        if (featOkTst && casFeat_Section == null)
      jcas.throwFeatMissing("Section", "gov.va.vinci.types.Output_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Section);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSection(int addr, String v) {
        if (featOkTst && casFeat_Section == null)
      jcas.throwFeatMissing("Section", "gov.va.vinci.types.Output_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Section, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Window_Category;
  /** @generated */
  final int     casFeatCode_Window_Category;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getWindow_Category(int addr) {
        if (featOkTst && casFeat_Window_Category == null)
      jcas.throwFeatMissing("Window_Category", "gov.va.vinci.types.Output_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Window_Category);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setWindow_Category(int addr, String v) {
        if (featOkTst && casFeat_Window_Category == null)
      jcas.throwFeatMissing("Window_Category", "gov.va.vinci.types.Output_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Window_Category, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Pattern_Category;
  /** @generated */
  final int     casFeatCode_Pattern_Category;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getPattern_Category(int addr) {
        if (featOkTst && casFeat_Pattern_Category == null)
      jcas.throwFeatMissing("Pattern_Category", "gov.va.vinci.types.Output_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Pattern_Category);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPattern_Category(int addr, String v) {
        if (featOkTst && casFeat_Pattern_Category == null)
      jcas.throwFeatMissing("Pattern_Category", "gov.va.vinci.types.Output_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Pattern_Category, v);}
    
  
 
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
      jcas.throwFeatMissing("Anchored_Sentence", "gov.va.vinci.types.Output_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Anchored_Sentence);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAnchored_Sentence(int addr, String v) {
        if (featOkTst && casFeat_Anchored_Sentence == null)
      jcas.throwFeatMissing("Anchored_Sentence", "gov.va.vinci.types.Output_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Anchored_Sentence, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Output_Pattern_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Term = jcas.getRequiredFeatureDE(casType, "Term", "uima.cas.String", featOkTst);
    casFeatCode_Term  = (null == casFeat_Term) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Term).getCode();

 
    casFeat_Term_Pattern = jcas.getRequiredFeatureDE(casType, "Term_Pattern", "uima.cas.String", featOkTst);
    casFeatCode_Term_Pattern  = (null == casFeat_Term_Pattern) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Term_Pattern).getCode();

 
    casFeat_Term_Category = jcas.getRequiredFeatureDE(casType, "Term_Category", "uima.cas.String", featOkTst);
    casFeatCode_Term_Category  = (null == casFeat_Term_Category) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Term_Category).getCode();

 
    casFeat_Section = jcas.getRequiredFeatureDE(casType, "Section", "uima.cas.String", featOkTst);
    casFeatCode_Section  = (null == casFeat_Section) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Section).getCode();

 
    casFeat_Window_Category = jcas.getRequiredFeatureDE(casType, "Window_Category", "uima.cas.String", featOkTst);
    casFeatCode_Window_Category  = (null == casFeat_Window_Category) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Window_Category).getCode();

 
    casFeat_Pattern_Category = jcas.getRequiredFeatureDE(casType, "Pattern_Category", "uima.cas.String", featOkTst);
    casFeatCode_Pattern_Category  = (null == casFeat_Pattern_Category) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Pattern_Category).getCode();

 
    casFeat_Anchored_Sentence = jcas.getRequiredFeatureDE(casType, "Anchored_Sentence", "uima.cas.String", featOkTst);
    casFeatCode_Anchored_Sentence  = (null == casFeat_Anchored_Sentence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Anchored_Sentence).getCode();

  }
}



    