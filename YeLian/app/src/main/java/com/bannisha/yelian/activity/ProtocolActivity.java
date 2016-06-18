package com.bannisha.yelian.activity;

import android.os.Bundle;

import com.bannisha.yelian.R;

/**
 * Created by Administrator on 2016/3/31.
 */
public class ProtocolActivity extends BaseActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
    }

    private void initView() {
        setContentView(R.layout.my_protocol);
        setTitleTextView("用户协议");
        setTitileReturn_button();
        setVisibility(false);
    }
}
