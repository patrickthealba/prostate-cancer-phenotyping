
/* First created by JCasGen Tue Jun 08 09:59:37 CDT 2021 */
package gov.va.vinci.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** Section Type
 * Updated by JCasGen Tue Jun 08 09:59:37 CDT 2021
 * @generated */
public class Section_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Section.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("gov.va.vinci.types.Section");
 
  /** @generated */
  final Feature casFeat_SectionHeader;
  /** @generated */
  final int     casFeatCode_SectionHeader;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSectionHeader(int addr) {
        if (featOkTst && casFeat_SectionHeader == null)
      jcas.throwFeatMissing("SectionHeader", "gov.va.vinci.types.Section");
    return ll_cas.ll_getRefValue(addr, casFeatCode_SectionHeader);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSectionHeader(int addr, int v) {
        if (featOkTst && casFeat_SectionHeader == null)
      jcas.throwFeatMissing("SectionHeader", "gov.va.vinci.types.Section");
    ll_cas.ll_setRefValue(addr, casFeatCode_SectionHeader, v);}
    
  
 
  /** @generated */
  final Feature casFeat_SectionHeaderText;
  /** @generated */
  final int     casFeatCode_SectionHeaderText;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSectionHeaderText(int addr) {
        if (featOkTst && casFeat_SectionHeaderText == null)
      jcas.throwFeatMissing("SectionHeaderText", "gov.va.vinci.types.Section");
    return ll_cas.ll_getStringValue(addr, casFeatCode_SectionHeaderText);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSectionHeaderText(int addr, String v) {
        if (featOkTst && casFeat_SectionHeaderText == null)
      jcas.throwFeatMissing("SectionHeaderText", "gov.va.vinci.types.Section");
    ll_cas.ll_setStringValue(addr, casFeatCode_SectionHeaderText, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Experiencer;
  /** @generated */
  final int     casFeatCode_Experiencer;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getExperiencer(int addr) {
        if (featOkTst && casFeat_Experiencer == null)
      jcas.throwFeatMissing("Experiencer", "gov.va.vinci.types.Section");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Experiencer);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setExperiencer(int addr, String v) {
        if (featOkTst && casFeat_Experiencer == null)
      jcas.throwFeatMissing("Experiencer", "gov.va.vinci.types.Section");
    ll_cas.ll_setStringValue(addr, casFeatCode_Experiencer, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Negation;
  /** @generated */
  final int     casFeatCode_Negation;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getNegation(int addr) {
        if (featOkTst && casFeat_Negation == null)
      jcas.throwFeatMissing("Negation", "gov.va.vinci.types.Section");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Negation);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNegation(int addr, String v) {
        if (featOkTst && casFeat_Negation == null)
      jcas.throwFeatMissing("Negation", "gov.va.vinci.types.Section");
    ll_cas.ll_setStringValue(addr, casFeatCode_Negation, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Temporality;
  /** @generated */
  final int     casFeatCode_Temporality;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTemporality(int addr) {
        if (featOkTst && casFeat_Temporality == null)
      jcas.throwFeatMissing("Temporality", "gov.va.vinci.types.Section");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Temporality);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTemporality(int addr, String v) {
        if (featOkTst && casFeat_Temporality == null)
      jcas.throwFeatMissing("Temporality", "gov.va.vinci.types.Section");
    ll_cas.ll_setStringValue(addr, casFeatCode_Temporality, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Section_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_SectionHeader = jcas.getRequiredFeatureDE(casType, "SectionHeader", "uima.tcas.Annotation", featOkTst);
    casFeatCode_SectionHeader  = (null == casFeat_SectionHeader) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_SectionHeader).getCode();

 
    casFeat_SectionHeaderText = jcas.getRequiredFeatureDE(casType, "SectionHeaderText", "uima.cas.String", featOkTst);
    casFeatCode_SectionHeaderText  = (null == casFeat_SectionHeaderText) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_SectionHeaderText).getCode();

 
    casFeat_Experiencer = jcas.getRequiredFeatureDE(casType, "Experiencer", "uima.cas.String", featOkTst);
    casFeatCode_Experiencer  = (null == casFeat_Experiencer) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Experiencer).getCode();

 
    casFeat_Negation = jcas.getRequiredFeatureDE(casType, "Negation", "uima.cas.String", featOkTst);
    casFeatCode_Negation  = (null == casFeat_Negation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Negation).getCode();

 
    casFeat_Temporality = jcas.getRequiredFeatureDE(casType, "Temporality", "uima.cas.String", featOkTst);
    casFeatCode_Temporality  = (null == casFeat_Temporality) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Temporality).getCode();

  }
}



    