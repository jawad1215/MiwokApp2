package com.example.miwokapp2;

import android.app.Activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


public class WordAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] maintitle;
    private final String[] subtitle;

    public WordAdapter(Activity context, String[] maintitle,String[] subtitle) {
        super(context, R.layout.list_item, maintitle);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.maintitle=maintitle;
        this.subtitle=subtitle;

    }

    @Override
    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.list_item, null,true);

        TextView titleText = (TextView) rowView.findViewById(R.id.miwok_text_view);
        TextView subtitleText = (TextView) rowView.findViewById(R.id.default_text_view);

        titleText.setText(maintitle[position]);
        subtitleText.setText(subtitle[position]);

        return rowView;

    }
}
