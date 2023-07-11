
/* First created by JCasGen Tue Jun 08 09:59:36 CDT 2021 */
package gov.va.vinci.leo.whitespace.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Tue Jun 08 09:59:36 CDT 2021
 * @generated */
public class Token_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Token.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("gov.va.vinci.leo.whitespace.types.Token");
 
  /** @generated */
  final Feature casFeat_TokenType;
  /** @generated */
  final int     casFeatCode_TokenType;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getTokenType(int addr) {
        if (featOkTst && casFeat_TokenType == null)
      jcas.throwFeatMissing("TokenType", "gov.va.vinci.leo.whitespace.types.Token");
    return ll_cas.ll_getIntValue(addr, casFeatCode_TokenType);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTokenType(int addr, int v) {
        if (featOkTst && casFeat_TokenType == null)
      jcas.throwFeatMissing("TokenType", "gov.va.vinci.leo.whitespace.types.Token");
    ll_cas.ll_setIntValue(addr, casFeatCode_TokenType, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Token_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_TokenType = jcas.getRequiredFeatureDE(casType, "TokenType", "uima.cas.Integer", featOkTst);
    casFeatCode_TokenType  = (null == casFeat_TokenType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_TokenType).getCode();

  }
}



    