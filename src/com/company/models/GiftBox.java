package com.company;

public class GiftBox extends Product {

    private String dimension; //small, medium, big
    private String type; //beauty (with beauty products), delicious (with sweets), deluxe (with champagne)

    public GiftBox(String productName, double productPrice,String dimension, String type)
    {
        super(productName, productPrice);
        this.dimension = dimension;
        this.type = type;
    }


    public void setDimension()
    {
        this.dimension = dimension;
    }

    public void setType()
    {
        this.type = type;
    }


    public String getDimension() {
        return dimension;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "GiftBox " +
                "Dimension: " + dimension + " " +
                "Type: " + type + " " +
                "- " + productPrice + " RON";
    }

    @Override
    public void message() {
        System.out.println("Just for you <3");
    }
}
