package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<word> {

    private int mColorId;

    public WordAdapter( Context context,  ArrayList<word> words, int color) {
        super(context, 0,words);
        mColorId = color;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        word current_word = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView miwok_TextView = (TextView) listItemView.findViewById(R.id.miwok);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        miwok_TextView.setText(current_word.getmM());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView english_TextView = (TextView) listItemView.findViewById(R.id.english);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        english_TextView.setText(current_word.getmE());

        ImageView imageView = (ImageView)listItemView.findViewById(R.id.image);
        // 判断是否有图片
        if (current_word.hasImage()) {
            imageView.setImageResource(current_word.getmI());
        }else {
            imageView.setVisibility(View.GONE);
        }

        //为每个Activity的text_item_container设置不同的颜色
        View textContainer = listItemView.findViewById(R.id.text_item_container);
        int color = ContextCompat.getColor(getContext(),mColorId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
