package com.company.Models;

import com.company.Models.Address;
import com.company.Models.Person;
import com.company.Services.Message;

public class Recipient extends Person implements Message {

    protected String county;
    protected  String town;
    protected  String street;
    protected  String number; //It is a String because the number can have a form like "12B".
    protected  int postalCode;

    public Recipient(String lastName, String firstName, char gender, String telephoneNumber, String mailAddress, Address addressRecipient) {
        super(lastName, firstName, gender, telephoneNumber, mailAddress);
        this.county = county;
        this.town = town;
        this.street = street;
        this.number = number;
        this.postalCode = postalCode;

    }

    @Override
    public void setLastName() {
        super.setLastName();
    }

    @Override
    public void setFirstName() {
        super.setFirstName();
    }

    @Override
    public void setGender() {
        super.setGender();
    }

    @Override
    public void setTelephoneNumber(String telephoneNumber) {
        super.setTelephoneNumber(telephoneNumber);
    }

    @Override
    public void setMailAddress(String mailAddress) {
        super.setMailAddress(mailAddress);
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public char getGender() {
        return super.getGender();
    }

    @Override
    public String getTelephoneNumber() {
        return super.getTelephoneNumber();
    }

    @Override
    public String getMailAddress() {
        return super.getMailAddress();
    }

    public String getCounty() {
        return county;
    }

    public String getTown() {
        return town;
    }

    public String getStreet() {
        return street;
    }

    public String getNumber() {
        return number;
    }


    public int getPostalCode() {
        return postalCode;
    }

    @Override
    public String toString() {
        return "Recipient{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", gender=" + gender +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", mailAddress='" + mailAddress + '\'' +
                ", Address: " + '\n' +
                ", county=" + county + '\n' +
                ", town=" + town + '\n'+
                ", street=" + street + '\n'+
                ", number=" + number + '\n'+
                ", postalCode=" + postalCode + '\n'+
        '}';
    }

    public void message()
    {
        System.out.println("Today we have a surprise for you. :) ");
    }
}
