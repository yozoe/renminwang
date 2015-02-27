package com.android.net.http.impl;

import android.util.Log;

import com.android.configuration.net.HttpConstants;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.JsonRequest;
import com.google.gson.Gson;

import java.io.UnsupportedEncodingException;

/**
 * Created by issuser on 15/2/26.
 */
public class GsonRequest<T> extends JsonRequest<T> {

    private Gson mGson;
    private Class<T> mClass;
    private Response.Listener<T> mListener;

    public GsonRequest(int method, String url, String requestBody, Class<T> objectClass, Response.Listener<T> listener, Response.ErrorListener errorListener) {
        super(method, url, requestBody, listener, errorListener);
        this.mClass = objectClass;
        this.mListener = listener;
        this.setRetryPolicy(new DefaultRetryPolicy(HttpConstants.TIME_OUT, HttpConstants.RETRY_TIMES, 1.f));
        mGson = new Gson();
    }

    @Override
    protected Response parseNetworkResponse(NetworkResponse networkResponse) {
        try {
            String json = new String(networkResponse.data, HttpHeaderParser.parseCharset(networkResponse.headers));
            Log.d("tag", json);
            T t = mGson.fromJson(json, mClass);
            return Response.success(t, HttpHeaderParser.parseCacheHeaders(networkResponse));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }

}