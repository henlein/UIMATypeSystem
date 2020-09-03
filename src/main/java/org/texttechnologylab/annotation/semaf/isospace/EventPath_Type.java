
/* First created by JCasGen Thu Apr 23 09:56:03 CEST 2020 */
package org.texttechnologylab.annotation.semaf.isospace;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Thu Sep 03 10:03:40 CEST 2020
 * @generated */
public class EventPath_Type extends Location_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = EventPath.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.semaf.isospace.EventPath");
 
  /** @generated */
  final Feature casFeat_trigger;
  /** @generated */
  final int     casFeatCode_trigger;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getTrigger(int addr) {
        if (featOkTst && casFeat_trigger == null)
      jcas.throwFeatMissing("trigger", "org.texttechnologylab.annotation.semaf.isospace.EventPath");
    return ll_cas.ll_getRefValue(addr, casFeatCode_trigger);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTrigger(int addr, int v) {
        if (featOkTst && casFeat_trigger == null)
      jcas.throwFeatMissing("trigger", "org.texttechnologylab.annotation.semaf.isospace.EventPath");
    ll_cas.ll_setRefValue(addr, casFeatCode_trigger, v);}
    
  
 
  /** @generated */
  final Feature casFeat_startID;
  /** @generated */
  final int     casFeatCode_startID;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getStartID(int addr) {
        if (featOkTst && casFeat_startID == null)
      jcas.throwFeatMissing("startID", "org.texttechnologylab.annotation.semaf.isospace.EventPath");
    return ll_cas.ll_getRefValue(addr, casFeatCode_startID);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setStartID(int addr, int v) {
        if (featOkTst && casFeat_startID == null)
      jcas.throwFeatMissing("startID", "org.texttechnologylab.annotation.semaf.isospace.EventPath");
    ll_cas.ll_setRefValue(addr, casFeatCode_startID, v);}
    
  
 
  /** @generated */
  final Feature casFeat_midIDs;
  /** @generated */
  final int     casFeatCode_midIDs;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getMidIDs(int addr) {
        if (featOkTst && casFeat_midIDs == null)
      jcas.throwFeatMissing("midIDs", "org.texttechnologylab.annotation.semaf.isospace.EventPath");
    return ll_cas.ll_getRefValue(addr, casFeatCode_midIDs);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMidIDs(int addr, int v) {
        if (featOkTst && casFeat_midIDs == null)
      jcas.throwFeatMissing("midIDs", "org.texttechnologylab.annotation.semaf.isospace.EventPath");
    ll_cas.ll_setRefValue(addr, casFeatCode_midIDs, v);}
    
  
 
  /** @generated */
  final Feature casFeat_endID;
  /** @generated */
  final int     casFeatCode_endID;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getEndID(int addr) {
        if (featOkTst && casFeat_endID == null)
      jcas.throwFeatMissing("endID", "org.texttechnologylab.annotation.semaf.isospace.EventPath");
    return ll_cas.ll_getRefValue(addr, casFeatCode_endID);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEndID(int addr, int v) {
        if (featOkTst && casFeat_endID == null)
      jcas.throwFeatMissing("endID", "org.texttechnologylab.annotation.semaf.isospace.EventPath");
    ll_cas.ll_setRefValue(addr, casFeatCode_endID, v);}
    
  
 
  /** @generated */
  final Feature casFeat_spatial_relator;
  /** @generated */
  final int     casFeatCode_spatial_relator;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSpatial_relator(int addr) {
        if (featOkTst && casFeat_spatial_relator == null)
      jcas.throwFeatMissing("spatial_relator", "org.texttechnologylab.annotation.semaf.isospace.EventPath");
    return ll_cas.ll_getRefValue(addr, casFeatCode_spatial_relator);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSpatial_relator(int addr, int v) {
        if (featOkTst && casFeat_spatial_relator == null)
      jcas.throwFeatMissing("spatial_relator", "org.texttechnologylab.annotation.semaf.isospace.EventPath");
    ll_cas.ll_setRefValue(addr, casFeatCode_spatial_relator, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public EventPath_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_trigger = jcas.getRequiredFeatureDE(casType, "trigger", "org.texttechnologylab.annotation.semaf.isospace.Motion", featOkTst);
    casFeatCode_trigger  = (null == casFeat_trigger) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_trigger).getCode();

 
    casFeat_startID = jcas.getRequiredFeatureDE(casType, "startID", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity", featOkTst);
    casFeatCode_startID  = (null == casFeat_startID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_startID).getCode();

 
    casFeat_midIDs = jcas.getRequiredFeatureDE(casType, "midIDs", "uima.cas.FSList", featOkTst);
    casFeatCode_midIDs  = (null == casFeat_midIDs) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_midIDs).getCode();

 
    casFeat_endID = jcas.getRequiredFeatureDE(casType, "endID", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity", featOkTst);
    casFeatCode_endID  = (null == casFeat_endID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_endID).getCode();

 
    casFeat_spatial_relator = jcas.getRequiredFeatureDE(casType, "spatial_relator", "uima.cas.FSList", featOkTst);
    casFeatCode_spatial_relator  = (null == casFeat_spatial_relator) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_spatial_relator).getCode();

  }
}



    