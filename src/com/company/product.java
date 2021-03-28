package com.company;

public abstract class product {

    protected String productName;
    protected double productPrice;

    public product(String productName, double productPrice)
    {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "product{"+
                "name = " + productName + '\'' +
                ", price = " + productName +
                '}';
    }

    public void setProductName()
    {
        this.productName = productName;
    }

    public void setProductPrice()
    {
        this.productPrice = productPrice;
    }

    public String getProductName()
    {
        return productName;
    }

    public double getProductPrice()
    {
        return productPrice;
    }

    public abstract double calculPromotie();

}
