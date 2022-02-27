package com.aisha2016.proj1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class type_subscription_interface extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_subscription_interface);

    }

    public void goTotransinformationUqu(View view) {
        Intent intent = new Intent(type_subscription_interface.this,transinformation.class);
        startActivity(intent);
    }

    public void goToCompanyCards(View view) {
        Intent intent = new Intent(type_subscription_interface.this,company.class);
        startActivity(intent);
    }
}