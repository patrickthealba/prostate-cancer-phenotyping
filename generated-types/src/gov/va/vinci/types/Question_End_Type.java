
/* First created by JCasGen Tue May 07 14:28:20 CDT 2019 */
package gov.va.vinci.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import gov.va.vinci.leo.regex.types.RegularExpressionType_Type;

/** 
 * Updated by JCasGen Tue May 07 14:28:20 CDT 2019
 * @generated */
public class Question_End_Type extends RegularExpressionType_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Question_End.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("gov.va.vinci.types.Question_End");



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Question_End_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    