package com.example.core.taskstack;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.helloandroid.R;


public class Bactivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b_layout);
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //2.演示 singleTop模式:
//                startActivity(new Intent(Bactivity.this, Bactivity.class));

                //3.演示 singleTask模式:
//                startActivity(new Intent(Bactivity.this, Cactivity.class));

                //4.演示 singleInstance模式:
                startActivity(new Intent(Bactivity.this, Aactivity.class));
            }
        });
    }
}