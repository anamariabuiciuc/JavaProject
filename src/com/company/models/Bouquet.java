package com.company.Models;
import com.company.Services.Message;

public class Bouquet extends Product implements Message {
    private String nameFlowers;
    private int numberOfFlowers;
    private String colorOfFlowers;
    public Bouquet(String productName, double productPrice, String nameFlowers, int numberOfFlowers, String colorOfFlowers)
    {
        super(productName,productPrice);
        this.nameFlowers = nameFlowers;
        this.numberOfFlowers = numberOfFlowers;
        this.colorOfFlowers = colorOfFlowers;
    }

    public Bouquet() {
        super();
    }

    @Override
    public void setProductName() {
        super.setProductName();
    }

    @Override
    public void setProductPrice() {
        super.setProductPrice();
    }

    public void setNameFlowers(String nameFlowers) {
       this.nameFlowers = nameFlowers;
    }

    public void setNumberOfFlowers()
    {
        this.numberOfFlowers = numberOfFlowers;
    }

    public void setColorOfFlowers()
    {
        this.colorOfFlowers = colorOfFlowers;
    }

    @Override
    public String getProductName() {
        return super.getProductName();
    }

    @Override
    public double getProductPrice() {
        return super.getProductPrice();
    }

    public String getNameFlowers() {
        return nameFlowers;
    }

    public int getNumberOfFlowers()
    {
        return numberOfFlowers;
    }

    public String getColorOfFlowers()
    {
        return colorOfFlowers;
    }

    @Override
    public String toString() {
        return   productName +  " "+
                      + numberOfFlowers + " pieces - "+
                      + productPrice + " RON";
    }

    @Override
    public void message()
    {  //This message will be printed on a card that will be given with the bouquet.
        System.out.println("Because flowers make us happy. :) ");
    }




}
