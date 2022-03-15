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
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;


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
                Toast.makeText(sign_in.this, "لا يوجد حساب مرتبط بهذا البريد!" , Toast.LENGTH_SHORT).show();
            }
        });



    }
    else if ( email.isEmpty() || pass.isEmpty() ){
        Toast.makeText(this, "الرجاء تعبئة جميع الحقول المطلوبة", Toast.LENGTH_LONG).show();
    }

    else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){ Toast.makeText(this, "الرجاء إدخال بريد إالكتروني صحيح", Toast.LENGTH_LONG).show();
    }
//AAAI 9may

    if ((email.isEmpty())|pass.isEmpty()){
        isUser();
    } //END AAAI 9may

}
//AAAI 9may
    private void isUser() {

        String userEnteredEmail = passEmailSignIn.getText().toString().trim();
        String userEnteredpass = passPasswordSignIn.getText().toString().trim();

        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("passenger");

        Query checkUser = reference.orderByChild("email").equalTo(userEnteredEmail);
        checkUser.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
             if(snapshot.exists()) {

                 passEmailSignIn.setError(null);
               //  passEmailSignIn.setErrorEnabled(false);

                 String passwordFromDB = snapshot.child(userEnteredEmail).child("password").getValue(String.class);

                 if(passwordFromDB.equals(userEnteredpass)){
                     passEmailSignIn.setError(null);
                 //    passEmailSignIn.setErrorEnabled(false);

                     String emailFromDB = snapshot.child(userEnteredEmail).child("email").getValue(String.class);
                     String nameFromDB = snapshot.child(userEnteredEmail).child("name").getValue(String.class);
                     String phonFromDB = snapshot.child(userEnteredEmail).child("phon").getValue(String.class);
                     String regionFromDB = snapshot.child(userEnteredEmail).child("region").getValue(String.class);

                     Toast.makeText(sign_in.this, ""+emailFromDB+ nameFromDB +phonFromDB , Toast.LENGTH_SHORT).show();

                     Intent intent = new Intent(getApplicationContext(),editprofile.class);
                     intent.putExtra("name",nameFromDB);
                     intent.putExtra("email",emailFromDB);
                     intent.putExtra("phon",phonFromDB);
                     intent.putExtra("region",regionFromDB);
                     intent.putExtra("password",passwordFromDB);
                     startActivity(intent);


                 }
                 else {
                     passPasswordSignIn.setError("wrong password");
                     passPasswordSignIn.requestFocus();
                 }

             }
             else {
                 passEmailSignIn.setError("no sach email exist");
                 passEmailSignIn.requestFocus();
             }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        //END AAAI 9may
    }

    //-----------------Intent-------------- على حسب الايميل رح نوجهه للمينبيج المناسب اذا ادمن او باسس او درايفر
    public void goToMainPass(View v) {
        Intent  intent = new Intent(sign_in.this,mainpage_passnenger.class);
        intent.putExtra("id",""+passEmailSignIn);
        startActivity(intent);
    }

    public void goToSignUp (View v) {
        Intent  intent = new Intent(sign_in.this,sign_up.class);
        startActivity(intent);
    }


  /*  public void addcomp(View view) {
            Companies comp = new Companies("السامر" , "350", 3, "alsamer@gmail.com");
            comp.add(comp);
            Companies comp1 = new Companies("رواحل المسك" , "600", 5, "rawahelalmisk@gmail.com");
            comp.add(comp1); */

            /*.addOnSuccessListener(suc -> {
            Toast.makeText(sign_in.this, "تم إنشاء حساب جديد", Toast.LENGTH_SHORT).show();
            startActivity( new Intent(sign_in.this,sign_in.class));
            finish();
        }) .addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(sign_in.this, "عذرا لقد حصل خطأ بالمصادقة!" , Toast.LENGTH_SHORT).show();
            }
        });*/
    }
//}

