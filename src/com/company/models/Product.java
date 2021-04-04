package com.company;
import java.util.ArrayList;

public class Product implements Message {

    protected String productName;
    protected double productPrice;

    public Product(String productName, double productPrice)
    {
        this.productName = productName;
        this.productPrice = productPrice;
    }

   /* public Product()
    {
        this.productName = "?";
        this.productPrice =0;
    }*/

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
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

    public void message() {}

}
