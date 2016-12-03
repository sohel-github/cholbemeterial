package com.walletmix.humayunkabir.cholbe;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class ContactAdapter extends BaseAdapter {

    final Context context;
    final String[] title;
    final String[] deg;
    final String[] detail;
    final Integer[] imageId;
    private static LayoutInflater inflater = null;

    public ContactAdapter(Context context, String[] title, String[] deg, String[] detail, Integer[] imageId) {
        this.context = context;
        this.title = title;
        this.deg = deg;
        this.detail = detail;
        this.imageId = imageId;
    }


    @Override
    public int getCount() {
        return title.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View rowView, ViewGroup parent) {

        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        rowView = inflater.inflate(R.layout.contact_row, null, true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.contactTitle);
        TextView txtDeg = (TextView) rowView.findViewById(R.id.contactDeg);
        TextView txtDetail = (TextView) rowView.findViewById(R.id.contactDetail);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.img);

        txtTitle.setText(title[position]);
        txtDeg.setText(deg[position]);
        txtDetail.setText(detail[position]);
        imageView.setImageResource(imageId[position]);

        return rowView;

    }

}
