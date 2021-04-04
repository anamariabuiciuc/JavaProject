package com.company;

public class Address {

    private String county;
    private String town;
    private String street;
    private String number; //It is a String because the number can have a form like "12B".
    private int postalCode;

    public Address(String county, String town, String street, String number, int postalCode)
    {
        this.county = county;
        this.town = town;
        this.street = street;
        this.number = number;
        this.postalCode = postalCode;
    }

    public void setCountyAddress(String county)
    {
        this.county = county;
    }
    public void setTownAddress(String town)
    {
        this.town = town;
    }

    public void setStreetAddress(String street)
    {
         this.street = street;
    }

    public void setNumberAddress(String number)
    {
        this.number = number;
    }

    public void setPostalCodeAddress(int PostalCode)
    {
        this.postalCode = postalCode;
    }

    public String getTownAddress(String town)
    {
        return town;
    }

    @Override
    public String toString() {
        return "Address{" +
                "county='" + county + '\'' +
                ", town='" + town + '\'' +
                ", street='" + street + '\'' +
                ", number='" + number + '\'' +
                ", postalCode=" + postalCode +
                '}';
    }
}
