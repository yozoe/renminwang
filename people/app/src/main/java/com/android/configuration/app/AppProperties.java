package com.android.configuration.app;

import com.android.app.AppCtx;
import com.android.common.utils.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by issuser on 15/2/16.
 */
public class AppProperties {

    private Properties sProperties = null;
    private static AppProperties sInstance = null;

    public static AppProperties getInstance() {
        if (sInstance == null) sInstance = new AppProperties();
        return sInstance;
    }

    private static Properties loadProperties(String path) {
        try {
            Properties _properties = new Properties();
            InputStream stream = AppCtx.getInstance().getAssets().open(path);
            if (stream == null) {
                return null;
            }
            _properties.load(stream);
            IOUtils.close(stream);
            return _properties;
        } catch (IOException e) {
            return null;
        }
    }

    public String getString(String tag, String defaultValue) {
        final String value = sProperties.getProperty(tag);
        if (value == null || value.trim().equals("")) {
            return defaultValue;
        }
        return value;
    }

}
