package com.example.helloandroid.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.helloandroid.R;
import com.example.helloandroid.entity.NewsEntity;

import java.util.List;

public class NewCardAdapterMultiple extends BaseAdapter {

    private final List<NewsEntity> listData;
    private final Context mContext;
    //定义两个类别标志
    private static final int TYPE_NEWS_1 = 0;
    private static final int TYPE_NEWS_2 = 1;

    public NewCardAdapterMultiple(List<NewsEntity> mData, Context mContext) {
        this.listData = mData;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    //返回对应item布局类型
    @Override
    public int getItemViewType(int position) {
        if (position % 2 == 0) {
            return TYPE_NEWS_1;
        } else {
            return TYPE_NEWS_2;
        }
    }

    //总共多少item布局类型
    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        int type = getItemViewType(position); //获取布局类型
        ViewHolder holder1 = null;
        ViewHolder2 holder2 = null;
        if (convertView == null) {
            switch (type) {
                case TYPE_NEWS_1:
                    holder1 = new ViewHolder();
                    convertView = LayoutInflater.from(mContext).inflate(R.layout.listview_item_layout
                            , parent
                            , false);
                    holder1.img_icon = (ImageView) convertView.findViewById(R.id.img_icon);
                    holder1.title = (TextView) convertView.findViewById(R.id.tv_title);
                    holder1.content = (TextView) convertView.findViewById(R.id.tv_content);
                    convertView.setTag(holder1);
                    break;
                case TYPE_NEWS_2:
                    holder2 = new ViewHolder2();
                    convertView = LayoutInflater.from(mContext).inflate(R.layout.listview_item_layout2
                            , parent
                            , false);
                    holder2.img_icon = (ImageView) convertView.findViewById(R.id.img_icon);
                    holder2.title = (TextView) convertView.findViewById(R.id.tv_title);
                    holder2.content = (TextView) convertView.findViewById(R.id.tv_content);
                    convertView.setTag(holder2);
                    break;
            }

        } else {
            switch (type) {
                case TYPE_NEWS_1:
                    holder1 = (ViewHolder) convertView.getTag();
                    break;
                case TYPE_NEWS_2:
                    holder2 = (ViewHolder2) convertView.getTag();
                    break;
            }
        }
        switch (type) {
            case TYPE_NEWS_1:
                holder1.img_icon.setBackgroundResource(listData.get(position).getIcon());
                holder1.title.setText(listData.get(position).getTitle());
                holder1.content.setText(listData.get(position).getContent());
                break;
            case TYPE_NEWS_2:
                holder2.img_icon.setBackgroundResource(listData.get(position).getIcon());
                holder2.title.setText(listData.get(position).getTitle());
                holder2.content.setText(listData.get(position).getContent());
                break;
        }
        return convertView;
    }

    static class ViewHolder {
        ImageView img_icon;
        TextView title;
        TextView content;
    }

    static class ViewHolder2 {
        ImageView img_icon;
        TextView title;
        TextView content;
    }
}