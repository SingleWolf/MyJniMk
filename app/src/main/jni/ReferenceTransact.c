//
// Created by admin on 2018/10/18.
//
#include <jni.h>

JNIEXPORT void JNICALL Java_com_walker_myjnimk_ReferenceTransact_encodeArray
        (JNIEnv * env, jclass type, jintArray arr){
    //拿到整型数组的长度以及第0个元素的地址
    //jsize       (*GetArrayLength)(JNIEnv*, jarray);
    int length = (*env)->GetArrayLength(env, arr);
    // jint*       (*GetIntArrayElements)(JNIEnv*, jintArray, jboolean*);
    int* arrp = (*env)->GetIntArrayElements(env, arr, 0);
    int i;
    for(i = 0;i<length;i++){
        *(arrp + i) += 10; //将数组中的每个元素加10
    }
}

