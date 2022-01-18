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

public class HijaiyahIActivity2 extends AppCompatActivity {
    ImageView TampilGambar;
    ImageButton show,hide,pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hijaiyah_i2);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        TampilGambar = (ImageView) findViewById(R.id.kasroh_zi_pop);
        show = (ImageButton) findViewById(R.id.kasroh_zi);
        show = (ImageButton) findViewById(R.id.kasroh_si);
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
        final MediaPlayer SuaraAlif = MediaPlayer.create(this, R.raw.kasroh_zi); //Memanggil nama lagu
        final MediaPlayer SuaraBa = MediaPlayer.create(this, R.raw.kasroh_si);
        final MediaPlayer SuaraTa = MediaPlayer.create(this, R.raw.kasroh_syi);
        final MediaPlayer SuaraSa = MediaPlayer.create(this, R.raw.kasroh_shi);
        final MediaPlayer SuaraJim = MediaPlayer.create(this, R.raw.kasroh_dhi);
        final MediaPlayer SuaraHa = MediaPlayer.create(this, R.raw.kasroh_thi);
        final MediaPlayer SuaraKho = MediaPlayer.create(this, R.raw.kasroh_dzii);
        final MediaPlayer SuaraDal = MediaPlayer.create(this, R.raw.kasroh_ii);
        final MediaPlayer SuaraDzal = MediaPlayer.create(this, R.raw.kasroh_ghi);
        final MediaPlayer SuaraRo = MediaPlayer.create(this, R.raw.kasroh_fi);

        ImageButton ButtonSuara = (ImageButton) this.findViewById(R.id.kasroh_zi); //fariabel button
        ImageButton ButtonSuara2 = (ImageButton) this.findViewById(R.id.kasroh_si);
        ImageButton ButtonSuara3 = (ImageButton) this.findViewById(R.id.kasroh_syi);
        ImageButton ButtonSuara4 = (ImageButton) this.findViewById(R.id.kasroh_shi);
        ImageButton ButtonSuara5 = (ImageButton) this.findViewById(R.id.kasroh_dhi);
        ImageButton ButtonSuara6 = (ImageButton) this.findViewById(R.id.kasroh_thi);
        ImageButton ButtonSuara7 = (ImageButton) this.findViewById(R.id.kasroh_dzhi);
        ImageButton ButtonSuara8 = (ImageButton) this.findViewById(R.id.kasroh_ii);
        ImageButton ButtonSuara9 = (ImageButton) this.findViewById(R.id.kasroh_ghi);
        ImageButton ButtonSuara10 = (ImageButton) this.findViewById(R.id.kasroh_fi);

        /*Biar suara hidup */
        ButtonSuara.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.kasroh_zi_pop);
                TampilGambar.startAnimation(animScale);
                SuaraAlif.start();
            }
        });

        ButtonSuara2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.kasroh_si_pop);
                TampilGambar.startAnimation(animScale);
                SuaraBa.start();
            }
        });

        ButtonSuara3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.kasroh_syi_pop);
                TampilGambar.startAnimation(animScale);
                SuaraTa.start();
            }
        });

        ButtonSuara4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.kasroh_shi_pop);
                TampilGambar.startAnimation(animScale);
                SuaraSa.start();
            }
        });
        ButtonSuara5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.kasroh_dhi_pop);
                TampilGambar.startAnimation(animScale);
                SuaraJim.start();
            }
        });
        ButtonSuara6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.kasroh_thi_pop);
                TampilGambar.startAnimation(animScale);
                SuaraHa.start();
            }
        });
        ButtonSuara7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.kasroh_dzhi_pop);
                TampilGambar.startAnimation(animScale);
                SuaraKho.start();
            }
        });

        ButtonSuara8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.kasroh_ii_pop);
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
                TampilGambar.setImageResource(R.drawable.kasroh_fi_pop);
                TampilGambar.startAnimation(animScale);
                SuaraRo.start();
            }
        });

        pindah = (ImageButton) findViewById(R.id.back);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //suaraButton.start();
                Intent intent = new Intent(HijaiyahIActivity2.this, HijaiyahIActivity.class);
                startActivity(intent);
                //mp.stop();
            }
        });

    }
}
