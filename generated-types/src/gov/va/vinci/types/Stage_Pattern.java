

/* First created by JCasGen Tue Jun 08 09:59:37 CDT 2021 */
package gov.va.vinci.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import gov.va.vinci.leo.annotationpattern.types.AnnotationPatternType;


/** 
 * Updated by JCasGen Tue Jun 08 09:59:37 CDT 2021
 * XML source: C:/Users/VH7256~1/AppData/Local/Temp/3/leoTypeDescription_a5cffad6-254b-4083-b74b-66eb64bfe7ce877418464091326058.xml
 * @generated */
public class Stage_Pattern extends AnnotationPatternType {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Stage_Pattern.class);
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
  protected Stage_Pattern() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Stage_Pattern(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Stage_Pattern(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Stage_Pattern(JCas jcas, int begin, int end) {
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
  //* Feature: Stage

  /** getter for Stage - gets 
   * @generated
   * @return value of the feature 
   */
  public String getStage() {
    if (Stage_Pattern_Type.featOkTst && ((Stage_Pattern_Type)jcasType).casFeat_Stage == null)
      jcasType.jcas.throwFeatMissing("Stage", "gov.va.vinci.types.Stage_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Stage_Pattern_Type)jcasType).casFeatCode_Stage);}
    
  /** setter for Stage - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setStage(String v) {
    if (Stage_Pattern_Type.featOkTst && ((Stage_Pattern_Type)jcasType).casFeat_Stage == null)
      jcasType.jcas.throwFeatMissing("Stage", "gov.va.vinci.types.Stage_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Stage_Pattern_Type)jcasType).casFeatCode_Stage, v);}    
   
    
  //*--------------*
  //* Feature: T

  /** getter for T - gets 
   * @generated
   * @return value of the feature 
   */
  public String getT() {
    if (Stage_Pattern_Type.featOkTst && ((Stage_Pattern_Type)jcasType).casFeat_T == null)
      jcasType.jcas.throwFeatMissing("T", "gov.va.vinci.types.Stage_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Stage_Pattern_Type)jcasType).casFeatCode_T);}
    
  /** setter for T - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setT(String v) {
    if (Stage_Pattern_Type.featOkTst && ((Stage_Pattern_Type)jcasType).casFeat_T == null)
      jcasType.jcas.throwFeatMissing("T", "gov.va.vinci.types.Stage_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Stage_Pattern_Type)jcasType).casFeatCode_T, v);}    
   
    
  //*--------------*
  //* Feature: N

  /** getter for N - gets 
   * @generated
   * @return value of the feature 
   */
  public String getN() {
    if (Stage_Pattern_Type.featOkTst && ((Stage_Pattern_Type)jcasType).casFeat_N == null)
      jcasType.jcas.throwFeatMissing("N", "gov.va.vinci.types.Stage_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Stage_Pattern_Type)jcasType).casFeatCode_N);}
    
  /** setter for N - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setN(String v) {
    if (Stage_Pattern_Type.featOkTst && ((Stage_Pattern_Type)jcasType).casFeat_N == null)
      jcasType.jcas.throwFeatMissing("N", "gov.va.vinci.types.Stage_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Stage_Pattern_Type)jcasType).casFeatCode_N, v);}    
   
    
  //*--------------*
  //* Feature: M

  /** getter for M - gets 
   * @generated
   * @return value of the feature 
   */
  public String getM() {
    if (Stage_Pattern_Type.featOkTst && ((Stage_Pattern_Type)jcasType).casFeat_M == null)
      jcasType.jcas.throwFeatMissing("M", "gov.va.vinci.types.Stage_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Stage_Pattern_Type)jcasType).casFeatCode_M);}
    
  /** setter for M - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setM(String v) {
    if (Stage_Pattern_Type.featOkTst && ((Stage_Pattern_Type)jcasType).casFeat_M == null)
      jcasType.jcas.throwFeatMissing("M", "gov.va.vinci.types.Stage_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Stage_Pattern_Type)jcasType).casFeatCode_M, v);}    
   
    
  //*--------------*
  //* Feature: G

  /** getter for G - gets 
   * @generated
   * @return value of the feature 
   */
  public String getG() {
    if (Stage_Pattern_Type.featOkTst && ((Stage_Pattern_Type)jcasType).casFeat_G == null)
      jcasType.jcas.throwFeatMissing("G", "gov.va.vinci.types.Stage_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Stage_Pattern_Type)jcasType).casFeatCode_G);}
    
  /** setter for G - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setG(String v) {
    if (Stage_Pattern_Type.featOkTst && ((Stage_Pattern_Type)jcasType).casFeat_G == null)
      jcasType.jcas.throwFeatMissing("G", "gov.va.vinci.types.Stage_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Stage_Pattern_Type)jcasType).casFeatCode_G, v);}    
   
    
  //*--------------*
  //* Feature: Stage_Type

  /** getter for Stage_Type - gets 
   * @generated
   * @return value of the feature 
   */
  public String getStage_Type() {
    if (Stage_Pattern_Type.featOkTst && ((Stage_Pattern_Type)jcasType).casFeat_Stage_Type == null)
      jcasType.jcas.throwFeatMissing("Stage_Type", "gov.va.vinci.types.Stage_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Stage_Pattern_Type)jcasType).casFeatCode_Stage_Type);}
    
  /** setter for Stage_Type - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setStage_Type(String v) {
    if (Stage_Pattern_Type.featOkTst && ((Stage_Pattern_Type)jcasType).casFeat_Stage_Type == null)
      jcasType.jcas.throwFeatMissing("Stage_Type", "gov.va.vinci.types.Stage_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Stage_Pattern_Type)jcasType).casFeatCode_Stage_Type, v);}    
   
    
  //*--------------*
  //* Feature: Stage_Value

  /** getter for Stage_Value - gets 
   * @generated
   * @return value of the feature 
   */
  public String getStage_Value() {
    if (Stage_Pattern_Type.featOkTst && ((Stage_Pattern_Type)jcasType).casFeat_Stage_Value == null)
      jcasType.jcas.throwFeatMissing("Stage_Value", "gov.va.vinci.types.Stage_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Stage_Pattern_Type)jcasType).casFeatCode_Stage_Value);}
    
  /** setter for Stage_Value - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setStage_Value(String v) {
    if (Stage_Pattern_Type.featOkTst && ((Stage_Pattern_Type)jcasType).casFeat_Stage_Value == null)
      jcasType.jcas.throwFeatMissing("Stage_Value", "gov.va.vinci.types.Stage_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Stage_Pattern_Type)jcasType).casFeatCode_Stage_Value, v);}    
   
    
  //*--------------*
  //* Feature: Stage_Modifier

  /** getter for Stage_Modifier - gets 
   * @generated
   * @return value of the feature 
   */
  public String getStage_Modifier() {
    if (Stage_Pattern_Type.featOkTst && ((Stage_Pattern_Type)jcasType).casFeat_Stage_Modifier == null)
      jcasType.jcas.throwFeatMissing("Stage_Modifier", "gov.va.vinci.types.Stage_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Stage_Pattern_Type)jcasType).casFeatCode_Stage_Modifier);}
    
  /** setter for Stage_Modifier - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setStage_Modifier(String v) {
    if (Stage_Pattern_Type.featOkTst && ((Stage_Pattern_Type)jcasType).casFeat_Stage_Modifier == null)
      jcasType.jcas.throwFeatMissing("Stage_Modifier", "gov.va.vinci.types.Stage_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Stage_Pattern_Type)jcasType).casFeatCode_Stage_Modifier, v);}    
   
    
  //*--------------*
  //* Feature: Other_Term

  /** getter for Other_Term - gets 
   * @generated
   * @return value of the feature 
   */
  public String getOther_Term() {
    if (Stage_Pattern_Type.featOkTst && ((Stage_Pattern_Type)jcasType).casFeat_Other_Term == null)
      jcasType.jcas.throwFeatMissing("Other_Term", "gov.va.vinci.types.Stage_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Stage_Pattern_Type)jcasType).casFeatCode_Other_Term);}
    
  /** setter for Other_Term - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setOther_Term(String v) {
    if (Stage_Pattern_Type.featOkTst && ((Stage_Pattern_Type)jcasType).casFeat_Other_Term == null)
      jcasType.jcas.throwFeatMissing("Other_Term", "gov.va.vinci.types.Stage_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Stage_Pattern_Type)jcasType).casFeatCode_Other_Term, v);}    
  }

    