package com.aisha2016.proj1;

public class Passenger {
    private String name;
    private String email;
    private String password;
    private String phone;
    private String region;

    public Passenger() {
    }

    public Passenger(String name, String email, String phone, String password, String region) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.region = region;
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


}
