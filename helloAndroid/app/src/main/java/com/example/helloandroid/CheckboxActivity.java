package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class CheckboxActivity extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    public CheckBox checkBox001;
    public CheckBox checkBox002;
    public CheckBox checkBox003;
    public CheckBox checkBox004;
    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkbox);
        checkBox001 = findViewById(R.id.checkbox001);
        checkBox002 = findViewById(R.id.checkbox002);
        checkBox003 = findViewById(R.id.checkbox003);
        checkBox004 = findViewById(R.id.checkbox004);
        button = findViewById(R.id.submit);
        checkBox001.setOnCheckedChangeListener(this);
        checkBox002.setOnCheckedChangeListener(this);
        checkBox003.setOnCheckedChangeListener(this);
        checkBox004.setOnCheckedChangeListener(this);
        button.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        ArrayList<String> listValue = new ArrayList<>();
        if (checkBox001.isChecked()) {
            listValue.add(checkBox001.getText().toString());
        }
        if (checkBox002.isChecked()) {
            listValue.add(checkBox002.getText().toString());
        }
        if (checkBox003.isChecked()) {
            listValue.add(checkBox003.getText().toString());
        }
        if (checkBox004.isChecked()) {
            listValue.add(checkBox004.getText().toString());
        }
        Toast.makeText(getApplicationContext(), listValue.toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (buttonView.isChecked()) {
            Toast.makeText(getApplicationContext(), buttonView.getText().toString(), Toast.LENGTH_SHORT).show();
        }
    }
}