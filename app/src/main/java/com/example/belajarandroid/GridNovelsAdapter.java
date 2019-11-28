package com.example.belajarandroid;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GridNovelsAdapter extends RecyclerView.Adapter<GridNovelsAdapter.GridViewHolder> {
    private ArrayList<Novel> listNovel;
    public Context ctx2;
    public GridNovelsAdapter(ArrayList<Novel> list, Context context) {
        this.ctx2 = context;
        this.listNovel = list;
    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_grid_novel, viewGroup, false);
        return new GridViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull final GridViewHolder holder, int position) {
        final Novel hero = listNovel.get(position);
        Glide.with(holder.itemView.getContext())
                .load(listNovel.get(position).getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Novel h2 = new Novel();
                h2.setName(hero.getName());
                h2.setSinopsis(hero.getSinopsis());
                h2.setPhoto(hero.getPhoto());

                Intent intent = new Intent(ctx2, Detail.class);
                intent.putExtra("DATA",h2);
                ctx2.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return listNovel.size();
    }
    public class GridViewHolder extends RecyclerView.ViewHolder {
        public ImageView imgPhoto;

        public GridViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}

