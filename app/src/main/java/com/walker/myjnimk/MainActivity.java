package com.walker.myjnimk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.walker.core.util.ToastUtils;

import static com.walker.myjnimk.HelloJni.array;

public class MainActivity extends AppCompatActivity {

    private String mEncryptValue="jni is great";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onHello(View v){
        ToastUtils.showCenterShort(new HelloJni().getHello());
    }

    public void onEncode(View v){
        String value_1=mEncryptValue;
        String value_2=HelloJni.onEncode(mEncryptValue);
        mEncryptValue=value_2;
        ToastUtils.showCenterShort(String.format("%s加密后为：%s",value_1,value_2));
    }

    public void onDecode(View v){
        String value_1=mEncryptValue;
        String value_2=HelloJni.onDecode(mEncryptValue);
        mEncryptValue=value_2;
        ToastUtils.showCenterShort(String.format("%s解密后为：%s",value_1,value_2));
    }

    public void onReference(View v){
        String value_1="";
        for(int index:array){
            value_1=value_1+index;
        }

        HelloJni.exeArray();

        String value_2="";
        for(int index:array){
            value_2=value_2+index;
        }

        ToastUtils.showCenterShort(String.format("%s操作后为：%s",value_1,value_2));
    }

}
