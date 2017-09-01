package com.example.nieyuqi959.mtoutiao.utils;

import android.text.TextUtils;
import android.util.Log;

/**
 * Created by nieyuqi959 on 17/9/1.
 */

public class LogUtils {

    private static boolean LOGI = true;
    private static String TAG = "logutils";

    public static void i(String tag, String msg) {
        if (LOGI) {
            if (TextUtils.isEmpty(tag)) {
                Log.i(TAG, msg);
            } else {
                Log.i(tag, msg);
            }
        }
    }

    public static void i(String msg) {
        if (!TextUtils.isEmpty(msg))
            Log.i(TAG, msg);
    }

    public static void d(String msg) {
        if (!TextUtils.isEmpty(msg))
            Log.d(TAG, msg);
    }

    public static void d(String tag, String msg) {
        if (LOGI) {
            if (TextUtils.isEmpty(tag)) {
                Log.d(TAG, msg);
            } else {
                Log.d(tag, msg);
            }
        }
    }

    public static void e(String msg) {
        if (!TextUtils.isEmpty(msg))
            Log.e(TAG, msg);
    }

    public static void e(String tag, String msg) {
        if (LOGI) {
            if (TextUtils.isEmpty(tag)) {
                Log.e(TAG, msg);
            } else {
                Log.e(tag, msg);
            }
        }
    }


}
