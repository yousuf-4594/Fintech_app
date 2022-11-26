package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Trail_bal_Adapter extends RecyclerView.Adapter<Trail_bal_view_holder>{

    Context context;
    List<Trail_bal_Class> descs;

    public Trail_bal_Adapter(Context context, List<Trail_bal_Class> items) {
        this.context = context;
        this.descs = items;
    }
    @NonNull
    @Override
    public Trail_bal_view_holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Trail_bal_view_holder(LayoutInflater.from(context).inflate(R.layout.trail_bal_layout,parent,false));
    }
    @Override
    public void onBindViewHolder(@NonNull Trail_bal_view_holder holder, int position) {
        holder.desc.setText(descs.get(position).get_Desc());
        holder.credit.setText(descs.get(position).get_Credit());
        holder.debit.setText(descs.get(position).get_Debit());
    }
    @Override
    public int getItemCount() {
        return descs.size();
    }
}
