package com.aisha2016.proj1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class my_trips extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_trips);
        ListView PassengersList = (ListView) findViewById(R.id.lv_my_trips);
        List listPass = new ArrayList();
        listPass.add("العزيزية - الزاهر (ذهاب)");
        listPass.add("العزيزية - الزاهر (ذهاب)");
        listPass.add("العزيزية - الزاهر (ذهاب)");
        listPass.add("العزيزية - الزاهر (ذهاب)");
        listPass.add("العزيزية - الزاهر (عودة)");
        listPass.add("العزيزية - الزاهر (عودة)");
        listPass.add("العزيزية - الزاهر (عودة)");
        listPass.add("العزيزية - الزاهر (عودة)");

        ArrayAdapter arrayPass = new ArrayAdapter(this,R.layout.lv_my_trips,R.id.trip_location,listPass);
        PassengersList.setAdapter(arrayPass);
    }
}