package com.aisha2016.proj1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class drivers_interface extends AppCompatActivity {

    //ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drivers_interface);


        ListView PassengersList = (ListView) findViewById(R.id.listView);
        List listPass = new ArrayList();
        //اجيب البيانات من الداتابيس ك اوبجكت وناخد البيانات من الاوبجكتس
        listPass.add("ابو صالح");
        listPass.add("ابو محمد");
        listPass.add("ابو احمد");
        listPass.add("ابو خالد");
        listPass.add("ابو عثمان");
        listPass.add("ابو عيسى");
        listPass.add("ابو طارق");
        listPass.add("ابو صالح");


        /*ListView PassengersList2 = (ListView) findViewById(R.id.imageView);
    List listPass2 = new ArrayList();

    listPass2.add(R.drawable.profile_icon);
    listPass2.add(R.drawable.home);
    listPass2.add(R.drawable.profile_icon);
    listPass2.add(R.drawable.profile_icon);*/

        // ArrayAdapter arrayPass = new ArrayAdapter(this,android.R.layout.simple_list_item_1,listPass);
        ArrayAdapter arrayPass = new ArrayAdapter(this,R.layout.lv_drivers2,R.id.textView,listPass);
        PassengersList.setAdapter(arrayPass);



        /*
        listView.findViewById(R.id.listView);

        List<String> title= new ArrayList<>();
        List<Integer> image= new ArrayList<>();


        title.add("نور محمد الحافظ");
        title.add("عائشة عبدالقدوس فاروقي");
        title.add("فاطمة مصطفى بيات");
        title.add("امل الغريب العمري");

        image.add(R.drawable.profile_icon);
        image.add(R.drawable.profile_icon);
        image.add(R.drawable.profile_icon);
        image.add(R.drawable.profile_icon);




        MyAdapter myAdapter= new MyAdapter(this,title,image);
        listView.setAdapter(myAdapter);

         */



    }


}




