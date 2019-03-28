package com.example.miwokapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button) findViewById(R.id.chickme);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,FamilyActivity.class);
                startActivity(intent);
            }
        });

    }

    public void openNumbersList(View view)
    {

        //TextView numberTextView=(TextView) findViewById(R.id.numbers);
        Intent intent=new Intent(this,NumbersActivity.class);
        startActivity(intent);
    }
    public void openFamilyList(View view)
    {

        //TextView numberTextView=(TextView) findViewById(R.id.numbers);
        Intent intent=new Intent(this,FamilyActivity.class);
        startActivity(intent);
    }
    public void openColorList(View view)
    {

        //TextView numberTextView=(TextView) findViewById(R.id.numbers);
        Intent intent=new Intent(this,ColorsActivity.class);
        startActivity(intent);
    }
    public void openPhraseList(View view)
    {

        //TextView numberTextView=(TextView) findViewById(R.id.numbers);
        Intent intent=new Intent(this,PhrasesActivity.class);
        startActivity(intent);
    }
}
