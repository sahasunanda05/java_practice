package com.jap;

import java.util.Arrays;

public class SortingAge {

    //Write the logic to sort the array containing the age in descending order
    // inside the below method and return the sorted array
    public int[] getSortedAge(int [] ageArray){

        for (int i = 0; i < ageArray.length - 1; i++) {
            for (int j = 0; j < ageArray.length - i - 1; j++) {
                //check adjacent elements
                if (ageArray[j] < ageArray[j + 1]) {
                    //swap
                    int temp = ageArray[j];
                    ageArray[j] = ageArray[j + 1];
                    ageArray[j + 1] = temp;
                }

            }
        }

        return ageArray;
    }

    public static void main(String[] args) {
        //Declare and initialize an integer array containing age.
        int[] arr ={22,34,33,32,36,27,28};
        //Create an object of the class SortingAge
        SortingAge sortingAge = new SortingAge();
        //Call the method getSortedAge and pass the parameter
        int[] sorted= sortingAge.getSortedAge(arr);
        System.out.println(Arrays.toString(sorted));


    }
}
