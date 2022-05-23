package com.example.helloandroid;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

import java.time.Duration;

public class ToastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toast_layout);

        final Toast toast = Toast.makeText(this, "Toast提示文本信息", Toast.LENGTH_SHORT);
        //设置Toast显示的位置
        toast.setGravity(Gravity.TOP, 0, 0);
        final Snackbar snackbar = Snackbar.make(getWindow().getDecorView(),"Toast提示文本信息", Snackbar.LENGTH_INDEFINITE);
        snackbar.setText("哈哈，修改了文案");
        //自定义toast布局，不能自定义已经废除 This method was deprecated in API level 30
//        LinearLayout layout = (LinearLayout) toast.getView();
//        TextView v = layout.findViewById(android.R.id.message);
//        v.setTextColor(Color.parseColor("#F86C37"));
//        layout.setBackgroundColor(Color.BLUE);
//        ImageView image = new ImageView(this);
//        image.setImageResource(R.mipmap.ic_launcher_round);
//        layout.addView(image, 0);
//
        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(v1 -> snackbar.show());
    }
}
