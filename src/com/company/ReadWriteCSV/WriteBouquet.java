package com.company.ReadWriteCSV;
import com.company.Models.Bouquet;

import java.io.FileWriter;
import java.io.IOException;


public class WriteBouquet {

    private final static String path = "src/com/company/Files/bouquets.csv";


    public static void writeBouquet(String productName, double productPrice, String nameFlowers, int numberOfFlowers, String colorOfFlowers ){
        FileWriter fileWriter;
        try{

            fileWriter = new FileWriter((path), true);

            String stringBuilder = productName +
                                    "," + productPrice +
                                    "," + nameFlowers +
                                    "," + numberOfFlowers +
                                    "," + colorOfFlowers +
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
