package com.microservice.service.entity;

public class Data {
    private String district;

    public Data() {
    }

    public Data(String district, String country, String state, String bloodGroup) {
        this.district = district;
        this.country = country;
        this.state = state;
        this.bloodGroup = bloodGroup;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    private String country;  // Added country field
    private String state;
    private String  bloodGroup;
}
