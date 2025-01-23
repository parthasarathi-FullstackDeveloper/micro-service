package com.microservice.service.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "blood_donations")
public class Donation {

    @Id
    private String id;  // Use String for MongoDB ID (or ObjectId)

    private String donorName;

    private String email;

    private String bloodGroup;

    private Integer age;

    private String gender;

    private String contactNumber;

    private String address;
    private String country;  // Added country field
    private String state;    // Added state field

    public Donation(String id, String donorName, String email, String bloodGroup, Integer age, String gender, String contactNumber, String address, String country, String state, String district) {
        this.id = id;
        this.donorName = donorName;
        this.email = email;
        this.bloodGroup = bloodGroup;
        this.age = age;
        this.gender = gender;
        this.contactNumber = contactNumber;
        this.address = address;
        this.country = country;
        this.state = state;
        this.district = district;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    private String district; // Added district field



    public Donation() {
    }

    public Donation(String id, String donorName, String email, String bloodGroup, Integer age, String gender,
                    String contactNumber, String address, String message) {
        this.id = id;
        this.donorName = donorName;
        this.email = email;
        this.bloodGroup = bloodGroup;
        this.age = age;
        this.gender = gender;
        this.contactNumber = contactNumber;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDonorName() {
        return donorName;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
