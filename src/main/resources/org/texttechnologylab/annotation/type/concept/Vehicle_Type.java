
/* First created by JCasGen Wed Apr 22 22:07:17 CEST 2020 */
package org.texttechnologylab.annotation.type.concept;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;

/** 
 * Updated by JCasGen Thu Apr 23 08:52:23 CEST 2020
 * @generated */
public class Vehicle_Type extends Artifact_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Vehicle.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.type.concept.Vehicle");



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Vehicle_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    