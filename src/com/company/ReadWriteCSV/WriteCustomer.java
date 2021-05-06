package com.company.ReadWriteCSV;

import com.company.Models.Date;

import java.io.FileWriter;
import java.io.IOException;

public class WriteCustomer {
    private final static String path = "src/com/company/Files/customers.csv";

    public static void writeCustomer(String lastName, String firstName, char gender, String telephoneNumber, String mailAddress , Date dateOfBirthday, String identificationNumber)
    {
        FileWriter fileWriter;
        try{

            fileWriter = new FileWriter((path), true);

            String stringBuilder = lastName +
                    "," + firstName +
                    "," + gender +
                    "," + telephoneNumber +
                    "," + mailAddress +
                    "," + dateOfBirthday +
                    "," + identificationNumber +
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
