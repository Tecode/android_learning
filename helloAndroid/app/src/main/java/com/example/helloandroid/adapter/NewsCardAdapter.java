package com.example.helloandroid.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.helloandroid.entity.NewsEntity;

import java.util.List;

public class NewsCardAdapter extends BaseAdapter {
    public List<NewsEntity> listData;

    @Override
    public int getCount() {
        return listData.size();
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
        return null;
    }
}
