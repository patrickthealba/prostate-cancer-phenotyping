

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
public class Gleason_Value_Pattern extends AnnotationPatternType {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Gleason_Value_Pattern.class);
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
  protected Gleason_Value_Pattern() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Gleason_Value_Pattern(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Gleason_Value_Pattern(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Gleason_Value_Pattern(JCas jcas, int begin, int end) {
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
  //* Feature: Primary

  /** getter for Primary - gets 
   * @generated
   * @return value of the feature 
   */
  public String getPrimary() {
    if (Gleason_Value_Pattern_Type.featOkTst && ((Gleason_Value_Pattern_Type)jcasType).casFeat_Primary == null)
      jcasType.jcas.throwFeatMissing("Primary", "gov.va.vinci.types.Gleason_Value_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Gleason_Value_Pattern_Type)jcasType).casFeatCode_Primary);}
    
  /** setter for Primary - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPrimary(String v) {
    if (Gleason_Value_Pattern_Type.featOkTst && ((Gleason_Value_Pattern_Type)jcasType).casFeat_Primary == null)
      jcasType.jcas.throwFeatMissing("Primary", "gov.va.vinci.types.Gleason_Value_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Gleason_Value_Pattern_Type)jcasType).casFeatCode_Primary, v);}    
   
    
  //*--------------*
  //* Feature: Secondary

  /** getter for Secondary - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSecondary() {
    if (Gleason_Value_Pattern_Type.featOkTst && ((Gleason_Value_Pattern_Type)jcasType).casFeat_Secondary == null)
      jcasType.jcas.throwFeatMissing("Secondary", "gov.va.vinci.types.Gleason_Value_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Gleason_Value_Pattern_Type)jcasType).casFeatCode_Secondary);}
    
  /** setter for Secondary - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSecondary(String v) {
    if (Gleason_Value_Pattern_Type.featOkTst && ((Gleason_Value_Pattern_Type)jcasType).casFeat_Secondary == null)
      jcasType.jcas.throwFeatMissing("Secondary", "gov.va.vinci.types.Gleason_Value_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Gleason_Value_Pattern_Type)jcasType).casFeatCode_Secondary, v);}    
   
    
  //*--------------*
  //* Feature: Total

  /** getter for Total - gets 
   * @generated
   * @return value of the feature 
   */
  public float getTotal() {
    if (Gleason_Value_Pattern_Type.featOkTst && ((Gleason_Value_Pattern_Type)jcasType).casFeat_Total == null)
      jcasType.jcas.throwFeatMissing("Total", "gov.va.vinci.types.Gleason_Value_Pattern");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((Gleason_Value_Pattern_Type)jcasType).casFeatCode_Total);}
    
  /** setter for Total - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTotal(float v) {
    if (Gleason_Value_Pattern_Type.featOkTst && ((Gleason_Value_Pattern_Type)jcasType).casFeat_Total == null)
      jcasType.jcas.throwFeatMissing("Total", "gov.va.vinci.types.Gleason_Value_Pattern");
    jcasType.ll_cas.ll_setFloatValue(addr, ((Gleason_Value_Pattern_Type)jcasType).casFeatCode_Total, v);}    
  }

    