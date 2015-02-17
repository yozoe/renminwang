package com.android.app;

import android.app.Application;
import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.Volley;

/**
 * Created by issuser on 15/2/12.
 */
public class AppCtx extends Application {

    //
    private static Context sAppContext;
    private static AppCtx sAppCtx;

    public static AppCtx getInstance() {
        return sAppCtx;
    }

    ImageLoader mImageLoader;
    private RequestQueue mRequestQueue;

    @Override
    public void onCreate() {
        super.onCreate();

        firstCreateInstance();
        init();
    }

    protected void firstCreateInstance() {
        if (sAppCtx == null) {
            sAppCtx = this;
        }
        if (sAppContext == null) {
            sAppContext = this;
        }
        if (mRequestQueue == null) {
            mRequestQueue = Volley.newRequestQueue(this);
        }
    }

    public static Context getsAppContext() { return sAppContext; };
    public RequestQueue getmRequestQueue() { return mRequestQueue; };

    private void init() {};

}
