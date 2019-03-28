package com.example.miwokapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
      ListView listView;
   // GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        String maintitle [] = new String[] {
            "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"
        } ;

        String subtitle[] = new String[] {
                "lutti", "otiiko", "tolookosu", "oyyisa", "massokka", "temmokka", "kenekaku", "kawinta", "wo’e", "na’aacha"
        } ;

        WordAdapter adapter=new WordAdapter(this,maintitle,subtitle);
        listView=(ListView) findViewById(R.id.listNumbers);
        listView.setAdapter(adapter);





    }
}
