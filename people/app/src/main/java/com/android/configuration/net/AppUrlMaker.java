package com.android.configuration.net;

/**
 * Created by issuser on 15/2/26.
 */
public class AppUrlMaker {

    public static String getLoginUrl() {
        return makeUrl(UrlHosts.getHttpMainAddress(), UrlPaths.getLoginUrlPath());
    }

    private static String makeUrl(String host, String path) {
        return new StringBuffer().append(host).append(path).toString();
    }

}
