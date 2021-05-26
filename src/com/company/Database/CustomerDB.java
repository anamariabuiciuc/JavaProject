package com.company.Database;

import com.company.Models.Customer;
import com.company.ReadWriteCSV.WriteAuthentication;
import com.company.Services.Audit;
import com.company.Services.AuthenticationCustomers;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class CustomerDB {


    public static void AddCustomer() {


        try {
            // Connection
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flowershop", "root", "ana1612");

            //Create an INSERT
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nNew customer :) ");
            System.out.println("\nLast name: ");
            String lastname = null;
            lastname = scanner.next();

            System.out.println("\nFirst name: ");
            String firstname = null;
            firstname = scanner.next();

            System.out.println("\nGender: ");
            char gender= '\0';
            gender = scanner.next().charAt(0);

            System.out.println("\nTelephone number: ");
            String telephone = null;
            telephone = scanner.next();

            System.out.println("\nMail Address: ");
            String mail = null;
            mail = scanner.next();

            System.out.println("\nDate of birth (e.g. 1999-1-15): ");
            String sdate = null; sdate = scanner.next();
            Date date = Date.valueOf(sdate);

            System.out.println("\nIdentification number: ");
            String cnp = null;
            cnp = scanner.next();

            String statement = "INSERT INTO Customer VALUES ('"+lastname+"', '"+firstname+"', '"+gender+"', '"+telephone+"', '"+mail+"', '"+date+"', '"+cnp+"');";
            PreparedStatement ps = myConn.prepareStatement(statement);
            int status = ps.executeUpdate();
            if (status != 0) {
                System.out.println("Successful connection! :) \n ");
                System.out.println("Successful operation! :) \n");
                Audit.audit("Successfully inserted " + lastname + " "+firstname+" id: "+cnp+" in our list of customers in DB.");
                Customer customer = new Customer(lastname,firstname,gender,telephone,mail,date,cnp);
                //Create account
                WriteAuthentication.writeAuthentication(customer);
            } else
                System.out.println("Oh, no. Something went wrong. :( \n");

        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public static void DisplayCostumers(){

        try {
            // Connection
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flowershop", "root", "ana1612");

            // Create an interogation
            Statement myStmt = myConn.createStatement();
            // Execute it

            ResultSet myRs = myStmt.executeQuery("select * from customer;");


            //Display
            while (myRs.next()) {
                System.out.println(myRs.getString("LastName") + ", " + myRs.getString("FirstName") + ", " + myRs.getString("Gender") + ", " + myRs.getString("TelephoneNumber") + ", " + myRs.getString("MailAddress") + ", " + myRs.getString("DateOfBirth") + ", " + myRs.getString("IdentificationNumber"));

            }

            Audit.audit("Displayed all customers from DB.");

        } catch (Exception exc) {
            exc.printStackTrace();
        }

    }

    public static void DeleteCostumers(){

        try{
            // Connection
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flowershop", "root", "ana1612");

            // Create an interogation
            Statement myStmt = myConn.createStatement();
            // Execute it
            Scanner scan = new Scanner(System.in);
            System.out.println("\nEnter the Identification number of the customer you want to delete: ");
            String identificationNr = null;
            identificationNr = scan.next();
            String myRs = ("delete from customer where IdentificationNumber = '" + identificationNr + "'");
            PreparedStatement ps = myConn.prepareStatement(String.valueOf(myRs));
            int status = ps.executeUpdate();
            if (status != 0) {
                System.out.println("Successful connection! :) \n ");
                System.out.println("Successful operation! :) \n");
                Audit.audit("Successfully deleted customer with Id. number " + identificationNr + " from DB.");
            } else
                System.out.println("Oh, no. Something went wrong. :( \n");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }

    public static void UpdateCustomer(){

        try{ // Connection
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flowershop", "root", "ana1612");

            // Create an interogation
            Statement myStmt = myConn.createStatement();
            // Execute it
            Scanner scan = new Scanner(System.in);
            System.out.println("\nUpdate a Customer:\n");
            System.out.println("\n1. Update the name.");
            System.out.println("\n2. Update the gender.");
            System.out.println("\n3. Update contact information.");
            System.out.println("\n4. Update the date of birth.");
            System.out.println("\n5. Update Identification number.");
            System.out.println("Write the digit of your option: ");

            Scanner sc = new Scanner(System.in);
            int option = 0;
            option = sc.nextInt();
            String id = null;
            System.out.println("\nEnter the Identification number of the customer you want to update: ");
            id = sc.next();
            switch (option) {

                case 1:
                    String newLastName = null;
                    String newFirstName = null;
                    System.out.println("\nEnter the new last name: ");
                    newLastName = sc.next();
                    System.out.println("\nEnter the new first name: ");
                    newFirstName = sc.next();
                    System.out.println("Now, your name is " + newLastName + " " + newFirstName + ". ");
                    String myRs1 = (" update customer set LastName ='" + newLastName + "', FirstName = '" + newFirstName + "' where IdentificationNumber = '" + id + "'");
                    PreparedStatement ps1 = myConn.prepareStatement((myRs1));
                    int status1 = ps1.executeUpdate();
                    if (status1 != 0) {
                        System.out.println("Successful connection! :) \n ");
                        System.out.println("Successful operation! :) \n");
                        Audit.audit("Successfully updated the name for Customer " + newLastName + " " + newFirstName + " with ID " + id + "in DB.");
                    } else System.out.println("Oh, no. Something went wrong. :( \n");
                    break;

                case 2:
                    char newGender = '\0';
                    System.out.println("\nEnter the new gender (only f or m accepted): ");
                    newGender = sc.next().charAt(0);
                    System.out.println("Now, your gender is  " + newGender + ". ");
                    String myRs2 = (" update customer set  Gender = '" + newGender + "' where IdentificationNumber = '" + id + "'");
                    PreparedStatement ps2 = myConn.prepareStatement((myRs2));
                    int status2 = ps2.executeUpdate();
                    if (status2 != 0) {
                        System.out.println("Successful connection! :) \n ");
                        System.out.println("Successful operation! :) \n");
                        Audit.audit("Successfully updated the gender" + newGender + " for Customer with ID " + id + "in DB.");
                    } else System.out.println("Oh, no. Something went wrong. :( \n");
                    break;


                case 3:
                    String newMail = null;
                    String newTelephoneNr = null;
                    System.out.println("\nEnter the new mail address: ");
                    newMail = sc.next();
                    System.out.println("\nEnter the new telephone number: ");
                    newTelephoneNr = sc.next();
                    System.out.println("Your new mail address: " + newMail + "and your new telephone number: "+newTelephoneNr+" .");
                    String myRs3 = (" update customer set  TelephoneNumber = '" + newTelephoneNr + "', MailAddress = '"+newMail+"' where IdentificationNumber = '" + id + "'");
                    PreparedStatement ps3 = myConn.prepareStatement((myRs3));
                    int status3 = ps3.executeUpdate();
                    if (status3 != 0) {
                        System.out.println("Successful connection! :) \n ");
                        System.out.println("Successful operation! :) \n");
                        Audit.audit("Successfully updated the telephone number and mail address for Customer with ID " + id + "in DB.");
                    } else System.out.println("Oh, no. Something went wrong. :( \n");

                    break;



                case 4:
                    System.out.println("\nEnter the new date of birth (e.g. 1999-03-27): ");
                    String NewSBirthday = null; NewSBirthday = sc.next();
                    Date newBirthday = Date.valueOf(NewSBirthday);
                    System.out.println("Now, your birthday is  " +newBirthday+ ". ");
                    String myRs4 = (" update customer set  DateOfBirth = '" + newBirthday + "' where IdentificationNumber = '" + id + "'");
                    PreparedStatement ps4 = myConn.prepareStatement((myRs4));
                    int status4 = ps4.executeUpdate();
                    if (status4 != 0) {
                        System.out.println("Successful connection! :) \n ");
                        System.out.println("Successful operation! :) \n");
                        Audit.audit("Successfully updated the date of birth for Customer with ID " + id + "in DB.");
                    } else System.out.println("Oh, no. Something went wrong. :( \n");
                    break;


                case 5:
                    System.out.println("\nEnter the new Identification number: ");
                    String newId = null;
                    newId = sc.next();
                    System.out.println("Now, your Id is  " +newId+ ". ");
                    String myRs5 = (" update customer set  IdentificationNumber = '" + newId + "' where IdentificationNumber = '" + id + "'");
                    PreparedStatement ps5 = myConn.prepareStatement((myRs5));
                    int status5 = ps5.executeUpdate();
                    if (status5 != 0) {
                        System.out.println("Successful connection! :) \n ");
                        System.out.println("Successful operation! :) \n");
                        Audit.audit("Successfully updated the ID "+newId+" for Customer with ID " + id + "in DB.");
                    } else System.out.println("Oh, no. Something went wrong. :( \n");
                    break;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

}

