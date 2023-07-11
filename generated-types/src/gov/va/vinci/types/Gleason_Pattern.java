

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
public class Gleason_Pattern extends AnnotationPatternType {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Gleason_Pattern.class);
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
  protected Gleason_Pattern() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Gleason_Pattern(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Gleason_Pattern(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Gleason_Pattern(JCas jcas, int begin, int end) {
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
  //* Feature: Gleason_Score

  /** getter for Gleason_Score - gets 
   * @generated
   * @return value of the feature 
   */
  public float getGleason_Score() {
    if (Gleason_Pattern_Type.featOkTst && ((Gleason_Pattern_Type)jcasType).casFeat_Gleason_Score == null)
      jcasType.jcas.throwFeatMissing("Gleason_Score", "gov.va.vinci.types.Gleason_Pattern");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((Gleason_Pattern_Type)jcasType).casFeatCode_Gleason_Score);}
    
  /** setter for Gleason_Score - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGleason_Score(float v) {
    if (Gleason_Pattern_Type.featOkTst && ((Gleason_Pattern_Type)jcasType).casFeat_Gleason_Score == null)
      jcasType.jcas.throwFeatMissing("Gleason_Score", "gov.va.vinci.types.Gleason_Pattern");
    jcasType.ll_cas.ll_setFloatValue(addr, ((Gleason_Pattern_Type)jcasType).casFeatCode_Gleason_Score, v);}    
   
    
  //*--------------*
  //* Feature: Gleason_Modifier

  /** getter for Gleason_Modifier - gets 
   * @generated
   * @return value of the feature 
   */
  public String getGleason_Modifier() {
    if (Gleason_Pattern_Type.featOkTst && ((Gleason_Pattern_Type)jcasType).casFeat_Gleason_Modifier == null)
      jcasType.jcas.throwFeatMissing("Gleason_Modifier", "gov.va.vinci.types.Gleason_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Gleason_Pattern_Type)jcasType).casFeatCode_Gleason_Modifier);}
    
  /** setter for Gleason_Modifier - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGleason_Modifier(String v) {
    if (Gleason_Pattern_Type.featOkTst && ((Gleason_Pattern_Type)jcasType).casFeat_Gleason_Modifier == null)
      jcasType.jcas.throwFeatMissing("Gleason_Modifier", "gov.va.vinci.types.Gleason_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Gleason_Pattern_Type)jcasType).casFeatCode_Gleason_Modifier, v);}    
   
    
  //*--------------*
  //* Feature: PSA_in_Report

  /** getter for PSA_in_Report - gets 
   * @generated
   * @return value of the feature 
   */
  public String getPSA_in_Report() {
    if (Gleason_Pattern_Type.featOkTst && ((Gleason_Pattern_Type)jcasType).casFeat_PSA_in_Report == null)
      jcasType.jcas.throwFeatMissing("PSA_in_Report", "gov.va.vinci.types.Gleason_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Gleason_Pattern_Type)jcasType).casFeatCode_PSA_in_Report);}
    
  /** setter for PSA_in_Report - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPSA_in_Report(String v) {
    if (Gleason_Pattern_Type.featOkTst && ((Gleason_Pattern_Type)jcasType).casFeat_PSA_in_Report == null)
      jcasType.jcas.throwFeatMissing("PSA_in_Report", "gov.va.vinci.types.Gleason_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Gleason_Pattern_Type)jcasType).casFeatCode_PSA_in_Report, v);}    
  }

    