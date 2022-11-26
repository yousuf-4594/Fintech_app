package com.example.myapplication;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class viewholder extends RecyclerView.ViewHolder {

    TextView time;
    TextView desc1;
    TextView desc2;
    TextView debit;
    TextView credit;
    ImageView bg1;
    ImageView bg2;
    ImageView bg3;

    public viewholder(@NonNull View itemView) {
        super(itemView);
        time = itemView.findViewById(R.id.editTextTime);
        desc1 = itemView.findViewById(R.id.textView23);
        desc2 = itemView.findViewById(R.id.textView24);
        debit = itemView.findViewById(R.id.editTextNumber3);
        credit = itemView.findViewById(R.id.editTextNumber2);
        bg1 = itemView.findViewById(R.id.imageView22);
        bg2 = itemView.findViewById(R.id.imageView26);
        bg3 = itemView.findViewById(R.id.imageView21);
    }
}
