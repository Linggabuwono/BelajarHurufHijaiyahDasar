package com.example.belajarhurufhijaiyah;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

public class HijaiyahUActivity2 extends AppCompatActivity {
    ImageView TampilGambar;
    ImageButton show,hide,pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hijaiyah_u2);

        TampilGambar = (ImageView) findViewById(R.id.domah_zu_pop);
        show = (ImageButton) findViewById(R.id.domah_zu);
        show = (ImageButton) findViewById(R.id.domah_su);
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
        final MediaPlayer SuaraAlif = MediaPlayer.create(this, R.raw.zu); //Memanggil nama lagu
        final MediaPlayer SuaraBa = MediaPlayer.create(this, R.raw.su);
        final MediaPlayer SuaraTa = MediaPlayer.create(this, R.raw.syu);
        final MediaPlayer SuaraSa = MediaPlayer.create(this, R.raw.shu);
        final MediaPlayer SuaraJim = MediaPlayer.create(this, R.raw.dhu);
        final MediaPlayer SuaraHa = MediaPlayer.create(this, R.raw.thu);
        final MediaPlayer SuaraKho = MediaPlayer.create(this, R.raw.dzu);
        final MediaPlayer SuaraDal = MediaPlayer.create(this, R.raw.uu);
        final MediaPlayer SuaraDzal = MediaPlayer.create(this, R.raw.ghu);
        final MediaPlayer SuaraRo = MediaPlayer.create(this, R.raw.fu);

        ImageButton ButtonSuara = (ImageButton) this.findViewById(R.id.domah_zu); //fariabel button
        ImageButton ButtonSuara2 = (ImageButton) this.findViewById(R.id.domah_su);
        ImageButton ButtonSuara3 = (ImageButton) this.findViewById(R.id.domah_syu);
        ImageButton ButtonSuara4 = (ImageButton) this.findViewById(R.id.domah_shu);
        ImageButton ButtonSuara5 = (ImageButton) this.findViewById(R.id.domah_dhu);
        ImageButton ButtonSuara6 = (ImageButton) this.findViewById(R.id.domah_thu);
        ImageButton ButtonSuara7 = (ImageButton) this.findViewById(R.id.domah_dzhu);
        ImageButton ButtonSuara8 = (ImageButton) this.findViewById(R.id.domah_uu);
        ImageButton ButtonSuara9 = (ImageButton) this.findViewById(R.id.domah_ghu);
        ImageButton ButtonSuara10 = (ImageButton) this.findViewById(R.id.domah_fu);

        /*Biar suara hidup */
        ButtonSuara.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.domah_zu_pop);
                TampilGambar.startAnimation(animScale);
                SuaraAlif.start();
            }
        });

        ButtonSuara2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.domah_su_pop);
                TampilGambar.startAnimation(animScale);
                SuaraBa.start();
            }
        });

        ButtonSuara3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.domah_syu_pop);
                TampilGambar.startAnimation(animScale);
                SuaraTa.start();
            }
        });

        ButtonSuara4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.domah_shu_pop);
                TampilGambar.startAnimation(animScale);
                SuaraSa.start();
            }
        });
        ButtonSuara5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.domah_dhu_pop);
                TampilGambar.startAnimation(animScale);
                SuaraJim.start();
            }
        });
        ButtonSuara6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.domah_thu_pop);
                TampilGambar.startAnimation(animScale);
                SuaraHa.start();
            }
        });
        ButtonSuara7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.domah_dzhu_pop);
                TampilGambar.startAnimation(animScale);
                SuaraKho.start();
            }
        });

        ButtonSuara8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.domah_uu_pop);
                TampilGambar.startAnimation(animScale);
                SuaraDal.start();
            }
        });

        ButtonSuara9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.domah_ghu_pop);
                TampilGambar.startAnimation(animScale);
                SuaraDzal.start();
            }
        });
        ButtonSuara10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.domah_fu_pop);
                TampilGambar.startAnimation(animScale);
                SuaraRo.start();
            }
        });

    }
}
