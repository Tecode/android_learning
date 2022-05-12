package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class SwitchActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    private Switch switch_button;
    private ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.switch_activity);
        switch_button =(Switch) findViewById(R.id.switch_button);
        toggleButton =(ToggleButton) findViewById(R.id.toggle_button);
        switch_button.setOnCheckedChangeListener(this);
        toggleButton.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        switch (compoundButton.getId()) {
            case R.id.switch_button:
                if (compoundButton.isChecked()) {
                    Toast.makeText(this, "Switch打开", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "Switch关闭", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.toggle_button:
                if (compoundButton.isChecked()) {
                    Toast.makeText(this, "打开声音", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "关闭声音", Toast.LENGTH_SHORT).show();
                }
                break;
            default:
                break;
        }
    }
}