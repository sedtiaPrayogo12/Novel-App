package com.example.belajarandroid;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewNovelsAdapter extends RecyclerView.Adapter<CardViewNovelsAdapter.CardViewViewHolder>{
    private ArrayList<Novel> listNovel;
    public Context ctx3;
    public CardViewNovelsAdapter(ArrayList<Novel> list, Context context) {
        this.listNovel = list;
        this.ctx3 = context;
    }

    private OnItemClickCallback onItemClickCallback;
    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_novel, viewGroup, false);
        return new CardViewViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, int position) {
        final Novel novel = listNovel.get(position);
        Glide.with(holder.itemView.getContext())
                .load(novel.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);
        holder.tvName.setText(novel.getName());
        holder.tvDetail.setText(novel.getSinopsis());

        holder.btnFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Favorite " +
                        listNovel.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
            }
        });

        holder.btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Share " +
                        listNovel.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
            }
        });

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Novel h3 = new Novel();
                h3.setName(novel.getName());
                h3.setSinopsis(novel.getSinopsis());
                h3.setPhoto(novel.getPhoto());

                Intent intent = new Intent(ctx3, Detail.class);
                intent.putExtra("DATA", h3);
                ctx3.startActivity(intent);

            }
        });

    }
    @Override
    public int getItemCount() {
        return listNovel.size();
    }
    class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        Button btnFavorite, btnShare;

        CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_sinopsis);
            btnFavorite = itemView.findViewById(R.id.btn_set_favorite);
            btnShare = itemView.findViewById(R.id.btn_set_share);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Novel data);
    }
}
