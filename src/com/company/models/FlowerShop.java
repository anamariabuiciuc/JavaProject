package com.company;

import com.company.Services.Message;

import java.util.Objects;

public class FlowerShop implements Message {

        private String nameFlowerShop;
        private String telNumber;
        private String mailAddress;
        //The address
        private String county;
        private String town;
        private String street;
        private String number; //It is a String because the number can have a form like "12B".
        private int postalCode;

   public FlowerShop(String nameFlowerShop, String telNumber, String mailAddress, String county, String town, String street, String number, int postalCode)
   {
       this.nameFlowerShop = nameFlowerShop;
       this.telNumber = telNumber;
       this.mailAddress = mailAddress;
       this.county = county;
       this.town = town;
       this.street = street;
       this.number = number;
       this.postalCode = postalCode;
   }

   public void setNameFlowerShop(String nameFlowerShop)
   {
       this.nameFlowerShop = nameFlowerShop;
   }

    public void setTelNumberFlowerShop(String telNumber)
    {
        this.telNumber = telNumber;
    }

    public void setMailAddressFlowerShop(String mailAddress)
    {
        this.mailAddress = mailAddress;
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

    public String getNameFlowerShop()
    {
        return nameFlowerShop;
    }

    public String getTelNumberFlowerShop()
    {
        return telNumber;
    }

    public String getMailAddressFlowerShop()
    {
        return mailAddress;
    }

    public String getCountyFlowerShop()
    {
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
        return  nameFlowerShop +
               "\n        Telephone number: " + telNumber  +
              "\n         Mail address: " + mailAddress  +
                "\n        Address: \n County: " + county +
                "\n        Town: "+town+
                "\n        Street: "+street+
                "\n        Number: "+number+
                "\n        PostalCode: "+postalCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlowerShop that = (FlowerShop) o;
        return Objects.equals(telNumber, that.telNumber) && Objects.equals(mailAddress, that.mailAddress) && Objects.equals(postalCode, that.postalCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(telNumber, mailAddress, county,town,street,number,postalCode);
    }

    public void message()
    {
            System.out.println("New order! ");

    }
}

