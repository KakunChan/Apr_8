package com.example.apr_8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获取listview
        ListView lv = findViewById(R.id.lv);
//        String[] names = {"A","B","C"};
        List<Map<String,String>> names = new ArrayList<>();
        Map<String,String> map = new HashMap<String, String>();
        map.put("name","A");
        map.put("phone","1111111111");
        names.add(map);
        map = new HashMap<String, String>();
        map.put("name","B");
        map.put("phone","1111111111");
        names.add(map);
        map = new HashMap<String, String>();
        map.put("name","C");
        map.put("phone","1111111111");
        names.add(map);

//        SimpleAdapter adapter = new SimpleAdapter(MainActivity.this,names,
//               android.R.layout.simple_list_item_1, new String[]{"name"},new int[]{android.R.id.text1});
//        lv.setAdapter(simpleAdapter);
        //ArrayAdapter不支持多属性的数据，SimpleAdapter支持
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>( MainActivity.this,
//                android.R.layout.simple_list_item_1,android.R.id.text1,names);
        PhoneAdapter adapter = new PhoneAdapter(MainActivity.this,names);
        lv.setAdapter(adapter);
    }
}