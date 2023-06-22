package com.si6a.rakitkuy;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.si6a.rakitkuy.databinding.ItemUnggahBinding;

import java.util.ArrayList;
import java.util.List;

public class UnggahViewAdapter extends RecyclerView.Adapter<UnggahViewAdapter.ViewHolder> {
    private List<Unggah> data = new ArrayList<>();

    public void setData(List<Unggah> data){
        this.data = data;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public UnggahViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemUnggahBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull UnggahViewAdapter.ViewHolder holder, int position) {
        int pos = holder.getAdapterPosition();
        Unggah unggah = data.get(pos);
        holder.itemUnggahBinding.tvUsername.setText(unggah.getUsername());
        holder.itemUnggahBinding.tvContent.setText(unggah.getContent());
        holder.itemUnggahBinding.tvCreatedDate.setText(unggah.getCreated_date());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ItemUnggahBinding itemUnggahBinding;

        public ViewHolder(@NonNull ItemUnggahBinding itemView) {
            super(itemView.getRoot());
            itemUnggahBinding = itemView;
        }
    }
}
