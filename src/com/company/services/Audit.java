package com.company.Services;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.Date;

public class Audit {
    private static Audit audits = null;

    private Audit() {}

    public static Audit getInstance() {
        if (audits == null) {
            audits = new Audit();
        }
        return audits;
    }
    public static void audit (String action) {
        String path = "src/com/company/Files/audit.csv";
        try {
            FileWriter fileWriter = new FileWriter(path, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();

            printWriter.println(action + "," + dtf.format(now));
            printWriter.flush();
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Oops. Something went wrong with this file. :(");
        }
    }

}
