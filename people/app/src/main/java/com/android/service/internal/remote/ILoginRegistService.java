package com.android.service.internal.remote;

import android.content.Context;

import com.android.content.AppCallback;

/**
 * Created by issuser on 15/2/16.
 */
public interface ILoginRegistService {

    public <LoginRegistReturnModel> void doGetJson(String url, Context ctx, Class<LoginRegistReturnModel> cls,
                                                   String[][] parameters, AppCallback<LoginRegistReturnModel> callback);

}
