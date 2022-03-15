package com.aisha2016.proj1;

import android.widget.ImageView;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class Companies implements Serializable {
    private String name,price/*,evaluation,email*/;
    /*private ImageView logo;*/
   // private float evaluation;
   // private String email;

    public Companies(/*String email, String evaluation, */String name, /*ImageView logo, */String price ) {
        /*this.logo = logo;*/
        //this.email = email;
        //this.evaluation = evaluation;
        this.name = name;
        this.price = price;

    }
//Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   /* public ImageView getLogo() {
        return logo;
    }

    public void setLogo(ImageView logo) {
        this.logo = logo;
    }*/

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    /*public String getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }*/


/*
    public void addDriver(String name, String email, String phone, String password, String region, String busNum, String busplateNum, Companies comp){
        Driver driver = new Driver(name ,email, phone, password, region, busNum, busplateNum, comp);
    }
    FirebaseDatabase db = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = db.getReference(Companies.class.getSimpleName());

    public Task<Void> add(Companies comp){
        return databaseReference.push().setValue(comp);
    }

    public Task<Void> update(String key, HashMap<String, Object> hashMap ){
        return databaseReference.child(key).updateChildren(hashMap);    }

    public Task<Void> delete(String key){
        return databaseReference.child(key).removeValue();
    }*/

}
