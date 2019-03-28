package com.example.miwokapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class PhrasesActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        String maintitle [] = new String[] {
                "Where are you going?", "What is your name?", "My name is...", "How are you feeling?",
                "I’m feeling good.", "Are you coming?" +
                "Yes, I’m coming.", "I’m coming.", "Let’s go.", "Come here."
        } ;

        String subtitle[] = new String[] {
                "minto wuksusi", "tinnә oyaase'nә", "oyaaset...", "michәksәs?", "kuchi achit", "әәnәs'aa?",
                "hәә’ әәnәm", "әәnәm", "yoowutis", "әnni'nem"
        } ;

        WordAdapter adapter=new WordAdapter(this,maintitle,subtitle);
        listView=(ListView) findViewById(R.id.listNumbers);
        listView.setAdapter(adapter);


    }
}
