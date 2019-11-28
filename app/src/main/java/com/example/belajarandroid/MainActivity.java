package com.example.belajarandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvNovels;
    private ArrayList<Novel> list = new ArrayList<>();
    private  String title = "Mode List";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBarTitle(title);

        rvNovels = findViewById(R.id.rv_heroes);
        rvNovels.setHasFixedSize(true);

        list.addAll(NovelsData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvNovels.setLayoutManager(new LinearLayoutManager(this));
        ListNovelsAdapter listNovelsAdapter = new ListNovelsAdapter(list, this);
        rvNovels.setAdapter(listNovelsAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);

    }

    public void setMode(int selectedMode){
        switch (selectedMode){
            case R.id.action_list:
                title = "Mode List";
                showRecyclerList();
                break;
            case R.id.action_grid:
                title = "Mode Grid";
                showRecyclerGrid();
                break;
            case R.id.action_cardview:
                title = "Mode Card View";
                showRecyclerCardView();
                break;
            case R.id.action_about:
                Intent i = new Intent(this, About.class);
                startActivity(i);
        }
        setActionBarTitle(title);
    }

    private void showRecyclerGrid(){
        rvNovels.setLayoutManager(new GridLayoutManager(this, 2));
        GridNovelsAdapter gridHeroAdapter = new GridNovelsAdapter(list, this);
        rvNovels.setAdapter(gridHeroAdapter);
    }



    private void showRecyclerCardView(){
        rvNovels.setLayoutManager(new LinearLayoutManager(this));
        CardViewNovelsAdapter cardViewHeroAdapter = new CardViewNovelsAdapter(list, this);
        rvNovels.setAdapter(cardViewHeroAdapter);
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }


}

