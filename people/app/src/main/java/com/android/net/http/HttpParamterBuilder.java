package com.android.net.http;

import android.net.Uri;
import android.text.TextUtils;

import com.android.common.utils.LogUtils;

/**
 * Created by issuser on 15/2/26.
 */
public class HttpParamterBuilder {

    private static final String TAG = "HTTP Utils";

    public static String buildWithParams(String url, String[][] parameters) {
        if (parameters != null) {
            Uri.Builder uriBuilder = Uri.parse(url).buildUpon();
            for (String[] strs : parameters) {
                if (strs.length != 2) {
                    LogUtils.w(TAG, "you has passed a short wrong url parameter!");
                    continue;
                }

                final String str1 = strs[0];
                final String str2 = strs[1];

                if (str1 == null || str2 == null || TextUtils.isEmpty(str1.toString())) {
                    continue;
                }

                uriBuilder.appendQueryParameter(str1, str2);
            }
            url = uriBuilder.build().toString();
        }
        return url;
    }

}
