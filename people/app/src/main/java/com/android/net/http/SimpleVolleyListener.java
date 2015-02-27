package com.android.net.http;

import com.android.content.AppCallback;
import com.android.volley.Response;

/**
 * Created by issuser on 15/2/27.
 */
public class SimpleVolleyListener<T> implements Response.Listener<T> {

    private AppCallback<T> callback;
    
    public SimpleVolleyListener(AppCallback<T> callback) {
        this.callback = callback;
    }

    @Override
    public void onResponse(T t) {
        if (callback != null) {
            callback.callback(t);
        }
    }
}
