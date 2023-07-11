

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
public class Invasion_Pattern extends AnnotationPatternType {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Invasion_Pattern.class);
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
  protected Invasion_Pattern() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Invasion_Pattern(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Invasion_Pattern(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Invasion_Pattern(JCas jcas, int begin, int end) {
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
  //* Feature: Invasion_Status

  /** getter for Invasion_Status - gets 
   * @generated
   * @return value of the feature 
   */
  public String getInvasion_Status() {
    if (Invasion_Pattern_Type.featOkTst && ((Invasion_Pattern_Type)jcasType).casFeat_Invasion_Status == null)
      jcasType.jcas.throwFeatMissing("Invasion_Status", "gov.va.vinci.types.Invasion_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Invasion_Pattern_Type)jcasType).casFeatCode_Invasion_Status);}
    
  /** setter for Invasion_Status - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setInvasion_Status(String v) {
    if (Invasion_Pattern_Type.featOkTst && ((Invasion_Pattern_Type)jcasType).casFeat_Invasion_Status == null)
      jcasType.jcas.throwFeatMissing("Invasion_Status", "gov.va.vinci.types.Invasion_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Invasion_Pattern_Type)jcasType).casFeatCode_Invasion_Status, v);}    
   
    
  //*--------------*
  //* Feature: Invasion_Depth

  /** getter for Invasion_Depth - gets 
   * @generated
   * @return value of the feature 
   */
  public String getInvasion_Depth() {
    if (Invasion_Pattern_Type.featOkTst && ((Invasion_Pattern_Type)jcasType).casFeat_Invasion_Depth == null)
      jcasType.jcas.throwFeatMissing("Invasion_Depth", "gov.va.vinci.types.Invasion_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Invasion_Pattern_Type)jcasType).casFeatCode_Invasion_Depth);}
    
  /** setter for Invasion_Depth - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setInvasion_Depth(String v) {
    if (Invasion_Pattern_Type.featOkTst && ((Invasion_Pattern_Type)jcasType).casFeat_Invasion_Depth == null)
      jcasType.jcas.throwFeatMissing("Invasion_Depth", "gov.va.vinci.types.Invasion_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((Invasion_Pattern_Type)jcasType).casFeatCode_Invasion_Depth, v);}    
  }

    