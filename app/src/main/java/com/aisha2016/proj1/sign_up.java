package com.aisha2016.proj1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.HashMap;

public class sign_up extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        final EditText passNameSignUp = findViewById(R.id.passNameSignUp);
        final EditText passEmailSignUp = findViewById(R.id.passEmailSignUp);
        final EditText passPhoneSignUp = findViewById(R.id.passPhoneSignUp);
        final EditText passPassword1SignUp = findViewById(R.id.passPassword1SignUp);
        final EditText passPassword2SignUp = findViewById(R.id.passPassword2SignUp);
        ImageView signUp = findViewById(R.id.signUp);
        PassengerCRUD passcrud = new PassengerCRUD();

        signUp.setOnClickListener(v-> {
            /*Passenger pass = new Passenger(passNameSignUp.getText().toString(), passEmailSignUp.getText().toString(), passPhoneSignUp.getText().toString(), passPassword1SignUp.getText().toString(), passPassword2SignUp.getText().toString());
            passcrud.add(pass).addOnSuccessListener(suc->{
                Toast.makeText(this, "تم إنشاء حساب جديد", Toast.LENGTH_SHORT).show();
            }).addOnFailureListener(er->{
                Toast.makeText(this, "عذرا لقد حصل خطأ ما!"+er.getMessage(), Toast.LENGTH_SHORT).show();
            });*/

            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("name", passNameSignUp.getText().toString());
            passcrud.delete("MwLF4c0cSWwYqBW6jYw").addOnSuccessListener(suc->{
                Toast.makeText(this, "تم حذ1ف البيانات", Toast.LENGTH_SHORT).show();
            }).addOnFailureListener(er->{
                Toast.makeText(this, "عذرا لقد حصل خطأ ما!"+er.getMessage(), Toast.LENGTH_SHORT).show();
            });
                });

        //Drop down region menu

        /*Spinner regions = findViewById(R.id.region);
        spinner.setPrompt("اختر المنطقة");
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this , R.array.regions , android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        regions.setAdapter(adapter);
        regions.setOnItemSelectedListener(this);

        //
    }

    //Spinner's methods

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
        //Takig user's region
        String userRegion = parent.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {*/

    }
    }
