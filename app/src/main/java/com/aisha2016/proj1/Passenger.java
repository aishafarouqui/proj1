package com.aisha2016.proj1;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class Passenger {
    private String name;
    private String email;
    private String password;
    private String phone;
    private String region;
    private String subsType;

    public Passenger() {
    }

    public Passenger(String name, String email, String phone, String password, String region) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.region = region;
    }

    public String getSubsType() {
        return subsType;
    }

    public void setSubsType(String subsType) {
        this.subsType = subsType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }


    FirebaseDatabase db = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = db.getReference(Passenger.class.getSimpleName());

    public Task<Void> add(Passenger pass){
        return databaseReference.push().setValue(pass);
    }

    public Task<Void> update(String key, HashMap<String, Object> hashMap ){
        return databaseReference.child(key).updateChildren(hashMap);    }

    public Task<Void> delete(String key){
        return databaseReference.child(key).removeValue();
    }



}
