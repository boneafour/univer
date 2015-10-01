package com.example.hyhy.univer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class adapter  extends BaseAdapter {

    Item it;
    TextView textName, textCity;
    String [] names , suname;
    ImageView img;
    public adapter(Item item, String[] name, String[] suname, ImageView img) {
        this.it = item;
        this.names = name;
        this.suname = suname;
        this.img = img;

    }

    @Override
    public int getCount() {
        return names.length;
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
        LayoutInflater inflater = (LayoutInflater)it.getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.layout_of_adapter, null);
        textName = (TextView)rowView.findViewById(R.id.textName);
        textCity = (TextView)rowView.findViewById(R.id.textCity);
        img = (ImageView)rowView.findViewById(R.id.img);

        textName.setText(" "+names[position]);
        textCity.setText(" "+suname[position]);
        return rowView;
    }
}
