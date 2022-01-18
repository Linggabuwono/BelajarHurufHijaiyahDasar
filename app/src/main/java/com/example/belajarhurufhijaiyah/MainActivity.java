package com.example.belajarhurufhijaiyah;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton pindah;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer suaraButton = MediaPlayer.create(this, R.raw.button);

        pindah = (ImageButton) findViewById(R.id.buttonbelajar);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //suaraButton.start();
                Intent intent = new Intent(MainActivity.this, BelajarActivity.class);
                startActivity(intent);
                //mp.stop();
            }
        });

        pindah = (ImageButton) findViewById(R.id.buttonquiz);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //suaraButton.start();
                Intent intent = new Intent(MainActivity.this,QuizActivity.class);
                startActivity(intent);
                //mp.stop();
            }
        });
    }
}
