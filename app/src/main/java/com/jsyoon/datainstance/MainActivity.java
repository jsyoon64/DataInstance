package com.jsyoon.datainstance;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jsyoon.datainstance.Data.SettingData;
import com.jsyoon.datainstance.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    SettingData data=SettingData.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        binding.setData(data);

    }
}
