package com.cookandroid.daily;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class List extends BaseAdapter {
    Context context;
    LayoutInflater layoutInflater;
    ArrayList<String> data;
    public List(Context context, ArrayList<String> data){
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
        this.data = data;
    }
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = layoutInflater.inflate(R.layout.activity_list, null);

        TextView textView = view.findViewById(R.id.title);
        textView.setText(data.get(position));

        View bodyView = view.findViewById(R.id.body);
        Switch switchView = view.findViewById(R.id.exSwitch);

        bodyView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(context, "클릭시 설정 추가", Toast.LENGTH_SHORT).show();
            }
        });

        switchView.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(context, "온오프", Toast.LENGTH_SHORT).show();}
        });
        return view;
    }
}