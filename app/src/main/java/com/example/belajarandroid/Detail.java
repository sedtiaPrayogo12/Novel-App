package com.example.belajarandroid;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Novel novel = getIntent().getParcelableExtra("DATA");

        TextView nama = findViewById(R.id.name_detail);
        TextView detail = findViewById(R.id.ket_detail);
        ImageView photo = findViewById(R.id.photo_detail);


        Glide.with(this)
                .load(novel.getPhoto())
                .apply(new RequestOptions().override(800,800))
                .into(photo);
        nama.setText(novel.getName());
        detail.setText(novel.getSinopsis());

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // add back arrow to toolbar
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        getSupportActionBar().setTitle(novel.getName());
        toolbar.getNavigationIcon().setColorFilter(getResources().getColor(R.color.colorControlHighlight), PorterDuff.Mode.SRC_ATOP);
        toolbar.setTitleTextColor(getResources().getColor(R.color.colorControlHighlight));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item);
    }
}

