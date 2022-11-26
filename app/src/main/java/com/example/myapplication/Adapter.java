package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<viewholder> {

    Context context;
    List<record> items;

    public Adapter(Context context, List<record> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new viewholder(LayoutInflater.from(context).inflate(R.layout.table_row,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        holder.time.setText(items.get(position).getTime());
        holder.desc1.setText(items.get(position).getDesc1());
        holder.desc2.setText(items.get(position).getDesc2());
        holder.debit.setText(items.get(position).getDebit());
        holder.credit.setText(items.get(position).getCredit());
        holder.bg1.setImageResource(items.get(position).getBg1());
        holder.bg2.setImageResource(items.get(position).getBg2());
        holder.bg3.setImageResource(items.get(position).getBg3());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
