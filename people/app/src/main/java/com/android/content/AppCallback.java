package com.android.content;

/**
 * Created by issuser on 15/2/26.
 */
public interface AppCallback<T> {

    void callback(T t);
    void onError(Exception e);

}
