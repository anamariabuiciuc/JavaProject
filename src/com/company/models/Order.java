package com.company.Models;
import com.company.FlowerShop;
import com.company.Services.Sale;

import java.sql.Date;
import java.util.List;

public class Order implements Sale {

    private static int idOrder=0;
    private Date orderDate;
    private Customer buyer;
    private Recipient recipient;
    private List<Product> products;
    private int numberOfProducts;




 /* public Order ()
    {
        this.idOrder = this.idOrder+1;
        this.total = 0;
    }
*/


    public Order(int idOrder, Date orderDate, Customer buyer, Recipient recipient, int numberOfProducts, List<Product> products)
    {
        idOrder++;
        this.idOrder = idOrder;
        this.orderDate = orderDate;
        this.buyer = buyer;
        this.recipient = recipient;
        this.numberOfProducts = numberOfProducts;
        this.products = products;

    }



    public void setIdOrder()
    {
        this.idOrder = idOrder;
    }

    public void setOrderDate()
    {
        this.orderDate = orderDate;
    }

    public void setMyProduct(List<Product> products) {
        this.products = products;
    }


    public void setBuyer()
    {
        this.buyer = buyer;
    }

    public void setRecipient(Recipient recipient) {
        this.recipient = recipient;
    }

    public void setNumberOfProducts(){ this.numberOfProducts = numberOfProducts;}

    public void setProducts() {this.products = products;}


    public int getIdOrder() {
        return idOrder;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public Customer getBuyer() {
        return buyer;
    }

    public Recipient getRecipient() {
        return recipient;
    }



    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public List<Product> getMyProducts(){
        return products;
    }

    @Override
    public String toString() {
        return "Order: " + idOrder + " "+ orderDate +
                ", \nCustomer: " + buyer +
                ", \nRecipient: " + recipient +
                ", \nProducts: " + products +
                //", numberOfProducts=" + numberOfProducts +
                "\n"; }


    public double getTotalCost() {
        double total = 0;
        for (Product ip:products){
            total += ip.getProductPrice();
        }
        return total;
    }

    public void showMessages() {


        for(Product index:products){

            index.message();
            System.out.println(" With love, "+buyer.firstName+"\n");
        }
    }

    public void showSale(){
        if(getTotalCost() >= 500) System.out.println("For your next order you will have a voucher with 20% discount. Just use the code FLOWERSHOP20.");


    }
}
