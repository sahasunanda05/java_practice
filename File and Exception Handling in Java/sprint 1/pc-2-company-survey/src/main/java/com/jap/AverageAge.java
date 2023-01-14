package com.jap;

public class AverageAge {
    public static void main(String[] args) {
        String age [] ={"35","26","32","44"};
        AverageAge averageAge = new AverageAge();
        System.out.println(averageAge.averageAgeCalculator(age));
    }

    public String averageAgeCalculator(String[] ageRawData)
    {
        double avg = 0;
        double total = 0;
        try{
            for (int i = 0; i < ageRawData.length; i++) {
                total += Integer.parseInt(ageRawData[i]);
            }
            avg = total/ageRawData.length;
        }catch (NumberFormatException exception)
        {
            return String.valueOf(exception);
        }
        return String.valueOf(avg);
    }



}
