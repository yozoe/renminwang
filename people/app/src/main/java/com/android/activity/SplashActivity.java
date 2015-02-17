package com.android.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

import com.android.app.activities.BaseActivity;
import com.android.biz.login.LoginActivity;
import com.example.issuser.people.R;

/**
 * Created by issuser on 15/2/12.
 */
public class SplashActivity extends Activity {

    private final int LOING_EDLAY = 1000;

    private String userId;
    private int autoLoginTag = -1;

    private Handler handlerAutonLogin = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (autoLoginTag) {
                case 0:
                    Log.d("hehe", "hehe");
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                loadMainUI();
            }
        }, LOING_EDLAY);
    }

    private void loadMainUI() {
//        if (TextUtils.isEmpty(userId)) {
//
//        }
        startActivity(new Intent(SplashActivity.this, LoginActivity.class));
    }

}
