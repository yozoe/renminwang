package com.android.common.utils;

import java.io.Closeable;
import java.io.IOException;

/**
 * Created by issuser on 15/2/16.
 */
public class IOUtils {

    private static final String TAG = "IOUtils";

    public static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                LogUtils.e("TAG", "Could not close strem", e);
            }
        }
    }

}
