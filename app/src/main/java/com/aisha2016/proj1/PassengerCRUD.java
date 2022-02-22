package com.aisha2016.proj1;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class PassengerCRUD {
    private DatabaseReference databaseReference;
    public PassengerCRUD(){
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        databaseReference = db.getReference(Passenger.class.getSimpleName());
    }

    public Task<Void> add(Passenger pass){
        return databaseReference.push().setValue(pass);
    }

    public Task<Void> update(String key, HashMap<String, Object> hashMap ){
        return databaseReference.child(key).updateChildren(hashMap);    }

    public Task<Void> delete(String key){
        return databaseReference.child(key).removeValue();
    }


}
