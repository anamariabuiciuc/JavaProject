package com.company;

public class customer {

    private String lastName;
    private String firstName;
    private birthdayDate dateOfBirth;
    private long identificationNumber; //cnp
    private char gender; //f or m (specified in your identity card)
    private String telephoneNumber;
    private String mailAddress;

    public customer(String lastName, String firstName, birthdayDate dateOfBirthday, long identificationNumber, char gender, String telephoneNumber, String mailAddress)
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
        return "Client{" +
                "Last name='" + lastName + '\'' +
                ", First name=" + firstName + '\'' +
                ", gender=" + gender + '\'' +
                ", identificationNumber=" + identificationNumber + '\'' +
                ", telephoneNumber='" + telephoneNumber+ '\'' +
                ", mailAddress='" + mailAddress+ '\'' +
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

    public birthdayDate getDateOfBirth()
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
