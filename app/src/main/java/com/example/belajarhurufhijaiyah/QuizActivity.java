package com.example.belajarhurufhijaiyah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class QuizActivity extends AppCompatActivity {
    ImageButton pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        pindah = (ImageButton) findViewById(R.id.menuquiz1);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuizActivity.this, QuizHijaiyah.class);
                startActivity(intent);
            }
        });

        pindah = (ImageButton) findViewById(R.id.menuquiz2);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuizActivity.this, QuizHijaiyah2.class);
                startActivity(intent);
            }
        });

        pindah = (ImageButton) findViewById(R.id.menuquiz3);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuizActivity.this, QuizHijaiyah3.class);
                startActivity(intent);
            }
        });

        pindah = (ImageButton) findViewById(R.id.back);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //suaraButton.start();
                Intent intent = new Intent(QuizActivity.this, MainActivity.class);
                startActivity(intent);
                //mp.stop();
            }
        });
    }
}
