package com.bannisha.yelian.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.TextView;

import com.bannisha.yelian.R;

/**
 * Created by Administrator on 2016/3/31.
 */
public class AccountActivity extends BaseActivity{
    //个人账号
    private TextView user;
    //VIP等级
    private TextView level;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
    }

    private void initView() {
        setContentView(R.layout.my_account);
        setTitleTextView("个人信息");
        setTitileReturn_button();
        setVisibility(false);
        user = (TextView) findViewById(R.id.account_tv_user);
        level = (TextView) findViewById(R.id.account_tv_level);
        //设置个人账号及vip等级
    }
}
