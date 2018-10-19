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

    //传递数组其实是传递一个堆内存的数组首地址的引用过去，所以实际操作的是同一块内存，
    //当调用完方法，不需要返回值,实际上参数内容已经改变，
    //Android中很多操作硬件的方法都是这种C语言的传引用的思路，要非常熟练
    private static native void encodeArray(int[] arr);
}
