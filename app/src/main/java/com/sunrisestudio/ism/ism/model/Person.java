package com.sunrisestudio.ism.ism.model;

public class Person {
    private String firstName;
    private String lastName;
    private String profession;
    private String phoneNumber;

    public Person(String firstName, String lastName, String profession, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.profession = profession;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
