package com.example.belajarhurufhijaiyah;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

public class HijaiyahIActivity1 extends AppCompatActivity {
    ImageView TampilGambar;
    ImageButton show,hide,pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hijaiyah_i1);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        TampilGambar = (ImageView) findViewById(R.id.kasroh_i_pop);
        show = (ImageButton) findViewById(R.id.kasroh_i);
        show = (ImageButton) findViewById(R.id.kasroh_bi);
        final Animation animScale = AnimationUtils.loadAnimation(this,R.anim.anim_scale);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setVisibility(View.VISIBLE);
            }
        });

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setVisibility(View.INVISIBLE);
            }
        });

        //Untuk suara button
        final MediaPlayer SuaraAlif = MediaPlayer.create(this, R.raw.kasroh_i); //Memanggil nama lagu
        final MediaPlayer SuaraBa = MediaPlayer.create(this, R.raw.kasroh_bi);
        final MediaPlayer SuaraTa = MediaPlayer.create(this, R.raw.kasroh_ti);
        final MediaPlayer SuaraSa = MediaPlayer.create(this, R.raw.kasroh_tsi);
        final MediaPlayer SuaraJim = MediaPlayer.create(this, R.raw.kasroh_ji);
        final MediaPlayer SuaraHa = MediaPlayer.create(this, R.raw.kasroh_hi);
        final MediaPlayer SuaraKho = MediaPlayer.create(this, R.raw.kasroh_khi);
        final MediaPlayer SuaraDal = MediaPlayer.create(this, R.raw.kasroh_di);
        final MediaPlayer SuaraDzal = MediaPlayer.create(this, R.raw.kasroh_dzi);
        final MediaPlayer SuaraRo = MediaPlayer.create(this, R.raw.kasroh_ri);

        ImageButton ButtonSuara = (ImageButton) this.findViewById(R.id.kasroh_i); //fariabel button
        ImageButton ButtonSuara2 = (ImageButton) this.findViewById(R.id.kasroh_bi);
        ImageButton ButtonSuara3 = (ImageButton) this.findViewById(R.id.kasroh_ti);
        ImageButton ButtonSuara4 = (ImageButton) this.findViewById(R.id.kasroh_tsi);
        ImageButton ButtonSuara5 = (ImageButton) this.findViewById(R.id.kasroh_ji);
        ImageButton ButtonSuara6 = (ImageButton) this.findViewById(R.id.kasroh_hi);
        ImageButton ButtonSuara7 = (ImageButton) this.findViewById(R.id.kasroh_khi);
        ImageButton ButtonSuara8 = (ImageButton) this.findViewById(R.id.kasroh_di);
        ImageButton ButtonSuara9 = (ImageButton) this.findViewById(R.id.kasroh_dzi);
        ImageButton ButtonSuara10 = (ImageButton) this.findViewById(R.id.kasroh_ri);

        /*Biar suara hidup */
        ButtonSuara.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.kasroh_i_pop);
                TampilGambar.startAnimation(animScale);
                SuaraAlif.start();
            }
        });

        ButtonSuara2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.kasroh_bi_pop);
                TampilGambar.startAnimation(animScale);
                SuaraBa.start();
            }
        });

        ButtonSuara3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.kasroh_ti_pop);
                TampilGambar.startAnimation(animScale);
                SuaraTa.start();
            }
        });

        ButtonSuara4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.kasroh_tsi_pop);
                TampilGambar.startAnimation(animScale);
                SuaraSa.start();
            }
        });
        ButtonSuara5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.kasroh_ji_pop);
                TampilGambar.startAnimation(animScale);
                SuaraJim.start();
            }
        });
        ButtonSuara6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.kasroh_hi_pop);
                TampilGambar.startAnimation(animScale);
                SuaraHa.start();
            }
        });
        ButtonSuara7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.kasroh_khi_pop);
                TampilGambar.startAnimation(animScale);
                SuaraKho.start();
            }
        });

        ButtonSuara8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.kasroh_di_pop);
                TampilGambar.startAnimation(animScale);
                SuaraDal.start();
            }
        });

        ButtonSuara9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.kasroh_dzi_pop);
                TampilGambar.startAnimation(animScale);
                SuaraDzal.start();
            }
        });
        ButtonSuara10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.kasroh_ri_pop);
                TampilGambar.startAnimation(animScale);
                SuaraRo.start();
            }
        });

        pindah = (ImageButton) findViewById(R.id.back);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //suaraButton.start();
                Intent intent = new Intent(HijaiyahIActivity1.this, HijaiyahIActivity.class);
                startActivity(intent);
                //mp.stop();
            }
        });

    }
}
