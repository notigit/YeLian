package com.bannisha.yelian.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;

import com.bannisha.yelian.R;
import com.bannisha.yelian.utils.ActivityFinsh;


/**
 * Created by Administrator on 2016/3/15.
 */
public class LoadingActivity extends Activity {
    private ImageView loading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yelian_loading);
        loading = (ImageView) findViewById(R.id.loading_iv);
        Animation animation = new AlphaAnimation(0.1f,1.0f);//透明度动画
        animation.setDuration(3000);//渐变时间
        loading.startAnimation(animation);//启动动画
        ActivityFinsh.getInstance().addActivity(this);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                startActivity(new Intent(LoadingActivity.this, MainActivity.class));//跳转主界面
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}
