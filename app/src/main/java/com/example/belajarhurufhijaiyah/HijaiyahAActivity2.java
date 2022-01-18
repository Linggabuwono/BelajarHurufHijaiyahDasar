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

public class HijaiyahAActivity2 extends AppCompatActivity {
    ImageView TampilGambar;
    ImageButton show,hide,pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hijaiyah_a2);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        TampilGambar = (ImageView) findViewById(R.id.fatah_za_pop);
        show = (ImageButton) findViewById(R.id.fatah_za);
        show = (ImageButton) findViewById(R.id.fatah_sa);
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
        final MediaPlayer SuaraAlif = MediaPlayer.create(this, R.raw.fatah_za); //Memanggil nama lagu
        final MediaPlayer SuaraBa = MediaPlayer.create(this, R.raw.fatah_sa);
        final MediaPlayer SuaraTa = MediaPlayer.create(this, R.raw.fatah_sya);
        final MediaPlayer SuaraSa = MediaPlayer.create(this, R.raw.fatah_sho);
        final MediaPlayer SuaraJim = MediaPlayer.create(this, R.raw.fatah_dho);
        final MediaPlayer SuaraHa = MediaPlayer.create(this, R.raw.fatah_tho);
        final MediaPlayer SuaraKho = MediaPlayer.create(this, R.raw.fatah_dza);
        final MediaPlayer SuaraDal = MediaPlayer.create(this, R.raw.fatah_aa);
        final MediaPlayer SuaraDzal = MediaPlayer.create(this, R.raw.fatah_gho);
        final MediaPlayer SuaraRo = MediaPlayer.create(this, R.raw.fatah_fa);

        ImageButton ButtonSuara = (ImageButton) this.findViewById(R.id.fatah_za); //fariabel button
        ImageButton ButtonSuara2 = (ImageButton) this.findViewById(R.id.fatah_sa);
        ImageButton ButtonSuara3 = (ImageButton) this.findViewById(R.id.fatah_sya);
        ImageButton ButtonSuara4 = (ImageButton) this.findViewById(R.id.fatah_sha);
        ImageButton ButtonSuara5 = (ImageButton) this.findViewById(R.id.fatah_dha);
        ImageButton ButtonSuara6 = (ImageButton) this.findViewById(R.id.fatah_tho);
        ImageButton ButtonSuara7 = (ImageButton) this.findViewById(R.id.fatah_dzha);
        ImageButton ButtonSuara8 = (ImageButton) this.findViewById(R.id.fatah_aa);
        ImageButton ButtonSuara9 = (ImageButton) this.findViewById(R.id.fatah_gha);
        ImageButton ButtonSuara10 = (ImageButton) this.findViewById(R.id.fatah_fa);

        /*Biar suara hidup */
        ButtonSuara.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.fatah_za_pop);
                TampilGambar.startAnimation(animScale);
                SuaraAlif.start();
            }
        });

        ButtonSuara2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.fatah_sa_pop);
                TampilGambar.startAnimation(animScale);
                SuaraBa.start();
            }
        });

        ButtonSuara3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.fatah_sya_pop);
                TampilGambar.startAnimation(animScale);
                SuaraTa.start();
            }
        });

        ButtonSuara4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.fatah_sha_pop);
                TampilGambar.startAnimation(animScale);
                SuaraSa.start();
            }
        });
        ButtonSuara5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.fatah_dha_pop);
                TampilGambar.startAnimation(animScale);
                SuaraJim.start();
            }
        });
        ButtonSuara6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.fatah_tha_pop);
                TampilGambar.startAnimation(animScale);
                SuaraHa.start();
            }
        });
        ButtonSuara7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.fatah_dzha_pop);
                TampilGambar.startAnimation(animScale);
                SuaraKho.start();
            }
        });

        ButtonSuara8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.fatah_ain_pop);
                TampilGambar.startAnimation(animScale);
                SuaraDal.start();
            }
        });

        ButtonSuara9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.fatah_gha_pop);
                TampilGambar.startAnimation(animScale);
                SuaraDzal.start();
            }
        });
        ButtonSuara10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.fatah_fa_pop);
                TampilGambar.startAnimation(animScale);
                SuaraRo.start();
            }
        });

        pindah = (ImageButton) findViewById(R.id.back);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //suaraButton.start();
                Intent intent = new Intent(HijaiyahAActivity2.this, HijaiyahAActivity.class);
                startActivity(intent);
                //mp.stop();
            }
        });
    }
}
