package com.example.myproject;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Holder extends RecyclerView.ViewHolder {

    TextView examName;
    TextView examMessage;
    TextView examDate;
//    View view;
    public Holder(@NonNull View itemView) {
        super(itemView);

        examName = itemView.findViewById(R.id.examName);
        examMessage = itemView.findViewById(R.id.examMessage);
        examDate = itemView.findViewById(R.id.examDate);
//        view = itemView;
    }
}
