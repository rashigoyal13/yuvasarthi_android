package com.example.task;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class re_adapter extends RecyclerView.Adapter<re_adapter.myviewholder> {

    ArrayList<recycledata> dataholder;

    public re_adapter(ArrayList<recycledata> dataholder) {
        this.dataholder = dataholder;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new myviewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
       holder.image.setImageResource(dataholder.get(position).getImage());
        holder.title.setText(dataholder.get(position).getTitle());
        holder.date.setText(dataholder.get(position).getDate());


    }

    @Override
    public int getItemCount() {
        return dataholder.size();
    }

    class myviewholder extends RecyclerView.ViewHolder
    {
        ImageView image;
        TextView title,date;
        public Button more,shareb;
        public myviewholder(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.img_l);
            title=itemView.findViewById(R.id.tit);
            date=itemView.findViewById(R.id.date);
            more=itemView.findViewById(R.id.btn1);
            shareb=itemView.findViewById(R.id.sh);
        }
    }
}
