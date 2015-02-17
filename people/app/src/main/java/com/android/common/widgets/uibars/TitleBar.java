package com.android.common.widgets.uibars;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.issuser.people.R;

/**
 * Created by issuser on 15/2/12.
 */
public class TitleBar extends RelativeLayout {

    private RelativeLayout mNaviTitleContent;
    private RelativeLayout mFrameLeft;
    private RelativeLayout mFrameRight;
    private Button mNaviButtonLeft;
    private Button mNaviButtonRight;
    private TextView mNaviTitle;
    private ImageView mMiddleImage, mLeftImage, mRightImage;
    private Activity mActivity;

    public TitleBar(Context context) {
        super(context);
        initialize();
    }

    public TitleBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        initialize();
    }

    private void initialize() {
        inflate();
        findViews();
        set();
    }

    private void inflate() {
        LayoutInflater.from(getContext()).inflate(R.layout.view_title_bar2, this, true);
    }

    private void findViews() {
        mNaviTitle = (TextView) findViewById(R.id.title);
        mNaviTitleContent = (RelativeLayout) findViewById(R.id.titleContent);
        mNaviButtonLeft = (Button) findViewById(R.id.naviButtonLeft);
        mNaviButtonRight = (Button) findViewById(R.id.naviButtonRight);
        mFrameLeft = (RelativeLayout) findViewById(R.id.naviFrameLeft);
        mFrameRight = (RelativeLayout) findViewById(R.id.naviFrameRight);
        mMiddleImage = (ImageView) findViewById(R.id.imageview_titleContent);
        mLeftImage = (ImageView) findViewById(R.id.imageView_left_titlebar);
        mRightImage = (ImageView) findViewById(R.id.imageView_right_titlebar);
    }

    private void set() {
        setBackgroundResource(R.mipmap.live_beijing);
    }

    public void setLeftBg(int res) {
        mNaviButtonLeft.setBackgroundResource(res);
    }

    public void setRightBg(int res) {
        mNaviButtonRight.setBackgroundResource(res);
    }

    public void setMainBg(int res) {
        setBackgroundResource(res);
    }

    public void setLeftText(int res) {
        mNaviButtonLeft.setText(res);
    }

    public void setRightText(int res) {
        mNaviButtonRight.setText(res);
    }

    public void setRightText(CharSequence text) {
        mNaviButtonRight.setText(text);
    }

    public void setRightTextColor(int color) {
        mNaviButtonRight.setTextColor(color);
    }

    public void setTitleText(int res) {
        mNaviTitle.setText(res);
    }

    public void setTitleText(String text) {
        mNaviTitle.setText(text);
    }

    public TextView getTitleText() {
        return mNaviTitle;
    }

    public void setTitleTextColor(int color) {
        mNaviTitle.setTextColor(color);
    }

    public void setMiddleImageResource(int res) {
        mMiddleImage.setImageResource(res);
    }

    public void setRightImageResource(int res) {
        mRightImage.setImageResource(res);
    }

    public void setRightImageVisibility(int visibility) {
        mRightImage.setVisibility(visibility);
    }

    public ImageView getRightImage() {

        return mRightImage;
    }

    public void setLeftImageResource(int res) {
        mLeftImage.setImageResource(res);
    }

    /**
     *
     */
    public void hideLeft() {
        mNaviButtonLeft.setVisibility(View.INVISIBLE);
    }

    /**
     *
     */
    public void hideTitle() {
        mNaviButtonLeft.setVisibility(View.INVISIBLE);
    }

    /**
     *
     */
    public void hideRight() {
        mNaviTitle.setVisibility(View.INVISIBLE);
    }

    /**
     *
     */
    public void showLeft() {
        mNaviButtonLeft.setVisibility(View.VISIBLE);
    }

    /**
     *
     */
    public void showRight() {
        mNaviButtonRight.setVisibility(View.VISIBLE);
    }

    /**
     *
     */
    public void showTitle() {
        mNaviTitle.setVisibility(View.VISIBLE);
    }

    /**
     *
     * @param l
     */
    public void setLeftClick(OnClickListener l) {
        mFrameLeft.setOnClickListener(l);
    }

    /**
     *
     * @param l
     */
    public void setRightClick(OnClickListener l) {
        mFrameRight.setOnClickListener(l);
    }

    /**
     *
     * @param l
     */
    public void setTitleClick(OnClickListener l) {
        mNaviTitle.setOnClickListener(l);
    }

    public void setLeftImageClick(OnClickListener l) {
        mLeftImage.setOnClickListener(l);
    }

    public void setLeftBtnClick(OnClickListener l) {
        mNaviButtonLeft.setOnClickListener(l);
    }

    public void setLeftImageLongClick(OnLongClickListener l) {
        mLeftImage.setOnLongClickListener(l);
    }

    public void setRightImageClick(OnClickListener l) {
        mRightImage.setOnClickListener(l);
    }

    public void setRightImageClickable(boolean clickable) {
        mRightImage.setClickable(clickable);
    }

    public void setRightImageLongClick(OnLongClickListener l) {
        mRightImage.setOnLongClickListener(l);
    }

    public void setRightButtonClick(OnClickListener l) {
        mNaviButtonRight.setOnClickListener(l);
    }

    public void setRightButtonClickable(boolean clickable) {
        mNaviButtonRight.setClickable(clickable);
    }

    public void addCustomTitleView(View v) {
        hideLeft();
        mNaviTitleContent.addView(v);
    }

    public View getRightButton() { return mFrameRight; }

    public void enableLeftImageBackOnClick() {
        if (mLeftImage != null) {
            mLeftImage.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    final Activity act = mActivity;
                    if (act != null) {
                        act.finish();
                    }
                }
            });
        }
    }

    public void setActivity(Activity act) {
        this.mActivity = act;
    }

}
