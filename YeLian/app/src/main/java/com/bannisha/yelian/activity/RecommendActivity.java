package com.bannisha.yelian.activity;

import android.os.Bundle;
import android.widget.ListView;

import com.bannisha.yelian.R;
import com.bannisha.yelian.activity.BaseActivity;

/**
 * Created by Administrator on 2016/3/31.
 */
public class RecommendActivity extends BaseActivity{
    private ListView listview;
    //适配器
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
    }

    private void initView() {
        setContentView(R.layout.my_recommend);
        setTitleTextView("精品应用");
        setTitileReturn_button();
        setVisibility(false);
        listview = (ListView) findViewById(R.id.recommend_lv);
    }
}
