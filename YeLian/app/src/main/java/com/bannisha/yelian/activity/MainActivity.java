package com.bannisha.yelian.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.bannisha.yelian.R;
import com.bannisha.yelian.fragment.HomeFragment;
import com.bannisha.yelian.fragment.MyFragment;
import com.bannisha.yelian.fragment.VIPFragment;
import com.bannisha.yelian.utils.ActivityFinsh;

public class MainActivity extends FragmentActivity implements View.OnClickListener{
    public static int width ;
    public static int height ;
    public WindowManager wm;

    //标题
    private TextView title;
    private HomeFragment homeFragment;
    private VIPFragment vipFragment;
    private MyFragment myFragment;
    private RadioButton homeRB;
    private RadioButton vipRB;
    private RadioButton myRB;
    private android.support.v4.app.FragmentManager fragmentManager;

    private long exitTime = 0 ;//退出时间

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        initListener();
        categoryFragment(homeFragment);
    }

    private void initView() {
        setContentView(R.layout.activity_main);
        homeFragment = new HomeFragment();
        vipFragment = new VIPFragment();
        myFragment = new MyFragment();
        title = (TextView) findViewById(R.id.yelian_title_tv);
        homeRB = (RadioButton) findViewById(R.id.bottom_rb_home);
        vipRB = (RadioButton) findViewById(R.id.bottom_rb_vip);
        myRB = (RadioButton) findViewById(R.id.bottom_rb_my);
        //获取屏幕的宽高
        wm = getWindowManager();
        width = wm.getDefaultDisplay().getWidth();
        height = wm.getDefaultDisplay().getHeight();
    }

    private void initListener() {
        homeRB.setOnClickListener(this);
        vipRB.setOnClickListener(this);
        myRB.setOnClickListener(this);
        ActivityFinsh.getInstance().addActivity(this);
    }

    private void categoryFragment(Fragment fragement) {
        fragmentManager = getSupportFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        ft.replace(R.id.yelian_fl, fragement);
        ft.commit();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bottom_rb_home://首页
                categoryFragment(homeFragment);
                title.setText("");
                title.setBackgroundResource(R.drawable.logo1);
                break;
            case R.id.bottom_rb_vip://vip
                categoryFragment(vipFragment);
                title.setText("");
                title.setBackgroundResource(R.drawable.logo1);
                break;
            case R.id.bottom_rb_my://我的
                categoryFragment(myFragment);
                title.setText("我的");
                title.setBackground(null);
                break;
        }
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            exit();
            return false;
        }
        return super.onKeyDown(keyCode, event);
    }
    /**
     * 退出程序
     */
    public void exit() {
        if ((System.currentTimeMillis() - exitTime) > 2000) {
            Toast.makeText(this, "再按一次退出程序",
                    Toast.LENGTH_SHORT).show();
            exitTime = System.currentTimeMillis();
        } else {
            ActivityFinsh.getInstance().exit();
        }
    }
}
