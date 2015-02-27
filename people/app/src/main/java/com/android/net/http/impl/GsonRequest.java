package com.android.net.http.impl;

import android.util.Log;

import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonRequest;
import com.google.gson.Gson;

/**
 * Created by issuser on 15/2/26.
 */
public class GsonRequest<T> extends JsonRequest {

    private Gson mGson;
    private Class<T> mClass;
    private Response.Listener<T> mListener;

    public GsonRequest(int method, String url, String requestBody, Response.Listener listener, Response.ErrorListener errorListener) {
        super(method, url, requestBody, listener, errorListener);
        Log.i("啊啊", "哦哦");
    }

    @Override
    protected Response parseNetworkResponse(NetworkResponse networkResponse) {
        return null;
    }

}