

/* First created by JCasGen Tue Jun 08 09:59:35 CDT 2021 */
package gov.va.vinci.knowtator.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/** RelationshipAnnotation Annotation
 * Updated by JCasGen Tue Jun 08 09:59:35 CDT 2021
 * XML source: C:/Users/VH7256~1/AppData/Local/Temp/3/leoTypeDescription_a5cffad6-254b-4083-b74b-66eb64bfe7ce877418464091326058.xml
 * @generated */
public class RelationshipAnnotation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(RelationshipAnnotation.class);
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
  protected RelationshipAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public RelationshipAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public RelationshipAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public RelationshipAnnotation(JCas jcas, int begin, int end) {
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
  //* Feature: Source

  /** getter for Source - gets Source
   * @generated
   * @return value of the feature 
   */
  public Annotation getSource() {
    if (RelationshipAnnotation_Type.featOkTst && ((RelationshipAnnotation_Type)jcasType).casFeat_Source == null)
      jcasType.jcas.throwFeatMissing("Source", "gov.va.vinci.knowtator.types.RelationshipAnnotation");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((RelationshipAnnotation_Type)jcasType).casFeatCode_Source)));}
    
  /** setter for Source - sets Source 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSource(Annotation v) {
    if (RelationshipAnnotation_Type.featOkTst && ((RelationshipAnnotation_Type)jcasType).casFeat_Source == null)
      jcasType.jcas.throwFeatMissing("Source", "gov.va.vinci.knowtator.types.RelationshipAnnotation");
    jcasType.ll_cas.ll_setRefValue(addr, ((RelationshipAnnotation_Type)jcasType).casFeatCode_Source, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: Target

  /** getter for Target - gets Target
   * @generated
   * @return value of the feature 
   */
  public FSArray getTarget() {
    if (RelationshipAnnotation_Type.featOkTst && ((RelationshipAnnotation_Type)jcasType).casFeat_Target == null)
      jcasType.jcas.throwFeatMissing("Target", "gov.va.vinci.knowtator.types.RelationshipAnnotation");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((RelationshipAnnotation_Type)jcasType).casFeatCode_Target)));}
    
  /** setter for Target - sets Target 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTarget(FSArray v) {
    if (RelationshipAnnotation_Type.featOkTst && ((RelationshipAnnotation_Type)jcasType).casFeat_Target == null)
      jcasType.jcas.throwFeatMissing("Target", "gov.va.vinci.knowtator.types.RelationshipAnnotation");
    jcasType.ll_cas.ll_setRefValue(addr, ((RelationshipAnnotation_Type)jcasType).casFeatCode_Target, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for Target - gets an indexed value - Target
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public Annotation getTarget(int i) {
    if (RelationshipAnnotation_Type.featOkTst && ((RelationshipAnnotation_Type)jcasType).casFeat_Target == null)
      jcasType.jcas.throwFeatMissing("Target", "gov.va.vinci.knowtator.types.RelationshipAnnotation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((RelationshipAnnotation_Type)jcasType).casFeatCode_Target), i);
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((RelationshipAnnotation_Type)jcasType).casFeatCode_Target), i)));}

  /** indexed setter for Target - sets an indexed value - Target
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setTarget(int i, Annotation v) { 
    if (RelationshipAnnotation_Type.featOkTst && ((RelationshipAnnotation_Type)jcasType).casFeat_Target == null)
      jcasType.jcas.throwFeatMissing("Target", "gov.va.vinci.knowtator.types.RelationshipAnnotation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((RelationshipAnnotation_Type)jcasType).casFeatCode_Target), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((RelationshipAnnotation_Type)jcasType).casFeatCode_Target), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    