/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mach1.spatiallibs;

public class Mach1DecodeModule {
  public static SWIGTYPE_p_void Mach1DecodeCAPI_create() {
    long cPtr = Mach1DecodeModuleJNI.Mach1DecodeCAPI_create();
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static void Mach1DecodeCAPI_delete(SWIGTYPE_p_void M1obj) {
    Mach1DecodeModuleJNI.Mach1DecodeCAPI_delete(SWIGTYPE_p_void.getCPtr(M1obj));
  }

  public static void Mach1DecodeCAPI_setDecodeAlgoType(SWIGTYPE_p_void M1obj, Mach1DecodeAlgoType algorithmType) {
    Mach1DecodeModuleJNI.Mach1DecodeCAPI_setDecodeAlgoType(SWIGTYPE_p_void.getCPtr(M1obj), algorithmType.swigValue());
  }

  public static void Mach1DecodeCAPI_setPlatformType(SWIGTYPE_p_void M1obj, Mach1PlatformType platformType) {
    Mach1DecodeModuleJNI.Mach1DecodeCAPI_setPlatformType(SWIGTYPE_p_void.getCPtr(M1obj), platformType.swigValue());
  }

  public static Mach1DecodeAlgoType Mach1DecodeCAPI_getDecodeAlgoType(SWIGTYPE_p_void M1obj) {
    return Mach1DecodeAlgoType.swigToEnum(Mach1DecodeModuleJNI.Mach1DecodeCAPI_getDecodeAlgoType(SWIGTYPE_p_void.getCPtr(M1obj)));
  }

  public static Mach1PlatformType Mach1DecodeCAPI_getPlatformType(SWIGTYPE_p_void M1obj) {
    return Mach1PlatformType.swigToEnum(Mach1DecodeModuleJNI.Mach1DecodeCAPI_getPlatformType(SWIGTYPE_p_void.getCPtr(M1obj)));
  }

  public static void Mach1DecodeCAPI_decode(SWIGTYPE_p_void M1obj, float Yaw, float Pitch, float Roll, SWIGTYPE_p_float result, int bufferSize, int sampleIndex) {
    Mach1DecodeModuleJNI.Mach1DecodeCAPI_decode(SWIGTYPE_p_void.getCPtr(M1obj), Yaw, Pitch, Roll, SWIGTYPE_p_float.getCPtr(result), bufferSize, sampleIndex);
  }

  public static void Mach1DecodeCAPI_decodeCoeffs(SWIGTYPE_p_void M1obj, SWIGTYPE_p_float result, int bufferSize, int sampleIndex) {
    Mach1DecodeModuleJNI.Mach1DecodeCAPI_decodeCoeffs(SWIGTYPE_p_void.getCPtr(M1obj), SWIGTYPE_p_float.getCPtr(result), bufferSize, sampleIndex);
  }

  public static void Mach1DecodeCAPI_setFilterSpeed(SWIGTYPE_p_void M1obj, float filterSpeed) {
    Mach1DecodeModuleJNI.Mach1DecodeCAPI_setFilterSpeed(SWIGTYPE_p_void.getCPtr(M1obj), filterSpeed);
  }

  public static void Mach1DecodeCAPI_beginBuffer(SWIGTYPE_p_void M1obj) {
    Mach1DecodeModuleJNI.Mach1DecodeCAPI_beginBuffer(SWIGTYPE_p_void.getCPtr(M1obj));
  }

  public static void Mach1DecodeCAPI_endBuffer(SWIGTYPE_p_void M1obj) {
    Mach1DecodeModuleJNI.Mach1DecodeCAPI_endBuffer(SWIGTYPE_p_void.getCPtr(M1obj));
  }

  public static int Mach1DecodeCAPI_getFormatChannelCount(SWIGTYPE_p_void M1obj) {
    return Mach1DecodeModuleJNI.Mach1DecodeCAPI_getFormatChannelCount(SWIGTYPE_p_void.getCPtr(M1obj));
  }

  public static void Mach1DecodeCAPI_setRotation(SWIGTYPE_p_void M1obj, Mach1Point3D newRotationFromMinusOnetoOne) {
    Mach1DecodeModuleJNI.Mach1DecodeCAPI_setRotation(SWIGTYPE_p_void.getCPtr(M1obj), Mach1Point3D.getCPtr(newRotationFromMinusOnetoOne), newRotationFromMinusOnetoOne);
  }

  public static void Mach1DecodeCAPI_setRotationDegrees(SWIGTYPE_p_void M1obj, Mach1Point3D newRotationDegrees) {
    Mach1DecodeModuleJNI.Mach1DecodeCAPI_setRotationDegrees(SWIGTYPE_p_void.getCPtr(M1obj), Mach1Point3D.getCPtr(newRotationDegrees), newRotationDegrees);
  }

  public static void Mach1DecodeCAPI_setRotationRadians(SWIGTYPE_p_void M1obj, Mach1Point3D newRotationRadians) {
    Mach1DecodeModuleJNI.Mach1DecodeCAPI_setRotationRadians(SWIGTYPE_p_void.getCPtr(M1obj), Mach1Point3D.getCPtr(newRotationRadians), newRotationRadians);
  }

  public static void Mach1DecodeCAPI_setRotationQuat(SWIGTYPE_p_void M1obj, Mach1Point4D newRotationQuat) {
    Mach1DecodeModuleJNI.Mach1DecodeCAPI_setRotationQuat(SWIGTYPE_p_void.getCPtr(M1obj), Mach1Point4D.getCPtr(newRotationQuat), newRotationQuat);
  }

  public static int Mach1DecodeCAPI_getCurrentTime(SWIGTYPE_p_void M1obj) {
    return Mach1DecodeModuleJNI.Mach1DecodeCAPI_getCurrentTime(SWIGTYPE_p_void.getCPtr(M1obj));
  }

  public static int Mach1DecodeCAPI_getLastCalculationTime(SWIGTYPE_p_void M1obj) {
    return Mach1DecodeModuleJNI.Mach1DecodeCAPI_getLastCalculationTime(SWIGTYPE_p_void.getCPtr(M1obj));
  }

  public static String Mach1DecodeCAPI_getLog(SWIGTYPE_p_void M1obj) {
    return Mach1DecodeModuleJNI.Mach1DecodeCAPI_getLog(SWIGTYPE_p_void.getCPtr(M1obj));
  }

  public static Mach1Point3D Mach1DecodeCAPI_getCurrentAngle(SWIGTYPE_p_void M1obj) {
    return new Mach1Point3D(Mach1DecodeModuleJNI.Mach1DecodeCAPI_getCurrentAngle(SWIGTYPE_p_void.getCPtr(M1obj)), true);
  }

}
