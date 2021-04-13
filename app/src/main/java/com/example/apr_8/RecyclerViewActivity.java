package com.example.apr_8;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private HomeAdapter mAdapter;
    private String[] names = {"Jack","Tom","Angela","Nick"};
    private int[] icons = {R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher};//这里可以换掉 放在mipmap下面
    private String[] intro = {"Asss","Bssss","Csssss","Dsss"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        mRecyclerView = findViewById(R.id.rec);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(RecyclerViewActivity.this));
        mAdapter = new HomeAdapter();
        mRecyclerView.setAdapter(mAdapter);
    }
    class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder>{

        @NonNull
        @Override
        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            MyViewHolder holder =  new MyViewHolder(LayoutInflater.from(RecyclerViewActivity.this).inflate(R.layout.item_recycler_view,parent,false));
            return holder;
        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
            holder.tv_name.setText(names[position]);
            holder.tv_phone.setText(intro[position]);
            holder.iv_icon.setImageResource(icons[position]);

        }

        @Override
        public int getItemCount() {
            return names.length;
        }

        class MyViewHolder extends RecyclerView.ViewHolder{
            TextView tv_name;
            TextView tv_phone;
            ImageView iv_icon;
            public MyViewHolder(@NonNull View itemView){
                super(itemView);
                tv_name = itemView.findViewById(R.id.tv_name);
                tv_phone = itemView.findViewById(R.id.tv_phone);
                iv_icon = itemView.findViewById(R.id.iv_icon);

            }

        }

    }
}
