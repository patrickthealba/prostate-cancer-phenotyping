

/* First created by JCasGen Tue Jun 08 09:59:36 CDT 2021 */
package gov.va.vinci.leo.context.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Tue Jun 08 09:59:36 CDT 2021
 * XML source: C:/Users/VH7256~1/AppData/Local/Temp/3/leoTypeDescription_a5cffad6-254b-4083-b74b-66eb64bfe7ce877418464091326058.xml
 * @generated */
public class TermContext extends Context {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TermContext.class);
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
  protected TermContext() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public TermContext(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public TermContext(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public TermContext(JCas jcas, int begin, int end) {
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
    if (TermContext_Type.featOkTst && ((TermContext_Type)jcasType).casFeat_Concept == null)
      jcasType.jcas.throwFeatMissing("Concept", "gov.va.vinci.leo.context.types.TermContext");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TermContext_Type)jcasType).casFeatCode_Concept);}
    
  /** setter for Concept - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setConcept(String v) {
    if (TermContext_Type.featOkTst && ((TermContext_Type)jcasType).casFeat_Concept == null)
      jcasType.jcas.throwFeatMissing("Concept", "gov.va.vinci.leo.context.types.TermContext");
    jcasType.ll_cas.ll_setStringValue(addr, ((TermContext_Type)jcasType).casFeatCode_Concept, v);}    
   
    
  //*--------------*
  //* Feature: Metastatic_term

  /** getter for Metastatic_term - gets 
   * @generated
   * @return value of the feature 
   */
  public String getMetastatic_term() {
    if (TermContext_Type.featOkTst && ((TermContext_Type)jcasType).casFeat_Metastatic_term == null)
      jcasType.jcas.throwFeatMissing("Metastatic_term", "gov.va.vinci.leo.context.types.TermContext");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TermContext_Type)jcasType).casFeatCode_Metastatic_term);}
    
  /** setter for Metastatic_term - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMetastatic_term(String v) {
    if (TermContext_Type.featOkTst && ((TermContext_Type)jcasType).casFeat_Metastatic_term == null)
      jcasType.jcas.throwFeatMissing("Metastatic_term", "gov.va.vinci.leo.context.types.TermContext");
    jcasType.ll_cas.ll_setStringValue(addr, ((TermContext_Type)jcasType).casFeatCode_Metastatic_term, v);}    
   
    
  //*--------------*
  //* Feature: Experiencer

  /** getter for Experiencer - gets text of the experiencer
   * @generated
   * @return value of the feature 
   */
  public String getExperiencer() {
    if (TermContext_Type.featOkTst && ((TermContext_Type)jcasType).casFeat_Experiencer == null)
      jcasType.jcas.throwFeatMissing("Experiencer", "gov.va.vinci.leo.context.types.TermContext");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TermContext_Type)jcasType).casFeatCode_Experiencer);}
    
  /** setter for Experiencer - sets text of the experiencer 
   * @generated
   * @param v value to set into the feature 
   */
  public void setExperiencer(String v) {
    if (TermContext_Type.featOkTst && ((TermContext_Type)jcasType).casFeat_Experiencer == null)
      jcasType.jcas.throwFeatMissing("Experiencer", "gov.va.vinci.leo.context.types.TermContext");
    jcasType.ll_cas.ll_setStringValue(addr, ((TermContext_Type)jcasType).casFeatCode_Experiencer, v);}    
   
    
  //*--------------*
  //* Feature: Negation

  /** getter for Negation - gets text of the negation
   * @generated
   * @return value of the feature 
   */
  public String getNegation() {
    if (TermContext_Type.featOkTst && ((TermContext_Type)jcasType).casFeat_Negation == null)
      jcasType.jcas.throwFeatMissing("Negation", "gov.va.vinci.leo.context.types.TermContext");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TermContext_Type)jcasType).casFeatCode_Negation);}
    
  /** setter for Negation - sets text of the negation 
   * @generated
   * @param v value to set into the feature 
   */
  public void setNegation(String v) {
    if (TermContext_Type.featOkTst && ((TermContext_Type)jcasType).casFeat_Negation == null)
      jcasType.jcas.throwFeatMissing("Negation", "gov.va.vinci.leo.context.types.TermContext");
    jcasType.ll_cas.ll_setStringValue(addr, ((TermContext_Type)jcasType).casFeatCode_Negation, v);}    
   
    
  //*--------------*
  //* Feature: Temporality

  /** getter for Temporality - gets text of the temporality
   * @generated
   * @return value of the feature 
   */
  public String getTemporality() {
    if (TermContext_Type.featOkTst && ((TermContext_Type)jcasType).casFeat_Temporality == null)
      jcasType.jcas.throwFeatMissing("Temporality", "gov.va.vinci.leo.context.types.TermContext");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TermContext_Type)jcasType).casFeatCode_Temporality);}
    
  /** setter for Temporality - sets text of the temporality 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTemporality(String v) {
    if (TermContext_Type.featOkTst && ((TermContext_Type)jcasType).casFeat_Temporality == null)
      jcasType.jcas.throwFeatMissing("Temporality", "gov.va.vinci.leo.context.types.TermContext");
    jcasType.ll_cas.ll_setStringValue(addr, ((TermContext_Type)jcasType).casFeatCode_Temporality, v);}    
   
    
  //*--------------*
  //* Feature: Modifier_term

  /** getter for Modifier_term - gets text of the diagnosis term
   * @generated
   * @return value of the feature 
   */
  public String getModifier_term() {
    if (TermContext_Type.featOkTst && ((TermContext_Type)jcasType).casFeat_Modifier_term == null)
      jcasType.jcas.throwFeatMissing("Modifier_term", "gov.va.vinci.leo.context.types.TermContext");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TermContext_Type)jcasType).casFeatCode_Modifier_term);}
    
  /** setter for Modifier_term - sets text of the diagnosis term 
   * @generated
   * @param v value to set into the feature 
   */
  public void setModifier_term(String v) {
    if (TermContext_Type.featOkTst && ((TermContext_Type)jcasType).casFeat_Modifier_term == null)
      jcasType.jcas.throwFeatMissing("Modifier_term", "gov.va.vinci.leo.context.types.TermContext");
    jcasType.ll_cas.ll_setStringValue(addr, ((TermContext_Type)jcasType).casFeatCode_Modifier_term, v);}    
   
    
  //*--------------*
  //* Feature: Modifier

  /** getter for Modifier - gets text of the header
   * @generated
   * @return value of the feature 
   */
  public String getModifier() {
    if (TermContext_Type.featOkTst && ((TermContext_Type)jcasType).casFeat_Modifier == null)
      jcasType.jcas.throwFeatMissing("Modifier", "gov.va.vinci.leo.context.types.TermContext");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TermContext_Type)jcasType).casFeatCode_Modifier);}
    
  /** setter for Modifier - sets text of the header 
   * @generated
   * @param v value to set into the feature 
   */
  public void setModifier(String v) {
    if (TermContext_Type.featOkTst && ((TermContext_Type)jcasType).casFeat_Modifier == null)
      jcasType.jcas.throwFeatMissing("Modifier", "gov.va.vinci.leo.context.types.TermContext");
    jcasType.ll_cas.ll_setStringValue(addr, ((TermContext_Type)jcasType).casFeatCode_Modifier, v);}    
   
    
  //*--------------*
  //* Feature: Anatomy

  /** getter for Anatomy - gets text of the header
   * @generated
   * @return value of the feature 
   */
  public String getAnatomy() {
    if (TermContext_Type.featOkTst && ((TermContext_Type)jcasType).casFeat_Anatomy == null)
      jcasType.jcas.throwFeatMissing("Anatomy", "gov.va.vinci.leo.context.types.TermContext");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TermContext_Type)jcasType).casFeatCode_Anatomy);}
    
  /** setter for Anatomy - sets text of the header 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnatomy(String v) {
    if (TermContext_Type.featOkTst && ((TermContext_Type)jcasType).casFeat_Anatomy == null)
      jcasType.jcas.throwFeatMissing("Anatomy", "gov.va.vinci.leo.context.types.TermContext");
    jcasType.ll_cas.ll_setStringValue(addr, ((TermContext_Type)jcasType).casFeatCode_Anatomy, v);}    
   
    
  //*--------------*
  //* Feature: Hormone_modifier

  /** getter for Hormone_modifier - gets text of the header
   * @generated
   * @return value of the feature 
   */
  public String getHormone_modifier() {
    if (TermContext_Type.featOkTst && ((TermContext_Type)jcasType).casFeat_Hormone_modifier == null)
      jcasType.jcas.throwFeatMissing("Hormone_modifier", "gov.va.vinci.leo.context.types.TermContext");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TermContext_Type)jcasType).casFeatCode_Hormone_modifier);}
    
  /** setter for Hormone_modifier - sets text of the header 
   * @generated
   * @param v value to set into the feature 
   */
  public void setHormone_modifier(String v) {
    if (TermContext_Type.featOkTst && ((TermContext_Type)jcasType).casFeat_Hormone_modifier == null)
      jcasType.jcas.throwFeatMissing("Hormone_modifier", "gov.va.vinci.leo.context.types.TermContext");
    jcasType.ll_cas.ll_setStringValue(addr, ((TermContext_Type)jcasType).casFeatCode_Hormone_modifier, v);}    
   
    
  //*--------------*
  //* Feature: Hormone_modifier_term

  /** getter for Hormone_modifier_term - gets text of the header
   * @generated
   * @return value of the feature 
   */
  public String getHormone_modifier_term() {
    if (TermContext_Type.featOkTst && ((TermContext_Type)jcasType).casFeat_Hormone_modifier_term == null)
      jcasType.jcas.throwFeatMissing("Hormone_modifier_term", "gov.va.vinci.leo.context.types.TermContext");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TermContext_Type)jcasType).casFeatCode_Hormone_modifier_term);}
    
  /** setter for Hormone_modifier_term - sets text of the header 
   * @generated
   * @param v value to set into the feature 
   */
  public void setHormone_modifier_term(String v) {
    if (TermContext_Type.featOkTst && ((TermContext_Type)jcasType).casFeat_Hormone_modifier_term == null)
      jcasType.jcas.throwFeatMissing("Hormone_modifier_term", "gov.va.vinci.leo.context.types.TermContext");
    jcasType.ll_cas.ll_setStringValue(addr, ((TermContext_Type)jcasType).casFeatCode_Hormone_modifier_term, v);}    
   
    
  //*--------------*
  //* Feature: Treatment_modifier

  /** getter for Treatment_modifier - gets text of the header
   * @generated
   * @return value of the feature 
   */
  public String getTreatment_modifier() {
    if (TermContext_Type.featOkTst && ((TermContext_Type)jcasType).casFeat_Treatment_modifier == null)
      jcasType.jcas.throwFeatMissing("Treatment_modifier", "gov.va.vinci.leo.context.types.TermContext");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TermContext_Type)jcasType).casFeatCode_Treatment_modifier);}
    
  /** setter for Treatment_modifier - sets text of the header 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTreatment_modifier(String v) {
    if (TermContext_Type.featOkTst && ((TermContext_Type)jcasType).casFeat_Treatment_modifier == null)
      jcasType.jcas.throwFeatMissing("Treatment_modifier", "gov.va.vinci.leo.context.types.TermContext");
    jcasType.ll_cas.ll_setStringValue(addr, ((TermContext_Type)jcasType).casFeatCode_Treatment_modifier, v);}    
   
    
  //*--------------*
  //* Feature: Treatment_term

  /** getter for Treatment_term - gets text of the header
   * @generated
   * @return value of the feature 
   */
  public String getTreatment_term() {
    if (TermContext_Type.featOkTst && ((TermContext_Type)jcasType).casFeat_Treatment_term == null)
      jcasType.jcas.throwFeatMissing("Treatment_term", "gov.va.vinci.leo.context.types.TermContext");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TermContext_Type)jcasType).casFeatCode_Treatment_term);}
    
  /** setter for Treatment_term - sets text of the header 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTreatment_term(String v) {
    if (TermContext_Type.featOkTst && ((TermContext_Type)jcasType).casFeat_Treatment_term == null)
      jcasType.jcas.throwFeatMissing("Treatment_term", "gov.va.vinci.leo.context.types.TermContext");
    jcasType.ll_cas.ll_setStringValue(addr, ((TermContext_Type)jcasType).casFeatCode_Treatment_term, v);}    
   
    
  //*--------------*
  //* Feature: Castrate_term

  /** getter for Castrate_term - gets flag for castrate resistance
   * @generated
   * @return value of the feature 
   */
  public String getCastrate_term() {
    if (TermContext_Type.featOkTst && ((TermContext_Type)jcasType).casFeat_Castrate_term == null)
      jcasType.jcas.throwFeatMissing("Castrate_term", "gov.va.vinci.leo.context.types.TermContext");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TermContext_Type)jcasType).casFeatCode_Castrate_term);}
    
  /** setter for Castrate_term - sets flag for castrate resistance 
   * @generated
   * @param v value to set into the feature 
   */
  public void setCastrate_term(String v) {
    if (TermContext_Type.featOkTst && ((TermContext_Type)jcasType).casFeat_Castrate_term == null)
      jcasType.jcas.throwFeatMissing("Castrate_term", "gov.va.vinci.leo.context.types.TermContext");
    jcasType.ll_cas.ll_setStringValue(addr, ((TermContext_Type)jcasType).casFeatCode_Castrate_term, v);}    
   
    
  //*--------------*
  //* Feature: Castrate_sensitive

  /** getter for Castrate_sensitive - gets flag for castrate resistance
   * @generated
   * @return value of the feature 
   */
  public int getCastrate_sensitive() {
    if (TermContext_Type.featOkTst && ((TermContext_Type)jcasType).casFeat_Castrate_sensitive == null)
      jcasType.jcas.throwFeatMissing("Castrate_sensitive", "gov.va.vinci.leo.context.types.TermContext");
    return jcasType.ll_cas.ll_getIntValue(addr, ((TermContext_Type)jcasType).casFeatCode_Castrate_sensitive);}
    
  /** setter for Castrate_sensitive - sets flag for castrate resistance 
   * @generated
   * @param v value to set into the feature 
   */
  public void setCastrate_sensitive(int v) {
    if (TermContext_Type.featOkTst && ((TermContext_Type)jcasType).casFeat_Castrate_sensitive == null)
      jcasType.jcas.throwFeatMissing("Castrate_sensitive", "gov.va.vinci.leo.context.types.TermContext");
    jcasType.ll_cas.ll_setIntValue(addr, ((TermContext_Type)jcasType).casFeatCode_Castrate_sensitive, v);}    
   
    
  //*--------------*
  //* Feature: Castrate_resistant

  /** getter for Castrate_resistant - gets flag for castrate resistance
   * @generated
   * @return value of the feature 
   */
  public int getCastrate_resistant() {
    if (TermContext_Type.featOkTst && ((TermContext_Type)jcasType).casFeat_Castrate_resistant == null)
      jcasType.jcas.throwFeatMissing("Castrate_resistant", "gov.va.vinci.leo.context.types.TermContext");
    return jcasType.ll_cas.ll_getIntValue(addr, ((TermContext_Type)jcasType).casFeatCode_Castrate_resistant);}
    
  /** setter for Castrate_resistant - sets flag for castrate resistance 
   * @generated
   * @param v value to set into the feature 
   */
  public void setCastrate_resistant(int v) {
    if (TermContext_Type.featOkTst && ((TermContext_Type)jcasType).casFeat_Castrate_resistant == null)
      jcasType.jcas.throwFeatMissing("Castrate_resistant", "gov.va.vinci.leo.context.types.TermContext");
    jcasType.ll_cas.ll_setIntValue(addr, ((TermContext_Type)jcasType).casFeatCode_Castrate_resistant, v);}    
   
    
  //*--------------*
  //* Feature: mPCa_flag

  /** getter for mPCa_flag - gets flag for mPCa diagnosis
   * @generated
   * @return value of the feature 
   */
  public int getMPCa_flag() {
    if (TermContext_Type.featOkTst && ((TermContext_Type)jcasType).casFeat_mPCa_flag == null)
      jcasType.jcas.throwFeatMissing("mPCa_flag", "gov.va.vinci.leo.context.types.TermContext");
    return jcasType.ll_cas.ll_getIntValue(addr, ((TermContext_Type)jcasType).casFeatCode_mPCa_flag);}
    
  /** setter for mPCa_flag - sets flag for mPCa diagnosis 
   * @generated
   * @param v value to set into the feature 
   */
  public void setMPCa_flag(int v) {
    if (TermContext_Type.featOkTst && ((TermContext_Type)jcasType).casFeat_mPCa_flag == null)
      jcasType.jcas.throwFeatMissing("mPCa_flag", "gov.va.vinci.leo.context.types.TermContext");
    jcasType.ll_cas.ll_setIntValue(addr, ((TermContext_Type)jcasType).casFeatCode_mPCa_flag, v);}    
  }

    