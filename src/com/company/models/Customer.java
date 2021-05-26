package com.company.Models;
import java.sql.Date;
import com.company.Models.Person;
import com.company.Services.Message;

public class Customer extends Person implements Message {


    private Date dateOfBirth;
    private String identificationNumber; //cnp

    public Customer(String lastName, String firstName, char gender, String telephoneNumber, String mailAddress, java.sql.Date dd, String identificationNumber)
    {

        super(lastName, firstName, gender, telephoneNumber, mailAddress);
        this.dateOfBirth = new Date(2000,1,1);
        this.identificationNumber = identificationNumber;


    }

    public Customer() {
        super();
    }

   /* public Customer()
    {

        this.firstName = "unknown";
        this.lastName = "unknown";
    }*/



    public void setDateOfBirth()
    {
        this.dateOfBirth = dateOfBirth;
    }


    public void setIdentificationNumber()
    {
        this.identificationNumber = identificationNumber;
    }




    public Date getDateOfBirth()
    {
        return dateOfBirth;
    }

    public String getIdentificationNumber()
    {
        return identificationNumber;
    }



    @Override
    public String toString() {
        return " Customer{" +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", gender=" + gender +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", mailAddress='" + mailAddress + '\'' +
                "dateOfBirth=" + dateOfBirth +
                ", identificationNumber='" + identificationNumber + '\'' +
                '}';
    }


    public void message()
    {
        System.out.println("Order placed! You will receive a mail in 5 minutes!");

    }
}
