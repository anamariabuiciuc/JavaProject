package com.company.ReadWriteCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SearchCSVLine {

    //Search a string in my CSV file on a certain column. Return 1 if the string exists, else returns 0.
    public static boolean searchCsvLine(int searchColumnIndex, String searchString) throws IOException {
        //String resultRow = null;
        boolean value = false;
        BufferedReader br = new BufferedReader(new FileReader("src/com/company/Files/authentication.csv"));
        String line;
        while ( (line = br.readLine()) != null ) {
            String[] values = line.split(",");
            if(values[searchColumnIndex].equals(searchString)) {
              //  resultRow = line;
                value=true;
                break;
            }
        }
        br.close();
        return value;
        //return resultRow;
    }

}
