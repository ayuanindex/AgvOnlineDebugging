package com.realmax.agvonlinedebugging.ui.base;

import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.realmax.agvonlinedebugging.App;

public interface BaseUiRefresh {
    String TAG = "BaseUiRefresh";
    String TIP = "此接口方法暂未实现";

    /**
     * 显示Toast
     *
     * @param msg Toast显示的文字
     */
    default void showToast(String msg) {
        App.showToast(msg);
    }

    /**
     * 获取上下文环境
     *
     * @return 当前Activity的上下文环境
     */
    default AppCompatActivity getActivity() {
        Log.d(TAG, "getActivity: " + TIP);
        return null;
    }


    /**
     * 切换到主线程进行界面刷新
     */
    default void switchToMainThread(Runnable runnable) {
        Log.d(TAG, "switchToMainThread: " + TIP);
    }
}
