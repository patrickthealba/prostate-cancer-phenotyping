

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
public class ACC_Pattern extends AnnotationPatternType {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ACC_Pattern.class);
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
  protected ACC_Pattern() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public ACC_Pattern(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public ACC_Pattern(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public ACC_Pattern(JCas jcas, int begin, int end) {
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
  //* Feature: Title

  /** getter for Title - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTitle() {
    if (ACC_Pattern_Type.featOkTst && ((ACC_Pattern_Type)jcasType).casFeat_Title == null)
      jcasType.jcas.throwFeatMissing("Title", "gov.va.vinci.types.ACC_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ACC_Pattern_Type)jcasType).casFeatCode_Title);}
    
  /** setter for Title - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTitle(String v) {
    if (ACC_Pattern_Type.featOkTst && ((ACC_Pattern_Type)jcasType).casFeat_Title == null)
      jcasType.jcas.throwFeatMissing("Title", "gov.va.vinci.types.ACC_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((ACC_Pattern_Type)jcasType).casFeatCode_Title, v);}    
   
    
  //*--------------*
  //* Feature: Specimen_Type

  /** getter for Specimen_Type - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSpecimen_Type() {
    if (ACC_Pattern_Type.featOkTst && ((ACC_Pattern_Type)jcasType).casFeat_Specimen_Type == null)
      jcasType.jcas.throwFeatMissing("Specimen_Type", "gov.va.vinci.types.ACC_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ACC_Pattern_Type)jcasType).casFeatCode_Specimen_Type);}
    
  /** setter for Specimen_Type - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSpecimen_Type(String v) {
    if (ACC_Pattern_Type.featOkTst && ((ACC_Pattern_Type)jcasType).casFeat_Specimen_Type == null)
      jcasType.jcas.throwFeatMissing("Specimen_Type", "gov.va.vinci.types.ACC_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((ACC_Pattern_Type)jcasType).casFeatCode_Specimen_Type, v);}    
   
    
  //*--------------*
  //* Feature: Year

  /** getter for Year - gets 
   * @generated
   * @return value of the feature 
   */
  public String getYear() {
    if (ACC_Pattern_Type.featOkTst && ((ACC_Pattern_Type)jcasType).casFeat_Year == null)
      jcasType.jcas.throwFeatMissing("Year", "gov.va.vinci.types.ACC_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ACC_Pattern_Type)jcasType).casFeatCode_Year);}
    
  /** setter for Year - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setYear(String v) {
    if (ACC_Pattern_Type.featOkTst && ((ACC_Pattern_Type)jcasType).casFeat_Year == null)
      jcasType.jcas.throwFeatMissing("Year", "gov.va.vinci.types.ACC_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((ACC_Pattern_Type)jcasType).casFeatCode_Year, v);}    
   
    
  //*--------------*
  //* Feature: Identifier

  /** getter for Identifier - gets 
   * @generated
   * @return value of the feature 
   */
  public String getIdentifier() {
    if (ACC_Pattern_Type.featOkTst && ((ACC_Pattern_Type)jcasType).casFeat_Identifier == null)
      jcasType.jcas.throwFeatMissing("Identifier", "gov.va.vinci.types.ACC_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ACC_Pattern_Type)jcasType).casFeatCode_Identifier);}
    
  /** setter for Identifier - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setIdentifier(String v) {
    if (ACC_Pattern_Type.featOkTst && ((ACC_Pattern_Type)jcasType).casFeat_Identifier == null)
      jcasType.jcas.throwFeatMissing("Identifier", "gov.va.vinci.types.ACC_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((ACC_Pattern_Type)jcasType).casFeatCode_Identifier, v);}    
  }

    