package com.example.miwokapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class FamilyActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        String maintitle [] = new String[] {
                "father", "mother", "son", "daughter", "older brother", "younger brother", "older sister", "younger sister", "grandmother", "grandfather"
        } ;

        String subtitle[] = new String[] {
                "әpә", "әṭa", "angsi", "tune", "taachi", "chalitti", "teṭe", "kolliti", "ama", "paapa"
        } ;
        WordAdapter adapter=new WordAdapter(this,maintitle,subtitle);
        listView=(ListView) findViewById(R.id.listNumbers);
        listView.setAdapter(adapter);
    }
}
