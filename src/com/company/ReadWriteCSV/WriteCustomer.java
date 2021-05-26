package com.company.ReadWriteCSV;

import java.sql.Date;

import java.io.FileWriter;
import java.io.IOException;

public class WriteCustomer {
    private final static String path = "src/com/company/Files/customers.csv";

    public static void writeCustomer(String lastName, String firstName, char gender, String telephoneNumber, String mailAddress , Date dateOfBirthday, String identificationNumber)
    {
        FileWriter fileWriter;
        try{

            fileWriter = new FileWriter((path), true);

            String stringBuilder =
                    identificationNumber +
                            "," +lastName +
                    "," + firstName +
                    "," + gender +
                    "," + telephoneNumber +
                    "," + mailAddress +
                    "," + dateOfBirthday +
                    "\n";

            fileWriter.write(stringBuilder);
            fileWriter.flush();
            fileWriter.close();

        }

        catch(IOException e)
        {
            e.printStackTrace();
            System.out.println("Oops. Something went wrong. :(");
        }

    }

}
