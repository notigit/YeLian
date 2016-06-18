package com.bannisha.yelian.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bannisha.yelian.bean.VIPBean;

import java.util.List;

/**
 * Created by Administrator on 2016/3/31.
 */
public class VIPAdapter extends PagerAdapter{
    LayoutInflater inflater;
    public List<VIPBean> VIPList;
    Context mContext;

    public VIPAdapter(Context mContext,List<VIPBean> VIPList) {
        this.VIPList = VIPList;
        this.mContext = mContext;
        inflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return VIPList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return false;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        return super.instantiateItem(container, position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
        container.removeView((View) object);
    }
    class ViewHolder {
        ImageView pic;
        TextView name;
    }
}
