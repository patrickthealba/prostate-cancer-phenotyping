

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
public class Risk_Pattern extends AnnotationPatternType {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Risk_Pattern.class);
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
  protected Risk_Pattern() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Risk_Pattern(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Risk_Pattern(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Risk_Pattern(JCas jcas, int begin, int end) {
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
    if (Risk_Pattern_Type.featOkTst && ((Risk_Pattern_Type)jcasType).casFeat_Gleason_Score == null)
      jcasType.jcas.throwFeatMissing("Gleason_Score", "gov.va.vinci.types.Risk_Pattern");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((Risk_Pattern_Type)jcasType).casFeatCode_Gleason_Score);}
    
  /** setter for Gleason_Score - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGleason_Score(float v) {
    if (Risk_Pattern_Type.featOkTst && ((Risk_Pattern_Type)jcasType).casFeat_Gleason_Score == null)
      jcasType.jcas.throwFeatMissing("Gleason_Score", "gov.va.vinci.types.Risk_Pattern");
    jcasType.ll_cas.ll_setFloatValue(addr, ((Risk_Pattern_Type)jcasType).casFeatCode_Gleason_Score, v);}    
   
    
  //*--------------*
  //* Feature: Cores

  /** getter for Cores - gets 
   * @generated
   * @return value of the feature 
   */
  public String getCores() {
    if (Risk_Pattern_Type.featOkTst && ((Risk_Pattern_Type)jcasType).casFeat_Cores == null)
      jcasType.jcas.throwFeatMissing("Cores", "gov.va.vinci.types.Risk_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Risk_Pattern_Type)jcasType).casFeatCode_Cores);}
    
  /** setter for Cores - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCores(String v) {
    if (Risk_Pattern_Type.featOkTst && ((Risk_Pattern_Type)jcasType).casFeat_Cores == null)
      jcasType.jcas.throwFeatMissing("Cores", "gov.va.vinci.types.Risk_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Risk_Pattern_Type)jcasType).casFeatCode_Cores, v);}    
   
    
  //*--------------*
  //* Feature: Percent_Involved

  /** getter for Percent_Involved - gets 
   * @generated
   * @return value of the feature 
   */
  public String getPercent_Involved() {
    if (Risk_Pattern_Type.featOkTst && ((Risk_Pattern_Type)jcasType).casFeat_Percent_Involved == null)
      jcasType.jcas.throwFeatMissing("Percent_Involved", "gov.va.vinci.types.Risk_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Risk_Pattern_Type)jcasType).casFeatCode_Percent_Involved);}
    
  /** setter for Percent_Involved - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPercent_Involved(String v) {
    if (Risk_Pattern_Type.featOkTst && ((Risk_Pattern_Type)jcasType).casFeat_Percent_Involved == null)
      jcasType.jcas.throwFeatMissing("Percent_Involved", "gov.va.vinci.types.Risk_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Risk_Pattern_Type)jcasType).casFeatCode_Percent_Involved, v);}    
  }

    