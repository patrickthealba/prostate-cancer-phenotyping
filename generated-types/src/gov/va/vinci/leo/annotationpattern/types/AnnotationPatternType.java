

/* First created by JCasGen Tue Jun 08 09:59:36 CDT 2021 */
package gov.va.vinci.leo.annotationpattern.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Jun 08 09:59:36 CDT 2021
 * XML source: C:/Users/VH7256~1/AppData/Local/Temp/3/leoTypeDescription_a5cffad6-254b-4083-b74b-66eb64bfe7ce877418464091326058.xml
 * @generated */
public class AnnotationPatternType extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnnotationPatternType.class);
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
  protected AnnotationPatternType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public AnnotationPatternType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public AnnotationPatternType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public AnnotationPatternType(JCas jcas, int begin, int end) {
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
  //* Feature: anchor

  /** getter for anchor - gets 
   * @generated
   * @return value of the feature 
   */
  public Annotation getAnchor() {
    if (AnnotationPatternType_Type.featOkTst && ((AnnotationPatternType_Type)jcasType).casFeat_anchor == null)
      jcasType.jcas.throwFeatMissing("anchor", "gov.va.vinci.leo.annotationpattern.types.AnnotationPatternType");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AnnotationPatternType_Type)jcasType).casFeatCode_anchor)));}
    
  /** setter for anchor - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnchor(Annotation v) {
    if (AnnotationPatternType_Type.featOkTst && ((AnnotationPatternType_Type)jcasType).casFeat_anchor == null)
      jcasType.jcas.throwFeatMissing("anchor", "gov.va.vinci.leo.annotationpattern.types.AnnotationPatternType");
    jcasType.ll_cas.ll_setRefValue(addr, ((AnnotationPatternType_Type)jcasType).casFeatCode_anchor, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: anchorPattern

  /** getter for anchorPattern - gets 
   * @generated
   * @return value of the feature 
   */
  public String getAnchorPattern() {
    if (AnnotationPatternType_Type.featOkTst && ((AnnotationPatternType_Type)jcasType).casFeat_anchorPattern == null)
      jcasType.jcas.throwFeatMissing("anchorPattern", "gov.va.vinci.leo.annotationpattern.types.AnnotationPatternType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AnnotationPatternType_Type)jcasType).casFeatCode_anchorPattern);}
    
  /** setter for anchorPattern - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnchorPattern(String v) {
    if (AnnotationPatternType_Type.featOkTst && ((AnnotationPatternType_Type)jcasType).casFeat_anchorPattern == null)
      jcasType.jcas.throwFeatMissing("anchorPattern", "gov.va.vinci.leo.annotationpattern.types.AnnotationPatternType");
    jcasType.ll_cas.ll_setStringValue(addr, ((AnnotationPatternType_Type)jcasType).casFeatCode_anchorPattern, v);}    
   
    
  //*--------------*
  //* Feature: pattern

  /** getter for pattern - gets 
   * @generated
   * @return value of the feature 
   */
  public String getPattern() {
    if (AnnotationPatternType_Type.featOkTst && ((AnnotationPatternType_Type)jcasType).casFeat_pattern == null)
      jcasType.jcas.throwFeatMissing("pattern", "gov.va.vinci.leo.annotationpattern.types.AnnotationPatternType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AnnotationPatternType_Type)jcasType).casFeatCode_pattern);}
    
  /** setter for pattern - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPattern(String v) {
    if (AnnotationPatternType_Type.featOkTst && ((AnnotationPatternType_Type)jcasType).casFeat_pattern == null)
      jcasType.jcas.throwFeatMissing("pattern", "gov.va.vinci.leo.annotationpattern.types.AnnotationPatternType");
    jcasType.ll_cas.ll_setStringValue(addr, ((AnnotationPatternType_Type)jcasType).casFeatCode_pattern, v);}    
   
    
  //*--------------*
  //* Feature: target

  /** getter for target - gets 
   * @generated
   * @return value of the feature 
   */
  public Annotation getTarget() {
    if (AnnotationPatternType_Type.featOkTst && ((AnnotationPatternType_Type)jcasType).casFeat_target == null)
      jcasType.jcas.throwFeatMissing("target", "gov.va.vinci.leo.annotationpattern.types.AnnotationPatternType");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AnnotationPatternType_Type)jcasType).casFeatCode_target)));}
    
  /** setter for target - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTarget(Annotation v) {
    if (AnnotationPatternType_Type.featOkTst && ((AnnotationPatternType_Type)jcasType).casFeat_target == null)
      jcasType.jcas.throwFeatMissing("target", "gov.va.vinci.leo.annotationpattern.types.AnnotationPatternType");
    jcasType.ll_cas.ll_setRefValue(addr, ((AnnotationPatternType_Type)jcasType).casFeatCode_target, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: targetPattern

  /** getter for targetPattern - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTargetPattern() {
    if (AnnotationPatternType_Type.featOkTst && ((AnnotationPatternType_Type)jcasType).casFeat_targetPattern == null)
      jcasType.jcas.throwFeatMissing("targetPattern", "gov.va.vinci.leo.annotationpattern.types.AnnotationPatternType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AnnotationPatternType_Type)jcasType).casFeatCode_targetPattern);}
    
  /** setter for targetPattern - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTargetPattern(String v) {
    if (AnnotationPatternType_Type.featOkTst && ((AnnotationPatternType_Type)jcasType).casFeat_targetPattern == null)
      jcasType.jcas.throwFeatMissing("targetPattern", "gov.va.vinci.leo.annotationpattern.types.AnnotationPatternType");
    jcasType.ll_cas.ll_setStringValue(addr, ((AnnotationPatternType_Type)jcasType).casFeatCode_targetPattern, v);}    
  }

    