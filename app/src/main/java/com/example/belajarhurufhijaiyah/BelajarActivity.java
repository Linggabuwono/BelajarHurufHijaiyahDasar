package com.example.belajarhurufhijaiyah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class BelajarActivity extends AppCompatActivity {
    ImageButton pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar);

        pindah = (ImageButton) findViewById(R.id.menubhd);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //suaraButton.start();
                Intent intent = new Intent(BelajarActivity.this, HijaiyahDasarActivity.class);
                startActivity(intent);
                //mp.stop();
            }
        });

        pindah = (ImageButton) findViewById(R.id.menubha);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //suaraButton.start();
                Intent intent = new Intent(BelajarActivity.this, HijaiyahAActivity.class);
                startActivity(intent);
                //mp.stop();
            }
        });

        pindah = (ImageButton) findViewById(R.id.menubhi);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //suaraButton.start();
                Intent intent = new Intent(BelajarActivity.this, HijaiyahIActivity.class);
                startActivity(intent);
                //mp.stop();
            }
        });

        pindah = (ImageButton) findViewById(R.id.menubhu);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //suaraButton.start();
                Intent intent = new Intent(BelajarActivity.this, HijaiyahUActivity.class);
                startActivity(intent);
                //mp.stop();
            }
        });
    }
}
