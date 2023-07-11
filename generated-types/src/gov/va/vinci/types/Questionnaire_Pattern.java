

/* First created by JCasGen Tue May 07 14:55:59 CDT 2019 */
package gov.va.vinci.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import gov.va.vinci.leo.annotationpattern.types.AnnotationPatternType;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue May 07 14:55:59 CDT 2019
 * XML source: C:/Users/VHASLC~2/AppData/Local/Temp/5/leoTypeDescription_70b576f0-be65-4151-8ed8-597b78b107455710247672293021720.xml
 * @generated */
public class Questionnaire_Pattern extends AnnotationPatternType {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Questionnaire_Pattern.class);
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
  protected Questionnaire_Pattern() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Questionnaire_Pattern(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Questionnaire_Pattern(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Questionnaire_Pattern(JCas jcas, int begin, int end) {
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
  //* Feature: Target

  /** getter for Target - gets 
   * @generated
   * @return value of the feature 
   */
  public Annotation getTarget() {
    if (Questionnaire_Pattern_Type.featOkTst && ((Questionnaire_Pattern_Type)jcasType).casFeat_Target == null)
      jcasType.jcas.throwFeatMissing("Target", "gov.va.vinci.types.Questionnaire_Pattern");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Questionnaire_Pattern_Type)jcasType).casFeatCode_Target)));}
    
  /** setter for Target - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTarget(Annotation v) {
    if (Questionnaire_Pattern_Type.featOkTst && ((Questionnaire_Pattern_Type)jcasType).casFeat_Target == null)
      jcasType.jcas.throwFeatMissing("Target", "gov.va.vinci.types.Questionnaire_Pattern");
    jcasType.ll_cas.ll_setRefValue(addr, ((Questionnaire_Pattern_Type)jcasType).casFeatCode_Target, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    