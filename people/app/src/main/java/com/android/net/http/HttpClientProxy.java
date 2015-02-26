package com.android.net.http;

import android.content.Context;

import com.android.content.AppCallback;

/**
 * Created by issuser on 15/2/26.
 */
public class HttpClientProxy {

    private String mUrl;

    public HttpClientProxy(String url) {
        this.mUrl = url;
    }

    public <T> void doGetJson(Context ctx, Class<T> cls, String[][] parameters, AppCallback<T> callback) {
        new JsonHttpClient<T>(ctx, cls).doGet(mUrl, parameters, callback);
    }

}
