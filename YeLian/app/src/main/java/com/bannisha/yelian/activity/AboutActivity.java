package com.bannisha.yelian.activity;

import android.os.Bundle;

import com.bannisha.yelian.R;

/**
 * Created by Administrator on 2016/3/31.
 */
public class AboutActivity extends BaseActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
    }

    private void initView() {
        setContentView(R.layout.my_about);
        setTitleTextView("关于我们");
        setTitileReturn_button();
        setVisibility(false);
    }
}
