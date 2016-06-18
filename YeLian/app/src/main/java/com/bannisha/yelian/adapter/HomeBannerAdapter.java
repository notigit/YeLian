package com.bannisha.yelian.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.bannisha.yelian.R;
import com.squareup.picasso.Picasso;

import java.util.List;


public class HomeBannerAdapter extends PagerAdapter {
    private Context mContext;
    public List<MainBannerMess> list;

    public HomeBannerAdapter(Context context, List<MainBannerMess> list) {
        this.mContext = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size() > 0 ? list.size() : 0;
    }

    @Override
    public boolean isViewFromObject(View arg0, Object arg1) {
        // TODO Auto-generated method stub
        return arg0 == arg1;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public Object instantiateItem(ViewGroup coView, final int position) {
        viewHolder holder = null;
        final View convertView = LayoutInflater.from(mContext).inflate(R.layout.vierfiller, null);
        holder = new viewHolder();
        holder.pic = (ImageView) convertView.findViewById(R.id.advertisement_icon1);
        coView.addView(convertView);
        Picasso.with(mContext).load(list.get(position).urls).resize((500), (500)).centerCrop().into(holder.pic);
        final viewHolder finalHolder = holder;
        convertView.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, "123", Toast.LENGTH_SHORT).show();
//                String advid = list.get(position).advid;
//                Intent intent = new Intent(context, AdvertisementActivity.class);
//                intent.putExtra("advid", advid);
//                context.startActivity(intent);
            }
        });
        return convertView;
    }

    class viewHolder {
        ImageView pic;
    }
}
