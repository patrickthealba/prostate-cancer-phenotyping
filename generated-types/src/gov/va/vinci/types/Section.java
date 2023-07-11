

/* First created by JCasGen Tue Jun 08 09:59:37 CDT 2021 */
package gov.va.vinci.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Section Type
 * Updated by JCasGen Tue Jun 08 09:59:37 CDT 2021
 * XML source: C:/Users/VH7256~1/AppData/Local/Temp/3/leoTypeDescription_a5cffad6-254b-4083-b74b-66eb64bfe7ce877418464091326058.xml
 * @generated */
public class Section extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Section.class);
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
  protected Section() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Section(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Section(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Section(JCas jcas, int begin, int end) {
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
  //* Feature: SectionHeader

  /** getter for SectionHeader - gets Anchor annotation around which the section was created
   * @generated
   * @return value of the feature 
   */
  public Annotation getSectionHeader() {
    if (Section_Type.featOkTst && ((Section_Type)jcasType).casFeat_SectionHeader == null)
      jcasType.jcas.throwFeatMissing("SectionHeader", "gov.va.vinci.types.Section");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Section_Type)jcasType).casFeatCode_SectionHeader)));}
    
  /** setter for SectionHeader - sets Anchor annotation around which the section was created 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSectionHeader(Annotation v) {
    if (Section_Type.featOkTst && ((Section_Type)jcasType).casFeat_SectionHeader == null)
      jcasType.jcas.throwFeatMissing("SectionHeader", "gov.va.vinci.types.Section");
    jcasType.ll_cas.ll_setRefValue(addr, ((Section_Type)jcasType).casFeatCode_SectionHeader, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: SectionHeaderText

  /** getter for SectionHeaderText - gets text of the header
   * @generated
   * @return value of the feature 
   */
  public String getSectionHeaderText() {
    if (Section_Type.featOkTst && ((Section_Type)jcasType).casFeat_SectionHeaderText == null)
      jcasType.jcas.throwFeatMissing("SectionHeaderText", "gov.va.vinci.types.Section");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Section_Type)jcasType).casFeatCode_SectionHeaderText);}
    
  /** setter for SectionHeaderText - sets text of the header 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSectionHeaderText(String v) {
    if (Section_Type.featOkTst && ((Section_Type)jcasType).casFeat_SectionHeaderText == null)
      jcasType.jcas.throwFeatMissing("SectionHeaderText", "gov.va.vinci.types.Section");
    jcasType.ll_cas.ll_setStringValue(addr, ((Section_Type)jcasType).casFeatCode_SectionHeaderText, v);}    
   
    
  //*--------------*
  //* Feature: Experiencer

  /** getter for Experiencer - gets text of the header
   * @generated
   * @return value of the feature 
   */
  public String getExperiencer() {
    if (Section_Type.featOkTst && ((Section_Type)jcasType).casFeat_Experiencer == null)
      jcasType.jcas.throwFeatMissing("Experiencer", "gov.va.vinci.types.Section");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Section_Type)jcasType).casFeatCode_Experiencer);}
    
  /** setter for Experiencer - sets text of the header 
   * @generated
   * @param v value to set into the feature 
   */
  public void setExperiencer(String v) {
    if (Section_Type.featOkTst && ((Section_Type)jcasType).casFeat_Experiencer == null)
      jcasType.jcas.throwFeatMissing("Experiencer", "gov.va.vinci.types.Section");
    jcasType.ll_cas.ll_setStringValue(addr, ((Section_Type)jcasType).casFeatCode_Experiencer, v);}    
   
    
  //*--------------*
  //* Feature: Negation

  /** getter for Negation - gets text of the header
   * @generated
   * @return value of the feature 
   */
  public String getNegation() {
    if (Section_Type.featOkTst && ((Section_Type)jcasType).casFeat_Negation == null)
      jcasType.jcas.throwFeatMissing("Negation", "gov.va.vinci.types.Section");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Section_Type)jcasType).casFeatCode_Negation);}
    
  /** setter for Negation - sets text of the header 
   * @generated
   * @param v value to set into the feature 
   */
  public void setNegation(String v) {
    if (Section_Type.featOkTst && ((Section_Type)jcasType).casFeat_Negation == null)
      jcasType.jcas.throwFeatMissing("Negation", "gov.va.vinci.types.Section");
    jcasType.ll_cas.ll_setStringValue(addr, ((Section_Type)jcasType).casFeatCode_Negation, v);}    
   
    
  //*--------------*
  //* Feature: Temporality

  /** getter for Temporality - gets text of the header
   * @generated
   * @return value of the feature 
   */
  public String getTemporality() {
    if (Section_Type.featOkTst && ((Section_Type)jcasType).casFeat_Temporality == null)
      jcasType.jcas.throwFeatMissing("Temporality", "gov.va.vinci.types.Section");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Section_Type)jcasType).casFeatCode_Temporality);}
    
  /** setter for Temporality - sets text of the header 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTemporality(String v) {
    if (Section_Type.featOkTst && ((Section_Type)jcasType).casFeat_Temporality == null)
      jcasType.jcas.throwFeatMissing("Temporality", "gov.va.vinci.types.Section");
    jcasType.ll_cas.ll_setStringValue(addr, ((Section_Type)jcasType).casFeatCode_Temporality, v);}    
  }

    