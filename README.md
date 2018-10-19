# 通过ndk-build方式进行NDK开发

##1、配置好NDK开发环境
##2、创建Java方法
```Java
    package com.walker.myjnimk;

    public class HelloJni {

        public static int[] array = {5,2,0,1,3,1,4};

        static {
            //加载打包完毕的so类库
            System.loadLibrary("Hello");
        }

        public String getHello() {
            String value = getStringFromC();
            return value;
        }


        public static String onEncode(String value){
            return encode(value,value.length());
        }

        public static String onDecode(String value){
            return decode(value,value.length());
        }

        public static void exeArray(){
            encodeArray(array);
        }

        public native String getStringFromC();

        private static native String encode(String value,int length);

        private static native String decode(String value,int length);

        private static native void encodeArray(int[] arr);
    }
```
##3、使用javah命令生成对应的头文件
```Java
E:\code\MyJniMk\app\src\main\java>javah -classpath . -jni com.walker.com.walker.myjnimk.HelloJni
```
##4、在main下创建jni文件夹，将头文件com_walker_myjnimk_HelloJni.h放入jni中，并创建相应的源文件
##5、在jni中配置Android.mk、Application.mk,在jni目录下执行ndk-build命令，编译so库
```Java
E:\code\MyJniMk\app\src\main\jni>ndk-build
```
##6、将生成的so库放入jniLibs的对应目录下，加载使用

