package com.example.myapplication;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Trail_bal_view_holder extends RecyclerView.ViewHolder {
    TextView desc;
    TextView debit;
    TextView credit;

    public Trail_bal_view_holder(@NonNull View itemView) {
        super(itemView);
        desc = itemView.findViewById(R.id.desc);
        debit = itemView.findViewById(R.id.deb);
        credit = itemView.findViewById(R.id.cre);
    }
}
