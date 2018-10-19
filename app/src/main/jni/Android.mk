LOCAL_PATH := $(call my-dir)

#include $(CLEAR_VARS)  
#LOCAL_MODULE := Hello  
#LOCAL_SRC_FILES := libHello.so    
#include $(PREBUILT_SHARED_LIBRARY)  

#声明一个预编译库的模块：共享库
include $(CLEAR_VARS)
#编译生成的文件的类库叫什么名字
LOCAL_MODULE := Hello
#要编译的c文件
LOCAL_SRC_FILES := Hello.c
LOCAL_LDLIBS := -llog -lz -ldl
#应该用复数形式，否则连接不上第三方库中的函数
LOCAL_SHARED_LIBRARIES :=
include $(BUILD_SHARED_LIBRARY)


