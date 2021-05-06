package com.company.ReadWriteCSV;

import com.company.FlowerShop;
import com.company.Models.Customer;
import com.company.Models.Date;
import com.company.Models.Product;
import com.company.Models.Recipient;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteOrder {
    private final static String path = "src/com/company/Files/orders.csv";

    public static void writeOrder(int idOrder, Date orderDate, Customer buyer, Recipient recipient, int numberOfProducts, List<Product> products, FlowerShop seller){
        FileWriter fileWriter;
        try{

            fileWriter = new FileWriter((path), true);

            String stringBuilder = idOrder +
                    "," + orderDate +
                    "," + buyer +
                    "," + recipient +
                    "," + numberOfProducts +
                    "," + products +
                    "," + seller+
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
