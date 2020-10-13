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

public class PhrasesActivity extends AppCompatActivity {

    ListView lv;
    CustomAdapter2 ca;
    String[] engPhrases={"The tourists watch the sunset.","Vegetables are good for you.",
            "The man is bad.","Hello Peter, my name is Richard and I am happy to meet you.",
            "Good evening. Welcome.","I'm fine how are you?",
            "Thank you very much, but I did not order this.",
            "Tuesday the 1st. January.","The working week starts on Monday.",
            "We like to sleep in on Sunday mornings.",
            "It's April now, so next month will be May."};
    String[] gerPhrases={"Die Touristen sehen den Sonnenuntergang.",
            "Gemüse ist gut für dich.","Der Mann ist schlecht.",
            "Hallo Peter, mein Name ist Richard und es freut mich dich kennen zu lernen.",
            "Guten Abend. Willkommen.","Mir geht es gut, wie geht es dir?",
            "Vielen Dank, aber ich habe dies nicht bestellt.","Dienstag, der 1. Januar.",
            "Die Arbeitswoche startet am Montag.","Wir schlafen sonntags morgens gerne aus.",
            "Jetzt ist es April, also wird nächsten Monat Mai sein."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        lv = findViewById(R.id.commonListView);
        ca = new CustomAdapter2();
        lv.setAdapter(ca);

    }

    public class CustomAdapter2 extends BaseAdapter {

        @Override
        public int getCount() {
            return engPhrases.length;
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
            tv1.setText(gerPhrases[position]);
            tv2.setText(engPhrases[position]);
            img.setImageResource(R.drawable.imgphrases);
            return convertView;
        }
    }
}