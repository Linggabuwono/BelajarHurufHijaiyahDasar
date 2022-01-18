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

public class HijaiyahAActivity3 extends AppCompatActivity {
    ImageView TampilGambar;
    ImageButton show,hide,pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hijaiyah_a3);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        TampilGambar = (ImageView) findViewById(R.id.fatah_qa_pop);
        show = (ImageButton) findViewById(R.id.fatah_qa);
        show = (ImageButton) findViewById(R.id.fatah_ka);
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
        final MediaPlayer SuaraAlif = MediaPlayer.create(this, R.raw.fatah_qo); //Memanggil nama lagu
        final MediaPlayer SuaraBa = MediaPlayer.create(this, R.raw.fatah_ka);
        final MediaPlayer SuaraTa = MediaPlayer.create(this, R.raw.fatah_la);
        final MediaPlayer SuaraSa = MediaPlayer.create(this, R.raw.fatah_ma);
        final MediaPlayer SuaraJim = MediaPlayer.create(this, R.raw.fatah_na);
        final MediaPlayer SuaraHa = MediaPlayer.create(this, R.raw.fatah_wa);
        final MediaPlayer SuaraKho = MediaPlayer.create(this, R.raw.fatah_haa);
        final MediaPlayer SuaraDal = MediaPlayer.create(this, R.raw.fatah_ya);

        ImageButton ButtonSuara = (ImageButton) this.findViewById(R.id.fatah_qa); //fariabel button
        ImageButton ButtonSuara2 = (ImageButton) this.findViewById(R.id.fatah_ka);
        ImageButton ButtonSuara3 = (ImageButton) this.findViewById(R.id.fatah_la);
        ImageButton ButtonSuara4 = (ImageButton) this.findViewById(R.id.fatah_ma);
        ImageButton ButtonSuara5 = (ImageButton) this.findViewById(R.id.fatah_na);
        ImageButton ButtonSuara6 = (ImageButton) this.findViewById(R.id.fatah_wa);
        ImageButton ButtonSuara7 = (ImageButton) this.findViewById(R.id.fatah_haa);
        ImageButton ButtonSuara8 = (ImageButton) this.findViewById(R.id.fatah_ya);

        /*Biar suara hidup */
        ButtonSuara.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.fatah_qa_pop);
                TampilGambar.startAnimation(animScale);
                SuaraAlif.start();
            }
        });

        ButtonSuara2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.fatah_ka_pop);
                TampilGambar.startAnimation(animScale);
                SuaraBa.start();
            }
        });

        ButtonSuara3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.fatah_la_pop);
                TampilGambar.startAnimation(animScale);
                SuaraTa.start();
            }
        });

        ButtonSuara4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.fatah_ma_pop);
                TampilGambar.startAnimation(animScale);
                SuaraSa.start();
            }
        });
        ButtonSuara5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.fatah_na_pop);
                TampilGambar.startAnimation(animScale);
                SuaraJim.start();
            }
        });
        ButtonSuara6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.fatah_wa_pop);
                TampilGambar.startAnimation(animScale);
                SuaraHa.start();
            }
        });
        ButtonSuara7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.fatah_haa_pop);
                TampilGambar.startAnimation(animScale);
                SuaraKho.start();
            }
        });

        ButtonSuara8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.fatah_ya_pop);
                TampilGambar.startAnimation(animScale);
                SuaraDal.start();
            }
        });
    }
}
