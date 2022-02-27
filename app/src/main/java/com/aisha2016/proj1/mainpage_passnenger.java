package com.aisha2016.proj1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class mainpage_passnenger extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage_passnenger);
    }

    //الذهاب لصفحة رحلاتي
    public void goToMyPassTrips(View view) {
            Intent  intent = new Intent(mainpage_passnenger.this,pass_trips.class);
            startActivity(intent);

    }
    //الذهاب لصفحة تتبع المسار

    public void goToTrackMasarPass(View view) {
            //Intent  intent = new Intent(mainpage_passnenger.this,mainpage_passnenger.class);
            //startActivity(intent);

    }


    //الذهاب لصفحة البطاقة الالكترونية
    public void goToElcCard(View view) {
        Intent  intent = new Intent(mainpage_passnenger.this,electronic_card.class);
        startActivity(intent);
    }

    //الذهاب لصفحة الشركات
    public void goToCompanyType(View view) {
        Intent intent = new Intent(mainpage_passnenger.this,type_subscription_interface.class);
        startActivity(intent);
    }


    //الذهاب لصفحة البروفايل
    public void goToEditProfile(View view) {
        Intent  intent = new Intent(mainpage_passnenger.this,editprofile.class);
        startActivity(intent);
    }




}