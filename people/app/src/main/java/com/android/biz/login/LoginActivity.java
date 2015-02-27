package com.android.biz.login;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.app.activities.BaseActivity;
import com.android.common.widgets.uibars.TitleBar;
import com.android.configuration.net.AppUrlMaker;
import com.android.content.AppCallback;
import com.android.service.internal.remote.impl.LoginRegistServiceImpl;
import com.android.service.internal.remote.models.LoginRegistReturnModel;
import com.example.issuser.people.R;

/**
 * Created by issuser on 15/2/12.
 */
public class LoginActivity extends BaseActivity implements View.OnClickListener {

    private Button mLoginButton;
    private EditText mPhoneNumber;
    private EditText mPassword;

    private String phonenumber;
    private String password;

    @Override
    protected void doCreate() {
        Log.d("hehe", "login activity create");
        mLoginButton = (Button) findViewById(R.id.button_login);
        mPhoneNumber = (EditText) findViewById(R.id.edittext_phoneNumber);
        mPassword = (EditText) findViewById(R.id.edittext_password);
        mLoginButton.setOnClickListener(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.ac_login;
    }

    @Override
    protected boolean buildTitle(TitleBar bar) {
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_login:
                String urlstr = AppUrlMaker.getLoginUrl();
                phonenumber = mPhoneNumber.getText().toString().trim();
                password = mPassword.getText().toString().trim();
                LoginRegistServiceImpl lrsi = new LoginRegistServiceImpl();
                lrsi.doGetJson(urlstr, LoginActivity.this, LoginRegistReturnModel.class, new String[][] {
                        {"phoneNo", phonenumber},
                        {"password", password}
                }, new AppCallback<LoginRegistReturnModel>() {
                    @Override
                    public void callback(LoginRegistReturnModel loginRegistReturnModel) {
                        Log.i("hehe", loginRegistReturnModel.getUser().toString());
                    }

                    @Override
                    public void onError(Exception e) {
                        Log.i("hehe", "出错了");
                    }
                });
                break;
        }
    }
}
