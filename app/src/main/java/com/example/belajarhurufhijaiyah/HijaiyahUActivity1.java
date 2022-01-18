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

public class HijaiyahUActivity1 extends AppCompatActivity {
    ImageView TampilGambar;
    ImageButton show,hide,pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hijaiyah_u1);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        TampilGambar = (ImageView) findViewById(R.id.domah_u_pop);
        show = (ImageButton) findViewById(R.id.domah_u);
        show = (ImageButton) findViewById(R.id.domah_bu);
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
        final MediaPlayer SuaraAlif = MediaPlayer.create(this, R.raw.u); //Memanggil nama lagu
        final MediaPlayer SuaraBa = MediaPlayer.create(this, R.raw.bu);
        final MediaPlayer SuaraTa = MediaPlayer.create(this, R.raw.tu);
        final MediaPlayer SuaraSa = MediaPlayer.create(this, R.raw.tsu);
        final MediaPlayer SuaraJim = MediaPlayer.create(this, R.raw.ju);
        final MediaPlayer SuaraHa = MediaPlayer.create(this, R.raw.hu);
        final MediaPlayer SuaraKho = MediaPlayer.create(this, R.raw.khu);
        final MediaPlayer SuaraDal = MediaPlayer.create(this, R.raw.du);
        final MediaPlayer SuaraDzal = MediaPlayer.create(this, R.raw.dzu);
        final MediaPlayer SuaraRo = MediaPlayer.create(this, R.raw.ru);

        ImageButton ButtonSuara = (ImageButton) this.findViewById(R.id.domah_u); //fariabel button
        ImageButton ButtonSuara2 = (ImageButton) this.findViewById(R.id.domah_bu);
        ImageButton ButtonSuara3 = (ImageButton) this.findViewById(R.id.domah_tu);
        ImageButton ButtonSuara4 = (ImageButton) this.findViewById(R.id.domah_tsu);
        ImageButton ButtonSuara5 = (ImageButton) this.findViewById(R.id.domah_ju);
        ImageButton ButtonSuara6 = (ImageButton) this.findViewById(R.id.domah_hu);
        ImageButton ButtonSuara7 = (ImageButton) this.findViewById(R.id.domah_khu);
        ImageButton ButtonSuara8 = (ImageButton) this.findViewById(R.id.domah_du);
        ImageButton ButtonSuara9 = (ImageButton) this.findViewById(R.id.domah_dzu);
        ImageButton ButtonSuara10 = (ImageButton) this.findViewById(R.id.domah_ru);

        /*Biar suara hidup */
        ButtonSuara.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.domah_u_pop);
                TampilGambar.startAnimation(animScale);
                SuaraAlif.start();
            }
        });

        ButtonSuara2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.domah_bu_pop);
                TampilGambar.startAnimation(animScale);
                SuaraBa.start();
            }
        });

        ButtonSuara3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.domah_tu_pop);
                TampilGambar.startAnimation(animScale);
                SuaraTa.start();
            }
        });

        ButtonSuara4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.domah_tsu_pop);
                TampilGambar.startAnimation(animScale);
                SuaraSa.start();
            }
        });
        ButtonSuara5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.domah_ju_pop);
                TampilGambar.startAnimation(animScale);
                SuaraJim.start();
            }
        });
        ButtonSuara6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.domah_hu_pop);
                TampilGambar.startAnimation(animScale);
                SuaraHa.start();
            }
        });
        ButtonSuara7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.domah_khu_pop);
                TampilGambar.startAnimation(animScale);
                SuaraKho.start();
            }
        });

        ButtonSuara8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.domah_du_pop);
                TampilGambar.startAnimation(animScale);
                SuaraDal.start();
            }
        });

        ButtonSuara9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.domah_dzu_pop);
                TampilGambar.startAnimation(animScale);
                SuaraDzal.start();
            }
        });
        ButtonSuara10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.domah_ru_pop);
                TampilGambar.startAnimation(animScale);
                SuaraRo.start();
            }
        });

    }
}
