package com.zhongyao.screensswitch;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;

/**
 * Activity横竖屏切换生命周期（待验证...）：
 * 总结：

 1、不设置Activity的android:configChanges时，切屏会重新调用各个生命周期，
 切横屏时会执行一次，切竖屏时会执行两次

 2、设置Activity的android:configChanges="orientation"时，切屏还是会重新调
 用各个生命周期，切横、竖屏时只会执行一次

 3、设置Activity的android:configChanges="orientation|keyboardHidden"时，
 切屏不会重新调用各个生命周期，只会执行onConfigurationChanged方法

 总结一下整个Activity的生命周期

 补充一点，当前Activity产生事件弹出Toast和AlertDialog的时候Activity的生命
 周期不会有改变

 Activity运行时按下HOME键(跟被完全覆盖是一样的)：onSaveInstanceState -->
 onPause --> onStop       onRestart -->onStart--->onResume

 Activity未被完全覆盖只是失去焦点：onPause--->onResume ..
 */

public class MainActivity extends Activity {
    public static String TAG = "yao";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate()");


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy()");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.d(TAG,"onConfigurationChanged()");
    }
}
