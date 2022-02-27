package com.aisha2016.proj1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class mainpage_admin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage_admin);
    }
    public void goToAddDriver(View view) {
        Intent intent = new Intent(mainpage_admin.this,add_driver.class);
        startActivity(intent);
    }

    public void goToAllDrivers(View view) {
        Intent intent = new Intent(mainpage_admin.this,drivers_interface.class);
        startActivity(intent);
    }

    public void goToEditProfile(View view) {
        Intent intent = new Intent(mainpage_admin.this,editprofile.class);
        startActivity(intent);
    }
}