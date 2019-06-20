package com.example.miftaarif.belajar.planet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvCategory;
    private ArrayList<Planet> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        rvCategory = findViewById(R.id.rv_planet);
        rvCategory.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(data_planet.getListData());

        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        CardViewPlanetAdapter cardViewPlanetAdapter = new CardViewPlanetAdapter(this);

        cardViewPlanetAdapter.setListPlanet(list);
        rvCategory.setAdapter(cardViewPlanetAdapter);
    }
}
