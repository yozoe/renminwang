package com.android.net.http;

import com.android.content.AppCallback;
import com.android.volley.Response;
import com.android.volley.VolleyError;

/**
 * Created by issuser on 15/2/27.
 */
public class SimpleVolleyErrorListener<T> implements Response.ErrorListener {

    private AppCallback<T> callback;

    public SimpleVolleyErrorListener(AppCallback<T> callback){
        this.callback = callback;
    }

    @Override
    public void onErrorResponse(VolleyError e) {
        if(callback != null) callback.onError(e);
    }

}
