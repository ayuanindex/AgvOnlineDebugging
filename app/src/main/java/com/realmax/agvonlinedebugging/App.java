package com.realmax.agvonlinedebugging;

import android.app.Application;
import android.content.Context;
import android.widget.Toast;

public class App extends Application {
    private static Context context;
    private static Toast toast;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this.getApplicationContext();
        toast = Toast.makeText(context, "", Toast.LENGTH_SHORT);
    }

    /**
     * @return 返回上下文环境
     */
    public static Context getContext() {
        return context;
    }

    /**
     * 显示Toast
     *
     * @param msg Toast中的文字
     */
    public static void showToast(String msg) {
        toast.cancel();
        toast = Toast.makeText(context, msg, Toast.LENGTH_SHORT);
        toast.show();
    }
}
