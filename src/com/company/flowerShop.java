package com.company;

public class flowerShop {

        private String nameFlowerShop;
        private String telNumber;
        private String mailAddress;
         private flowerShopAddress address;

   public flowerShop(String nameFlowerShop, String telNumber, String mailAddress, flowerShopAddress address)
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

    public void setAddressFlowerShop(flowerShopAddress address)
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

    public flowerShopAddress getAddressFlowerShop()
    {
        return address;
    }

}

