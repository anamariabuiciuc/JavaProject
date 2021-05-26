package com.company.Services;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class Audit {
    private static Audit audits = null;

    private Audit() {}

    public static Audit getInstance() {
        if (audits == null) {
            audits = new Audit();
        }
        return audits;
    }
    public static void audit (String action) {
        String path = "src/com/company/Files/audit.csv";
        try {
            FileWriter fileWriter = new FileWriter(path, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();

            //Insert the same information in the database.
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flowershop", "root", "ana1612");
            Statement myStmt = myConn.createStatement();
            String statement = "INSERT INTO audit(actionName,timestamp) VALUES ('" + action+ "','" + dtf.format(now)+ "');";
            PreparedStatement ps = myConn.prepareStatement(statement);
            int status = ps.executeUpdate();
            if (status != 0) {
                System.out.println("Successfully recorded this action! :) \n");
            } else
                System.out.println("Oh, no. Something went wrong. :( \n");

            printWriter.println(action + "," + dtf.format(now));
            printWriter.flush();
            printWriter.close();
        } catch (IOException | SQLException e) {
            e.printStackTrace();
            System.out.println("Oops. Something went wrong with this file. :(");
        }
    }

    public static void DisplayAuditDB(){

        try {
            // Connection
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flowershop", "root", "ana1612");

            // Create an interogation
            Statement myStmt = myConn.createStatement();
            // Execute it
            ResultSet myRs = myStmt.executeQuery("select * from audit;");

            //Display
            while (myRs.next()) {
                System.out.println(myRs.getString("actionName") + ", " + myRs.getString("timestamp") );

            }

            Audit.audit("Seen audit from DB.");

        } catch (Exception exc) {
            exc.printStackTrace();
        }


    }

    public static void DeleteAudit() {//Delete all actions done by a certain date.

        try {
            // Connection
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flowershop", "root", "ana1612");

            // Create an interogation
            Statement myStmt = myConn.createStatement();
            // Execute it
            System.out.println("Delete from audit the actions stored to DATE (e.g 24/05/2021 23:00:00)\n");
            System.out.println("Enter the date: \n");

            Scanner scanner = new Scanner(System.in);
            String sdate = null; sdate = scanner.next();
            java.sql.Date date = Date.valueOf(sdate);


            String myRs = ("delete from audit where timestamp <= '" + sdate+ "'");
            PreparedStatement ps = myConn.prepareStatement(String.valueOf(myRs));
            int status = ps.executeUpdate();
            if (status != 0) {
                System.out.println("Successful connection! :) \n ");
                System.out.println("Successful operation! :) \n");
                Audit.audit("Successfully deleted all actions from audit until " + sdate+ ", from DB.");
            } else
                System.out.println("Oh, no. Something went wrong. :( \n");




        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    //Update it is not necessary.

}
