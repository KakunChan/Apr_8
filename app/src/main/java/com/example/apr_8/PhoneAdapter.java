package com.example.apr_8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;
import java.util.Map;

public class PhoneAdapter extends BaseAdapter {
    private List<Map<String,String>> names;
    private Context context;
    public PhoneAdapter(Context context,List<Map<String,String>> names){
        this.context = context;
        this.names = names;
    }


    @Override
    //数据源的数量大小
    public int getCount() {
        return names.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //postion 当前的数组索引   convertView 指定的单元格布局
        if (convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item_list_view,null);
        }
        //从单元格布局中绑定所有的控件
        TextView tv_name = convertView.findViewById(R.id.tv_name);
        TextView tv_phone = convertView.findViewById(R.id.tv_phone);
        Button btn_dial = convertView.findViewById(R.id.btn_dial);
        //获取当前所需要显示的记录数据
        Map<String,String> item = names.get(position);
        tv_name.setText(item.get("name"));
        tv_phone.setText(item.get("phone"));

        return convertView;
    }
}
