package com.cookandroid.daily;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost  = getTabHost();

        TabHost.TabSpec spec;
        Intent intent;

        intent = new Intent().setClass(this, Day.class);
        spec = tabHost.newTabSpec("Day");
        spec.setIndicator("오늘일정");
        spec.setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, Month.class);
        spec = tabHost.newTabSpec("Month");
        spec.setIndicator("월간일정");
        spec.setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, Device.class);
        spec = tabHost.newTabSpec("Device");
        spec.setIndicator("홈 기기");
        spec.setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, Settings.class);
        spec = tabHost.newTabSpec("Settings");
        spec.setIndicator("설정");
        spec.setContent(intent);
        tabHost.addTab(spec);


    }
}