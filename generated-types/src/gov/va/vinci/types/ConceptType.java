

/* First created by JCasGen Tue Jun 08 09:59:36 CDT 2021 */
package gov.va.vinci.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Concept annotation
 * Updated by JCasGen Tue Jun 08 09:59:36 CDT 2021
 * XML source: C:/Users/VH7256~1/AppData/Local/Temp/3/leoTypeDescription_a5cffad6-254b-4083-b74b-66eb64bfe7ce877418464091326058.xml
 * @generated */
public class ConceptType extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ConceptType.class);
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
  protected ConceptType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public ConceptType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public ConceptType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public ConceptType(JCas jcas, int begin, int end) {
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
  //* Feature: Concept

  /** getter for Concept - gets 
   * @generated
   * @return value of the feature 
   */
  public String getConcept() {
    if (ConceptType_Type.featOkTst && ((ConceptType_Type)jcasType).casFeat_Concept == null)
      jcasType.jcas.throwFeatMissing("Concept", "gov.va.vinci.types.ConceptType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ConceptType_Type)jcasType).casFeatCode_Concept);}
    
  /** setter for Concept - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setConcept(String v) {
    if (ConceptType_Type.featOkTst && ((ConceptType_Type)jcasType).casFeat_Concept == null)
      jcasType.jcas.throwFeatMissing("Concept", "gov.va.vinci.types.ConceptType");
    jcasType.ll_cas.ll_setStringValue(addr, ((ConceptType_Type)jcasType).casFeatCode_Concept, v);}    
   
    
  //*--------------*
  //* Feature: Pattern

  /** getter for Pattern - gets 
   * @generated
   * @return value of the feature 
   */
  public String getPattern() {
    if (ConceptType_Type.featOkTst && ((ConceptType_Type)jcasType).casFeat_Pattern == null)
      jcasType.jcas.throwFeatMissing("Pattern", "gov.va.vinci.types.ConceptType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ConceptType_Type)jcasType).casFeatCode_Pattern);}
    
  /** setter for Pattern - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPattern(String v) {
    if (ConceptType_Type.featOkTst && ((ConceptType_Type)jcasType).casFeat_Pattern == null)
      jcasType.jcas.throwFeatMissing("Pattern", "gov.va.vinci.types.ConceptType");
    jcasType.ll_cas.ll_setStringValue(addr, ((ConceptType_Type)jcasType).casFeatCode_Pattern, v);}    
  }

    