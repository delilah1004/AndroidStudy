package com.appcenter_d.delilahapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Handler hd = new Handler();
        hd.postDelayed(new splashhandler(), 3000); //1초 후에 hd handler 실행 3000ms=3초
    }

    private class splashhandler implements Runnable {
        public void run() {
            startActivity(new Intent(getApplication(), MainActivity.class)); //로딩이 끝난 후, ChoiceFunction 이동
            Splash.this.finish(); //로딩페이지 Activity stack에서 제거
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        //초반 플래시 화면에서 넘어갈 때 뒤로가기 버튼 못 누르게 함
    }
}
