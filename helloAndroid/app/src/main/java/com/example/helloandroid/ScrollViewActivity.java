package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

public class ScrollViewActivity extends AppCompatActivity implements View.OnClickListener {
    private ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scroll_view_layout);
        buildView();
    }

    private void buildView() {
        scrollView = findViewById(R.id.scroll_box);
        Button buttonTop = findViewById(R.id.button_top);
        Button buttonBottom = findViewById(R.id.button_bottom);
        TextView textView = findViewById(R.id.scroll_text);
        buttonTop.setOnClickListener(this);
        buttonBottom.setOnClickListener(this);
        StringBuilder textValue = new StringBuilder();
        for (int index = 0; index < 100; index++) {
            textValue.append("滚动页面的内容第").append(index).append(" 条\n");
        }
        textView.setText(textValue);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_top:
                scrollView.fullScroll(ScrollView.FOCUS_UP);
                break;
            case R.id.button_bottom:
                scrollView.fullScroll(ScrollView.FOCUS_DOWN);
                break;
            default:
                break;
        }
    }
}