

/* First created by JCasGen Tue Apr 30 12:25:23 CDT 2019 */
package gov.va.vinci.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import gov.va.vinci.leo.annotationpattern.types.AnnotationPatternType;


/** 
 * Updated by JCasGen Tue Apr 30 12:25:23 CDT 2019
 * XML source: C:/Users/VHASLC~2/AppData/Local/Temp/2/leoTypeDescription_76594044-5cff-4028-8ffd-41d41188dc1f1816674815589467920.xml
 * @generated */
public class Output_Pattern extends AnnotationPatternType {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Output_Pattern.class);
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
  protected Output_Pattern() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Output_Pattern(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Output_Pattern(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Output_Pattern(JCas jcas, int begin, int end) {
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
  //* Feature: Term

  /** getter for Term - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTerm() {
    if (Output_Pattern_Type.featOkTst && ((Output_Pattern_Type)jcasType).casFeat_Term == null)
      jcasType.jcas.throwFeatMissing("Term", "gov.va.vinci.types.Output_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Output_Pattern_Type)jcasType).casFeatCode_Term);}
    
  /** setter for Term - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTerm(String v) {
    if (Output_Pattern_Type.featOkTst && ((Output_Pattern_Type)jcasType).casFeat_Term == null)
      jcasType.jcas.throwFeatMissing("Term", "gov.va.vinci.types.Output_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Output_Pattern_Type)jcasType).casFeatCode_Term, v);}    
   
    
  //*--------------*
  //* Feature: Term_Pattern

  /** getter for Term_Pattern - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTerm_Pattern() {
    if (Output_Pattern_Type.featOkTst && ((Output_Pattern_Type)jcasType).casFeat_Term_Pattern == null)
      jcasType.jcas.throwFeatMissing("Term_Pattern", "gov.va.vinci.types.Output_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Output_Pattern_Type)jcasType).casFeatCode_Term_Pattern);}
    
  /** setter for Term_Pattern - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTerm_Pattern(String v) {
    if (Output_Pattern_Type.featOkTst && ((Output_Pattern_Type)jcasType).casFeat_Term_Pattern == null)
      jcasType.jcas.throwFeatMissing("Term_Pattern", "gov.va.vinci.types.Output_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Output_Pattern_Type)jcasType).casFeatCode_Term_Pattern, v);}    
   
    
  //*--------------*
  //* Feature: Term_Category

  /** getter for Term_Category - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTerm_Category() {
    if (Output_Pattern_Type.featOkTst && ((Output_Pattern_Type)jcasType).casFeat_Term_Category == null)
      jcasType.jcas.throwFeatMissing("Term_Category", "gov.va.vinci.types.Output_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Output_Pattern_Type)jcasType).casFeatCode_Term_Category);}
    
  /** setter for Term_Category - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTerm_Category(String v) {
    if (Output_Pattern_Type.featOkTst && ((Output_Pattern_Type)jcasType).casFeat_Term_Category == null)
      jcasType.jcas.throwFeatMissing("Term_Category", "gov.va.vinci.types.Output_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Output_Pattern_Type)jcasType).casFeatCode_Term_Category, v);}    
   
    
  //*--------------*
  //* Feature: Section

  /** getter for Section - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSection() {
    if (Output_Pattern_Type.featOkTst && ((Output_Pattern_Type)jcasType).casFeat_Section == null)
      jcasType.jcas.throwFeatMissing("Section", "gov.va.vinci.types.Output_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Output_Pattern_Type)jcasType).casFeatCode_Section);}
    
  /** setter for Section - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSection(String v) {
    if (Output_Pattern_Type.featOkTst && ((Output_Pattern_Type)jcasType).casFeat_Section == null)
      jcasType.jcas.throwFeatMissing("Section", "gov.va.vinci.types.Output_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Output_Pattern_Type)jcasType).casFeatCode_Section, v);}    
   
    
  //*--------------*
  //* Feature: Window_Category

  /** getter for Window_Category - gets text of the header
   * @generated
   * @return value of the feature 
   */
  public String getWindow_Category() {
    if (Output_Pattern_Type.featOkTst && ((Output_Pattern_Type)jcasType).casFeat_Window_Category == null)
      jcasType.jcas.throwFeatMissing("Window_Category", "gov.va.vinci.types.Output_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Output_Pattern_Type)jcasType).casFeatCode_Window_Category);}
    
  /** setter for Window_Category - sets text of the header 
   * @generated
   * @param v value to set into the feature 
   */
  public void setWindow_Category(String v) {
    if (Output_Pattern_Type.featOkTst && ((Output_Pattern_Type)jcasType).casFeat_Window_Category == null)
      jcasType.jcas.throwFeatMissing("Window_Category", "gov.va.vinci.types.Output_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Output_Pattern_Type)jcasType).casFeatCode_Window_Category, v);}    
   
    
  //*--------------*
  //* Feature: Pattern_Category

  /** getter for Pattern_Category - gets text of the header
   * @generated
   * @return value of the feature 
   */
  public String getPattern_Category() {
    if (Output_Pattern_Type.featOkTst && ((Output_Pattern_Type)jcasType).casFeat_Pattern_Category == null)
      jcasType.jcas.throwFeatMissing("Pattern_Category", "gov.va.vinci.types.Output_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Output_Pattern_Type)jcasType).casFeatCode_Pattern_Category);}
    
  /** setter for Pattern_Category - sets text of the header 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPattern_Category(String v) {
    if (Output_Pattern_Type.featOkTst && ((Output_Pattern_Type)jcasType).casFeat_Pattern_Category == null)
      jcasType.jcas.throwFeatMissing("Pattern_Category", "gov.va.vinci.types.Output_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Output_Pattern_Type)jcasType).casFeatCode_Pattern_Category, v);}    
   
    
  //*--------------*
  //* Feature: Anchored_Sentence

  /** getter for Anchored_Sentence - gets text of the header
   * @generated
   * @return value of the feature 
   */
  public String getAnchored_Sentence() {
    if (Output_Pattern_Type.featOkTst && ((Output_Pattern_Type)jcasType).casFeat_Anchored_Sentence == null)
      jcasType.jcas.throwFeatMissing("Anchored_Sentence", "gov.va.vinci.types.Output_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Output_Pattern_Type)jcasType).casFeatCode_Anchored_Sentence);}
    
  /** setter for Anchored_Sentence - sets text of the header 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnchored_Sentence(String v) {
    if (Output_Pattern_Type.featOkTst && ((Output_Pattern_Type)jcasType).casFeat_Anchored_Sentence == null)
      jcasType.jcas.throwFeatMissing("Anchored_Sentence", "gov.va.vinci.types.Output_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Output_Pattern_Type)jcasType).casFeatCode_Anchored_Sentence, v);}    
  }

    