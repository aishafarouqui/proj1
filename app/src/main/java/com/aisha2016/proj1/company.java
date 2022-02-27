package com.aisha2016.proj1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class company extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_company);
        ListView PassengersList = (ListView) findViewById(R.id.lv_company);
        ArrayList<Companies> listPass = new ArrayList();
        //نجيب البيانات من الداتابيس ك اوبجكت وناخد البيانات من الاوبجكتس
        /*listPass.add("ابو صالح");
        listPass.add("ابو صالح");
        listPass.add("ابو صالح");
        listPass.add("ابو صالح");
        listPass.add("ابو صالح");
        listPass.add("ابو صالح");
        listPass.add("ابو صالح");
        listPass.add("ابو صالح");*/

        // ArrayAdapter arrayPass = new ArrayAdapter(this,android.R.layout.simple_list_item_1,listPass);
        ArrayAdapter arrayPass = new ArrayAdapter(this,R.layout.lv_company,R.id.comp_name,listPass);
        PassengersList.setAdapter(arrayPass);

    }

    public void getView (int position, View selectedComp, ViewGroup parent){
        LayoutInflater inflater = getLayoutInflater();
        View row = inflater.inflate(R.layout.lv_company, parent, false);
        TextView compName = (TextView) row.findViewById(R.id.comp_name);
        TextView subscPrice = (TextView) row.findViewById(R.id.subscPrice);
        ImageView logo = (ImageView) row.findViewById(R.id.logo);
        Button displayCompInfo = (Button) row.findViewById(R.id.displayCompInfo);
        //Companies comp = listPass.get(position);



    }
}