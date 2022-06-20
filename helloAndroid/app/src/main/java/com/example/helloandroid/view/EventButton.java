package com.example.helloandroid.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatButton;

public class EventButton extends AppCompatButton {

    public EventButton(Context context) {
        super(context);
    }

    public EventButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public EventButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("EventButton","onTouchEvent");
        return true;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
//        return super.dispatchTouchEvent(event);
        Log.d("EventButton","dispatchTouchEvent" + event.getAction());
        return true;
    }
}
