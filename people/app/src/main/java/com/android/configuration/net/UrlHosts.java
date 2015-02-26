package com.android.configuration.net;

import com.android.configuration.app.AppProperties;

/**
 * Created by issuser on 15/2/26.
 */
public class UrlHosts {

    public static String getHttpMainAddress() { return getString("APP_MAIN_ADDRESS", ""); };

    private static String getString(String tag, String defaultValue) {
        return AppProperties.getInstance().getString(tag, defaultValue);
    }

}
