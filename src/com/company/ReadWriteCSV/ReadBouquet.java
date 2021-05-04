package com.company.ReadWriteCSV;
import com.company.Product;
import com.company.Models.Bouquet;
import com.company.GiftBox;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadBouquet {
    private final static String path = "src/com/company/Files/bouquets.csv";

    public static void ReadProduct(List<Product> bouqs) {

        BufferedReader bufferedReader;
        try{

            bufferedReader = new BufferedReader(new FileReader(path));
            String line = bufferedReader.readLine();
            while((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                bouqs.add(new Bouquet(strings[0],  Double.parseDouble(strings[1]), strings[2], Integer.parseInt(strings[3]),strings[4]));

            }
        }

        catch (IOException e) {

            e.printStackTrace();
        }

    }

}