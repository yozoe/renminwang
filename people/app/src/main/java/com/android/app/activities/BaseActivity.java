package com.android.app.activities;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.RelativeLayout;

import com.android.common.widgets.uibars.TitleBar;
import com.example.issuser.people.R;

/**
 * Created by issuser on 15/2/12.
 */
abstract public class BaseActivity extends Activity {

    private static final String TAG = "BaseActivity";
    private String mClassName;
    protected Activity mActivity;

    private ProgressDialog mProgressDialog;

    protected RelativeLayout mContentRootView;
    protected TitleBar mTitleBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mClassName = getClass().getSimpleName();
        prebuild();
        setContentView(R.layout.ac_base);
        configuration();
        basicInitialize();
        initSet();
    }

    protected void afterCreate(Bundle savedInstanceState) {

    }

    @Override
    public final boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);

    }

    private void initSet() {

    }

    private void prebuild() {

    }

    private void configuration() {

    }

    private void basicInitialize() {
        basicFindViews();
        basicSetting();
        initAnim();
    }

    private void initAnim() {

    }

    private void basicFindViews() {
        mContentRootView = (RelativeLayout) findViewById(R.id.content);
        mTitleBar = (TitleBar) findViewById(R.id.titleBar);
    }

    private void basicSetting() {
        buildTitle();
        addContent();
        doCreate();
        registBrocastReceiver();
    }

    private void buildTitle() {
        final TitleBar bar = mTitleBar;
        if (bar == null) {
            return;
        }
        bar.setActivity(this);
        if (!buildTitle(mTitleBar)) {
            mTitleBar.setVisibility(View.GONE);
        }
    }

    private void addContent() {
        final int layoutId = getLayoutId();
        if (layoutId <= 0) {
            Log.w(TAG, "you just past a invalid layout id !");
            return;
        }
        LayoutInflater inflater = LayoutInflater.from(this);
        inflater.inflate(layoutId, mContentRootView, true);
    }

    protected void registBrocastReceiver() {

    }

    protected abstract int getLayoutId();
    protected abstract boolean buildTitle(TitleBar bar);
    protected abstract void doCreate();
}
