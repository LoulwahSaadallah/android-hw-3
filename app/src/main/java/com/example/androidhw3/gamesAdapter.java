package com.example.androidhw3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class gamesAdapter extends ArrayAdapter<Games> {
    List<Games> gamesListAdapter;
    public gamesAdapter(@NonNull Context context, int resource, @NonNull List<Games> objects) {
        super(context, resource, objects);
        gamesListAdapter = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

      View view = LayoutInflater.from(getContext()).inflate(R.layout.listgame, parent, false);
      Games currentItem = gamesListAdapter.get(position);
        ImageView itemformula = view.findViewById(R.id.imageformula);
        TextView itemname = view.findViewById(R.id.name);
        TextView price = view.findViewById(R.id.priceformula1);
        itemformula.setImageResource(currentItem.getImageformula());
        itemname.setText(currentItem.getFormula1());
        price.setText(currentItem.getPriceformula1() + "");


        return view;
    }

}
