package com.example.germanapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvMain;
    RecyclerView.Adapter adt;
    RecyclerView.LayoutManager layoutManager;

    String[] list = {"NUMBERS","WORDS","PHRASES","COLOURS"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvMain =  findViewById(R.id.rvMain);
        layoutManager = new LinearLayoutManager(this);
        rvMain.setLayoutManager(layoutManager);
        adt = new CustomAdapter();
        rvMain.setAdapter(adt);
    }

    public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder>{

        public class ViewHolder extends RecyclerView.ViewHolder{

            TextView textView;
            CardView cv;
            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                textView = itemView.findViewById(R.id.tvDesc);
                cv = itemView.findViewById(R.id.cardView);
                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String s = (String) v.getTag();
                        if(s.equals("NUMBERS")){
                            Intent intent = new Intent(MainActivity.this, com.example.germanapp.NumbersActivity.class);
                            startActivity(intent);
                        }else if(s.equals("WORDS")){
                            Intent intent = new Intent(MainActivity.this,
                                    com.example.germanapp.WordsActivity.class);
                            startActivity(intent);
                        }else if(s.equals("PHRASES")){
                            Intent intent = new Intent(MainActivity.this,
                                    com.example.germanapp.PhrasesActivity.class);
                            startActivity(intent);
                        }else{
                            Intent intent = new Intent(MainActivity.this,
                                    com.example.germanapp.ColoursActivity.class);
                            startActivity(intent);
                        }
                    }
                });
            }
        }
        @NonNull
        @Override
        public CustomAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.mainlistview,
                    parent, false);
            return new ViewHolder(v);
        }

        @Override
        public void onBindViewHolder(@NonNull CustomAdapter.ViewHolder holder, int position) {

            holder.itemView.setTag(list[position]);
            holder.itemView.setTag(list[position]);
            holder.textView.setText(list[position]);
        }

        @Override
        public int getItemCount() {
            return list.length;
        }
    }

}