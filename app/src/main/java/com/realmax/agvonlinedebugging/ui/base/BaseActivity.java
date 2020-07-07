package com.realmax.agvonlinedebugging.ui.base;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    public Handler uiHandler;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResourceId());
        initView();
        uiHandler = new Handler(Looper.getMainLooper());
        initListener();
        initData();
    }

    /**
     * 获取布局资源
     *
     * @return 返回布局资源ID
     */
    @LayoutRes
    protected abstract int getLayoutResourceId();

    /**
     * 初始化界面控件
     */
    protected abstract void initView();

    /**
     * 初始化监听
     */
    protected abstract void initListener();

    /**
     * 初始化数据
     */
    protected abstract void initData();

    /**
     * 界面跳转
     *
     * @param activity 需要跳转的Activity
     */
    public <T> void jump(Class<T> activity) {
        startActivity(new Intent(this, activity));
    }
}
