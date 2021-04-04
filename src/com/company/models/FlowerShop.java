package com.company;

import java.util.Objects;

public class FlowerShop implements Message {

        private String nameFlowerShop;
        private String telNumber;
        private String mailAddress;
         private Address address;

   public FlowerShop(String nameFlowerShop, String telNumber, String mailAddress, Address address)
   {
       this.nameFlowerShop = nameFlowerShop;
       this.telNumber = telNumber;
       this.mailAddress = mailAddress;
       this.address = address;
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

    public void setAddressFlowerShop(Address address)
    {
        this.address = address;
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

    public Address getAddressFlowerShop()
    {
        return address;
    }

    @Override
    public String toString() {
        return  nameFlowerShop +
               "\n        Telephone number: " + telNumber  +
              "\n        Mail address: " + mailAddress  +
                "\n        Address: " + address ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlowerShop that = (FlowerShop) o;
        return Objects.equals(telNumber, that.telNumber) && Objects.equals(mailAddress, that.mailAddress) && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(telNumber, mailAddress, address);
    }

    public void message()
    {
            System.out.println("New order! ");

    }
}

