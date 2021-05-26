package com.company.Database;

import com.company.FlowerShop;
import com.company.Models.Customer;
import com.company.ReadWriteCSV.WriteAuthentication;
import com.company.Services.Audit;

import java.sql.*;
import java.util.Scanner;

public class FlowershopDB {

    public static void AddFlowershop() {


        try {
            // Connection
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flowershop", "root", "ana1612");

            //Create an INSERT
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nNew flowershop :) ");
            System.out.println("\nName: ");
            String name = null;
            name = scanner.next();

            System.out.println("\nTelephone number: ");
            String telephone = null;
            telephone = scanner.next();

            System.out.println("\nMail Address: ");
            String mail = null;
            mail = scanner.next();

            System.out.println("\nNow, we need the address: ");
            System.out.println("\nCounty: ");
            String county = null;
            county = scanner.next();

            System.out.println("\nTown: ");
            String town = null;
            town = scanner.next();

            System.out.println("\nStreet: ");
            String street = null;
            street = scanner.next();

            System.out.println("\nNumber: ");
            String nr = null;
            nr = scanner.next();

            System.out.println("\nPostal code: ");
            int postalCode = 0;
            postalCode = scanner.nextInt();

            String statement = "INSERT INTO flowershop VALUES ('"+name+"', '"+telephone+"', '"+mail+"', '"+county+"', '"+town+"', '"+street+"', '"+nr+"', '"+postalCode+"');";
            PreparedStatement ps = myConn.prepareStatement(statement);
            int status = ps.executeUpdate();
            if (status != 0) {
                System.out.println("Successful connection! :) \n ");
                System.out.println("Successful operation! :) \n");
                Audit.audit("Successfully inserted " + name + " flowershop from "+town+" in DB.");
                FlowerShop flowershop= new FlowerShop(name,telephone,mail,county,town,street,nr,postalCode);
                //Create account for the flowershop
                //WriteAuthentication.writeAuthentication(flowershop);
            } else
                System.out.println("Oh, no. Something went wrong. :( \n");

        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public static void DisplayFlowerShop(){

        try {
            // Connection
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flowershop", "root", "ana1612");

            // Create an interogation
            Statement myStmt = myConn.createStatement();
            // Execute it

            ResultSet myRs = myStmt.executeQuery("select * from flowershop;");


            //Display
            while (myRs.next()) {
                System.out.println(myRs.getString("nameFlowerShop") + ", " + myRs.getString("telNumber") + ", " + myRs.getString("mail") + ", " + myRs.getString("county") + ", " + myRs.getString("town") + ", " + myRs.getString("street") + ", " + myRs.getString("nr")+ ", " + myRs.getString("postalCode"));

            }

            Audit.audit("Displayed all flowershops from DB.");

        } catch (Exception exc) {
            exc.printStackTrace();
        }

    }


    public static void DeleteFlowershop(){

        try{
            // Connection
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flowershop", "root", "ana1612");

            // Create an interogation
            Statement myStmt = myConn.createStatement();
            // Execute it
            Scanner scan = new Scanner(System.in);
            System.out.println("\nEnter the name of the flowershop you want to delete: ");
            String nameFl = null;
            nameFl = scan.next();
            String myRs = ("delete from flowershop where nameFlowerShop = '" + nameFl + "'");
            PreparedStatement ps = myConn.prepareStatement(String.valueOf(myRs));
            int status = ps.executeUpdate();
            if (status != 0) {
                System.out.println("Successful connection! :) \n ");
                System.out.println("Successful operation! :) \n");
                Audit.audit("Successfully deleted FlowerShop with name " + nameFl + " from DB.");
            } else
                System.out.println("Oh, no. Something went wrong. :( \n");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }

    public static void UpdateFlowershop(){

        try{ // Connection
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flowershop", "root", "ana1612");

            // Create an interogation
            Statement myStmt = myConn.createStatement();
            // Execute it
            Scanner scan = new Scanner(System.in);
            System.out.println("\nUpdate a Flowershop\n");
            System.out.println("\n1. Update the name.");
            System.out.println("\n2. Update contact information.");
            System.out.println("\n3. Update address.");
            System.out.println("Write the digit of your option: ");

            Scanner sc = new Scanner(System.in);
            int option = 0;
            option = sc.nextInt();
            String nameShop = null;
            System.out.println("\nEnter the name of the flowershop you want to update: ");
            nameShop = sc.next();
            switch (option) {

                case 1:
                    String newName = null;
                    System.out.println("\nEnter the new name: ");
                    newName = sc.next();

                    System.out.println("Now, the name of flowershop is " + newName +". ");
                    String myRs1 = (" update flowershop set nameFlowerShop ='" + newName + "' where nameFlowerShop = '" + nameShop + "'");
                    PreparedStatement ps1 = myConn.prepareStatement((myRs1));
                    int status1 = ps1.executeUpdate();
                    if (status1 != 0) {
                        System.out.println("Successful connection! :) \n ");
                        System.out.println("Successful operation! :) \n");
                        Audit.audit("Successfully updated the name for Flowershop " + newName + " with old name " + nameShop + "in DB.");
                    } else System.out.println("Oh, no. Something went wrong. :( \n");
                    break;


                case 2:
                    String newMail = null;
                    String newTelephoneNr = null;
                    System.out.println("\nEnter the new mail address: ");
                    newMail = sc.next();
                    System.out.println("\nEnter the new telephone number: ");
                    newTelephoneNr = sc.next();
                    System.out.println("The new mail address: " + newMail + "and the new telephone number: "+newTelephoneNr+" .");
                    String myRs3 = (" update flowershop set  telNumber = '" + newTelephoneNr + "', mail = '"+newMail+"' where nameFlowerShop = '" + nameShop + "'");
                    PreparedStatement ps3 = myConn.prepareStatement((myRs3));
                    int status3 = ps3.executeUpdate();
                    if (status3 != 0) {
                        System.out.println("Successful connection! :) \n ");
                        System.out.println("Successful operation! :) \n");
                        Audit.audit("Successfully updated the telephone number and mail address for FlowerShop " + nameShop + "in DB.");
                    } else System.out.println("Oh, no. Something went wrong. :( \n");

                    break;


                case 4:
                    System.out.println("\nEnter the new Address: ");

                    System.out.println("\nCounty: ");
                    String countyNew = null;
                    countyNew = sc.next();

                    System.out.println("\nTown: ");
                    String townNew = null;
                    townNew = sc.next();

                    System.out.println("\nStreet: ");
                    String streetNew = null;
                    streetNew = sc.next();

                    System.out.println("\nNumber: ");
                    String nrNew = null;
                    nrNew = sc.next();

                    System.out.println("\nPostal code: ");
                    int postalCodeNew = 0;
                    postalCodeNew = sc.nextInt();

                    String myRs4 = (" update flowershop set  county = '" + countyNew + "', town = '"+townNew+"', street ='"+streetNew+"', nr = '"+nrNew+"', postalCode = '"+postalCodeNew+"' where nameFlowerShop = '" + nameShop + "'");
                    PreparedStatement ps4 = myConn.prepareStatement((myRs4));
                    int status4 = ps4.executeUpdate();
                    if (status4 != 0) {
                        System.out.println("Successful connection! :) \n ");
                        System.out.println("Successful operation! :) \n");
                        Audit.audit("Successfully updated the address for Flowershop " + nameShop + "in DB.");
                    } else System.out.println("Oh, no. Something went wrong. :( \n");
                    break;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }


}
