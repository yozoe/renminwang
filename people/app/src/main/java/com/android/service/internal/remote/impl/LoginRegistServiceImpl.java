package com.android.service.internal.remote.impl;

import android.content.Context;

import com.android.content.AppCallback;
import com.android.net.http.HttpClientProxy;
import com.android.service.internal.remote.ILoginRegistService;

/**
 * Created by issuser on 15/2/26.
 */
public class LoginRegistServiceImpl implements ILoginRegistService {


    @Override
    public <LoginRegistReturnModel> void doGetJson(String url, Context ctx, Class<LoginRegistReturnModel> cls, String[][] parameters, AppCallback<LoginRegistReturnModel> callback) {
        HttpClientProxy hcp = new HttpClientProxy(url);
        hcp.doGetJson(ctx, cls, parameters, callback);
    }
}
