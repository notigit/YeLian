package com.bannisha.yelian.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bannisha.yelian.R;
import com.bannisha.yelian.adapter.VIPAdapter;

/**
 * Created by Administrator on 2016/3/31.
 */
public class VIPFragment extends Fragment {
    private LinearLayout vipLL;
    private HorizontalScrollView vipHSV;
    private VIPAdapter vipAdapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.index_vip,null);
        initView(view);
        return view;
    }

    private void initView(View view) {
        vipLL = (LinearLayout) view.findViewById(R.id.vip_ll);
        vipHSV = (HorizontalScrollView) view.findViewById(R.id.vip_hsv);
        for (int i = 0; i < 5; i++)
        {
            View itemView = LayoutInflater.from(getActivity()).inflate(R.layout.vip_hsv_item ,null);
            ImageView pic = (ImageView) itemView.findViewById(R.id.vip_iv_pic);
            ImageView suo = (ImageView) itemView.findViewById(R.id.vip_iv_suo);
            pic.setImageResource(R.drawable.zfyd1);
            TextView txt = (TextView) itemView.findViewById(R.id.vip_tv_index);
            txt.setText(i+"");
            vipLL.addView(itemView);
        }
    }


}
