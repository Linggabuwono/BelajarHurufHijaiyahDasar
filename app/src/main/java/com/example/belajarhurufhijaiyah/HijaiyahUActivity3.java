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

public class HijaiyahUActivity3 extends AppCompatActivity {
    ImageView TampilGambar;
    ImageButton show,hide,pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hijaiyah_u3);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        TampilGambar = (ImageView) findViewById(R.id.domah_qu_pop);
        show = (ImageButton) findViewById(R.id.domah_ku);
        show = (ImageButton) findViewById(R.id.domah_lu);
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
        final MediaPlayer SuaraAlif = MediaPlayer.create(this, R.raw.qu); //Memanggil nama lagu
        final MediaPlayer SuaraBa = MediaPlayer.create(this, R.raw.ku);
        final MediaPlayer SuaraTa = MediaPlayer.create(this, R.raw.lu);
        final MediaPlayer SuaraSa = MediaPlayer.create(this, R.raw.mu);
        final MediaPlayer SuaraJim = MediaPlayer.create(this, R.raw.nu);
        final MediaPlayer SuaraHa = MediaPlayer.create(this, R.raw.wu);
        final MediaPlayer SuaraKho = MediaPlayer.create(this, R.raw.huu);
        final MediaPlayer SuaraDal = MediaPlayer.create(this, R.raw.yu);

        ImageButton ButtonSuara = (ImageButton) this.findViewById(R.id.domah_qu); //fariabel button
        ImageButton ButtonSuara2 = (ImageButton) this.findViewById(R.id.domah_ku);
        ImageButton ButtonSuara3 = (ImageButton) this.findViewById(R.id.domah_lu);
        ImageButton ButtonSuara4 = (ImageButton) this.findViewById(R.id.domah_mu);
        ImageButton ButtonSuara5 = (ImageButton) this.findViewById(R.id.domah_nu);
        ImageButton ButtonSuara6 = (ImageButton) this.findViewById(R.id.domah_wu);
        ImageButton ButtonSuara7 = (ImageButton) this.findViewById(R.id.domah_huu);
        ImageButton ButtonSuara8 = (ImageButton) this.findViewById(R.id.domah_yu);

        /*Biar suara hidup */
        ButtonSuara.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.domah_qu_pop);
                TampilGambar.startAnimation(animScale);
                SuaraAlif.start();
            }
        });

        ButtonSuara2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.domah_ku_pop);
                TampilGambar.startAnimation(animScale);
                SuaraBa.start();
            }
        });

        ButtonSuara3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.domah_lu_pop);
                TampilGambar.startAnimation(animScale);
                SuaraTa.start();
            }
        });

        ButtonSuara4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.domah_mu_pop);
                TampilGambar.startAnimation(animScale);
                SuaraSa.start();
            }
        });
        ButtonSuara5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.domah_nu_pop);
                TampilGambar.startAnimation(animScale);
                SuaraJim.start();
            }
        });
        ButtonSuara6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.domah_wu_pop);
                TampilGambar.startAnimation(animScale);
                SuaraHa.start();
            }
        });
        ButtonSuara7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.domah_huu_pop);
                TampilGambar.startAnimation(animScale);
                SuaraKho.start();
            }
        });

        ButtonSuara8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.domah_yu_pop);
                TampilGambar.startAnimation(animScale);
                SuaraDal.start();
            }
        });

        pindah = (ImageButton) findViewById(R.id.back);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //suaraButton.start();
                Intent intent = new Intent(HijaiyahUActivity3.this, HijaiyahUActivity.class);
                startActivity(intent);
                //mp.stop();
            }
        });

    }
}
