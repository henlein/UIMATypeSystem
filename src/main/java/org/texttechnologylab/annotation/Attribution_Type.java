
/* First created by JCasGen Thu Nov 05 17:32:31 CET 2020 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.texttechnologylab.annotation.type.AnnotationNode_Type;

/** 
 * Updated by JCasGen Thu Nov 05 17:33:59 CET 2020
 * @generated */
public class Attribution_Type extends AnnotationNode_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Attribution.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.Attribution");



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Attribution_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    