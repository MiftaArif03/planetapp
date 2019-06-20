package com.example.miftaarif.belajar.planet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailPlanet extends AppCompatActivity {

    public static final String EXTRA_NAMA= "extra_name";
    public static final String EXTRA_KETERANGAN = "extra_keterangan";
    public static final String EXTRA_FOTO= "extra_foto";
    public static final String EXTRA_DETAIL= "extra_detail";
    TextView tvNamaPlanet, tvDetailPlanet;
    ImageView fotoPlanet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_planet);
        tvNamaPlanet = findViewById(R.id.tv_item_nama_planet);
        tvDetailPlanet = findViewById(R.id.tv_item_detail_planet);
        fotoPlanet =findViewById(R.id.img_item_photo_det);

        String namaplanet = getIntent().getStringExtra(EXTRA_NAMA);
        String detailplanet = getIntent().getStringExtra(EXTRA_DETAIL);
        String foto = getIntent().getStringExtra(EXTRA_FOTO);

        tvNamaPlanet.setText(namaplanet);
        tvDetailPlanet.setText(detailplanet);
        Glide.with(DetailPlanet.this)
                .load(foto)
                .override(200, 250)
                .into(fotoPlanet);

    }
}
