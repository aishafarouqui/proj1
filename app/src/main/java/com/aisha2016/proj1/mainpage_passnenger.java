package com.aisha2016.proj1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class mainpage_passnenger extends AppCompatActivity {
DatabaseReference database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage_passnenger);



    }

    //الذهاب لصفحة رحلاتي
    public void goToMyPassTrips(View view) {
            Intent  intent = new Intent(mainpage_passnenger.this,pass_trips.class);
      /*  Intent data = getIntent();
        String id = data.getExtras().getString("id");

        database = FirebaseDatabase.getInstance().getReference().child("email").child(id);
        database.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String name = dataSnapshot.child("name").getValue().toString();
                String email = dataSnapshot.child("email").getValue().toString();
                String phone = dataSnapshot.child("phone").getValue().toString();
                Toast.makeText(mainpage_passnenger.this, ""+name+email+phone, Toast.LENGTH_LONG).show();


            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(mainpage_passnenger.this, "VV", Toast.LENGTH_LONG).show();

            }
        });*/
            startActivity(intent);
////


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

    public void goToSetting(View view) {
        Intent  intent = new Intent(mainpage_passnenger.this,settings_interface.class);
        startActivity(intent);
    }


}