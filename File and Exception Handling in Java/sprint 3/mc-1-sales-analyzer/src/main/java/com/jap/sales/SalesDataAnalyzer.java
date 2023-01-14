package com.jap.sales;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SalesDataAnalyzer {

    // This method reads a file and adds each line of the file into the corresponding SalesRecord object
    public SalesRecord[] readFile(String fileName) {


        //Read File
        //Define Array of object . What should be the length??
        // Add values to array of object
        // Return Object array

        try {
            FileReader f = new FileReader(fileName);
            BufferedReader br = new BufferedReader(f);


            SalesRecord[] sr = new SalesRecord[100];
            String line = "";
            int i = 0;
            br.readLine();
            while ((line = br.readLine()) != null) {

                //    if (i == 0) continue;
                //   System.out.println(line);

                String data[] = line.split(",");

                sr[i] = new SalesRecord();
                sr[i].setDate(data[0]);
                sr[i].setCustomer_id(Integer.parseInt(data[1]));
                sr[i].setProduct_category(Integer.parseInt(data[2]));
                sr[i].setPayment_method(data[3]);
                sr[i].setAmount(Double.parseDouble(data[4]));
                sr[i].setTime_on_site(Double.parseDouble(data[5]));
                sr[i].setClicks_in_site(Integer.parseInt(data[6]));

                i++;
            }

            return sr;

        } catch (NumberFormatException e) {
            throw new NumberFormatException();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return null;
    }
}
