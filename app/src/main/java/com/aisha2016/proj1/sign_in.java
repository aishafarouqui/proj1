package com.aisha2016.proj1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class sign_in extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


}
    public void goToMainPass(View v) {
        Intent  intent = new Intent(sign_in.this,mainpage_passnenger.class);
        startActivity(intent);
    }

    public void goToSignUp (View v) {
        Intent  intent = new Intent(sign_in.this,sign_up.class);
        startActivity(intent);
    }


}

