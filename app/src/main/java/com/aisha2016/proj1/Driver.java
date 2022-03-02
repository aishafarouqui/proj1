package com.aisha2016.proj1;

public class Driver {
    private String name;
    private String email;
    private String password;
    private String phone;
    private String region;
    private String busNum;
    private String busplateNum;
    Companies comp;


    public Driver(String name, String email, String password, String phone, String region, String busNum, String busplateNum, Companies comp) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.region = region;
        this.busNum = busNum;
        this.busplateNum = busplateNum;
        this.comp = comp;
    }

    public String getBusNum() {
        return busNum;
    }

    public void setBusNum(String busNum) {
        this.busNum = busNum;
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

    public Companies getComp() { return comp; }

    public void setComp(Companies comp) { this.comp = comp; }

    public String getBusplateNum() {
        return busplateNum;
    }

    public void setBusplateNum(String busplateNum) {
        this.busplateNum = busplateNum;
    }




}

