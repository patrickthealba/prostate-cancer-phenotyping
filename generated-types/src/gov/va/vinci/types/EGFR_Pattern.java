

/* First created by JCasGen Tue Jun 08 09:59:36 CDT 2021 */
package gov.va.vinci.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import gov.va.vinci.leo.annotationpattern.types.AnnotationPatternType;


/** 
 * Updated by JCasGen Tue Jun 08 09:59:36 CDT 2021
 * XML source: C:/Users/VH7256~1/AppData/Local/Temp/3/leoTypeDescription_a5cffad6-254b-4083-b74b-66eb64bfe7ce877418464091326058.xml
 * @generated */
public class EGFR_Pattern extends AnnotationPatternType {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(EGFR_Pattern.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected EGFR_Pattern() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public EGFR_Pattern(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public EGFR_Pattern(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public EGFR_Pattern(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: Term_Type

  /** getter for Term_Type - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTerm_Type() {
    if (EGFR_Pattern_Type.featOkTst && ((EGFR_Pattern_Type)jcasType).casFeat_Term_Type == null)
      jcasType.jcas.throwFeatMissing("Term_Type", "gov.va.vinci.types.EGFR_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EGFR_Pattern_Type)jcasType).casFeatCode_Term_Type);}
    
  /** setter for Term_Type - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTerm_Type(String v) {
    if (EGFR_Pattern_Type.featOkTst && ((EGFR_Pattern_Type)jcasType).casFeat_Term_Type == null)
      jcasType.jcas.throwFeatMissing("Term_Type", "gov.va.vinci.types.EGFR_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((EGFR_Pattern_Type)jcasType).casFeatCode_Term_Type, v);}    
   
    
  //*--------------*
  //* Feature: NLP_Value

  /** getter for NLP_Value - gets 
   * @generated
   * @return value of the feature 
   */
  public String getNLP_Value() {
    if (EGFR_Pattern_Type.featOkTst && ((EGFR_Pattern_Type)jcasType).casFeat_NLP_Value == null)
      jcasType.jcas.throwFeatMissing("NLP_Value", "gov.va.vinci.types.EGFR_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EGFR_Pattern_Type)jcasType).casFeatCode_NLP_Value);}
    
  /** setter for NLP_Value - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setNLP_Value(String v) {
    if (EGFR_Pattern_Type.featOkTst && ((EGFR_Pattern_Type)jcasType).casFeat_NLP_Value == null)
      jcasType.jcas.throwFeatMissing("NLP_Value", "gov.va.vinci.types.EGFR_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((EGFR_Pattern_Type)jcasType).casFeatCode_NLP_Value, v);}    
   
    
  //*--------------*
  //* Feature: Snippet_Type

  /** getter for Snippet_Type - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSnippet_Type() {
    if (EGFR_Pattern_Type.featOkTst && ((EGFR_Pattern_Type)jcasType).casFeat_Snippet_Type == null)
      jcasType.jcas.throwFeatMissing("Snippet_Type", "gov.va.vinci.types.EGFR_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EGFR_Pattern_Type)jcasType).casFeatCode_Snippet_Type);}
    
  /** setter for Snippet_Type - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSnippet_Type(String v) {
    if (EGFR_Pattern_Type.featOkTst && ((EGFR_Pattern_Type)jcasType).casFeat_Snippet_Type == null)
      jcasType.jcas.throwFeatMissing("Snippet_Type", "gov.va.vinci.types.EGFR_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((EGFR_Pattern_Type)jcasType).casFeatCode_Snippet_Type, v);}    
   
    
  //*--------------*
  //* Feature: Annotated_Snippet

  /** getter for Annotated_Snippet - gets 
   * @generated
   * @return value of the feature 
   */
  public String getAnnotated_Snippet() {
    if (EGFR_Pattern_Type.featOkTst && ((EGFR_Pattern_Type)jcasType).casFeat_Annotated_Snippet == null)
      jcasType.jcas.throwFeatMissing("Annotated_Snippet", "gov.va.vinci.types.EGFR_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EGFR_Pattern_Type)jcasType).casFeatCode_Annotated_Snippet);}
    
  /** setter for Annotated_Snippet - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnnotated_Snippet(String v) {
    if (EGFR_Pattern_Type.featOkTst && ((EGFR_Pattern_Type)jcasType).casFeat_Annotated_Snippet == null)
      jcasType.jcas.throwFeatMissing("Annotated_Snippet", "gov.va.vinci.types.EGFR_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((EGFR_Pattern_Type)jcasType).casFeatCode_Annotated_Snippet, v);}    
   
    
  //*--------------*
  //* Feature: Anchored_Sentence

  /** getter for Anchored_Sentence - gets 
   * @generated
   * @return value of the feature 
   */
  public String getAnchored_Sentence() {
    if (EGFR_Pattern_Type.featOkTst && ((EGFR_Pattern_Type)jcasType).casFeat_Anchored_Sentence == null)
      jcasType.jcas.throwFeatMissing("Anchored_Sentence", "gov.va.vinci.types.EGFR_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EGFR_Pattern_Type)jcasType).casFeatCode_Anchored_Sentence);}
    
  /** setter for Anchored_Sentence - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnchored_Sentence(String v) {
    if (EGFR_Pattern_Type.featOkTst && ((EGFR_Pattern_Type)jcasType).casFeat_Anchored_Sentence == null)
      jcasType.jcas.throwFeatMissing("Anchored_Sentence", "gov.va.vinci.types.EGFR_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((EGFR_Pattern_Type)jcasType).casFeatCode_Anchored_Sentence, v);}    
   
    
  //*--------------*
  //* Feature: Value_in_Sentence

  /** getter for Value_in_Sentence - gets 
   * @generated
   * @return value of the feature 
   */
  public String getValue_in_Sentence() {
    if (EGFR_Pattern_Type.featOkTst && ((EGFR_Pattern_Type)jcasType).casFeat_Value_in_Sentence == null)
      jcasType.jcas.throwFeatMissing("Value_in_Sentence", "gov.va.vinci.types.EGFR_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EGFR_Pattern_Type)jcasType).casFeatCode_Value_in_Sentence);}
    
  /** setter for Value_in_Sentence - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue_in_Sentence(String v) {
    if (EGFR_Pattern_Type.featOkTst && ((EGFR_Pattern_Type)jcasType).casFeat_Value_in_Sentence == null)
      jcasType.jcas.throwFeatMissing("Value_in_Sentence", "gov.va.vinci.types.EGFR_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((EGFR_Pattern_Type)jcasType).casFeatCode_Value_in_Sentence, v);}    
   
    
  //*--------------*
  //* Feature: Value_Term

  /** getter for Value_Term - gets 
   * @generated
   * @return value of the feature 
   */
  public String getValue_Term() {
    if (EGFR_Pattern_Type.featOkTst && ((EGFR_Pattern_Type)jcasType).casFeat_Value_Term == null)
      jcasType.jcas.throwFeatMissing("Value_Term", "gov.va.vinci.types.EGFR_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EGFR_Pattern_Type)jcasType).casFeatCode_Value_Term);}
    
  /** setter for Value_Term - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue_Term(String v) {
    if (EGFR_Pattern_Type.featOkTst && ((EGFR_Pattern_Type)jcasType).casFeat_Value_Term == null)
      jcasType.jcas.throwFeatMissing("Value_Term", "gov.va.vinci.types.EGFR_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((EGFR_Pattern_Type)jcasType).casFeatCode_Value_Term, v);}    
   
    
  //*--------------*
  //* Feature: Tight_Window

  /** getter for Tight_Window - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTight_Window() {
    if (EGFR_Pattern_Type.featOkTst && ((EGFR_Pattern_Type)jcasType).casFeat_Tight_Window == null)
      jcasType.jcas.throwFeatMissing("Tight_Window", "gov.va.vinci.types.EGFR_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EGFR_Pattern_Type)jcasType).casFeatCode_Tight_Window);}
    
  /** setter for Tight_Window - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTight_Window(String v) {
    if (EGFR_Pattern_Type.featOkTst && ((EGFR_Pattern_Type)jcasType).casFeat_Tight_Window == null)
      jcasType.jcas.throwFeatMissing("Tight_Window", "gov.va.vinci.types.EGFR_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((EGFR_Pattern_Type)jcasType).casFeatCode_Tight_Window, v);}    
   
    
  //*--------------*
  //* Feature: Term_Start

  /** getter for Term_Start - gets 
   * @generated
   * @return value of the feature 
   */
  public int getTerm_Start() {
    if (EGFR_Pattern_Type.featOkTst && ((EGFR_Pattern_Type)jcasType).casFeat_Term_Start == null)
      jcasType.jcas.throwFeatMissing("Term_Start", "gov.va.vinci.types.EGFR_Pattern");
    return jcasType.ll_cas.ll_getIntValue(addr, ((EGFR_Pattern_Type)jcasType).casFeatCode_Term_Start);}
    
  /** setter for Term_Start - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTerm_Start(int v) {
    if (EGFR_Pattern_Type.featOkTst && ((EGFR_Pattern_Type)jcasType).casFeat_Term_Start == null)
      jcasType.jcas.throwFeatMissing("Term_Start", "gov.va.vinci.types.EGFR_Pattern");
    jcasType.ll_cas.ll_setIntValue(addr, ((EGFR_Pattern_Type)jcasType).casFeatCode_Term_Start, v);}    
   
    
  //*--------------*
  //* Feature: Term_End

  /** getter for Term_End - gets 
   * @generated
   * @return value of the feature 
   */
  public int getTerm_End() {
    if (EGFR_Pattern_Type.featOkTst && ((EGFR_Pattern_Type)jcasType).casFeat_Term_End == null)
      jcasType.jcas.throwFeatMissing("Term_End", "gov.va.vinci.types.EGFR_Pattern");
    return jcasType.ll_cas.ll_getIntValue(addr, ((EGFR_Pattern_Type)jcasType).casFeatCode_Term_End);}
    
  /** setter for Term_End - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTerm_End(int v) {
    if (EGFR_Pattern_Type.featOkTst && ((EGFR_Pattern_Type)jcasType).casFeat_Term_End == null)
      jcasType.jcas.throwFeatMissing("Term_End", "gov.va.vinci.types.EGFR_Pattern");
    jcasType.ll_cas.ll_setIntValue(addr, ((EGFR_Pattern_Type)jcasType).casFeatCode_Term_End, v);}    
  }

    