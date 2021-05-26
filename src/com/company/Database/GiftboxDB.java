package com.company.Database;

import com.company.Services.Audit;

import java.sql.*;
import java.util.Scanner;

public class GiftboxDB {


    public static void AddGiftBox() {


        try {
            // Connection
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flowershop", "root", "ana1612");

            // Create an interogation
            Statement myStmt = myConn.createStatement();


            //Create an INSERT
            Scanner scanner = new Scanner(System.in);
            System.out.println("Name of the GiftBox: ");
            String name = null;
            name = scanner.next();

            System.out.println("\nPrice of the GiftBox (RON): ");
            double price = 0;
            price = scanner.nextDouble();

            System.out.println("\nDimension of the GiftBox (only Small,Medium,Big) : ");
            String dimension = null;
            dimension = scanner.next();

            System.out.println("\nType of the GiftBox (e.g. Beauty (with beauty products), Delicious (with sweets), Deluxe (with champagne) : ");
            String type = null;
            type = scanner.next();

            String statement = "INSERT INTO giftbox(productName, productPrice, dimension, typeGift) VALUES ('" + name + "','" + price + "','" + dimension + "','" + type + "' );";
            PreparedStatement ps = myConn.prepareStatement(statement);
            int status = ps.executeUpdate();
            if (status != 0) {
                System.out.println("Successful connection! :) \n ");
                System.out.println("Successful operation! :) \n");
                Audit.audit("Successfully inserted " + name + " GiftBox in DB.");
            } else
                System.out.println("Oh, no. Something went wrong. :( \n");

        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }


    public static void DisplayGiftBox() {


        try {
            // Connection
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flowershop", "root", "ana1612");

            // Create an interogation
            Statement myStmt = myConn.createStatement();
            // Execute it
            ResultSet myRs = myStmt.executeQuery("select * from giftbox;");

            //Display
            while (myRs.next()) {
                System.out.println(myRs.getString("productName") + ", " + myRs.getString("productPrice") + " RON, " + myRs.getString("dimension") + ", " + myRs.getString("typeGift"));

            }

        } catch (Exception exc) {
            exc.printStackTrace();
        }

    }

    public static void DeleteBouquet() {

        try {
            // Connection
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flowershop", "root", "ana1612");

            // Create an interogation
            Statement myStmt = myConn.createStatement();
            // Execute it
            System.out.println("\nChoose an option:\n");
            System.out.println("1. Delete all GiftBoxes by name.\n");
            System.out.println("2. Delete all GiftBoxes by price.\n");
            System.out.println("3. Delete all GiftBoxes by type.\n");
            System.out.println("Write the digit of your option: ");

            Scanner sc = new Scanner(System.in);
            int option = 0;
            option = sc.nextInt();
            switch (option) {

                case 1:
                    String nameProduct = null;
                    System.out.println("\nEnter the name of the Giftbox you want to delete: ");
                    nameProduct = sc.next();
                    String myRs = ("delete from giftbox where productName = '" + nameProduct + "'");
                    PreparedStatement ps = myConn.prepareStatement(String.valueOf(myRs));
                    int status = ps.executeUpdate();
                    if (status != 0) {
                        System.out.println("Successful connection! :) \n ");
                        System.out.println("Successful operation! :) \n");
                        Audit.audit("Successfully deleted " + nameProduct + " GiftBox from DB.");
                    } else
                        System.out.println("Oh, no. Something went wrong. :( \n");
                    break;

                case 2:
                    double priceProduct = 0;
                    System.out.println("\nEnter the price: ");
                    priceProduct = sc.nextDouble();
                    System.out.println("\nAll Giftboxes with price: "+priceProduct+ " RON  will be deleted.");
                    String myRs2 = ("delete from giftbox where productPrice = '" + priceProduct + "'");
                    PreparedStatement ps2 = myConn.prepareStatement((myRs2));
                    int status2 = ps2.executeUpdate();
                    if (status2 != 0) {
                        System.out.println("Successful connection! :) \n ");
                        System.out.println("Successful operation! :) \n");
                        Audit.audit("Successfully deleted all giftboxes with Price: " + priceProduct + " RON from DB.");
                    } else
                        System.out.println("Oh, no. Something went wrong. :( \n");
                    break;


                case 3:
                    String typeGiftBox = null;
                    System.out.println("\nEnter the type of the Giftboxes you want to delete: ");
                    typeGiftBox = sc.next();
                    System.out.println("\nAll" +typeGiftBox+ " Giftboxes will be deleted.");
                    String myRs3 = ("delete from giftbox where typeGift = '" + typeGiftBox + "'");
                    PreparedStatement ps3 = myConn.prepareStatement((myRs3));
                    int status3 = ps3.executeUpdate();
                    if (status3 != 0) {
                        System.out.println("Successful connection! :) \n ");
                        System.out.println("Successful operation! :) \n");
                        Audit.audit("Successfully deleted all" + typeGiftBox + " giftboxes from DB.");
                    } else
                        System.out.println("Oh, no. Something went wrong. :( \n");
                    break;
            }


        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }


    public static void UpdateGiftbox() {

        try {
            // Connection
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flowershop", "root", "ana1612");

            // Create an interogation
            Statement myStmt = myConn.createStatement();
            // Execute it
            System.out.println("\nUpdate a giftbox:\n");
            System.out.println("\n1. Make a discount.");
            System.out.println("\n2. Change the price.");
            System.out.println("Write the digit of your option: ");

            Scanner sc = new Scanner(System.in);
            int option = 0;
            option = sc.nextInt();

            switch (option) {
                case 1:
                    String giftboxDimension = null;
                    String giftboxType = null;
                    System.out.println("\nEnter the name of the dimension of giftbox: ");
                    giftboxDimension = sc.next();
                    System.out.println("\nEnter the name of the type of giftbox: ");
                    giftboxType = sc.next();
                    double percentage = 0;
                    System.out.println("\nWrite the percentage discount you want to apply: ");
                    percentage = sc.nextDouble();
                    String myRs = (" update giftbox set productPrice =productPrice*((100-'"+ percentage +"')/100) where dimension = '"+giftboxDimension+"' and typeGift = '" +giftboxType+ "'");
                    PreparedStatement ps = myConn.prepareStatement((myRs));
                    int status = ps.executeUpdate();
                    if (status != 0) {
                        System.out.println("Successful connection! :) \n ");
                        System.out.println("Successful operation! :) \n");
                        Audit.audit("Successfully applied "+percentage+"% discount for all " +giftboxDimension+" "+giftboxType+" giftboxes  from DB. ");}
                    else{
                        System.out.println("Oh, no. Something went wrong. :( \n"); }
                    break;

                case 2:
                    System.out.println("Enter the name of the giftbox for which you want to change the price: ");
                    String nameGiftBox = null;
                    nameGiftBox = sc.next();
                    double newPrice = 0;
                    System.out.println("\nEnter the new price: ");
                    newPrice = sc.nextDouble();
                    String myRs2 = (" update giftbox set productPrice ='"+newPrice+"' where productName = '"+nameGiftBox+"' ");
                    PreparedStatement ps2 = myConn.prepareStatement((myRs2));
                    int status2 = ps2.executeUpdate();
                    if (status2 != 0) {
                        System.out.println("Successful connection! :) \n ");
                        System.out.println("Successful operation! :) \n");
                        Audit.audit("Successfully updated the price ("+newPrice+ " RON) for "+nameGiftBox+ " giftbox in DB.");}
                    else System.out.println("Oh, no. Something went wrong. :( \n");
                    break;

            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
