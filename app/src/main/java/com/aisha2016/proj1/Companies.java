package com.aisha2016.proj1;

import android.widget.ImageView;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class Companies implements Serializable {
    private String email,name,price;
    /*private ImageView logo;*/
   // private float evaluation;
   // private String email;

    public Companies(String email,/* String evaluation,*/ String name, /*ImageView logo, */String price ) {
        /*this.logo = logo;*/
        this.email = email;
       // this.evaluation = evaluation;
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

    public void setPFrice(String price) {
        this.price = price;
    }

    /*public String getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }
*/
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
