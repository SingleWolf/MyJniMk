package com.walker.myjnimk;
/**
 *@author Walker
 *
 *@e-mail feitianwumu@163.com
 *
 *@date on 2018/10/18
 *
 *@summary 加密类
 *
 */
public class Encrypt {

    static {
        System.loadLibrary("Encrypt");
    }

    public static String onEncode(String value){
        return encode(value,value.length());
    }

    public static String onDecode(String value){
        return decode(value,value.length());
    }

    private static native String encode(String value,int length);

    private static native String decode(String value,int length);
}
