package com.company.ReadWriteCSV;

import com.company.Models.Bouquet;
import com.company.Models.GiftBox;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadGiftBox {
    private final static String path = "src/com/company/Files/giftboxes.csv";

    public static void readGiftBoxes() {


        ArrayList<GiftBox> boxes = new ArrayList<>();
        BufferedReader bufferedReader;
        try{

            bufferedReader = new BufferedReader(new FileReader(path));
            String line = bufferedReader.readLine();
            while((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                boxes.add(new GiftBox(strings[0],  Double.parseDouble(strings[1]), strings[2], strings[3]));

            }
        }

        catch (IOException e) {

            e.printStackTrace();
            System.out.println("Oops. Something went wrong. :(");
        }

    }

}
