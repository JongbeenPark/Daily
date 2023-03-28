package com.cookandroid.daily;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Device extends AppCompatActivity {
    ListView exampleList;
    ArrayList<String> dataSample;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device);

        dataSample = new ArrayList<String>();

        dataSample.add("TV");
        dataSample.add("냉장고");
        dataSample.add("전등");

        exampleList = findViewById(R.id.listView);
        List buttonListAdapter = new List(this, dataSample);

        exampleList.setAdapter(buttonListAdapter);
    }
}