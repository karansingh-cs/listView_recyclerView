package com.example.homework_1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<Item> {

        public ListAdapter(Context context, ArrayList<Item> itemArrayList){

            super(context, R.layout.list_item, itemArrayList);
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            Item item = getItem(position);

            if (convertView == null){
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent, false);
            }

            TextView itemName = convertView.findViewById(R.id.foodName);

            itemName.setText(item.name);

            return convertView;
        }
    }
