package com.company;

public class giftBox extends product {

    private String receiver; //for mom,dad,sister,brother,girlfriend,boyfriend, friend, etc
    private String dimension; //small, medium, big
    private String type; //beauty (with beauty products), delicious (with sweets), deluxe (with champagne)

    public giftBox(String productName, double productPrice, String receiver, String dimension, String type)
    {
        super(productName, productPrice);
        this.receiver = receiver;
        this.dimension = dimension;
        this.type = type;
    }

    public void setReceiver()
    {
        this.receiver = receiver;
    }

    public void setDimension()
    {
        this.dimension = dimension;
    }

    public void setType()
    {
        this.type = type;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getDimension() {
        return dimension;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "giftBox{" +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice + '\'' +
                "receiver='" + receiver + '\'' +
                ", dimension='" + dimension + '\'' +
                ", type='" + type +
                '}';
    }

}
