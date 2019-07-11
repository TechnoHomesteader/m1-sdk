/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.Mach1;

public class Mach1FloatArray {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Mach1FloatArray(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Mach1FloatArray obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    //delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        Mach1FloatArrayModuleJNI.delete_Mach1FloatArray(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public long asVoidPtr() {
    return getCPtr(this);    
  }

  public static Mach1FloatArray frompointer(long cPtr) {
    return (cPtr == 0) ? null : new Mach1FloatArray(cPtr, false);
  }

  public Mach1FloatArray(int nelements) {
    this(Mach1FloatArrayModuleJNI.new_Mach1FloatArray(nelements), true);
  }

  public float getitem(int index) {
    return Mach1FloatArrayModuleJNI.Mach1FloatArray_getitem(swigCPtr, this, index);
  }

  public void setitem(int index, float value) {
    Mach1FloatArrayModuleJNI.Mach1FloatArray_setitem(swigCPtr, this, index, value);
  }

  public SWIGTYPE_p_float cast() {
    long cPtr = Mach1FloatArrayModuleJNI.Mach1FloatArray_cast(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
  }

  public static Mach1FloatArray frompointer(SWIGTYPE_p_float t) {
    long cPtr = Mach1FloatArrayModuleJNI.Mach1FloatArray_frompointer(SWIGTYPE_p_float.getCPtr(t));
    return (cPtr == 0) ? null : new Mach1FloatArray(cPtr, false);
  }

}
