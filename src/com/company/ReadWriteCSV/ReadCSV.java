package com.company.ReadWriteCSV;
import com.company.Models.Product;
import com.company.Models.Bouquet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/*
public class ReadBouquet {
    //public static String path = "src/com/company/Files/bouquets.csv";

    public static void readBouquet(String path) {

        ArrayList<Bouquet> bouqs  = new ArrayList<>();
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
*/

public class ReadCSV {
    public static final String delimiter = ",";
    public static void read(String csvFile) {
        try {
            File file = new File(csvFile);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            String[] tempArr;
            while((line = br.readLine()) != null) {
                tempArr = line.split(delimiter);
                for(String tempStr : tempArr) {
                    System.out.print(tempStr + " ");
                }
                System.out.println();
            }
            br.close();
        } catch(IOException ioe) {
            ioe.printStackTrace();
            System.out.println("Oops. Something went wrong. :(");
        }
    }
    public static void main(String[] args) {
        // csv file to read
        String csvFile = "src/com/company/Files/bouquets.csv";
        ReadCSV.read(csvFile);

    }
}