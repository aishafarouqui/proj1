package com.aisha2016.proj1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class pass_trips extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass_trips);
        ListView PassengersList = (ListView) findViewById(R.id.lvPassTrips);
        List listPass = new ArrayList();
        //نجيب البيانات من الداتابيس ك اوبجكت وناخد البيانات من الاوبجكتس
        listPass.add("ابو صالح");
        listPass.add("ابو صالح");
        listPass.add("ابو صالح");
        listPass.add("ابو صالح");
        listPass.add("ابو صالح");
        listPass.add("ابو صالح");
        listPass.add("ابو صالح");
        listPass.add("ابو صالح");

        // ArrayAdapter arrayPass = new ArrayAdapter(this,android.R.layout.simple_list_item_1,listPass);
        ArrayAdapter arrayPass = new ArrayAdapter(this,R.layout.lv_pass_trips,R.id.tvPassTrips,listPass);
        PassengersList.setAdapter(arrayPass);
    }
}