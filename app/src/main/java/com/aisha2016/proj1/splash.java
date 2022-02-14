package com.aisha2016.proj1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        // thread();
        // }
        // private void thread(){
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(5000);

                    //Intent intent = new Intent(splash.this,SignUp.class);
                    Intent intent = new Intent(getApplicationContext(),sign_in.class);
                    startActivity(intent);
                    finish();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };
        thread.start();
    }
}