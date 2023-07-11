

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
public class Involvement_Pattern extends AnnotationPatternType {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Involvement_Pattern.class);
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
  protected Involvement_Pattern() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Involvement_Pattern(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Involvement_Pattern(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Involvement_Pattern(JCas jcas, int begin, int end) {
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
  //* Feature: Value_1

  /** getter for Value_1 - gets 
   * @generated
   * @return value of the feature 
   */
  public String getValue_1() {
    if (Involvement_Pattern_Type.featOkTst && ((Involvement_Pattern_Type)jcasType).casFeat_Value_1 == null)
      jcasType.jcas.throwFeatMissing("Value_1", "gov.va.vinci.types.Involvement_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Involvement_Pattern_Type)jcasType).casFeatCode_Value_1);}
    
  /** setter for Value_1 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue_1(String v) {
    if (Involvement_Pattern_Type.featOkTst && ((Involvement_Pattern_Type)jcasType).casFeat_Value_1 == null)
      jcasType.jcas.throwFeatMissing("Value_1", "gov.va.vinci.types.Involvement_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Involvement_Pattern_Type)jcasType).casFeatCode_Value_1, v);}    
   
    
  //*--------------*
  //* Feature: Value_2

  /** getter for Value_2 - gets 
   * @generated
   * @return value of the feature 
   */
  public String getValue_2() {
    if (Involvement_Pattern_Type.featOkTst && ((Involvement_Pattern_Type)jcasType).casFeat_Value_2 == null)
      jcasType.jcas.throwFeatMissing("Value_2", "gov.va.vinci.types.Involvement_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Involvement_Pattern_Type)jcasType).casFeatCode_Value_2);}
    
  /** setter for Value_2 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue_2(String v) {
    if (Involvement_Pattern_Type.featOkTst && ((Involvement_Pattern_Type)jcasType).casFeat_Value_2 == null)
      jcasType.jcas.throwFeatMissing("Value_2", "gov.va.vinci.types.Involvement_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Involvement_Pattern_Type)jcasType).casFeatCode_Value_2, v);}    
   
    
  //*--------------*
  //* Feature: Percent_Involved

  /** getter for Percent_Involved - gets 
   * @generated
   * @return value of the feature 
   */
  public String getPercent_Involved() {
    if (Involvement_Pattern_Type.featOkTst && ((Involvement_Pattern_Type)jcasType).casFeat_Percent_Involved == null)
      jcasType.jcas.throwFeatMissing("Percent_Involved", "gov.va.vinci.types.Involvement_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Involvement_Pattern_Type)jcasType).casFeatCode_Percent_Involved);}
    
  /** setter for Percent_Involved - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPercent_Involved(String v) {
    if (Involvement_Pattern_Type.featOkTst && ((Involvement_Pattern_Type)jcasType).casFeat_Percent_Involved == null)
      jcasType.jcas.throwFeatMissing("Percent_Involved", "gov.va.vinci.types.Involvement_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Involvement_Pattern_Type)jcasType).casFeatCode_Percent_Involved, v);}    
  }

    