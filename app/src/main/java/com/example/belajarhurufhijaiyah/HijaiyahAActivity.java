package com.example.belajarhurufhijaiyah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HijaiyahAActivity extends AppCompatActivity {
    ImageButton pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hijaiyah_a);

        pindah = (ImageButton) findViewById(R.id.menubha1);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //suaraButton.start();
                Intent intent = new Intent(HijaiyahAActivity.this, HijaiyahAActivity1.class);
                startActivity(intent);
                //mp.stop();
            }
        });

        pindah = (ImageButton) findViewById(R.id.menubha2);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //suaraButton.start();
                Intent intent = new Intent(HijaiyahAActivity.this, HijaiyahAActivity2.class);
                startActivity(intent);
                //mp.stop();
            }
        });

        pindah = (ImageButton) findViewById(R.id.menubha3);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //suaraButton.start();
                Intent intent = new Intent(HijaiyahAActivity.this, HijaiyahAActivity3.class);
                startActivity(intent);
                //mp.stop();
            }
        });
    }
}
