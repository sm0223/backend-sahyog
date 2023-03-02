package com.sahyog.backend.entities;

import java.util.ArrayList;

public class Patient{
    public String healthId;
    public String healthIdNumber;
    public String name;
    public String gender;
    public Address address;
    public int yearOfBirth;
    public int dayOfBirth;
    public int monthOfBirth;
    public ArrayList<Identifier> identifiers;

    public Patient() {
    }

    public Patient(String healthId, String healthIdNumber, String name, String gender, Address address, int yearOfBirth, int dayOfBirth, int monthOfBirth, ArrayList<Identifier> identifiers) {
        this.healthId = healthId;
        this.healthIdNumber = healthIdNumber;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.yearOfBirth = yearOfBirth;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.identifiers = identifiers;
    }

    public Patient(String healthId) {
        this.healthId = healthId;
    }

    public String getHealthId() {
        return healthId;
    }

    public void setHealthId(String healthId) {
        this.healthId = healthId;
    }

    public String getHealthIdNumber() {
        return healthIdNumber;
    }

    public void setHealthIdNumber(String healthIdNumber) {
        this.healthIdNumber = healthIdNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public ArrayList<Identifier> getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(ArrayList<Identifier> identifiers) {
        this.identifiers = identifiers;
    }
}


