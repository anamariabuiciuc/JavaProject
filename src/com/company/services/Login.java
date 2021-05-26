package com.company.Services;

import com.company.ReadWriteCSV.SearchCSVLine;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Login {

    public static void run() throws IOException {

        Scanner keyboard = new Scanner(System.in);


        System.out.println("Mail address: ");
        String inpUser = keyboard.next();
        System.out.println("Password: ");
        String inpPass = keyboard.next(); // gets input from user

        boolean user = SearchCSVLine.searchCsvLine(0, inpUser);
        boolean pass = SearchCSVLine.searchCsvLine(1, inpPass);

        boolean loginVar = false;

        if (user == true && pass == true) {
            System.out.print("Welcome back! :) \n");
            Audit.audit(inpUser + " logged in.");

        } else if (user == true && pass == false) {
            System.out.print("Login failed. Wrong credentials. \n");
            Audit.audit(inpUser + " tried to log in but failed.");

        } else {

                System.out.println("This mail address is not registered.");
                Audit.audit(inpUser + " tried to log in but it's not registered.");



            }
    }
}

