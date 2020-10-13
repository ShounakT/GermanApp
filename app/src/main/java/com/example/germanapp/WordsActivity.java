package com.example.germanapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class WordsActivity extends AppCompatActivity {

    ListView lv;
    CustomAdapter1 ca;
    String[] engWords={"Week.","Year.","Today.","Tomorrow.","Yesterday.","Calendar.","Second.","Use.",
            "Come.","Laugh.","Beautiful."};
    String[] gerWords={"Woche.","Jahr.","Heute.","Morgen.","Gestern.","Kalender.","Sekunde.","Benutzen.",
            "Kommen.","Lachen.","Schön."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words);
        lv = findViewById(R.id.commonListView);
        ca = new CustomAdapter1();
        lv.setAdapter(ca);
        AppCompatActivity appCompatActivity;

    }
    public class CustomAdapter1 extends BaseAdapter {

        @Override
        public int getCount() {
            return engWords.length;
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
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.commonlistview,
                    parent, false);
            ImageView img = convertView.findViewById(R.id.ivImg);
            TextView tv1 = convertView.findViewById(R.id.tvGerman);
            TextView tv2 = convertView.findViewById(R.id.tvEnglish);
            tv1.setText(gerWords[position]);
            tv2.setText(engWords[position]);
            img.setImageResource(R.drawable.imgphrases);
            return convertView;
        }
    }
}