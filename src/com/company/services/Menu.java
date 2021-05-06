package com.company.Services;

import com.company.FlowerShop;
import com.company.Models.Bouquet;
import com.company.Models.Customer;
import com.company.Models.GiftBox;
import com.company.Models.Order;
import com.company.ReadWriteCSV.ReadCSV;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static void menu() throws IOException{

        System.out.println("************  FlowerShop App ************\n");
        System.out.println("With you since 2021! :) Created by anamariabuiciuc \n");
        System.out.println("\nHello! ");
       // Scanner scanner = new Scanner(System.in);
       // System.out.println("What is your (first) name?");
        System.out.println( "Nice to meet you! "
                + "I'm your assistant, Ana. ");
        System.out.println("Let me know how can I help you.");


        Scanner scanner = new Scanner(System.in);
        int option=0;
        ArrayList<Bouquet> bouquetsList = null;
        ArrayList<GiftBox> giftboxesList = null;
        ArrayList<Order> ordersList = null;
        ArrayList<FlowerShop> shopsList = null;

        do { System.out.println("\nChoose an option:\n");
            System.out.println("1. See our available products.\n");
            System.out.println("2. Enter your account.\n");
            System.out.println("3. Place an order. \n");
            //System.out.println("See the status of your order.\n");
            //System.out.println("Delete ...");
            System.out.println("4. Add a new FlowerShop.\n");
            System.out.println("5. Add a new product.\n");
            System.out.println("6. Exit\n");
             System.out.println("Write the digit of your option: ");
             option = scanner.nextInt();

                switch (option) {

                    case 1:
                        System.out.println("Bouquets: \n");
                        ReadCSV.read("src/com/company/Files/bouquets.csv");
                        System.out.println("\nGiftboxes\n");
                        ReadCSV.read("src/com/company/Files/giftboxes.csv");
                        Audit.audit("Seen list of products.");
                        break;

                    case 2: //Enter your account
                            Login.run();
                            break;



                    case 3:
                        //Place an order
                        System.out.println("What dou you want to order?\nWrite the name of the products you wish:");
                        break;


                    case 6:
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Wrong option. Please choose a valid option!\n");
                }
            } while(option < 7);




    }
}
