package com.example.laptops;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter {
    ArrayList<Laptops> myList =new ArrayList<>();
    Context context;

    public ItemAdapter(ArrayList<Laptops> myList, Context context) {
        this.myList = myList;
        this.context = context;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item,parent,false);
        ViewHolder vh =new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder)holder).img.setImageResource(myList.get(position).getImg());
        ((ViewHolder)holder).name.setText(myList.get(position).getName());
        ((ViewHolder)holder).price.setText(myList.get(position).getPrice()+"KD");


    }

    @Override
    public int getItemCount() {
        return myList.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder{

        ImageView img;
        TextView name, price;
        View v;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            v= itemView;
            img=v.findViewById(R.id.imageViewItem);
            name=v.findViewById(R.id.textViewName1);
            price=v.findViewById(R.id.textViewPrice1);

        }
    }

}
