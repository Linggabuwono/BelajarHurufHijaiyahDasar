package com.example.belajarhurufhijaiyah;

import java.util.Random;

public class SoalQuiz {

    private int listhuruf[] = {
            R.drawable.ainpop,
            R.drawable.bapop,
            R.drawable.tapop,
            R.drawable.haapop,
            R.drawable.jimpop,
            R.drawable.thapop,
            R.drawable.waupop,
            R.drawable.tsapop,
            R.drawable.qafpop,
            R.drawable.lampop,
            R.drawable.mimpop,
            R.drawable.nunpop,
            R.drawable.hapop,
            R.drawable.alifpop,
            R.drawable.rapop,
            R.drawable.zaipop,
            R.drawable.yapop,
            R.drawable.khapop,
            R.drawable.dalpop,
            R.drawable.shadpop
    };

    private int listhuruf2[] = {
            R.drawable.fatah_aa,
            R.drawable.fatah_ba,
            R.drawable.fatah_ta,
            R.drawable.fatah_haa,
            R.drawable.fatah_ja,
            R.drawable.fatah_tho,
            R.drawable.fatah_wa,
            R.drawable.fatah_tsa,
            R.drawable.fatah_qa,
            R.drawable.fatah_la,
            R.drawable.fatah_ma,
            R.drawable.fatah_na,
            R.drawable.fatah_ha,
            R.drawable.fatah_a,
            R.drawable.fatah_ra,
            R.drawable.fatah_za,
            R.drawable.fatah_ya,
            R.drawable.fatah_kha,
            R.drawable.fatah_da,
            R.drawable.fatah_sha
    };

    public int[] getlist(){
        return listhuruf;
    }
    public int[] getlist2(){
        return listhuruf2;
    }

    public int getrandomhuruf(){
        int rnd = new Random().nextInt(listhuruf.length);
        return rnd;
    }

    public int getimagesoal(int i){
        return listhuruf[i];
    }

    public int getimagejwbn(int i){
        return listhuruf2[i];
    }

    public int getjumlah(){
        return listhuruf.length;
    }
    public int getjumlah2(){
        return listhuruf2.length;
    }
}
