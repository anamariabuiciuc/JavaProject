package com.company.ReadWriteCSV;

import com.company.FlowerShop;
import com.company.Models.Customer;
import com.company.Models.Date;
import com.company.Models.Product;
import com.company.Models.Recipient;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteAuthentication {
    private final static String path = "src/com/company/Files/authentication.csv";

    public static void writeAuthentication(Customer customer, String password){
        FileWriter fileWriter;
        try{

            fileWriter = new FileWriter((path), true);

            String stringBuilder = customer.getMailAddress() +
                    "," + password+
                    "\n";

            fileWriter.write(stringBuilder);
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
