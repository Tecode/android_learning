package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radio_button);
        final Button button = findViewById(R.id.submit);
        final RadioGroup radioGroup = findViewById(R.id.radio_group);
        //第一种获得单选按钮值的方法为radioGroup设置一个监听器:setOnCheckedChanged()
        radioGroup.setOnCheckedChangeListener((group, checkedId) -> {
            RadioButton radioButton = findViewById(checkedId);
            Toast.makeText(getApplicationContext(), radioButton.getText(), Toast.LENGTH_LONG).show();
        });
        //第二种为radioGroup设置一个监听器:setOnCheckedChanged()
        button.setOnClickListener(view -> {
            for (int index = 0; index < radioGroup.getChildCount(); ++index) {
                RadioButton radioButton = (RadioButton) radioGroup.getChildAt(index);
                if (radioButton.isChecked()) {
                    Toast.makeText(getApplicationContext(), radioButton.getText(), Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}