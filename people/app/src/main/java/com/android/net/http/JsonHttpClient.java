package com.android.net.http;

import android.content.Context;

import com.android.app.AppCtx;
import com.android.content.AppCallback;
import com.android.volley.RequestQueue;

/**
 * Created by issuser on 15/2/26.
 */
public class JsonHttpClient<T> implements I_HttpClient<T> {

    protected static final String ERROR_JSON = "#error json";

    private Context mContext;

    private RequestQueue mQueue;

    private Class<T> mCls;

    public JsonHttpClient(Context ctx, Class<T> cls) {
        if (ctx == null || cls == null) {
            throw new NullPointerException("null param!");
        }
        this.mContext = ctx;
        this.mCls = cls;

        mQueue = AppCtx.getInstance().getmRequestQueue();
        if (mQueue == null) {
            throw new RuntimeException("got a null request-queue");
        }
    }

    @Override
    public void doGet(String url, String[][] parameters, AppCallback<T> callback) {

    }

    @Override
    public void doPost(String url, String[][] parameters, String requestBody, AppCallback<T> callback) {

    }

    private void addRequest(int method, String url, String[][] parameters, String requesstBody, AppCallback<T> callback) {
        url = HttpParamterBuilder.buildWithParams(url, parameters);
        final RequestQueue queue = mQueue;
        if (queue == null) {
            return;
        }

    }

}
