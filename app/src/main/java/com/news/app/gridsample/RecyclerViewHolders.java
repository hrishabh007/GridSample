package com.news.app.gridsample;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class RecyclerViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView countryName;
    public ImageView countryPhoto;
    ItemClickListener itemClickListener;
    public RecyclerViewHolders(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        countryName = (TextView)itemView.findViewById(R.id.country_name);
        countryPhoto = (ImageView)itemView.findViewById(R.id.country_photo);
        itemView.setOnClickListener(this);
    }

   /* @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), "Clicked Country Position = " + getPosition(), Toast.LENGTH_SHORT).show();
    }*/
   @Override
   public void onClick(View v) {
       this.itemClickListener.onItemClick(v, getLayoutPosition());
   }

    public void setItemClickListener(ItemClickListener ic) {
        this.itemClickListener = ic;
    }
}