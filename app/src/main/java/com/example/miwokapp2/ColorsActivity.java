package com.example.miwokapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class ColorsActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        String maintitle [] = new String[] {
                "red", "green", "brown", "gray", "black", "white", "dusty yellow", "mustard yellow"
        } ;

        String subtitle[] = new String[] {
                "weṭeṭṭi", "chokokki", "ṭakaakki", "ṭopoppi", "kululli", "kelelli", "ṭopiisә", "chiwiiṭә"
        } ;

        WordAdapter adapter=new WordAdapter(this,maintitle,subtitle);
        listView=(ListView) findViewById(R.id.listNumbers);
        listView.setAdapter(adapter);

    }
}
