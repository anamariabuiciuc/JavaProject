package com.company;
//Flowershop Online
//in progress
public class Main {

    public static void main(String[] args) {

       bouquet b1 = new bouquet("Buchet trandafir", 100, 9, "rosii");
       bouquet b2 = new bouquet("Buchet gladiole", 50, 15, "mov");
       Date d1 = new Date(16,12,2000);
       Date do1 = new Date(30,3,2021);
       customer c1 = new customer("Buiciuc", "Ana", d1, 16290, 'f', "0735239310", "anabuiciuc@gmail.com");
       flowerShopAddress ad1 = new flowerShopAddress("Bacau", "Bacau", "Nicu Enea", "15", 600190);
       flowerShop f1 = new flowerShop("Floraria din Povesti", "0234484909", "florariadinpovestibacau@gmail.com",ad1);
       order o1 = new order(101,do1,c1, f1);
       System.out.println(o1.toString());


    }
}
