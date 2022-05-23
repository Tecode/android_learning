package com.example.helloandroid;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.helloandroid.adapter.NewsCardAdapter;
import com.example.helloandroid.entity.NewsEntity;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    public Context baseContent;
    public List<NewsEntity> listData = null;
    public ListView listView;
    public NewsCardAdapter newsCardAdapter = null;

    private String modifyNumber(int value) {
        return value < 10 ? "0" + value : value + "";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.baseContent = this;
        setContentView(R.layout.list_view_layout);
        listData = new ArrayList<NewsEntity>();
        listView = findViewById(R.id.listview);
        for (int index = 0; index < 20; index++) {
            listData.add(new NewsEntity(
                    modifyNumber(index) + "疫情常态防控下如何保障旅客在飞机上安全安心？",
                    "5月23日下午，国务院联防联控机制召开新闻发布会，介绍分秒必争，抓实抓细疫情防控工作有关情况，并回答媒体提问。对此，民航局飞行标准司副司长孔繁伟表示，当前，全球疫情仍处于高位，我国仍将持续面临“外防输入，内防反弹”的巨大压力。",
                    R.mipmap.news
            ));
        }
        newsCardAdapter = new NewsCardAdapter(listData, baseContent);
        listView.setAdapter(newsCardAdapter);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        Toast.makeText(baseContent,"点击了第" + position + "条数据" , Toast.LENGTH_SHORT).show();
    }
}