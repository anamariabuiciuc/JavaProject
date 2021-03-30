package com.company;

public class customer {

    protected String lastName;
    protected String firstName;
    protected Date dateOfBirth;
    protected long identificationNumber; //cnp
    protected char gender; //f or m (specified in your identity card)
    protected String telephoneNumber;
    protected String mailAddress;

    public customer(String lastName, String firstName, Date dateOfBirthday, long identificationNumber, char gender, String telephoneNumber, String mailAddress)
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateOfBirth =  dateOfBirthday;
        this.identificationNumber = identificationNumber;
        this.gender = gender; //f or m, specified in the identity card
        this.telephoneNumber = telephoneNumber;
        this.mailAddress = mailAddress;
    }


    @Override
    public String toString() {
        return "customer{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", identificationNumber=" + identificationNumber +
                ", gender=" + gender +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", mailAddress='" + mailAddress + '\'' +
                '}';
    }

    public void setLastName()
    {
        this.lastName = lastName;
    }

    public void setFirstName()
    {
        this.firstName = firstName;
    }

    public void setDateOfBirth()
    {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGender()
    {
        this.gender = gender;
    }

    public void setIdentificationNumber()
    {
        this.identificationNumber = identificationNumber;
    }

    public void setTelephoneNumber()
    {
        this.telephoneNumber = telephoneNumber;
    }

    public void setMailAddress()
    {
        this.mailAddress = mailAddress;
    }


    public String getLastName()
    {
        return lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public char getGender()
    {
        return gender;
    }

    public Date getDateOfBirth()
    {
        return dateOfBirth;
    }

    public long getIdentificationNumber()
    {
        return identificationNumber;
    }

    public String getTelephoneNumber()
    {
        return telephoneNumber;
    }

    public String getMailAddress()
    {
        return mailAddress;
    }


}
