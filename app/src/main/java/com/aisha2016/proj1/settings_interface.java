package com.aisha2016.proj1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class settings_interface extends AppCompatActivity {
    private   Button sign_outbtn ;
    private TextView deletAcount;
    private  FirebaseAuth auth;
    private FirebaseUser user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_interface);

        sign_outbtn= findViewById(R.id.logoutbuttun);
        deletAcount=findViewById(R.id.delAccount);
        auth= FirebaseAuth.getInstance();
        user= auth.getCurrentUser();


//delet acount
        deletAcount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog = new  AlertDialog.Builder(settings_interface.this);
                dialog.setTitle("هل أنت متأكد من حذف الحساب؟!");
                dialog.setMessage("لن تستطيع تسجيل الدخول بهذا الحساب عند حذفه");

                 dialog.setPositiveButton("حذف", new DialogInterface.OnClickListener() {
                     @Override
                     public void onClick(DialogInterface dialog, int which) {
                         user.delete().addOnCompleteListener(new OnCompleteListener<Void>() {
                             @Override
                             public void onComplete(@NonNull Task<Void> task) {
                                 if (task.isSuccessful()){
                                     Toast.makeText(settings_interface.this, "تم حذف الحساب بنجاح", Toast.LENGTH_SHORT).show();
                                     Intent intent = new Intent(settings_interface.this,sign_in.class);
                                     startActivity(intent);
                                     finish();
                                 }else {
                                     Toast.makeText(settings_interface.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                                 }
                             }
                         });
                     }
                 });

                dialog.setNegativeButton("إلغاء", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }) ;
                AlertDialog alertDialog= dialog.create();
                alertDialog.show();
            }
        });


// sign out
        sign_outbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intent =new Intent(settings_interface.this,sign_in.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);

            }
        });



    }


    public void goToInvoice (View v) {
        Intent intent = new Intent(settings_interface.this,invoice.class);
        startActivity(intent);
    }
}

