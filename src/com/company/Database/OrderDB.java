package com.company.Database;

import com.company.Models.Customer;
import com.company.Models.Product;
import com.company.ReadWriteCSV.WriteAuthentication;
import com.company.Services.Audit;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class OrderDB {


    public static void AddOrder() {


        try {
            // Connection
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flowershop", "root", "ana1612");

            //Create an INSERT
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nNew order :) ");
            int id = 0;
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            LocalDateTime now = LocalDateTime.now();
            System.out.println("\n Date: "+dtf.format(now));

            System.out.println("\nEnter your identification number: ");
            String cnp = null;
            cnp = scanner.next();

            RecipientDB.AddRecipient();

            System.out.println("\nConfirm them telephone number: ");
            String telephone = null;
            telephone = scanner.next();

            System.out.println("\nNumber of products you want to buy: ");
            int nrProducts = scanner.nextInt();

            System.out.println("\nPlease, enter the names of the products you want to buy and separate them by comma. E.g. RedRoses,WhiteTulips");
            String names = scanner.next();


            String statement = "INSERT INTO orders VALUES ('"+id+"','"+dtf.format(now)+"', '"+cnp+"', '"+telephone+"', '"+names+"', '"+nrProducts+"');";
            PreparedStatement ps = myConn.prepareStatement(statement);
            int status = ps.executeUpdate();
            if (status != 0) {
                System.out.println("Successful connection! :) \n ");
                System.out.println("Successful operation! :) \n");
                Audit.audit("Successfully inserted a new order from customer with id " +cnp+ " in DB.");
            } else
                System.out.println("Oh, no. Something went wrong. :( \n");

        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public static void DisplayOrders(){

        try {
            // Connection
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flowershop", "root", "ana1612");

            // Create an interogation
            Statement myStmt = myConn.createStatement();
            // Execute it

            ResultSet myRs = myStmt.executeQuery("select * from orders;");

           System.out.print("\nId  Date order  Id Customer  TelRecipient   Products List    Nr of products\n");
            //Display
            while (myRs.next()) {
                System.out.println(myRs.getString("Id_order") + ", " + myRs.getString("Date_order") + ", " + myRs.getString("Id_buyer") + ", " + myRs.getString("telephoneRecipient") + ", " + myRs.getString("productsList") + ", " + myRs.getString("numberOfProducts") );

            }
            Audit.audit("Displayed all the orders from DB.");



        } catch (Exception exc) {
            exc.printStackTrace();
        }

    }

    public static void DeleteOrder() {//delete order by its id

        try {
            // Connection
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flowershop", "root", "ana1612");

            // Create an interogation
            Statement myStmt = myConn.createStatement();
            // Execute it
            System.out.println("\nEnter the ID for the order you want to delete: \n");

            Scanner sc = new Scanner(System.in);
            int id_order = 0;
            id_order = sc.nextInt();

            String nameProduct = null;
            String myRs = ("delete from order where Id_order = '" + id_order + "'");
            PreparedStatement ps = myConn.prepareStatement(String.valueOf(myRs));
            int status = ps.executeUpdate();
            if (status != 0) {
                System.out.println("Successful connection! :) \n ");
                System.out.println("Successful operation! :) \n");
                Audit.audit("Successfully deleted Order " + id_order + "  from DB.");
            } else
                System.out.println("Oh, no. Something went wrong. :( \n");


        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

        public static void UpdateOrder() {//Update products list and number of products

            try {
                // Connection
                Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flowershop", "root", "ana1612");

                // Create an interogation
                Statement myStmt = myConn.createStatement();
                // Execute it
                System.out.println("\nUpdate the products list of your order.\n");
                System.out.println("\nEnter the ID for the order you want to update: \n");


                Scanner scanner = new Scanner(System.in);


                int idOrd = 0; idOrd = scanner.nextInt();
                System.out.println("\nNumber of products you want to buy: ");
                int nr = scanner.nextInt();

                System.out.println("\nPlease, enter the names of the products you want to buy and separate them by comma. E.g. RedRoses,WhiteTulips");
                String nameProducts = scanner.next();

                String myRs = (" update orders set productsList='"+ nameProducts +"', numberOfProducts='"+nr+"' where Id_order = '"+idOrd+"' ");
                PreparedStatement ps = myConn.prepareStatement((myRs));
                int status = ps.executeUpdate();
                if (status != 0) {
                    System.out.println("Successful connection! :) \n ");
                    System.out.println("Successful operation! :) \n");
                    Audit.audit("Successfully updated the products list for Order "+idOrd+" in DB.");}
                else{
                    System.out.println("Oh, no. Something went wrong. :( \n"); }




            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }





}
