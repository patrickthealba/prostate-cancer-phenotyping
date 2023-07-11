
/* First created by JCasGen Tue Jun 08 09:59:36 CDT 2021 */
package gov.va.vinci.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import gov.va.vinci.leo.annotationpattern.types.AnnotationPatternType_Type;

/** 
 * Updated by JCasGen Tue Jun 08 09:59:36 CDT 2021
 * @generated */
public class ACC_Pattern_Type extends AnnotationPatternType_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = ACC_Pattern.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("gov.va.vinci.types.ACC_Pattern");
 
  /** @generated */
  final Feature casFeat_Title;
  /** @generated */
  final int     casFeatCode_Title;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTitle(int addr) {
        if (featOkTst && casFeat_Title == null)
      jcas.throwFeatMissing("Title", "gov.va.vinci.types.ACC_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Title);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTitle(int addr, String v) {
        if (featOkTst && casFeat_Title == null)
      jcas.throwFeatMissing("Title", "gov.va.vinci.types.ACC_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Title, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Specimen_Type;
  /** @generated */
  final int     casFeatCode_Specimen_Type;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSpecimen_Type(int addr) {
        if (featOkTst && casFeat_Specimen_Type == null)
      jcas.throwFeatMissing("Specimen_Type", "gov.va.vinci.types.ACC_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Specimen_Type);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSpecimen_Type(int addr, String v) {
        if (featOkTst && casFeat_Specimen_Type == null)
      jcas.throwFeatMissing("Specimen_Type", "gov.va.vinci.types.ACC_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Specimen_Type, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Year;
  /** @generated */
  final int     casFeatCode_Year;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getYear(int addr) {
        if (featOkTst && casFeat_Year == null)
      jcas.throwFeatMissing("Year", "gov.va.vinci.types.ACC_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Year);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setYear(int addr, String v) {
        if (featOkTst && casFeat_Year == null)
      jcas.throwFeatMissing("Year", "gov.va.vinci.types.ACC_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Year, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Identifier;
  /** @generated */
  final int     casFeatCode_Identifier;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getIdentifier(int addr) {
        if (featOkTst && casFeat_Identifier == null)
      jcas.throwFeatMissing("Identifier", "gov.va.vinci.types.ACC_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Identifier);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setIdentifier(int addr, String v) {
        if (featOkTst && casFeat_Identifier == null)
      jcas.throwFeatMissing("Identifier", "gov.va.vinci.types.ACC_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Identifier, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public ACC_Pattern_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Title = jcas.getRequiredFeatureDE(casType, "Title", "uima.cas.String", featOkTst);
    casFeatCode_Title  = (null == casFeat_Title) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Title).getCode();

 
    casFeat_Specimen_Type = jcas.getRequiredFeatureDE(casType, "Specimen_Type", "uima.cas.String", featOkTst);
    casFeatCode_Specimen_Type  = (null == casFeat_Specimen_Type) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Specimen_Type).getCode();

 
    casFeat_Year = jcas.getRequiredFeatureDE(casType, "Year", "uima.cas.String", featOkTst);
    casFeatCode_Year  = (null == casFeat_Year) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Year).getCode();

 
    casFeat_Identifier = jcas.getRequiredFeatureDE(casType, "Identifier", "uima.cas.String", featOkTst);
    casFeatCode_Identifier  = (null == casFeat_Identifier) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Identifier).getCode();

  }
}



    