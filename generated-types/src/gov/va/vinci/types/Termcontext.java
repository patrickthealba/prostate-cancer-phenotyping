

/* First created by JCasGen Thu May 09 09:08:56 CDT 2019 */
package gov.va.vinci.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import gov.va.vinci.leo.context.types.Context;


/** 
 * Updated by JCasGen Thu May 09 09:08:56 CDT 2019
 * XML source: C:/Users/VHASLC~2/AppData/Local/Temp/5/leoTypeDescription_ef7e40a8-96ff-4b52-bb08-606b554e6c9f1736725612210408835.xml
 * @generated */
public class Termcontext extends Context {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Termcontext.class);
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
  protected Termcontext() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Termcontext(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Termcontext(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Termcontext(JCas jcas, int begin, int end) {
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
    if (Termcontext_Type.featOkTst && ((Termcontext_Type)jcasType).casFeat_Concept == null)
      jcasType.jcas.throwFeatMissing("Concept", "gov.va.vinci.types.Termcontext");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Termcontext_Type)jcasType).casFeatCode_Concept);}
    
  /** setter for Concept - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setConcept(String v) {
    if (Termcontext_Type.featOkTst && ((Termcontext_Type)jcasType).casFeat_Concept == null)
      jcasType.jcas.throwFeatMissing("Concept", "gov.va.vinci.types.Termcontext");
    jcasType.ll_cas.ll_setStringValue(addr, ((Termcontext_Type)jcasType).casFeatCode_Concept, v);}    
   
    
  //*--------------*
  //* Feature: Experiencer

  /** getter for Experiencer - gets text of the experiencer
   * @generated
   * @return value of the feature 
   */
  public String getExperiencer() {
    if (Termcontext_Type.featOkTst && ((Termcontext_Type)jcasType).casFeat_Experiencer == null)
      jcasType.jcas.throwFeatMissing("Experiencer", "gov.va.vinci.types.Termcontext");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Termcontext_Type)jcasType).casFeatCode_Experiencer);}
    
  /** setter for Experiencer - sets text of the experiencer 
   * @generated
   * @param v value to set into the feature 
   */
  public void setExperiencer(String v) {
    if (Termcontext_Type.featOkTst && ((Termcontext_Type)jcasType).casFeat_Experiencer == null)
      jcasType.jcas.throwFeatMissing("Experiencer", "gov.va.vinci.types.Termcontext");
    jcasType.ll_cas.ll_setStringValue(addr, ((Termcontext_Type)jcasType).casFeatCode_Experiencer, v);}    
   
    
  //*--------------*
  //* Feature: Negation

  /** getter for Negation - gets text of the negation
   * @generated
   * @return value of the feature 
   */
  public String getNegation() {
    if (Termcontext_Type.featOkTst && ((Termcontext_Type)jcasType).casFeat_Negation == null)
      jcasType.jcas.throwFeatMissing("Negation", "gov.va.vinci.types.Termcontext");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Termcontext_Type)jcasType).casFeatCode_Negation);}
    
  /** setter for Negation - sets text of the negation 
   * @generated
   * @param v value to set into the feature 
   */
  public void setNegation(String v) {
    if (Termcontext_Type.featOkTst && ((Termcontext_Type)jcasType).casFeat_Negation == null)
      jcasType.jcas.throwFeatMissing("Negation", "gov.va.vinci.types.Termcontext");
    jcasType.ll_cas.ll_setStringValue(addr, ((Termcontext_Type)jcasType).casFeatCode_Negation, v);}    
   
    
  //*--------------*
  //* Feature: Temporality

  /** getter for Temporality - gets text of the temporality
   * @generated
   * @return value of the feature 
   */
  public String getTemporality() {
    if (Termcontext_Type.featOkTst && ((Termcontext_Type)jcasType).casFeat_Temporality == null)
      jcasType.jcas.throwFeatMissing("Temporality", "gov.va.vinci.types.Termcontext");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Termcontext_Type)jcasType).casFeatCode_Temporality);}
    
  /** setter for Temporality - sets text of the temporality 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTemporality(String v) {
    if (Termcontext_Type.featOkTst && ((Termcontext_Type)jcasType).casFeat_Temporality == null)
      jcasType.jcas.throwFeatMissing("Temporality", "gov.va.vinci.types.Termcontext");
    jcasType.ll_cas.ll_setStringValue(addr, ((Termcontext_Type)jcasType).casFeatCode_Temporality, v);}    
   
    
  //*--------------*
  //* Feature: Modifier

  /** getter for Modifier - gets text of the header
   * @generated
   * @return value of the feature 
   */
  public String getModifier() {
    if (Termcontext_Type.featOkTst && ((Termcontext_Type)jcasType).casFeat_Modifier == null)
      jcasType.jcas.throwFeatMissing("Modifier", "gov.va.vinci.types.Termcontext");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Termcontext_Type)jcasType).casFeatCode_Modifier);}
    
  /** setter for Modifier - sets text of the header 
   * @generated
   * @param v value to set into the feature 
   */
  public void setModifier(String v) {
    if (Termcontext_Type.featOkTst && ((Termcontext_Type)jcasType).casFeat_Modifier == null)
      jcasType.jcas.throwFeatMissing("Modifier", "gov.va.vinci.types.Termcontext");
    jcasType.ll_cas.ll_setStringValue(addr, ((Termcontext_Type)jcasType).casFeatCode_Modifier, v);}    
  }

    