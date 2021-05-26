package com.company.Database;

import com.company.Models.Customer;
import com.company.ReadWriteCSV.WriteAuthentication;
import com.company.Services.Audit;

import java.sql.*;
import java.util.Scanner;

public class RecipientDB {

    public static void AddRecipient() {


        try {
            // Connection
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flowershop", "root", "ana1612");

            //Create an INSERT
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nNew recipient :) ");
            System.out.println("\nLast name: ");
            String lastname = null;
            lastname = scanner.next();

            System.out.println("\nFirst name: ");
            String firstname = null;
            firstname = scanner.next();

            System.out.println("\nGender: ");
            char gender = '\0';
            gender = scanner.next().charAt(0);

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

            String statement = "INSERT INTO recipient VALUES ('" + lastname + "', '" + firstname + "', '" + gender + "', '" + telephone + "', '" + mail + "', '" + county + "', '" + town + "', '" + street + "', '" + nr + "', '" + postalCode + "');";
            PreparedStatement ps = myConn.prepareStatement(statement);
            int status = ps.executeUpdate();
            if (status != 0) {
                System.out.println("Successful connection! :) \n ");
                System.out.println("Successful operation! :) \n");
                Audit.audit("Successfully inserted " + lastname + " " + firstname + "  in recipient list in DB.");
            } else
                System.out.println("Oh, no. Something went wrong. :( \n");

        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public static void DisplayRecipient() {

        try {
            // Connection
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flowershop", "root", "ana1612");

            // Create an interogation
            Statement myStmt = myConn.createStatement();
            // Execute it

            ResultSet myRs = myStmt.executeQuery("select * from recipient;");


            //Display
            while (myRs.next()) {
                System.out.println(myRs.getString("lName") + ", " + myRs.getString("fName") + ", " + myRs.getString("gen") + ", " + myRs.getString("tel") + ", " + myRs.getString("mailAdd") + ", Address: " + myRs.getString("countyR") + ", " + myRs.getString("townR") + ", " + myRs.getString("streetR") + ", " + myRs.getString("nrR") + ", " + myRs.getString("postalCodeR"));

            }

            Audit.audit("Displayed all recipients from DB.");


        } catch (Exception exc) {
            exc.printStackTrace();
        }

    }

    public static void DeleteRecipient(){

        try{
            // Connection
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flowershop", "root", "ana1612");

            // Create an interogation
            Statement myStmt = myConn.createStatement();
            // Execute it
            Scanner scan = new Scanner(System.in);
            System.out.println("\nEnter the telephone number of the recipient you want to delete: ");
            String teleph = null;
            teleph = scan.next();
            String myRs = ("delete from recipient where tel = '" + teleph + "'");
            PreparedStatement ps = myConn.prepareStatement(String.valueOf(myRs));
            int status = ps.executeUpdate();
            if (status != 0) {
                System.out.println("Successful connection! :) \n ");
                System.out.println("Successful operation! :) \n");
                Audit.audit("Successfully deleted recipient with telephone number " + teleph + " from DB.");
            } else
                System.out.println("Oh, no. Something went wrong. :( \n");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }


    public static void UpdateRecipient(){

        try{ // Connection
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flowershop", "root", "ana1612");

            // Create an interogation
            Statement myStmt = myConn.createStatement();
            // Execute it
            Scanner scan = new Scanner(System.in);
            System.out.println("\nUpdate a Recipient\n");
            System.out.println("\n1. Update the name.");
            System.out.println("\n2. Update the gender.");
            System.out.println("\n3. Update contact information.");
            System.out.println("\n4. Update address.");
            System.out.println("Write the digit of your option: ");

            Scanner sc = new Scanner(System.in);
            int option = 0;
            option = sc.nextInt();
            String t = null;
            System.out.println("\nEnter the telephone number of the recipient you want to update: ");
            t = sc.next();
            switch (option) {

                case 1:
                    String newLastName = null;
                    String newFirstName = null;
                    System.out.println("\nEnter the new last name: ");
                    newLastName = sc.next();
                    System.out.println("\nEnter the new first name: ");
                    newFirstName = sc.next();
                    System.out.println("Now, the name is " + newLastName + " " + newFirstName + ". ");
                    String myRs1 = (" update recipient set lName ='" + newLastName + "', fName = '" + newFirstName + "' where tel = '" + t + "'");
                    PreparedStatement ps1 = myConn.prepareStatement((myRs1));
                    int status1 = ps1.executeUpdate();
                    if (status1 != 0) {
                        System.out.println("Successful connection! :) \n ");
                        System.out.println("Successful operation! :) \n");
                        Audit.audit("Successfully updated the name for Recipient " + newLastName + " " + newFirstName + " with telephone number " + t + "in DB.");
                    } else System.out.println("Oh, no. Something went wrong. :( \n");
                    break;

                case 2:
                    char newGender = '\0';
                    System.out.println("\nEnter the new gender (only f or m accepted): ");
                    newGender = sc.next().charAt(0);
                    System.out.println("Now,the gender is  " + newGender + ". ");
                    String myRs2 = (" update recipient set gen = '" + newGender + "' where tel = '" + t + "'");
                    PreparedStatement ps2 = myConn.prepareStatement((myRs2));
                    int status2 = ps2.executeUpdate();
                    if (status2 != 0) {
                        System.out.println("Successful connection! :) \n ");
                        System.out.println("Successful operation! :) \n");
                        Audit.audit("Successfully updated the gender" + newGender + " for Recipient with telephone number " + t + "in DB.");
                    } else System.out.println("Oh, no. Something went wrong. :( \n");
                    break;


                case 3:
                    String newMail = null;
                    String newTelephoneNr = null;
                    System.out.println("\nEnter the new mail address: ");
                    newMail = sc.next();
                    System.out.println("\nEnter the new telephone number: ");
                    newTelephoneNr = sc.next();
                    System.out.println("The new mail address: " + newMail + "and the new telephone number: "+newTelephoneNr+" .");
                    String myRs3 = (" update recipient set  tel = '" + newTelephoneNr + "', mailAdd = '"+newMail+"' where tel = '" + t + "'");
                    PreparedStatement ps3 = myConn.prepareStatement((myRs3));
                    int status3 = ps3.executeUpdate();
                    if (status3 != 0) {
                        System.out.println("Successful connection! :) \n ");
                        System.out.println("Successful operation! :) \n");
                        Audit.audit("Successfully updated the telephone number and mail address for Recipient with telephone number " + t + "in DB.");
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

                    String myRs4 = (" update recipient set  countyR = '" + countyNew + "', townR = '"+townNew+"', streetR ='"+streetNew+"', nrR = '"+nrNew+"', postalCodeR = '"+postalCodeNew+"' where tel = '" + t + "'");
                    PreparedStatement ps4 = myConn.prepareStatement((myRs4));
                    int status4 = ps4.executeUpdate();
                    if (status4 != 0) {
                        System.out.println("Successful connection! :) \n ");
                        System.out.println("Successful operation! :) \n");
                        Audit.audit("Successfully updated the address for Recipient with telephone number " + t + "in DB.");
                    } else System.out.println("Oh, no. Something went wrong. :( \n");
                    break;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

}
