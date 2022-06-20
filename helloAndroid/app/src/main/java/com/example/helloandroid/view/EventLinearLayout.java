package com.example.helloandroid.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

public class EventLinearLayout extends LinearLayout {

    public EventLinearLayout(Context context) {
        super(context);
    }

    public EventLinearLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("EventLinearLayout","onTouchEvent" + event.getAction());
        return false;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
//        return super.dispatchTouchEvent(ev);
        Log.d("EventLinearLayout","dispatchTouchEvent");
        return false;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.d("EventLinearLayout","拦截EventLinearLayout点击事件");
        return true;
    }
}
