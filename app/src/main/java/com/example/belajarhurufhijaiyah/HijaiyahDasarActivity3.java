package com.example.belajarhurufhijaiyah;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

public class HijaiyahDasarActivity3 extends AppCompatActivity {
    ImageView TampilGambar;
    ImageButton show,hide,pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hijaiyah_dasar3);

        TampilGambar = (ImageView) findViewById(R.id.qafpop);
        show = (ImageButton) findViewById(R.id.qaf);
        show = (ImageButton) findViewById(R.id.kaf);
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

        final MediaPlayer SuaraKof = MediaPlayer.create(this, R.raw.kof);
        final MediaPlayer SuaraKaf = MediaPlayer.create(this, R.raw.kaf);
        final MediaPlayer SuaraLam = MediaPlayer.create(this, R.raw.lam);
        final MediaPlayer SuaraMim = MediaPlayer.create(this, R.raw.min);
        final MediaPlayer SuaraNun = MediaPlayer.create(this, R.raw.nun);
        final MediaPlayer SuaraWawu = MediaPlayer.create(this, R.raw.wawu);
        final MediaPlayer SuaraHA = MediaPlayer.create(this, R.raw.haa);
        final MediaPlayer SuaraYa = MediaPlayer.create(this, R.raw.ya);

        ImageButton ButtonSuara21 = (ImageButton) this.findViewById(R.id.qaf);
        ImageButton ButtonSuara22 = (ImageButton) this.findViewById(R.id.kaf);
        ImageButton ButtonSuara23 = (ImageButton) this.findViewById(R.id.lam);
        ImageButton ButtonSuara24 = (ImageButton) this.findViewById(R.id.mim);
        ImageButton ButtonSuara25 = (ImageButton) this.findViewById(R.id.nun);
        ImageButton ButtonSuara26 = (ImageButton) this.findViewById(R.id.wau);
        ImageButton ButtonSuara27 = (ImageButton) this.findViewById(R.id.haa);
        ImageButton ButtonSuara0 = (ImageButton) this.findViewById(R.id.lamalif);
        ImageButton ButtonSuara00 = (ImageButton) this.findViewById(R.id.hamzah);
        ImageButton ButtonSuara28 = (ImageButton) this.findViewById(R.id.ya);

        ButtonSuara21.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.qafpop);
                TampilGambar.startAnimation(animScale);
                SuaraKof.start();
            }
        });
        ButtonSuara22.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kafpop);
                TampilGambar.startAnimation(animScale);
                // TODO Auto-generated method stub
                SuaraKaf.start();
            }
        });
        ButtonSuara23.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.lampop);
                TampilGambar.startAnimation(animScale);
                SuaraLam.start();
            }
        });

        ButtonSuara24.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.mimpop);
                TampilGambar.startAnimation(animScale);
                SuaraMim.start();
            }
        });
        ButtonSuara25.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.nunpop);
                TampilGambar.startAnimation(animScale);
                SuaraNun.start();
            }
        });
        ButtonSuara26.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.waupop);
                TampilGambar.startAnimation(animScale);
                SuaraWawu.start();
            }
        });
        ButtonSuara27.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.haapop);
                TampilGambar.startAnimation(animScale);
                SuaraHA.start();
            }
        });
        ButtonSuara0.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.lamalifpop);
                TampilGambar.startAnimation(animScale);
                SuaraHA.start();
            }
        });
        ButtonSuara00.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.hamzahpop);
                TampilGambar.startAnimation(animScale);
                SuaraHA.start();
            }
        });
        ButtonSuara28.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.yapop);
                TampilGambar.startAnimation(animScale);
                SuaraYa.start();
            }
        });
    }
}
