package com.android.net.http;

import com.android.content.AppCallback;

/**
 * Created by issuser on 15/2/26.
 */
public interface I_HttpClient<T> {

    void doGet(String url, String[][] parameters, AppCallback<T> callback);
    void doPost(String url, String[][] parameters, String requestBody, AppCallback<T> callback);

}
