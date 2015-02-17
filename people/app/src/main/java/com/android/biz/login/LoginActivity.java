package com.android.biz.login;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;

import com.android.app.activities.BaseActivity;
import com.android.common.widgets.uibars.TitleBar;
import com.example.issuser.people.R;

/**
 * Created by issuser on 15/2/12.
 */
public class LoginActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void doCreate() {
        Log.d("hehe", "login activity create");
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
                break;
        }
    }
}
