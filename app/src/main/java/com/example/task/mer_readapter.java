package com.example.task;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class mer_readapter extends RecyclerView.Adapter<mer_readapter.myviewholder> {
    ArrayList<mer_recycleitemdata> Dataholder;
    public mer_readapter(ArrayList<mer_recycleitemdata> Dataholder) {this.Dataholder=Dataholder;}

    @NonNull
    @Override
    public mer_readapter.myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.merchantrecyclerview,parent,false);
        return new myviewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull mer_readapter.myviewholder holder, int position) {
        holder.image.setImageResource(Dataholder.get(position).getImage());
        holder.names.setText(Dataholder.get(position).getName());
        holder.ratings.setText(Dataholder.get(position).getRating());
        holder.addresses.setText(Dataholder.get(position).getAddress());
        holder.fee.setText(Dataholder.get(position).getFees());


    }

    @Override
    public int getItemCount() {
        return Dataholder.size();
    }

    public class myviewholder extends RecyclerView.ViewHolder {
        public ImageView image;
        TextView names,ratings,addresses,fee;
        public Button callnow,enqiury;

        public myviewholder(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.img);
            names=itemView.findViewById(R.id.name);
            ratings=itemView.findViewById(R.id.rating);
            addresses=itemView.findViewById(R.id.address);
            fee=itemView.findViewById(R.id.fees);
            callnow=itemView.findViewById(R.id.calln);
            enqiury=itemView.findViewById(R.id.senden);
        }
    }
}
