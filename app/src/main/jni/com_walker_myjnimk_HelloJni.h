/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class com_walker_myjnimk_HelloJni */

#ifndef _Included_com_walker_myjnimk_HelloJni
#define _Included_com_walker_myjnimk_HelloJni
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     com_walker_myjnimk_HelloJni
 * Method:    getStringFromC
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_walker_myjnimk_HelloJni_getStringFromC
  (JNIEnv *, jclass);

JNIEXPORT jstring JNICALL Java_com_walker_myjnimk_HelloJni_encode
        (JNIEnv *, jclass, jstring, jint);

JNIEXPORT jstring JNICALL Java_com_walker_myjnimk_HelloJni_decode
        (JNIEnv *, jclass, jstring, jint);

JNIEXPORT void JNICALL Java_com_walker_myjnimk_HelloJni_encodeArray
(JNIEnv *, jclass, jintArray);

JNIEXPORT void JNICALL Java_com_walker_myjnimk_HelloJni_onJavaFunc
        (JNIEnv *, jobject, jstring);
#ifdef __cplusplus
}
#endif
#endif
