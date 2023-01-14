package com.jap.sales;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SalesDataAnalyzer {
    // Read the data from the file and store in a List
    public List<SalesRecord> readFile(String fileName) throws IOException {

        List<SalesRecord> sr = new ArrayList<SalesRecord>();

        FileReader fileReader = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fileReader);

        br.readLine();
        String line= "";
        while ((line = br.readLine())!= null){
            String[] data = line.split(",");
            SalesRecord salesRecord = new SalesRecord(data[0], Integer.parseInt(data[1]),Integer.parseInt(data[2]),data[3],Double.parseDouble(data[4]),Double.parseDouble(data[5]),Integer.parseInt(data[6]));
            sr.add(salesRecord);
        }


        return sr;
    }

    // Sort the customers based on purchase amount
    public List<SalesRecord> getAllCustomersSortedByPurchaseAmount(List<SalesRecord> salesData, AmountComparator amountComparator){
        Collections.sort(salesData, amountComparator);
        return salesData;
    }

    // Find the top customer who spent the maximum time on the site
    public SalesRecord getTopCustomerWhoSpentMaxTimeOnSite(List<SalesRecord> salesData,TimeOnSiteComparator timeOnSiteComparator){

        List<SalesRecord> sortedList = new ArrayList<SalesRecord>();
        Collections.sort(salesData, timeOnSiteComparator);



        return salesData.get(0);
    }



}
