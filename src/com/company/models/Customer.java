package com.company;

public class Customer extends Person implements Message{


    private Date dateOfBirth;
    private String identificationNumber; //cnp

    public Customer( String lastName, String firstName, char gender, String telephoneNumber, String mailAddress ,Date dateOfBirthday, String identificationNumber)
    {
        super(lastName, firstName, gender, telephoneNumber, mailAddress);
        this.dateOfBirth =  dateOfBirthday;
        this.identificationNumber = identificationNumber;

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
