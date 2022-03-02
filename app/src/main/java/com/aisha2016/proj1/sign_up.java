package com.aisha2016.proj1;
///////////////////////////////////// باقي الفاليديشن /////////////////////////////////////
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.internal.ViewUtils;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.util.HashMap;

public class sign_up extends AppCompatActivity {
    private EditText passNameSignUp, passEmailSignUp, passPhoneSignUp, passPassword1SignUp,passPassword2SignUp;
    private TextView haveAcount ;
    private ImageView signUp;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        passNameSignUp = findViewById(R.id.passNameSignUp);
        passEmailSignUp = findViewById(R.id.passEmailSignUp);
        passPhoneSignUp = findViewById(R.id.passPhoneSignUp);
        passPassword1SignUp = findViewById(R.id.passPassword1SignUp);
        passPassword2SignUp = findViewById(R.id.passPassword2SignUp);
        haveAcount = findViewById(R.id.haveAccount);
        signUp = findViewById(R.id.signUp);
        auth = FirebaseAuth.getInstance();

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createUser();
            }
        });
    }
    private void createUser(){


        String name = passNameSignUp.getText().toString();
        String email = passEmailSignUp.getText().toString();
        String phoneNum = passPhoneSignUp.getText().toString();
        String pass1 = passPassword1SignUp.getText().toString();
        String pass2 = passPassword2SignUp.getText().toString();

        if (!name.isEmpty() && !email.isEmpty() && !phoneNum.isEmpty() && !pass1.isEmpty() && !pass2.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches() && pass1.equals(pass2)){
            auth.createUserWithEmailAndPassword(email,pass1).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {

                    Passenger pass = new Passenger(name, email, phoneNum, pass1, pass2);
                    pass.add(pass).addOnSuccessListener(suc -> {
                        Toast.makeText(sign_up.this, "تم إنشاء حساب جديد", Toast.LENGTH_SHORT).show();
                        startActivity( new Intent(sign_up.this,sign_in.class));
                        finish();
                    }) .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(sign_up.this, "عذرا لقد حصل خطأ بالمصادقة!" , Toast.LENGTH_SHORT).show();
                        }
                    });

                }
            });



        }
        else if (name.isEmpty() || email.isEmpty() || phoneNum.isEmpty() || pass1.isEmpty() || pass2.isEmpty()){
            Toast.makeText(this, "الرجاء تعبئة جميع الحقول المطلوبة", Toast.LENGTH_LONG).show();
        }
        else if (!pass1.equals(pass2)){ Toast.makeText(this, "كلمتا المرور غير متطابقتان!", Toast.LENGTH_LONG).show();
        }
        else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){ Toast.makeText(this, "الرجاء إدخال بريد إالكتروني صحيح", Toast.LENGTH_LONG).show();
        }



    }
      /*   signUp.setOnClickListener(v-> {



private void createUser(){


            String name = passNameSignUp.getText().toString();
            String email = passEmailSignUp.getText().toString();
            String phoneNum = passPhoneSignUp.getText().toString();
            String pass1 = passPassword1SignUp.getText().toString();
            String pass2 = passPassword2SignUp.getText().toString();

            if (!name.isEmpty() && !email.isEmpty() && !phoneNum.isEmpty() && !pass1.isEmpty() && !pass2.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches() && pass1.equals(pass2)){
                auth.createUserWithEmailAndPassword(email,pass1).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        Passenger pass = new Passenger(name, email, phoneNum, pass1, pass2);
                        pass.add(pass).addOnSuccessListener(suc -> {
                            Toast.makeText(sign_up.this, "تم إنشاء حساب جديد", Toast.LENGTH_SHORT).show();
                            Intent  intent = new Intent(sign_up.this,sign_in.class);
                            startActivity(intent);
                        }).addOnFailureListener(er -> {
                            Toast.makeText(sign_up.this, "عذرا لقد حصل خطأ ما!" + er.getMessage(), Toast.LENGTH_SHORT).show();
                        });                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(sign_up.this, "عذرا لقد حصل خطأ بالمصادقة!" , Toast.LENGTH_SHORT).show();
                    }
                });


            }
                else if (name.isEmpty() || email.isEmpty() || phoneNum.isEmpty() || pass1.isEmpty() || pass2.isEmpty()){
                Toast.makeText(this, "الرجاء تعبئة جميع الحقول المطلوبة", Toast.LENGTH_LONG).show();
                }
                else if (!pass1.equals(pass2)){ Toast.makeText(this, "كلمتا المرور غير متطابقتان!", Toast.LENGTH_LONG).show();
                }
                else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){ Toast.makeText(this, "الرجاء إدخال بريد إالكتروني صحيح", Toast.LENGTH_LONG).show();
            }






            /*Passenger pass = new Passenger(passNameSignUp.getText().toString(), passEmailSignUp.getText().toString(), passPhoneSignUp.getText().toString(), passPassword1SignUp.getText().toString(), passPassword2SignUp.getText().toString());
            pass.add(pass).addOnSuccessListener(suc -> {
                Toast.makeText(this, "تم إنشاء حساب جديد", Toast.LENGTH_SHORT).show();
                Intent  intent = new Intent(sign_up.this,sign_in.class);
                startActivity(intent);
            }).addOnFailureListener(er -> {
                Toast.makeText(this, "عذرا لقد حصل خطأ ما!" + er.getMessage(), Toast.LENGTH_SHORT).show();
            });*/

           /* HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("name", passNameSignUp.getText().toString());
            passcrud.delete("MwLF4c0cSWwYqBW6jYw").addOnSuccessListener(suc->{
                Toast.makeText(this, "تم حذ1ف البيانات", Toast.LENGTH_SHORT).show();
            }).addOnFailureListener(er->{
                Toast.makeText(this, "عذرا لقد حصل خطأ ما!"+er.getMessage(), Toast.LENGTH_SHORT).show();
            });
                });*/

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

      //  });
   // }

//f});
     //  f }



    public void goToSignIn(View view) {
        Intent  intent = new Intent(sign_up.this,sign_in.class);
        startActivity(intent);
    }
}

