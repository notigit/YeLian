package com.bannisha.yelian.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;

import com.bannisha.yelian.R;
import com.bannisha.yelian.adapter.AdultAdapter;
import com.bannisha.yelian.adapter.HomeBannerAdapter;
import com.bannisha.yelian.adapter.MainBannerMess;
import com.bannisha.yelian.bean.AdultBean;
import com.bannisha.yelian.bean.HomeBannerBean;
import com.bannisha.yelian.customview.CirclePageIndicator;
import com.bannisha.yelian.utils.URLUtil;
import com.loopj.android.http.ResponseHandlerInterface;
import com.util.request.BasicKeyValue;
import com.util.request.HttpRequest;
import com.util.request.OnResponseListener;
import com.util.request.Url;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import cz.msebera.android.httpclient.Header;
import cz.msebera.android.httpclient.HttpResponse;

/**
 * Created by Administrator on 2016/3/31.
 */
public class HomeFragment extends Fragment implements View.OnClickListener {
    private ImageView freeNew;//最新
    private ImageView freeFire;//火爆
    private GridView gridView;
    private List<AdultBean> adultList;//成人影院：数据源
    private AdultAdapter adultAdapter;//成人影院：适配器


    ViewPager viewpager;
    private CirclePageIndicator indicator;
    HomeBannerAdapter adapter;
    List<MainBannerMess> list;
    List<HomeBannerBean.DataEntity> homeList;
    private int bannernu = 0;
    private ArrayList<String> urls;
    private ArrayList<String> names;
    private ArrayList<Integer> channelIds;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.index_home, null);
        initView(view);
        initListener();
        return view;
    }

    private void initView(View view) {
        freeNew = (ImageView) view.findViewById(R.id.home_iv_new);
        freeFire = (ImageView) view.findViewById(R.id.home_iv_fire);
        gridView = (GridView) view.findViewById(R.id.home_gw);
        adultAdapter = new AdultAdapter(getActivity(), adultList);

        viewpager = (ViewPager) view.findViewById(R.id.home_vp);
        indicator = (CirclePageIndicator) view.findViewById(R.id.banner_indicator);
        adapter = new HomeBannerAdapter(getActivity(), list);
        list = new ArrayList<MainBannerMess>();
        homeList = new ArrayList<HomeBannerBean.DataEntity>();
        loadData(homeList);
        Message message = handler25.obtainMessage(1);
        handler25.sendMessageDelayed(message, 3000);
    }

    private void initListener() {
        freeNew.setOnClickListener(this);
        freeFire.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.home_iv_new://最新
                break;
            case R.id.home_iv_fire://火爆
                break;
            case R.id.home_tv_more://成人影院：更多
                break;
        }
    }

    private Handler handler25 = new Handler() {
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 1:
                    viewpager.setCurrentItem(bannernu);
                    bannernu++;
                    if (bannernu > list.size()) {
                        bannernu = 0;
                        Message message = handler25.obtainMessage(1);
                        handler25.sendMessageDelayed(message, 3000);
                    } else {
                        Message message = handler25.obtainMessage(1);
                        handler25.sendMessageDelayed(message, 3000);
                    }
            }
            super.handleMessage(msg);
        }
    };

    private void loadData(List<HomeBannerBean.DataEntity> homeList) {
        if (null != homeList && !homeList.isEmpty()) {
            urls = new ArrayList<String>();
            names = new ArrayList<String>();
            channelIds = new ArrayList<Integer>();
            for (int i = 0; i < homeList.size(); i++) {
                urls.add(homeList.get(i).getPicUrl());
                names.add(homeList.get(i).getName());
                channelIds.add(homeList.get(i).getChannelId());
            }
            String[] urls = {"http://images.china.cn/attachement/jpg/site1007/20101125/0014222d98500e5874e114.jpg",
                    "http://images.china.cn/attachement/jpg/site1007/20101125/0014222d98500e5874e114.jpg"};
            list.clear();
            for (int i = 0; i < urls.length; i++) {
                MainBannerMess bean = new MainBannerMess();
                bean.urls = urls[i];
                this.list.add(bean);
            }
            adapter = new HomeBannerAdapter(getActivity(), list);
            viewpager.setAdapter(adapter);
            indicator.setViewPager(viewpager);
        }
    }

    /**
     * 网络请求
     * banner数据
     */
    private void bannerNetData() {
    }
}
