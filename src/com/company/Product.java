package com.company;
import com.company.Services.Message;

import java.util.ArrayList;
import java.util.Scanner;

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

    public void addProduct(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Numarul de produse pe care vreti sa le introduceti: ");
        int n = sc.nextInt();
        Product[] newProducts = new Product[n];
        String name; double price;

        for(int i=0; i< newProducts.length; i++)
        {
            System.out.println("\nIntroduceti numele produsului: ");
            name = sc.next();
            newProducts[i].setProductName();

            System.out.println("\nIntroduceti pretul produsului: ");
            price = sc.nextDouble();
            newProducts[i].setProductPrice();
        }
    }



    public void message() {}

}
