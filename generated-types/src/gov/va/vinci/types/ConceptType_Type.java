
/* First created by JCasGen Tue Jun 08 09:59:36 CDT 2021 */
package gov.va.vinci.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** Concept annotation
 * Updated by JCasGen Tue Jun 08 09:59:36 CDT 2021
 * @generated */
public class ConceptType_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = ConceptType.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("gov.va.vinci.types.ConceptType");
 
  /** @generated */
  final Feature casFeat_Concept;
  /** @generated */
  final int     casFeatCode_Concept;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getConcept(int addr) {
        if (featOkTst && casFeat_Concept == null)
      jcas.throwFeatMissing("Concept", "gov.va.vinci.types.ConceptType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Concept);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setConcept(int addr, String v) {
        if (featOkTst && casFeat_Concept == null)
      jcas.throwFeatMissing("Concept", "gov.va.vinci.types.ConceptType");
    ll_cas.ll_setStringValue(addr, casFeatCode_Concept, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Pattern;
  /** @generated */
  final int     casFeatCode_Pattern;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getPattern(int addr) {
        if (featOkTst && casFeat_Pattern == null)
      jcas.throwFeatMissing("Pattern", "gov.va.vinci.types.ConceptType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Pattern);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPattern(int addr, String v) {
        if (featOkTst && casFeat_Pattern == null)
      jcas.throwFeatMissing("Pattern", "gov.va.vinci.types.ConceptType");
    ll_cas.ll_setStringValue(addr, casFeatCode_Pattern, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public ConceptType_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Concept = jcas.getRequiredFeatureDE(casType, "Concept", "uima.cas.String", featOkTst);
    casFeatCode_Concept  = (null == casFeat_Concept) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Concept).getCode();

 
    casFeat_Pattern = jcas.getRequiredFeatureDE(casType, "Pattern", "uima.cas.String", featOkTst);
    casFeatCode_Pattern  = (null == casFeat_Pattern) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Pattern).getCode();

  }
}



    