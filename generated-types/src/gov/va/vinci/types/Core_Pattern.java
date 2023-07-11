

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
public class Core_Pattern extends AnnotationPatternType {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Core_Pattern.class);
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
  protected Core_Pattern() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Core_Pattern(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Core_Pattern(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Core_Pattern(JCas jcas, int begin, int end) {
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
  //* Feature: Cores_Involved

  /** getter for Cores_Involved - gets 
   * @generated
   * @return value of the feature 
   */
  public String getCores_Involved() {
    if (Core_Pattern_Type.featOkTst && ((Core_Pattern_Type)jcasType).casFeat_Cores_Involved == null)
      jcasType.jcas.throwFeatMissing("Cores_Involved", "gov.va.vinci.types.Core_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Core_Pattern_Type)jcasType).casFeatCode_Cores_Involved);}
    
  /** setter for Cores_Involved - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCores_Involved(String v) {
    if (Core_Pattern_Type.featOkTst && ((Core_Pattern_Type)jcasType).casFeat_Cores_Involved == null)
      jcasType.jcas.throwFeatMissing("Cores_Involved", "gov.va.vinci.types.Core_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Core_Pattern_Type)jcasType).casFeatCode_Cores_Involved, v);}    
   
    
  //*--------------*
  //* Feature: Total_Cores

  /** getter for Total_Cores - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTotal_Cores() {
    if (Core_Pattern_Type.featOkTst && ((Core_Pattern_Type)jcasType).casFeat_Total_Cores == null)
      jcasType.jcas.throwFeatMissing("Total_Cores", "gov.va.vinci.types.Core_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Core_Pattern_Type)jcasType).casFeatCode_Total_Cores);}
    
  /** setter for Total_Cores - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTotal_Cores(String v) {
    if (Core_Pattern_Type.featOkTst && ((Core_Pattern_Type)jcasType).casFeat_Total_Cores == null)
      jcasType.jcas.throwFeatMissing("Total_Cores", "gov.va.vinci.types.Core_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Core_Pattern_Type)jcasType).casFeatCode_Total_Cores, v);}    
  }

    