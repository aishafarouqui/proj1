package com.aisha2016.proj1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class sign_in extends AppCompatActivity {

    private EditText passEmailSignIn, passPasswordSignIn;
    private TextView notHaveAcount ;
    private ImageView signIn;
    private FirebaseAuth auth;




   // private TextView m
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ///ai
        passEmailSignIn = findViewById(R.id.passEmailSignIn);
        passPasswordSignIn = findViewById(R.id.passPasswordSignIn);
        notHaveAcount = findViewById(R.id.notHaveAcount);
        signIn = findViewById(R.id.signInToMain);
        auth = FirebaseAuth.getInstance();

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginUser();
            }
        });

}

//ai
private void loginUser(){

    String email = passEmailSignIn.getText().toString();
    String pass = passPasswordSignIn.getText().toString();

    if (!email.isEmpty() && !pass.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()){
        auth.signInWithEmailAndPassword(email,pass).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
            @Override
            public void onSuccess(AuthResult authResult) {
                Toast.makeText(sign_in.this, "تم  تسجيل الدخول بنجاح", Toast.LENGTH_SHORT).show();
                startActivity( new Intent(sign_in.this,mainpage_passnenger.class));
                finish();
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(sign_in.this, "عذرا لقد حصل خطأ بالمصادقة!" , Toast.LENGTH_SHORT).show();
            }
        });



    }
    else if ( email.isEmpty() || pass.isEmpty() ){
        Toast.makeText(this, "الرجاء تعبئة جميع الحقول المطلوبة", Toast.LENGTH_LONG).show();
    }

    else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){ Toast.makeText(this, "الرجاء إدخال بريد إالكتروني صحيح", Toast.LENGTH_LONG).show();
    }



}

    //-----------------Intent--------------
    public void goToMainPass(View v) {
        Intent  intent = new Intent(sign_in.this,mainpage_passnenger.class);
        startActivity(intent);
    }

    public void goToSignUp (View v) {
        Intent  intent = new Intent(sign_in.this,sign_up.class);
        startActivity(intent);
    }


}

