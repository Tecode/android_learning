package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

public class DispatchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dispatch_layout);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d("DispatchActivity", "dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("DispatchActivity", "onTouchEvent" + event.getAction());
        return super.onTouchEvent(event);
    }
}