package com.android.common.utils;

import android.util.Log;

import com.android.configuration.app.BuildConfig;

/**
 * Created by issuser on 15/2/16.
 */
public class LogUtils {

    public static void e(String tag, String msg, Throwable tr) {
        if (BuildConfig.DEBUG) Log.e(tag, msg, tr);
    }

    public static void e(String tag, String msg) {
        if (BuildConfig.DEBUG) Log.e(tag, msg);
    }

    public static void d(String tag, String msg, Throwable tr) {
        if (BuildConfig.DEBUG) Log.d(tag, msg, tr);
    }

    public static void d(String tag, String msg) {
        if (BuildConfig.DEBUG) Log.d(tag, msg);
    }

    public static void w(String tag, String msg, Throwable tr) {
        if (BuildConfig.DEBUG) Log.w(tag, msg, tr);
    }

    public static void w(String tag, String msg) {
        if (BuildConfig.DEBUG) Log.w(tag, msg);
    }

    public static void i(String tag, String msg, Throwable tr) {
        if (BuildConfig.DEBUG) Log.i(tag, msg, tr);
    }

    public static void i(String tag, String msg) {
        if (BuildConfig.DEBUG) Log.i(tag, msg);
    }

    public static void v(String tag, String msg, Throwable tr) {
        if (BuildConfig.DEBUG) Log.v(tag, msg, tr);
    }

    public static void v(String tag, String msg) {
        if (BuildConfig.DEBUG) Log.v(tag, msg);
    }
}
