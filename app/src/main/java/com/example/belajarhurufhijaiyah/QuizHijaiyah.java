package com.example.belajarhurufhijaiyah;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class QuizHijaiyah extends AppCompatActivity {
    ImageButton pilih;
    ImageButton jawaban1,jawaban2,jawaban3;
    ImageView soal;
    int s,s1,j1,j2,j3;
    int nilai=0;

    SoalQuiz hijaiyah = new SoalQuiz();
    int n = hijaiyah.getjumlah();

    boolean jawabanbenar = true;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_hijaiyah);

        soal = (ImageView) findViewById(R.id.soal);
        jawaban1 = (ImageButton) findViewById(R.id.jawaban1);
        jawaban2 = (ImageButton) findViewById(R.id.jawaban2);
        jawaban3 = (ImageButton) findViewById(R.id.jawaban3);

        final MediaPlayer SuaraButton = MediaPlayer.create(this, R.raw.button);
        newlevel();

        jawaban1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isCorrect(j1 ==s);
            }
        });

        jawaban2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isCorrect(j2 ==s);
            }
        });

        jawaban3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isCorrect(j3 ==s);
            }
        });
    }

    public void newlevel(){
        s = hijaiyah.getrandomhuruf();
        s1 = hijaiyah.getrandomhuruf();
        int i = new Random().nextInt(3) + 1;

        if(i==1){
            j1 = s;
        }
        else{
            j1 = hijaiyah.getrandomhuruf();
        }

        if(i ==2){
            j2 = s;
        }
        else {
            j2 = hijaiyah.getrandomhuruf();
        }
        if(i ==3){
            j3 = s;
        }
        else{
            j3 = hijaiyah.getrandomhuruf();
        }

        soal.setBackgroundResource(hijaiyah.getimagesoal(s));
        jawaban1.setBackgroundResource(hijaiyah.getimagejwbn(j1));
        jawaban2.setBackgroundResource(hijaiyah.getimagejwbn(j2));
        jawaban3.setBackgroundResource(hijaiyah.getimagejwbn(j3));
    }

    public void isCorrect(boolean input){
        TextView tampilSkor =(TextView) findViewById(R.id.nilai);

        if(input && i <n){
            MediaPlayer benar = MediaPlayer.create(getBaseContext(),R.raw.benar);
            nilai +=10;
            benar.start();
            newlevel();
            i++;
        }else{
            MediaPlayer salah = MediaPlayer.create(getBaseContext(),R.raw.salah);
            nilai -=5;
            salah.start();
        }

        tampilSkor.setText("SKOR : "+ nilai);
    }

}
