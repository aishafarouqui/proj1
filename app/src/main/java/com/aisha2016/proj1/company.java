package com.aisha2016.proj1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class company extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_company);
        ListView PassengersList = (ListView) findViewById(R.id.lv_company);
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
        ArrayAdapter arrayPass = new ArrayAdapter(this,R.layout.lv_company,R.id.comp_name,listPass);
        PassengersList.setAdapter(arrayPass);
    }
}