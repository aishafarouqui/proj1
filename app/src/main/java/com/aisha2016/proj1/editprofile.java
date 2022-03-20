package com.aisha2016.proj1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import javax.annotation.Nullable;

//import io.reactivex.annotations.NonNull;

public class editprofile extends AppCompatActivity {
    EditText name, email, password, region, phoneNum;
   /* ImageView photo;
    EditText name, email, password, region, phoneNum;
    FirebaseStorage storage;
    FirebaseAuth auth;
    FirebaseDatabase database;*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editprofile);

        // AAAI 9may
        name = findViewById(R.id.passNameSignUp);
        email = findViewById(R.id.passEmailSignUp);
        password = findViewById(R.id.passPassword1SignUp);
       // region = findViewById(R.id.region);
        phoneNum = findViewById(R.id.passPhoneSignUp);
         //show all data
          ShoeAllData(); //END AAAI 9may


    }
    // AAAI 9may
    private void ShoeAllData() {
        Intent intent = getIntent();
        String user_username  = intent.getStringExtra("name");
        String user_useremail  = intent.getStringExtra("email");
        String user_userphon  = intent.getStringExtra("phon");
        String user_userpassword = intent.getStringExtra("password");
        String user_userregion  = intent.getStringExtra("region");

        name.setText(user_username);
        email.setText(user_useremail);
        password.setText(user_userphon);
        phoneNum.setText(user_userpassword);
        //region.setText(user_userregion);
    } //END AAAI 9may
    /*Add photo*/

   /* public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View root = inflater.inflate(R.layout.activity_editprofile, container, false);
        auth = FirebaseAuth.getInstance();
        database = FirebaseDatabase.getInstance();
        storage =  FirebaseStorage.getInstance();
        photo = root.findViewById(R.id.profile_image2);
        photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_GET_CONTENT);
                intent.setType("image/*");
                startActivityForResult(intent, 33);
            }
        });
    return root;}


    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data){
    super.onActivityResult(requestCode, resultCode, data);
    if (data.getData() != null){
        Uri photoUri = data.getData();
        photo.setImageURI(photoUri);
        final StorageReference reference = storage.getReference().child("profile_picture").child(FirebaseAuth.getInstance().getUid());
        reference.putFile(photoUri).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
            @Override
            public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                Toast.makeText(getBaseContext(), "Uploaded", Toast.LENGTH_SHORT).show();
            }
        });
    }

    }

    public void addPhoto(View view) {

    }*/
}