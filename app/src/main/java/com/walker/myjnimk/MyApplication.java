package com.walker.myjnimk;

import android.app.Application;

import com.walker.core.util.ToastUtils;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ToastUtils.init(this);
    }
}
