package com.example.belajarhurufhijaiyah;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

public class HijaiyahAActivity1 extends AppCompatActivity {
    ImageView TampilGambar;
    ImageButton show,hide,pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hijaiyah_a1);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        TampilGambar = (ImageView) findViewById(R.id.fatah_a_pop);
        show = (ImageButton) findViewById(R.id.fatah_a);
        show = (ImageButton) findViewById(R.id.fatah_ba);
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
        final MediaPlayer SuaraAlif = MediaPlayer.create(this, R.raw.fatah_a); //Memanggil nama lagu
        final MediaPlayer SuaraBa = MediaPlayer.create(this, R.raw.fatah_ba);
        final MediaPlayer SuaraTa = MediaPlayer.create(this, R.raw.fatah_ta);
        final MediaPlayer SuaraSa = MediaPlayer.create(this, R.raw.fatah_tsa);
        final MediaPlayer SuaraJim = MediaPlayer.create(this, R.raw.fatah_ja);
        final MediaPlayer SuaraHa = MediaPlayer.create(this, R.raw.fatah_ha);
        final MediaPlayer SuaraKho = MediaPlayer.create(this, R.raw.fatah_kho);
        final MediaPlayer SuaraDal = MediaPlayer.create(this, R.raw.fatah_da);
        final MediaPlayer SuaraDzal = MediaPlayer.create(this, R.raw.fatah_dza);
        final MediaPlayer SuaraRo = MediaPlayer.create(this, R.raw.fatah_ro);

        ImageButton ButtonSuara = (ImageButton) this.findViewById(R.id.fatah_a); //fariabel button
        ImageButton ButtonSuara2 = (ImageButton) this.findViewById(R.id.fatah_ba);
        ImageButton ButtonSuara3 = (ImageButton) this.findViewById(R.id.fatah_ta);
        ImageButton ButtonSuara4 = (ImageButton) this.findViewById(R.id.fatah_tsa);
        ImageButton ButtonSuara5 = (ImageButton) this.findViewById(R.id.fatah_ja);
        ImageButton ButtonSuara6 = (ImageButton) this.findViewById(R.id.fatah_ha);
        ImageButton ButtonSuara7 = (ImageButton) this.findViewById(R.id.fatah_kha);
        ImageButton ButtonSuara8 = (ImageButton) this.findViewById(R.id.fatah_da);
        ImageButton ButtonSuara9 = (ImageButton) this.findViewById(R.id.fatah_dza);
        ImageButton ButtonSuara10 = (ImageButton) this.findViewById(R.id.fatah_ra);

        /*Biar suara hidup */
        ButtonSuara.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.fatah_a_pop);
                TampilGambar.startAnimation(animScale);
                SuaraAlif.start();
            }
        });

        ButtonSuara2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.fatah_ba_pop);
                TampilGambar.startAnimation(animScale);
                SuaraBa.start();
            }
        });

        ButtonSuara3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.fatah_ta_pop);
                TampilGambar.startAnimation(animScale);
                SuaraTa.start();
            }
        });

        ButtonSuara4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.fatah_tsa_pop);
                TampilGambar.startAnimation(animScale);
                SuaraSa.start();
            }
        });
        ButtonSuara5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.fatah_ja_pop);
                TampilGambar.startAnimation(animScale);
                SuaraJim.start();
            }
        });
        ButtonSuara6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.fatah_ha_pop);
                TampilGambar.startAnimation(animScale);
                SuaraHa.start();
            }
        });
        ButtonSuara7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.fatah_kha_pop);
                TampilGambar.startAnimation(animScale);
                SuaraKho.start();
            }
        });

        ButtonSuara8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.fatah_da_pop);
                TampilGambar.startAnimation(animScale);
                SuaraDal.start();
            }
        });

        ButtonSuara9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.fatah_dza_pop);
                TampilGambar.startAnimation(animScale);
                SuaraDzal.start();
            }
        });
        ButtonSuara10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.fatah_ra_pop);
                TampilGambar.startAnimation(animScale);
                SuaraRo.start();
            }
        });
    }
}
