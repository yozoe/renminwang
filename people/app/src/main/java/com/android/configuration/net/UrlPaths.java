package com.android.configuration.net;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by issuser on 15/2/26.
 */
public class UrlPaths {

    private static final String LOGIN_URL = "LOGIN_URL";
    private static Map<String, String> urls = new HashMap<String, String>();

    static  {
        init();
    }

    private static void init() {
        urls.put(LOGIN_URL, "UserLogin.do");
    }

    public static String getLoginUrlPath() {
        return urls.get(LOGIN_URL);
    }

}
