package com.company.Database;
import com.company.Models.Bouquet;
import com.company.Models.Customer;
import com.company.Services.Audit;

import java.sql.Date;

import java.sql.*;
import java.util.Scanner;

public class BouquetDB {


    public static void AddBouquet() {


        try {
            // Connection
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flowershop", "root", "ana1612");

            // Create an interogation
            Statement myStmt = myConn.createStatement();
            // Execute it
            // ResultSet myRs = myStmt.executeQuery("select * from bouquet");

            //Create an INSERT
            Scanner scanner = new Scanner(System.in);
            System.out.println("Name of bouquet: ");
            String name = null;
            name = scanner.next();

            System.out.println("\nPrice of bouquet (RON): ");
            double price = 0;
            price = scanner.nextDouble();

            System.out.println("\nName of flowers: ");
            String flowers = null;
            flowers = scanner.next();

            System.out.println("\nNumber of flowers in the bouquet: ");
            int nrFlowers = 0;
            nrFlowers = scanner.nextInt();

            System.out.println("\nColor of flowers: ");
            String colorFlowers = null;
            colorFlowers = scanner.next();

            String statement = "INSERT INTO bouquet(productName, productPrice, nameFlowers, numberOfFlowers, colorOfFlowers) VALUES ('" + name + "','" + price + "','" + flowers + "','" + nrFlowers + "' ,'" + colorFlowers + "');";
            // String statement = "INSERT INTO bouquet(productName, productPrice,nameFlowers, numberOfFlowers, colorOfFlowers) VALUES ('"++"')";
            PreparedStatement ps = myConn.prepareStatement(statement);
            int status = ps.executeUpdate();
            if (status != 0) {
                System.out.println("Successful connection! :) \n ");
                System.out.println("Successful operation! :) \n");
                Audit.audit("Successfully inserted " + name + " Bouquet in DB.");
            } else
                System.out.println("Oh, no. Something went wrong. :( \n");
            // Display
            //       while (myRs.next()) {
            //          System.out.println(myRs.getString("productName"));
            //      }

        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public static void DisplayBouquet() {


        try {
            // Connection
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flowershop", "root", "ana1612");

            // Create an interogation
            Statement myStmt = myConn.createStatement();
            // Execute it

            ResultSet myRs = myStmt.executeQuery("select * from bouquet;");


            //Display
            while (myRs.next()) {
                System.out.println(myRs.getString("productName") + ", " + myRs.getString("productPrice") + " RON, " + myRs.getString("nameFlowers") + ", " + myRs.getString("numberOfFlowers") + " flowers, Color:" + myRs.getString("colorOfFlowers"));

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
            System.out.println("1. Delete all bouquets by name.\n");
            System.out.println("2. Delete all bouquets by price.\n");
            System.out.println("3. Delete all bouquets by type of flowers.\n");
            //    System.out.println("4. Delete all bouquets by number of flowers.\n");
            //  System.out.println("5. Delete all bouquets by color.\n");
            System.out.println("Write the digit of your option: ");

            Scanner sc = new Scanner(System.in);
            int option = 0;
            option = sc.nextInt();
            switch (option) {

                case 1:
                    String nameProduct = null;
                    System.out.println("\nWrite the name of the bouquet you want to delete: ");
                    nameProduct = sc.next();
                    String myRs = ("delete from bouquet where productName = '" + nameProduct + "'");
                    PreparedStatement ps = myConn.prepareStatement(String.valueOf(myRs));
                    int status = ps.executeUpdate();
                    if (status != 0) {
                        System.out.println("Successful connection! :) \n ");
                        System.out.println("Successful operation! :) \n");
                        Audit.audit("Successfully deleted " + nameProduct + " Bouquet from DB.");
                    } else
                        System.out.println("Oh, no. Something went wrong. :( \n");
                    break;

                case 2:
                    double priceProduct = 0;
                    System.out.println("\nWrite the price: ");
                    priceProduct = sc.nextDouble();
                    String myRs2 = ("delete from bouquet where productPrice = '" + priceProduct + "'");
                    PreparedStatement ps2 = myConn.prepareStatement((myRs2));
                    int status2 = ps2.executeUpdate();
                    if (status2 != 0) {
                        System.out.println("Successful connection! :) \n ");
                        System.out.println("Successful operation! :) \n");
                        Audit.audit("Successfully deleted all bouquest with Price: " + priceProduct + " RON from DB.");
                    } else
                        System.out.println("Oh, no. Something went wrong. :( \n");
                    break;


                case 3:
                    String typeFlowers = null;
                    System.out.println("\nWrite the type of flower: ");
                    typeFlowers = sc.next();
                    String myRs3 = ("delete from bouquet where nameFlowers = '" + typeFlowers + "'");
                    PreparedStatement ps3 = myConn.prepareStatement((myRs3));
                    int status3 = ps3.executeUpdate();
                    if (status3 != 0) {
                        System.out.println("Successful connection! :) \n ");
                        System.out.println("Successful operation! :) \n");
                        Audit.audit("Successfully deleted all bouquets with  " + typeFlowers + " from DB.");
                    } else
                        System.out.println("Oh, no. Something went wrong. :( \n");
                    break;
            }


        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public static void UpdateBouquet() {

        try {
            // Connection
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flowershop", "root", "ana1612");

            // Create an interogation
            Statement myStmt = myConn.createStatement();
            // Execute it
            System.out.println("\nUpdate a bouquet:\n");
            System.out.println("\n1. Make a discount.");
            System.out.println("\n2. Change the price.");
            System.out.println("Write the digit of your option: ");

            Scanner sc = new Scanner(System.in);
            int option = 0;
            option = sc.nextInt();
            String flowerType = null;
            String color = null;
            System.out.println("\nWrite the name of the type of flower: ");
            flowerType = sc.next();
            System.out.println("\nWrite the color of the flowers: ");
            color = sc.next();
            switch (option) {
                case 1:
                          double percentage = 0;
                          System.out.println("\nWrite the percentage discount you want to apply: ");
                          percentage = sc.nextDouble();
                          String myRs = (" update bouquet set productPrice =productPrice*((100-'"+ percentage +"')/100) where nameFlowers = '"+flowerType+"' and colorOfFlowers = '" + color + "'");
                          PreparedStatement ps = myConn.prepareStatement((myRs));
                          int status = ps.executeUpdate();
                          if (status != 0) {
                           System.out.println("Successful connection! :) \n ");
                           System.out.println("Successful operation! :) \n");
                           Audit.audit("Successfully applied "+percentage+"% discount for all bouquest with "+color +" "+flowerType +" from DB. ");}
                          else{
                          System.out.println("Oh, no. Something went wrong. :( \n"); }
                          break;

                case 2:
                         double pricePerPiece = 0;
                        System.out.println("\nWrite the new price per piece: ");
                        pricePerPiece = sc.nextDouble();
                        String myRs2 = (" update bouquet set productPrice =numberOfFlowers*'"+pricePerPiece+"' where nameFlowers = '"+flowerType+"' and colorOfFlowers = '" + color + "'");
                        PreparedStatement ps2 = myConn.prepareStatement((myRs2));
                        int status2 = ps2.executeUpdate();
                        if (status2 != 0) {
                            System.out.println("Successful connection! :) \n ");
                            System.out.println("Successful operation! :) \n");
                            Audit.audit("Successfully updated the price for all bouquest with "+color +" "+flowerType +" from DB. New price per piece: "+pricePerPiece+" RON");}
                        else System.out.println("Oh, no. Something went wrong. :( \n");
                     break;

            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
