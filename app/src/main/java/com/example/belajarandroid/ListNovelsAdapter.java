package com.example.belajarandroid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListNovelsAdapter extends RecyclerView.Adapter<ListNovelsAdapter.ListViewHolder> {

    private ArrayList<Novel> listNovel;
    public Context ctx;

    public ListNovelsAdapter(ArrayList<Novel> list, Context context){
        this.ctx = context;
        this.listNovel= list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_novel, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        final Novel hero = listNovel.get(position);
        Glide.with(holder.itemView.getContext())
                .load(hero.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.tvName.setText(hero.getName());
        holder.tvDetail.setText(hero.getSinopsis());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Novel h = new Novel();
                h.setName(hero.getName());
                h.setSinopsis(hero.getSinopsis());
                h.setPhoto(hero.getPhoto());

                Intent intent = new Intent(ctx, Detail.class);
                intent.putExtra("DATA", h);
                ctx.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return listNovel.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

        ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_sinopsis);
        }
    }


}

