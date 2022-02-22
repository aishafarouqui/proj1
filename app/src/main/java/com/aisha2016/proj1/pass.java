package com.aisha2016.proj1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class pass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass);
        ListView PassengersList = (ListView) findViewById(R.id.lv_passenger);
        List listPass = new ArrayList();
        listPass.add("نور الحافظ");
        listPass.add("فاطمة بيات");
        listPass.add("عائشة فاروقي");
        listPass.add("امل العمري");
        listPass.add("نور الحافظ");
        listPass.add("نور الحافظ");
        listPass.add("فاطمة بيات");
        listPass.add("عائشة فاروقي");
        listPass.add("امل العمري");
        listPass.add("نور الحافظ");
        listPass.add("نور الحافظ");
        listPass.add("فاطمة بيات");
        listPass.add("عائشة فاروقي");
        listPass.add("امل العمري");
        listPass.add("نور الحافظ");
        listPass.add("نور الحافظ");
        listPass.add("نور الحافظ");
        listPass.add("نور الحافظ");

       // ArrayAdapter arrayPass = new ArrayAdapter(this,android.R.layout.simple_list_item_1,listPass);
        ArrayAdapter arrayPass = new ArrayAdapter(this,R.layout.lv_passenger,R.id.tvPassTrips,listPass);
        PassengersList.setAdapter(arrayPass);
    }


}