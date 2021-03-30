package com.company;

import java.util.ArrayList;

public class order {

    private int idOrder;
    private Date orderDate;
    private customer buyer;
   // private ArrayList<product> products;
    private flowerShop seller;

    public order (int idOrder, Date orderDate, customer buyer, flowerShop seller)
    { //ArrayList<product> products,
        this.idOrder= idOrder;
        this.orderDate = orderDate;
        this.buyer = buyer;
      //  this.products = products;
        this.seller = seller;
    }

    public void setIdOrder()
    {
        this.idOrder = idOrder;
    }

    public void setOrderDate()
    {
        this.orderDate = orderDate;
    }

    public void setBuyer()
    {
        this.buyer = buyer;
    }

   // public void setProducts(ArrayList<product> products) {
   //     this.products = products;
   // }

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

 //  public ArrayList<product> getProducts() {
 //      return products;
  // }

    public flowerShop getSeller() {
        return seller;
    }

    @Override
    public String toString() {
        return "order{" +
                "idOrder=" + idOrder +
                ", orderDate=" + orderDate +
                ", buyer=" + buyer +
              //  ", products=" + products +
                ", seller=" + seller +
                '}';
    }
}
