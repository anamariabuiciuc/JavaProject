package com.company.Models;

public class Person {

    protected String lastName;
    public String firstName;
    protected char gender; //f or m (specified in your identity card)
    protected String telephoneNumber;
    protected String mailAddress;

    public Person(String lastName, String firstName, char gender, String telephoneNumber, String mailAddress) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
        this.telephoneNumber = telephoneNumber;
        this.mailAddress = mailAddress;
    }

    public void setLastName() {
        this.lastName = lastName;
    }

    public void setFirstName() {
        this.firstName = firstName;
    }

    public void setGender() {
        this.gender = gender;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public char getGender() {
        return gender;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", gender=" + gender +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", mailAddress='" + mailAddress + '\'' +
                '}';
    }
}