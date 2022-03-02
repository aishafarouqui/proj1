package com.aisha2016.proj1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class sign_in extends AppCompatActivity {

    private EditText mEmail, mPass;
   // private TextView m
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


}

    //-----------------Intent--------------
    public void goToMainPass(View v) {
        Intent  intent = new Intent(sign_in.this,mainpage_passnenger.class);
        startActivity(intent);
    }

    public void goToSignUp (View v) {
        Intent  intent = new Intent(sign_in.this,sign_up.class);
        startActivity(intent);
    }


}

