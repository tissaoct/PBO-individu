package com.example.tissa;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class NegaraAdapter extends BaseAdapter {
    private Context context;
    private String[][] data;

    public NegaraAdapter(Context context, String[][] data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int position) {
        return data[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.activity_list_view, parent, false);
            holder = new ViewHolder();
            holder.imgView = convertView.findViewById(R.id.imgView);
            holder.text1 = convertView.findViewById(R.id.text1);
            holder.text2 = convertView.findViewById(R.id.text2);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        String[] currentItem = (String[]) getItem(position);
        if (currentItem != null) {
            int drawableId = context.getResources().getIdentifier(currentItem[2], "drawable", context.getPackageName());
            if (drawableId != 0) {
                Drawable drawable = context.getResources().getDrawable(drawableId);
                holder.imgView.setImageDrawable(drawable);
            } else {
                holder.imgView.setImageDrawable(null);
            }
            holder.text1.setText(currentItem[0]);
            holder.text2.setText(currentItem[1]);
        }

        return convertView;
    }

    static class ViewHolder {
        ImageView imgView;
        TextView text1;
        TextView text2;
    }
}
