package com.jsyoon.datainstance;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jsyoon.datainstance.Data.SettingData;
import com.jsyoon.datainstance.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    SettingData data=SettingData.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        data.InitData(this);
        binding.setData(data);

        binding.option.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(MainActivity.this, SettingActivity.class);
                startActivity(i);
            }
        });
    }
}
