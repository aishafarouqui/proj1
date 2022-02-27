package com.aisha2016.proj1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class mainpage_driver extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage_driver);
    }


    public void goToMyTripsDr(View view) {
        Intent  intent = new Intent(mainpage_driver.this,my_trips.class);
        startActivity(intent);
    }

    public void goToAllPassenger(View view) {
        Intent  intent = new Intent(mainpage_driver.this,pass.class);
        startActivity(intent);
    }

    public void goToEditProfile(View view) {
        Intent  intent = new Intent(mainpage_driver.this,editprofile.class);
        startActivity(intent);
    }


    public void goToAllDrivers(View view) {
            Intent  intent = new Intent(mainpage_driver.this,drivers_interface.class);
            startActivity(intent);
    }
}