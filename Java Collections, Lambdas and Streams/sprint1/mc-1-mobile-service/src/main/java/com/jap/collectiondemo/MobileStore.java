package com.jap.collectiondemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MobileStore {


    private List<Mobile> allMobiles;
    private String record = "";
    private String splitBy = ",";
    public MobileStore()
    {
        allMobiles = new ArrayList<>();

    }

    //Write logic to read the fileName that is "mobile.csv"
    //read all the lines one by one
    //Create Mobile class object and store data from file in the respective attributes of Mobile class
    // ex - Store brandName - Samsung in  mobile.setBrandName(brandName);
    //add mobile object in the List object and return the List
    //handle all the exceptions
    public List<Mobile> readMobileData(String fileName)
    {
        // class
        FileReader fr = null;
        try {
            fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();

            while ((line = br.readLine())!= null){
        String[] data = line.split(",");
                Mobile mobile = new Mobile(data[0],data[1],Double.parseDouble(data[2]),data[3],data[4],data[5],Integer.parseInt(data[6]));
                allMobiles.add(mobile);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        return allMobiles;
    }

    //Iterate the List created in the above method and retrieve the bandName
    //Return the List with specific Mobile having brandName coming from method parameter
    public List<Mobile> findPhoneByBrand(String brandName)
    {
        List<Mobile> mobilesByBrand = new ArrayList<>();

        for (Mobile element: allMobiles) {
            if (element.getBrandName().equalsIgnoreCase(brandName)) {
                mobilesByBrand.add(element);
            }
        }

        return mobilesByBrand;
    }

    //Iterate through the List created in the first method
    //Return the List of Mobile whose cost is more than $500
    public List<Mobile> findPhoneCostMoreThan$500()
    {
        List<Mobile> mobilesMoreThan500 = new ArrayList<>();

        for (Mobile element: allMobiles) {
            if (element.getCost() > 500) {
                mobilesMoreThan500.add(element);
            }
        }

        return mobilesMoreThan500;
    }

    //Iterate through the List created in the first method
    //Return the List of Mobile whose Pixel is more than 12MP
    public List<Mobile> findPhonePixelMoreThan12MP()
    {
        List<Mobile> mobilesMoreThan12MP = new ArrayList<>();

        for (Mobile element: allMobiles) {
            if (element.getCameraPixels() > 12) {
                mobilesMoreThan12MP.add(element);
            }
        }
        return mobilesMoreThan12MP;
    }


}

