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

public class ColoursActivity extends AppCompatActivity {

    ListView lv;
    CustomAdapter3 ca;
    String[] engColours={"Yellow.","Blue.","White.","Grey.","Orange.","Black.","Red.","Pink.","Green.","Violet.","Purple."};
    String[] gerColours={"Yelb.","Blau.","Weiß.","Grau.","Orange.","Schwarz.","Rot.","Rosa.","Grün.","Violett.","Violett lila."};
    int[] images = {R.drawable.color_dusty_yellow,R.drawable.imgblue,R.drawable.imgwhite,R.drawable.color_gray,R.drawable.imgorange,
            R.drawable.color_black,R.drawable.color_red,R.drawable.imgpink,R.drawable.color_green,R.drawable.imgviolet,R.drawable.imgpurple};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colours);
        lv = findViewById(R.id.commonListView);
        ca = new CustomAdapter3();
        lv.setAdapter(ca);

    }

    public class CustomAdapter3 extends BaseAdapter {

        @Override
        public int getCount() {
            return engColours.length;
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
            tv1.setText(gerColours[position]);
            tv2.setText(engColours[position]);
            img.setImageResource(images[position]);
            return convertView;
        }
    }
}