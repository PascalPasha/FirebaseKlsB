package com.example.firebaseklsb.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.content.Context;
import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.firebaseklsb.R;
import com.example.firebaseklsb.database.Teman;

public class AdapterLihatBarang extends
        RecyclerView.Adapter<AdapterLihatBarang.ViewHolder> {
    private ArrayList<Teman> daftarTeman;
    private Context context;

    public AdapterLihatBarang(ArrayList<Teman> daftarTeman, Context context){
        this.daftarTeman = daftarTeman;
        this.context = context;

    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNama;
        ViewHolder(View v) {
            super(v);
            tvNama = (TextView) v.findViewById(R.id.tv_nama);
        }
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_barang, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        String nama = daftarTeman.get(position).getNama();
        holder.tvNama.setText(nama);
        holder.tvNama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
        holder.tvNama.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                return true;
            }
        });

    }
    @Override
    public int getItemCount() {
        return daftarTeman.size();
    }
}
