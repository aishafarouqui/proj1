package com.aisha2016.proj1;

import android.widget.ImageView;

import java.util.ArrayList;

public class Companies {
    private String name;
    private ImageView logo;
    private String price;
    private String evaluation;
    private String email;
    ArrayList<Driver> drivers = new ArrayList<>();


    public Companies() {
    }
    public Companies(String name, ImageView logo, String price, String evaluation, String email) {
        this.name = name;
        this.logo = logo;
        this.price = price;
        this.evaluation = evaluation;
        this.email = email;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ImageView getLogo() {
        return logo;
    }

    public void setLogo(ImageView logo) {
        this.logo = logo;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getEvaluation() {
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
    }

    public void addDriver(String name, String email, String phone, String password, String region, String busNum, String busplateNum){
        Driver driver = new Driver(name ,email, phone, password, region, busNum, busplateNum);
        drivers.add(driver);
    }
}
