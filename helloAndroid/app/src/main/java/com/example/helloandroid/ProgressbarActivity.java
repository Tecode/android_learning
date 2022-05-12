package com.example.helloandroid;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class ProgressbarActivity extends AppCompatActivity {
    private int currentProgress = 0;
    private int maxProgress;
    private ProgressBar progressBar;

     private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case 0:
                    progressBar.setProgress(currentProgress);
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progressbar_layout);
        progressBar = (ProgressBar) findViewById(R.id.progress_horizontal);
        maxProgress = progressBar.getMax();
    }

    @Override
    protected void onStart() {
        super.onStart();
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        for (int i = 0; i <= 100; i++) {
                            Thread.sleep(1000);
                            currentProgress += 10;
                            if (currentProgress > maxProgress) {
                                break;
                            }
                            mHandler.sendEmptyMessage(0);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }
}