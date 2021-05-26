package com.company.ReadWriteCSV;

import com.company.FlowerShop;
import com.company.Models.Customer;

import java.sql.*;

import com.company.Models.Product;
import com.company.Models.Recipient;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class WriteAuthentication {
    private final static String path = "src/com/company/Files/authentication.csv";

    public static void writeAuthentication(Customer customer){
        FileWriter fileWriter;
        String password = null;
        String pass = null;

        try{
            Scanner s = new Scanner(System.in);
            fileWriter = new FileWriter((path), true);

            System.out.println("\n Please, write a password for your account: ");
            pass = s.next();
            System.out.println("\nConfirm your password: ");
            password = s.next();

            if(pass.equals(password) == false)
            {
                System.out.println("The passwords do not match. ");

                    System.out.println("\n Write a password: ");
                    pass = s.next();
                    System.out.println("\nConfirm your password: ");
                    password = s.next();

            }


                System.out.println("Successfull authentication!");
                String stringBuilder = customer.getMailAddress() +
                        "," + password +
                        "\n";

                fileWriter.write(stringBuilder);



             //   System.out.println("Oh, no. Something went wrong. :( \n");
                fileWriter.flush();
                fileWriter.close();

        }

        catch (IOException e)
        {
            e.printStackTrace();
            System.out.println("Oops. Something went wrong. :(");
        }
    }


}
