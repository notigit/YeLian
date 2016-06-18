package com.bannisha.yelian.fragment;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bannisha.yelian.R;
import com.bannisha.yelian.activity.AboutActivity;
import com.bannisha.yelian.activity.AccountActivity;
import com.bannisha.yelian.activity.ProtocolActivity;
import com.bannisha.yelian.activity.RecommendActivity;
import com.bannisha.yelian.utils.GetFileSizeUtil;

import java.io.File;

/**
 * Created by Administrator on 2016/3/31.
 */
public class MyFragment extends Fragment implements View.OnClickListener{
    //个人帐号
    private RelativeLayout account;
    //投诉热线
    private RelativeLayout complaint;
    //用户协议
    private RelativeLayout protocol;
    //精品推荐
    private RelativeLayout recommend;
    //清除缓存
    private RelativeLayout cache;
    //关于我们
    private RelativeLayout about;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.index_my,null);
        initView(view);
        initListener();
        return view;
    }

    private void initView(View view) {
        account = (RelativeLayout) view.findViewById(R.id.my_rl_account);
        complaint = (RelativeLayout) view.findViewById(R.id.my_rl_complaint);
        protocol = (RelativeLayout) view.findViewById(R.id.my_rl_protocol);
        recommend = (RelativeLayout) view.findViewById(R.id.my_rl_recommend);
        cache = (RelativeLayout) view.findViewById(R.id.my_rl_cache);
        about = (RelativeLayout) view.findViewById(R.id.my_rl_about);
    }

    private void initListener() {
        account.setOnClickListener(this);
        complaint.setOnClickListener(this);
        protocol.setOnClickListener(this);
        recommend.setOnClickListener(this);
        cache.setOnClickListener(this);
        about.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()){
            case R.id.my_rl_account://个人账号
                intent = new Intent(getActivity(),AccountActivity.class);
                break;
            case R.id.my_rl_complaint://投诉热线
                View view = LayoutInflater.from(getActivity()).inflate(R.layout.my_complaint,null);
                TextView sure = (TextView) view.findViewById(R.id.cpmplaint_tv_sure);
                TextView cancel = (TextView) view.findViewById(R.id.cpmplaint_tv_cancel);
                final AlertDialog dialog = new AlertDialog.Builder(getActivity()).setView(view).show();
                sure.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                break;
            case R.id.my_rl_protocol://用户协议
                intent = new Intent(getActivity(),ProtocolActivity.class);
                break;
            case R.id.my_rl_recommend://精品推荐
                intent = new Intent(getActivity(),RecommendActivity.class);
                break;
            case R.id.my_rl_cache://清楚缓存
                //计算缓存大小
                File cacheFile = getActivity().getApplication().getCacheDir();
                String size = GetFileSizeUtil.getAutoFileOrFilesSize(cacheFile.getPath());
                //清除缓存大小
                File cacheFile2 = getActivity().getApplication().getCacheDir();
                GetFileSizeUtil.deleteCache(cacheFile2);
                Toast.makeText(getActivity(),"清理了" + size + "缓存",Toast.LENGTH_SHORT).show();
                break;
            case R.id.my_rl_about://关于我们
                intent = new Intent(getActivity(),AboutActivity.class);
                break;
        }
        if (intent != null){
            startActivity(intent);
        }
    }
}
