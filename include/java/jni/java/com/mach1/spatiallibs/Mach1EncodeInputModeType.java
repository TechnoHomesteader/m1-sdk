/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mach1.spatiallibs;

public final class Mach1EncodeInputModeType {
  public final static Mach1EncodeInputModeType Mach1EncodeInputModeMono = new Mach1EncodeInputModeType("Mach1EncodeInputModeMono", Mach1EncodeModuleJNI.Mach1EncodeInputModeMono_get());
  public final static Mach1EncodeInputModeType Mach1EncodeInputModeStereo = new Mach1EncodeInputModeType("Mach1EncodeInputModeStereo");
  public final static Mach1EncodeInputModeType Mach1EncodeInputModeQuad = new Mach1EncodeInputModeType("Mach1EncodeInputModeQuad");
  public final static Mach1EncodeInputModeType Mach1EncodeInputModeLCRS = new Mach1EncodeInputModeType("Mach1EncodeInputModeLCRS");
  public final static Mach1EncodeInputModeType Mach1EncodeInputModeAFormat = new Mach1EncodeInputModeType("Mach1EncodeInputModeAFormat");
  public final static Mach1EncodeInputModeType Mach1EncodeInputModeBFormat = new Mach1EncodeInputModeType("Mach1EncodeInputModeBFormat");
  public final static Mach1EncodeInputModeType Mach1EncodeInputModeBFOAACN = new Mach1EncodeInputModeType("Mach1EncodeInputModeBFOAACN");
  public final static Mach1EncodeInputModeType Mach1EncodeInputModeBFOAFUMA = new Mach1EncodeInputModeType("Mach1EncodeInputModeBFOAFUMA");
  public final static Mach1EncodeInputModeType Mach1EncodeInputModeB2OAACN = new Mach1EncodeInputModeType("Mach1EncodeInputModeB2OAACN");
  public final static Mach1EncodeInputModeType Mach1EncodeInputModeB2OAFUMA = new Mach1EncodeInputModeType("Mach1EncodeInputModeB2OAFUMA");
  public final static Mach1EncodeInputModeType Mach1EncodeInputModeB3OAACN = new Mach1EncodeInputModeType("Mach1EncodeInputModeB3OAACN");
  public final static Mach1EncodeInputModeType Mach1EncodeInputModeB3OAFUMA = new Mach1EncodeInputModeType("Mach1EncodeInputModeB3OAFUMA");
  public final static Mach1EncodeInputModeType Mach1EncodeInputModeLCR = new Mach1EncodeInputModeType("Mach1EncodeInputModeLCR");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static Mach1EncodeInputModeType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + Mach1EncodeInputModeType.class + " with value " + swigValue);
  }

  private Mach1EncodeInputModeType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private Mach1EncodeInputModeType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private Mach1EncodeInputModeType(String swigName, Mach1EncodeInputModeType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static Mach1EncodeInputModeType[] swigValues = { Mach1EncodeInputModeMono, Mach1EncodeInputModeStereo, Mach1EncodeInputModeQuad, Mach1EncodeInputModeLCRS, Mach1EncodeInputModeAFormat, Mach1EncodeInputModeBFormat, Mach1EncodeInputModeBFOAACN, Mach1EncodeInputModeBFOAFUMA, Mach1EncodeInputModeB2OAACN, Mach1EncodeInputModeB2OAFUMA, Mach1EncodeInputModeB3OAACN, Mach1EncodeInputModeB3OAFUMA, Mach1EncodeInputModeLCR };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
