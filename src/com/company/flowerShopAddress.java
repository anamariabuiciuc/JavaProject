package com.company;

public class flowerShopAddress {

    private String county;
    private String town;
    private String street;
    private String number; //It is a String because the number can have a form like "12B".
    private int postalCode;

    public flowerShopAddress(String county, String town, String street, String number, int postalCode)
    {
        this.county = county;
        this.town = town;
        this.street = street;
        this.number = number;
        this.postalCode = postalCode;
    }

    public void setCountyFlowerShopAddress(String county)
    {
        this.county = county;
    }
    public void setTownFlowerShopAddress(String town)
    {
        this.town = town;
    }

    public void setStreetFlowerShopAddress(String street)
    {
         this.street = street;
    }

    public void setNumberFlowerShopAddress(String number)
    {
        this.number = number;
    }

    public void setPostalCodeFlowerShopAddress(int PostalCode)
    {
        this.postalCode = postalCode;
    }

    public String getTownFlowerShopAddress(String town)
    {
        return town;
    }

    @Override
    public String toString() {
        return "flowerShopAddress{" +
                "county='" + county + '\'' +
                ", town='" + town + '\'' +
                ", street='" + street + '\'' +
                ", number='" + number + '\'' +
                ", postalCode=" + postalCode +
                '}';
    }
}
