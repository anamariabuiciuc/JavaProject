package com.company;

import com.company.Models.Address;
import com.company.Models.Person;
import com.company.Services.Message;

public class Recipient extends Person implements Message {

    protected Address addressRecipient;

    public Recipient(String lastName, String firstName, char gender, String telephoneNumber, String mailAddress, Address addressRecipient) {
        super(lastName, firstName, gender, telephoneNumber, mailAddress);
        this.addressRecipient = addressRecipient;

    }

    public void setAddressRecipient(Address addressRecipient) {
        this.addressRecipient = addressRecipient;
    }

    public Address getAddressRecipient() {
        return addressRecipient;
    }

    @Override
    public String toString() {
        return "Recipient{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", gender=" + gender +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", mailAddress='" + mailAddress + '\'' +
                ", addressRecipient=" + addressRecipient +
                '}';
    }

    public void message()
    {
        System.out.println("Today we have a surprise for you. :) ");
    }
}
