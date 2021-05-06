package com.company.ReadWriteCSV;
import com.company.Models.GiftBox;

import java.io.FileWriter;
import java.io.IOException;

public class WriteGiftBox {

    private final static String path = "src/com/company/Files/giftboxes.csv";

    public static void writeGiftBox(String productName, double productPrice,String dimension, String type)
    {
        FileWriter fileWriter;
        try{

            fileWriter = new FileWriter((path), true);

            String stringBuilder = productName +
                    "," + productPrice +
                    "," + dimension +
                    "," + type +
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
