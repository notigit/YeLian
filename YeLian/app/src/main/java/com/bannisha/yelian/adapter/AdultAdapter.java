package com.bannisha.yelian.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bannisha.yelian.R;
import com.bannisha.yelian.activity.BaseActivity;
import com.bannisha.yelian.bean.AdultBean;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Administrator on 2016/3/31.
 */
public class AdultAdapter extends BaseAdapter{
    public List<AdultBean> adultList;
    LayoutInflater inflater;
    Context mContext;

    public AdultAdapter(Context mContext,List<AdultBean> adultList) {
        this.adultList = adultList;
        inflater = LayoutInflater.from(mContext);
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return adultList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null ){
            convertView = inflater.inflate(R.layout.adult_griditem,null);
            viewHolder = new ViewHolder();
            viewHolder.pic = (ImageView) convertView.findViewById(R.id.griditem_pic);
            viewHolder.name = (TextView) convertView.findViewById(R.id.griditem_tv_name);
            viewHolder.keyword = (TextView) convertView.findViewById(R.id.griditem_tv_keyword);
            viewHolder.content = (TextView) convertView.findViewById(R.id.griditem_tv_content);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }
        if (position < adultList.size() && adultList != null){
            Picasso.with(mContext).load(adultList.get(position).getData().get(position).getPicUrl()).into(viewHolder.pic);
            viewHolder.keyword.setText(adultList.get(position).getData().get(position).getKeyword());
            viewHolder.content.setText(adultList.get(position).getData().get(position).getContent());
        }
        return convertView;
    }
    class ViewHolder {
        ImageView pic;
        TextView name;
        TextView keyword;
        TextView content;
    }
}
