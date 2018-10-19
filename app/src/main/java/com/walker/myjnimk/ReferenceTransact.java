package com.walker.myjnimk;
/**
 *@author Walker
 *
 *@e-mail feitianwumu@163.com
 *
 *@date on 2018/10/18
 *
 *@summary 引用操作
 *
 */
public class ReferenceTransact {

    public static int[] array = {5,2,0,1,3,1,4};

    static {
        //加载打包完毕的so类库
        System.loadLibrary("ReferenceTransact");

    }

    public static void exeArray(){
        encodeArray(array);
    }

    //传递数组其实是传递一个堆内存的数组首地址的引用过去，所以实际操作的是同一块内存，
    //当调用完方法，不需要返回值,实际上参数内容已经改变，
    //Android中很多操作硬件的方法都是这种C语言的传引用的思路，要非常熟练
    private static native void encodeArray(int[] arr);
}
