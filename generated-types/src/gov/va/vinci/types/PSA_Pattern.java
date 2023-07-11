

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
public class PSA_Pattern extends AnnotationPatternType {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(PSA_Pattern.class);
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
  protected PSA_Pattern() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public PSA_Pattern(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public PSA_Pattern(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public PSA_Pattern(JCas jcas, int begin, int end) {
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
  //* Feature: PSA_Value

  /** getter for PSA_Value - gets 
   * @generated
   * @return value of the feature 
   */
  public String getPSA_Value() {
    if (PSA_Pattern_Type.featOkTst && ((PSA_Pattern_Type)jcasType).casFeat_PSA_Value == null)
      jcasType.jcas.throwFeatMissing("PSA_Value", "gov.va.vinci.types.PSA_Pattern");
    return jcasType.ll_cas.ll_getStringValue(addr, ((PSA_Pattern_Type)jcasType).casFeatCode_PSA_Value);}
    
  /** setter for PSA_Value - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPSA_Value(String v) {
    if (PSA_Pattern_Type.featOkTst && ((PSA_Pattern_Type)jcasType).casFeat_PSA_Value == null)
      jcasType.jcas.throwFeatMissing("PSA_Value", "gov.va.vinci.types.PSA_Pattern");
    jcasType.ll_cas.ll_setStringValue(addr, ((PSA_Pattern_Type)jcasType).casFeatCode_PSA_Value, v);}    
  }

    