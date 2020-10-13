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

public class NumbersActivity extends AppCompatActivity {

    String[] engNum = {"One.","Two.","Three.","Four.","Five.","Six.","Seven.","Eight.","Nine.","Ten."};
    String[] gerNum = {"Einer.","Zwei.","Drei.","Vier.","Fünf.","Sechs.","Sieben.","Acht.","Neun.","Zehn."};
    int[] images = {R.drawable.number_one,R.drawable.number_two,R.drawable.number_three,R.drawable.number_four,R.drawable.number_five,
    R.drawable.number_six,R.drawable.number_seven,R.drawable.number_eight,R.drawable.number_nine,R.drawable.number_ten};
    ListView lv;
    CustomAdapter ca;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        lv = findViewById(R.id.commonListView);
        ca = new CustomAdapter();
        lv.setAdapter(ca);

    }

    public class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return engNum.length;
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
            tv1.setText(gerNum[position]);
            tv2.setText(engNum[position]);
            img.setImageResource(images[position]);
            return convertView;
        }
    }
}