package edu.temple.coloractivityver2;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ColorAdapter extends BaseAdapter {
    Context c;
    int count;
    String[] color;
    String[] color_default;

    public ColorAdapter(Context context, int count, String[] color){
        this.c = context;
        this.count = count;
        this.color = color;
        color_default = c.getResources().getStringArray(R.array.color_default);
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public Object getItem(int position) {
        return color[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView view;
        if (convertView instanceof View){
            view = (TextView) convertView;
        } else {
            view = new TextView(c);
        }
        view.setText(color[position]);
        view.setBackgroundColor(Color.WHITE);
        view.setTextColor(Color.BLACK);
        view.setTextSize(40);

        return view;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent){
        TextView view;
        if (convertView instanceof View){
            view = (TextView)convertView;
        } else {
            view = new TextView(c);
        }
        view.setText(color[position]);
        try {
            view.setBackgroundColor(Color.parseColor(color_default[position]));
            view.setTextColor(Color.WHITE);
        }
        catch (Exception e){
            view.setBackgroundColor(Color.WHITE);
            view.setTextColor(Color.BLACK);
        }

        view.setTextSize(40);

        return view;
    }
}
