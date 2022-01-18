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

public class HijaiyahIActivity3 extends AppCompatActivity {
    ImageView TampilGambar;
    ImageButton show,hide,pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hijaiyah_i3);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        TampilGambar = (ImageView) findViewById(R.id.kasroh_qi_pop);
        show = (ImageButton) findViewById(R.id.kasroh_qi);
        show = (ImageButton) findViewById(R.id.kasroh_ki);
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
        final MediaPlayer SuaraAlif = MediaPlayer.create(this, R.raw.kasroh_qi); //Memanggil nama lagu
        final MediaPlayer SuaraBa = MediaPlayer.create(this, R.raw.kasroh_ki);
        final MediaPlayer SuaraTa = MediaPlayer.create(this, R.raw.kasroh_li);
        final MediaPlayer SuaraSa = MediaPlayer.create(this, R.raw.kasroh_mi);
        final MediaPlayer SuaraJim = MediaPlayer.create(this, R.raw.kasroh_ni);
        final MediaPlayer SuaraHa = MediaPlayer.create(this, R.raw.kasroh_wi);
        final MediaPlayer SuaraKho = MediaPlayer.create(this, R.raw.kasroh_hi);
        final MediaPlayer SuaraDal = MediaPlayer.create(this, R.raw.kasroh_yi);

        ImageButton ButtonSuara = (ImageButton) this.findViewById(R.id.kasroh_qi); //fariabel button
        ImageButton ButtonSuara2 = (ImageButton) this.findViewById(R.id.kasroh_ki);
        ImageButton ButtonSuara3 = (ImageButton) this.findViewById(R.id.kasroh_li);
        ImageButton ButtonSuara4 = (ImageButton) this.findViewById(R.id.kasroh_mi);
        ImageButton ButtonSuara5 = (ImageButton) this.findViewById(R.id.kasroh_ni);
        ImageButton ButtonSuara6 = (ImageButton) this.findViewById(R.id.kasroh_wi);
        ImageButton ButtonSuara7 = (ImageButton) this.findViewById(R.id.kasroh_hii);
        ImageButton ButtonSuara8 = (ImageButton) this.findViewById(R.id.kasroh_yi);

        /*Biar suara hidup */
        ButtonSuara.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.kasroh_qi_pop);
                TampilGambar.startAnimation(animScale);
                SuaraAlif.start();
            }
        });

        ButtonSuara2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.kasroh_ki_pop);
                TampilGambar.startAnimation(animScale);
                SuaraBa.start();
            }
        });

        ButtonSuara3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.kasroh_li_pop);
                TampilGambar.startAnimation(animScale);
                SuaraTa.start();
            }
        });

        ButtonSuara4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.kasroh_mi_pop);
                TampilGambar.startAnimation(animScale);
                SuaraSa.start();
            }
        });
        ButtonSuara5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.kasroh_ni_pop);
                TampilGambar.startAnimation(animScale);
                SuaraJim.start();
            }
        });
        ButtonSuara6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.kasroh_wi_pop);
                TampilGambar.startAnimation(animScale);
                SuaraHa.start();
            }
        });
        ButtonSuara7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.kasroh_hii_pop);
                TampilGambar.startAnimation(animScale);
                SuaraKho.start();
            }
        });

        ButtonSuara8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.kasroh_yi_pop);
                TampilGambar.startAnimation(animScale);
                SuaraDal.start();
            }
        });

    }
}
