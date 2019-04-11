package com.example.android.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class NumberViewHolder extends RecyclerView.ViewHolder {

    TextView listItemNumberView;

    NumberViewHolder(View itemView) {

        super(itemView);
        listItemNumberView = (TextView) itemView.findViewById(R.id.tv_item_number);

    }

    void bind(int listIndex) {

        listItemNumberView.setText(String.valueOf(listIndex));

    }
}
