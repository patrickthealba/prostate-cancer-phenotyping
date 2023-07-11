
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
public class Invasion_Pattern_Type extends AnnotationPatternType_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Invasion_Pattern.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("gov.va.vinci.types.Invasion_Pattern");
 
  /** @generated */
  final Feature casFeat_Invasion_Status;
  /** @generated */
  final int     casFeatCode_Invasion_Status;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getInvasion_Status(int addr) {
        if (featOkTst && casFeat_Invasion_Status == null)
      jcas.throwFeatMissing("Invasion_Status", "gov.va.vinci.types.Invasion_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Invasion_Status);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setInvasion_Status(int addr, String v) {
        if (featOkTst && casFeat_Invasion_Status == null)
      jcas.throwFeatMissing("Invasion_Status", "gov.va.vinci.types.Invasion_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Invasion_Status, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Invasion_Depth;
  /** @generated */
  final int     casFeatCode_Invasion_Depth;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getInvasion_Depth(int addr) {
        if (featOkTst && casFeat_Invasion_Depth == null)
      jcas.throwFeatMissing("Invasion_Depth", "gov.va.vinci.types.Invasion_Pattern");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Invasion_Depth);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setInvasion_Depth(int addr, String v) {
        if (featOkTst && casFeat_Invasion_Depth == null)
      jcas.throwFeatMissing("Invasion_Depth", "gov.va.vinci.types.Invasion_Pattern");
    ll_cas.ll_setStringValue(addr, casFeatCode_Invasion_Depth, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Invasion_Pattern_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Invasion_Status = jcas.getRequiredFeatureDE(casType, "Invasion_Status", "uima.cas.String", featOkTst);
    casFeatCode_Invasion_Status  = (null == casFeat_Invasion_Status) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Invasion_Status).getCode();

 
    casFeat_Invasion_Depth = jcas.getRequiredFeatureDE(casType, "Invasion_Depth", "uima.cas.String", featOkTst);
    casFeatCode_Invasion_Depth  = (null == casFeat_Invasion_Depth) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Invasion_Depth).getCode();

  }
}



    