package com.example.gridviewimage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;


public class GridAdapter extends BaseAdapter {
    Context context;
    String[] colorName;
    int[] image;
    LayoutInflater inflater;



    public GridAdapter(Context context, String[] colorName, int[] image) {
        this.context = context;
        this.colorName = colorName;
        this.image = image;
    }

    @Override
    public int getCount() {
        return colorName.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        if (inflater == null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        if (convertView == null){
            convertView = inflater.inflate(R.layout.grid_item, null);

        }

        ImageView imageView = convertView.findViewById(R.id.grid_image);
        TextView textView = convertView.findViewById(R.id.item_name);

        imageView.setImageResource(image[position]);
        textView.setText(colorName[position]);

        return convertView;
    }
}
