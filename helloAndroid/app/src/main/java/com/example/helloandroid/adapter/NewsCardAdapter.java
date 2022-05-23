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

public class NewsCardAdapter extends BaseAdapter {
    public List<NewsEntity> listData;
    private final Context baseContext;

    public NewsCardAdapter(List<NewsEntity> data, Context context) {
        this.listData = data;
        this.baseContext = context;
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

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = LayoutInflater.from(baseContext).inflate(R.layout.adapter_item_layout
                    , parent
                    , false);
            holder.img_icon = (ImageView) convertView.findViewById(R.id.img_icon);
            holder.title = (TextView) convertView.findViewById(R.id.tv_title);
            holder.content = (TextView) convertView.findViewById(R.id.tv_content);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.img_icon.setBackgroundResource(listData.get(position).getIcon());
        holder.title.setText(listData.get(position).getTitle());
        holder.content.setText(listData.get(position).getContent());
        return convertView;
    }

    static class ViewHolder {
        ImageView img_icon;
        TextView title;
        TextView content;
    }
}
