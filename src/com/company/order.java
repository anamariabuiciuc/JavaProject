package com.company;

import java.util.*;

public class order {

    private int idOrder;
    private Date orderDate;
    private customer buyer;
    private int numberOfProducts;
    private product myProduct;
    private double total;
    private flowerShop seller;



    public order ()
    {
        this.idOrder = this.idOrder+1;
        this.numberOfProducts = 0;
        this.total = 0;
    }





    public void setIdOrder()
    {
        this.idOrder = idOrder;
    }

    public void setOrderDate()
    {
        this.orderDate = orderDate;
    }

    public void setMyProduct(product myProduct) {
        this.myProduct = myProduct;
    }

    public void setNumberOfProducts(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }

    public void setBuyer()
    {
        this.buyer = buyer;
    }

   // public void setProducts() {this.products = products;}

    public void setSeller()
    {
        this.seller = seller;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public customer getBuyer() {
        return buyer;
    }

 //    public ArrayList<product> getProducts() {
 //   return products;
 //}

    public flowerShop getSeller() {
        return seller;
    }

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public product getMyProduct() {
        return myProduct;
    }

    @Override
    public String toString() {
        return "order{" +
                "idOrder=" + idOrder +
                ", orderDate=" + orderDate +
                ", buyer=" + buyer +
                ", numberOfProducts=" + numberOfProducts +
                ", myProduct=" + myProduct +
                ", total=" + total +
                ", seller=" + seller +
                '}';
    }

    public double calculateTotal()
    {
        double money = 0;
       // for(product products: this.myProduct){

            money = money + numberOfProducts*(myProduct.getProductPrice() );

       // }

        return money;
    }
}
