package com.example.nianfo.myapplication;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.nianfo.myapplication.R;

public class NameViewHolder extends RecyclerView.ViewHolder {
    private TextView textViewName;
    public NameViewHolder(@NonNull View itemView) {
        super(itemView);
        textViewName = itemView.findViewById(R.id.iteme_name_textview_name);
    }

    public void setContent(String name){
        textViewName.setText(name);
    }
}



