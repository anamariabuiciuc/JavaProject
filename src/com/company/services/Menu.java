package com.company.Services;

import com.company.Database.*;
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
    public static void menu() throws IOException {

        System.out.println("************  FlowerShop App ************\n");
        System.out.println("With you since 2021! :) Created by anamariabuiciuc \n");
        System.out.println("\nHello! ");
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("What is your (first) name?");
        System.out.println("Nice to meet you! "
                + "I'm your assistant, Ana. ");
        System.out.println("Let me know how can I help you.");


        Scanner scanner = new Scanner(System.in);
        int op = 0;
        // ArrayList<Bouquet> bouquetsList = null;
        //  ArrayList<GiftBox> giftboxesList = null;
        //ArrayList<Order> ordersList = null;
        //ArrayList<FlowerShop> shopsList = null;

        do {
            System.out.println("\nChoose an option:\n");
            System.out.println("\n1. View as a customer.\n");
            System.out.println("\n2.View as an admin.\n");
            System.out.println("\n3.Exit. \n");
            System.out.println("\nEnter the digit of your option: \n");
            op = scanner.nextInt();
            switch (op) {

                case 1:
                    int option = 0;

                    do{
                        System.out.println("\nChoose an option:\n");
                        System.out.println("1. See our available products.\n");
                        System.out.println("2.Create aaccount.\n");
                        System.out.println("3. Enter your account.\n");
                        System.out.println("4. Update your account information. \n");
                        System.out.println("5. Place an order. \n");
                        System.out.println("6. Update your order. \n");
                        System.out.println("7. Delete your order. \n");
                        System.out.println("8. Update a recipient. \n");
                        System.out.println("9. Delete your account.\n");
                        System.out.println("10. Exit\n");
                        System.out.println("Write the digit of your option: ");
                        option = scanner.nextInt();

                        switch (option) {

                            case 1:
                                System.out.println("Bouquets\n");
                                // ReadCSV.read("src/com/company/Files/bouquets.csv");
                                //Display bouquets from DB.
                                BouquetDB.DisplayBouquet();
                                new Bouquet().message(); //created a new instance of the class Bouquet in order
                                //to call message which is a non-static method and cannot be simply called in a static method
                                System.out.println("\nGiftboxes\n");
                                //Display Giftboxes from DB.
                                GiftboxDB.DisplayGiftBox();
                                new GiftBox().message();
                                // ReadCSV.read("src/com/company/Files/giftboxes.csv");
                                Audit.audit("Seen list of products.");
                                break;

                            case 2://Create your account
                                System.out.println("\nPlease, enter the requested information about yourself.");
                                CustomerDB.AddCustomer();
                                break;

                            case 3: //Enter your account
                                Login.run();
                                break;


                            case 4://Update your account information
                                System.out.println("\nPlease, enter the requested information about yourself.");
                                CustomerDB.UpdateCustomer();
                                break;


                            case 5:
                                //Place an order
                                System.out.println("\nEnter the requested information about your order.");
                                OrderDB.AddOrder();
                                break;

                            case 6:
                                //Update your order
                                System.out.println("\nEnter the requested information about your order.");
                                OrderDB.UpdateOrder();
                                break;

                            case 7:
                                //Delete your oreder
                                System.out.println("\nEnter the requested information about the order you want to delete.");
                                OrderDB.DeleteOrder();
                                break;

                            case 8:
                                //Update a recipient
                                System.out.println("\nEnter the requested information about your recipient.");
                                RecipientDB.UpdateRecipient();
                                break;

                            case 9:
                                //Delete your account
                                System.out.println("\nEnter the requested information about yourself.");
                                CustomerDB.DeleteCostumers();
                                break;

                            case 10:
                                System.exit(0);
                                break;

                            default:
                                System.out.println("Wrong option. Please choose a valid option!\n");
                        }
                    } while (option > 0 && option < 11);
                    break;

                case 2:
                    int opt = 0;

                    do {
                        System.out.println("\nChoose an option:\n");
                        System.out.println("1. See our available products.\n");
                        System.out.println("2. Login.\n");
                        System.out.println("3. Place an order. \n");
                        System.out.println("4. Delete an order. \n");
                        System.out.println("5. Update an order. \n");
                        System.out.println("6. See all the orders.\n");
                        System.out.println("7. Add a new FlowerShop.\n");
                        System.out.println("8. Update a FlowerShop. \n");
                        System.out.println("9. Delete a FlowerShop. \n");
                        System.out.println("10. See the list with flowershops.\n");
                        System.out.println("11. Add a new bouquet.\n");
                        System.out.println("12. Update a bouquet.\n");
                        System.out.println("13. Delete a bouquet.\n");
                        System.out.println("14. Add a new giftbox.\n");
                        System.out.println("15. Update a giftbox.\n");
                        System.out.println("16. Delete a giftbox.\n");
                        System.out.println("17. Add a customer.\n");
                        System.out.println("18. Delete a customer.\n");
                        System.out.println("19. Update a customer.\n");
                        System.out.println("20. See the list of customers.\n");
                        System.out.println("21. Update a recipient. \n");
                        System.out.println("22. Delete a recipient. \n");
                        System.out.println("23. See all recipients. \n");
                        System.out.println("24. See audit.\n");
                        System.out.println("25. Delete actions from audit.\n");
                        System.out.println("26. Exit\n");
                        System.out.println("Write the digit of your option: ");
                        opt = scanner.nextInt();

                        switch (opt) {

                            case 1:
                                System.out.println("Bouquets\n");
                                //Display bouquets from DB.
                                BouquetDB.DisplayBouquet();
                                new Bouquet().message(); //created a new instance of the class Bouquet in order
                                //to call message which is a non-static method and cannot be simply called in a static method
                                System.out.println("\nGiftboxes\n");
                                //Display Giftboxes from DB.
                                GiftboxDB.DisplayGiftBox();
                                new GiftBox().message();
                                // ReadCSV.read("src/com/company/Files/giftboxes.csv");
                                Audit.audit("Seen list of products.");
                                break;

                            case 2://Login
                                System.out.println("\nEnter your account.\n");
                                Login.run();
                                break;

                            case 3://Place an order
                                System.out.println("\nEnter the requested information about the new order.\n");
                                OrderDB.AddOrder();
                                break;

                            case 4://Delete an order
                                System.out.println("\nEnter the requested information about the  order.\n");
                                OrderDB.DeleteOrder();
                                break;

                            case 5://Update an order
                                System.out.println("\nEnter the requested information about the  order.\n");
                                OrderDB.UpdateOrder();
                                break;

                            case 6://See the list of orders
                                OrderDB.DisplayOrders();
                                break;

                            case 7://Add a new flowershop
                                System.out.println("\nEnter the requested information about the new flowershop.\n");
                                FlowershopDB.AddFlowershop();
                                break;

                            case 8://Update aflowershop
                                System.out.println("\nEnter the requested information about the flowershop.\n");
                                FlowershopDB.UpdateFlowershop();
                                break;

                            case 9://Delete a flowershop
                                System.out.println("\nEnter the requested information about the flowershop.\n");
                                FlowershopDB.DeleteFlowershop();
                                break;

                            case 10://See the flowershops
                                FlowershopDB.DisplayFlowerShop();
                                break;

                            case 11://Add a new bouquet
                                System.out.println("\nPlease, enter the requested information about the new bouquet.");
                                BouquetDB.AddBouquet();
                                break;

                            case 12:
                                //Update a bouquet.
                                System.out.println("\nPlease, enter the requested information about the bouquet you want to update.");
                                BouquetDB.UpdateBouquet();
                                break;

                            case 13:
                                //Delete a bouquet.
                                System.out.println("\nPlease, enter the requested information about the bouquet you want to delete.");
                                BouquetDB.DeleteBouquet();
                                break;

                            case 14:
                                //Add a giftbox.
                                System.out.println("\nPlease, enter the requested information about the new giftbox.");
                                GiftboxDB.AddGiftBox();
                                break;

                            case 15:
                                //Update a giftbox.
                                System.out.println("\nPlease, enter the requested information about the giftbox you want to update.");
                                GiftboxDB.UpdateGiftbox();
                                break;

                            case 16:
                                //Delete a giftbox.
                                System.out.println("\nPlease, enter the requested information about the giftbox you want to delete.");
                                GiftboxDB.DeleteBouquet();
                                break;

                            case 17:
                                System.out.println("\nPlease, enter the requested information about the new customer.");
                                CustomerDB.AddCustomer();
                                break;

                            case 18:
                                System.out.println("\nPlease, enter the requested information about the customer you want to delete.");
                                CustomerDB.DeleteCostumers();
                                break;

                            case 19:
                                System.out.println("\nPlease, enter the requested information about the customer you want to update.");
                                CustomerDB.UpdateCustomer();
                                break;

                            case 20:
                                System.out.println("\nCustomers ");
                                CustomerDB.DisplayCostumers();
                                break;

                            case 21:
                                System.out.println("\nEnter the requested information about the recipient you want to update. ");
                                RecipientDB.UpdateRecipient();
                                break;

                            case 22:
                                System.out.println("\nEnter the requested information about the recipient you want to delete. ");
                                RecipientDB.DeleteRecipient();
                                break;

                            case 23:
                                System.out.println("\nRecipients\n");
                                RecipientDB.DisplayRecipient();
                                break;

                            case 24:
                                System.out.println("\nAudit\n");
                                Audit.DisplayAuditDB();
                                break;

                            case 25:
                                Audit.DeleteAudit();
                                break;

                            case 26:
                                System.exit(0);
                                break;

                            default:
                                System.out.println("Wrong option. Please choose a valid option!\n");

                        }
                    } while (opt > 0 && opt < 27);
                    break;

                case 3:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Wrong option. Please choose a valid option!\n");

            }
        } while (op > 0 && op < 4);


    }
}

   /* public static void menu() throws IOException{

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
            System.out.println("4. Add a new FlowerShop.\n");
            System.out.println("5. Add a new bouquet.\n");
            System.out.println("6. Update a bouquet.\n");
            System.out.println("7. Delete a bouquet.\n");
            System.out.println("8. Add a new giftbox.\n");
            System.out.println("9. Update a giftbox.\n");
            System.out.println("10. Delete a giftbox.\n");
            System.out.println("11. Add a customer.\n");
            System.out.println("12. Delete a customer.\n");
            System.out.println("13. See the list of customers.\n");
            System.out.println("14. Admin mode\n");
            System.out.println("15. Exit\n");
             System.out.println("Write the digit of your option: ");
             option = scanner.nextInt();

                switch (option) {

                    case 1:
                        System.out.println("Bouquets\n");
                       // ReadCSV.read("src/com/company/Files/bouquets.csv");
                        //Display bouquets from DB.
                        BouquetDB.DisplayBouquet();
                        new Bouquet().message(); //created a new instance of the class Bouquet in order
                        //to call message which is a non-static method and cannot be simply called in a static method
                        System.out.println("\nGiftboxes\n");
                        //Display Giftboxes from DB.
                        GiftboxDB.DisplayGiftBox();
                        new GiftBox().message();
                       // ReadCSV.read("src/com/company/Files/giftboxes.csv");
                        Audit.audit("Seen list of products.");
                        break;

                    case 2: //Enter your account
                            Login.run();
                            break;



                    case 3:
                        //Place an order
                        System.out.println("\nWrite the requested information about your order.");
                        OrderDB.AddOrder();
                        break;

                    case 4:
                        //Add a new FlowerShop.
                        System.out.println("\nPlease, enter the requested information about the new flowershop.");
                        FlowershopDB.AddFlowershop();
                        break;


                    case 5:
                        //Add a new bouquet.
                        System.out.println("\nPlease, enter the requested information about the new bouquet.");
                        BouquetDB.AddBouquet();
                        break;

                    case 6 :
                        //Update a bouquet.
                        System.out.println("\nPlease, enter the requested information about the bouquet you want to update.");
                        BouquetDB.UpdateBouquet();
                        break;

                    case 7:
                        //Delete a bouquet.
                        System.out.println("\nPlease, enter the requested information about the bouquet you want to delete.");
                        BouquetDB.DeleteBouquet();
                        break;

                    case 8:
                        //Add a giftbox.
                        System.out.println("\nPlease, enter the requested information about the new giftbox.");
                        GiftboxDB.AddGiftBox();
                        break;

                    case 9:
                        //Update a giftbox.
                        System.out.println("\nPlease, enter the requested information about the giftbox you want to update.");
                        GiftboxDB.UpdateGiftbox();
                        break;

                    case 10:
                        //Delete a giftbox.
                        System.out.println("\nPlease, enter the requested information about the giftbox you want to delete.");
                        GiftboxDB.DeleteBouquet();
                        break;


                    case 11:
                        System.out.println("\nPlease, enter the requested information about the new customer.");
                        CustomerDB.AddCustomer();
                        break;

                    case 12:
                        System.out.println("\nPlease, enter the requested information about the customer you want to delete.");
                        CustomerDB.DeleteCostumers();
                        break;


                    case 13:
                        System.out.println("\nCustomers ");
                        CustomerDB.DisplayCostumers();
                        Audit.audit("Seen the list of customers.");
                        break;

                    case 14:
                        Login.run();

                        break;

                    case 15:
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Wrong option. Please choose a valid option!\n");
                }
            } while(option > 0 && option < 20);




    }
}*/
