package com.company;

public class bouquet extends product {
    private String nameFlowers;
    private int numberOfFlowers;
    private String colorOfFlowers;
    public bouquet(String productName, double productPrice, String nameFlowers, int numberOfFlowers, String colorOfFlowers)
    {
        super(productName,productPrice);
        this.nameFlowers = nameFlowers;
        this.numberOfFlowers = numberOfFlowers;
        this.colorOfFlowers = colorOfFlowers;
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

    public int getNumberOfFlowers()
    {
        return numberOfFlowers;
    }

    public String getColorOfFlowers()
    {
        return colorOfFlowers;
    }




}
