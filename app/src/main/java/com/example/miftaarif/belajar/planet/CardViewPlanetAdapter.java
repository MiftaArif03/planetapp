package com.example.miftaarif.belajar.planet;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CardViewPlanetAdapter extends RecyclerView.Adapter<CardViewPlanetAdapter.CardViewViewHolder> {

    private ArrayList<Planet> listPlanet;
    private Context context;

    public CardViewPlanetAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Planet> getListPlanet() {
        return listPlanet;
    }
    public void setListPlanet(ArrayList<Planet> listPlanet) {
        this.listPlanet = listPlanet;
    }

    @Override
    public CardViewViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_planet, parent ,false);
        CardViewViewHolder viewHolder = new CardViewViewHolder(view);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(CardViewViewHolder holder, int position) {
        Planet p = getListPlanet().get(position);
        Glide.with(context)
                .load(p.getFoto())
                .override(200, 250)
                .into(holder.imgPhoto);
        holder.tvName.setText(p.getNama());
        holder.tvRemarks.setText(p.getKeterangan());
        holder.btnDetail.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback() {

            //@Override
            public void onItemClicked(View view, int position) {

                Intent detailIntent = new Intent(context, DetailPlanet.class);
                detailIntent.putExtra(DetailPlanet.EXTRA_NAMA, getListPlanet().get(position).getNama());
                detailIntent.putExtra(DetailPlanet.EXTRA_DETAIL, getListPlanet().get(position).getDetail());
                detailIntent.putExtra(DetailPlanet.EXTRA_FOTO, getListPlanet().get(position).getFoto());
                context.startActivity(detailIntent);
            }
        }));


    }

    @Override

    public int getItemCount() {
        return getListPlanet().size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvRemarks;
        Button btnDetail;

        public CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvRemarks = itemView.findViewById(R.id.tv_item_remarks);
            btnDetail = itemView.findViewById(R.id.btn_set_favorite);
        }
    }
}
