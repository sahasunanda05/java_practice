package com.jap.marksevaluation;

import java.util.Arrays;

public class OakBridgeSchool {

    // Convert the given string name to upper case
    public String convertToUpperCase(String name){
        if(name == null || name.equalsIgnoreCase(""))
            return " ";
        return name.toUpperCase();
    }

    // Find the shortest word in the list of surnames
    public String shortestSurname(String[] surnames)
    {
        int minimumLength = surnames[0].length();
        String shortest = surnames[0];
        for (int i=0 ; i<surnames.length ; i++){
            String word = surnames[i];
            int length = word.length();
            if(minimumLength > length) {
                minimumLength = length;
                shortest = word;
            }
        }
        return shortest;
    }

    // Check if any of the names in the array is repeated, if yes return true else false
    public boolean checkIfNamesAreRepeated(String[] names){
        boolean flag = false;
        for (int i=0;i<names.length;i++){
            for (int j=i+1;j<names.length;j++){
                if(names[i].equalsIgnoreCase(names[j])){
                    flag = true;
                    break;
                }
            }
            if (flag)
                break;
        }

        return flag;
    }

    // Concatenate the name and surname of the students
    public String[] concatenateNameAndSurname(String[] names, String [] surnames){
        String []  concatenatedNames = new String[names.length];
        for (int i=0;i<names.length;i++){
            concatenatedNames[i]=names[i].concat(" ").concat(surnames[i]);
        }

        return  concatenatedNames;
    }

    // Display the names
    public void displayStudentNames(String[] namesArray){
        for (int i=0;i<namesArray.length;i++)
            System.out.print(namesArray[i] + ", ");
    }
    public String[] sortAlphabetically(String[] names){
        for (int i = 0; i < names.length - 1; i++) {
            for (int j = 0; j < names.length - i - 1; j++) {
                //check adjacent elements
                if (names[j].compareTo(names[j + 1])>0) {
                    //swap
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }
        return names;
    }

    public static void main(String[] args) {
        OakBridgeSchool oakBridgeSchool = new OakBridgeSchool();
        // Declare and Initialize values to the arrays
        String[] studentNames = {"Michelle", "Kate", "Ann", "Tina", "Tom", "Sam", "Ria", "Pam", "Kate", "Leo"};
        String[] studentSurnames ={"Smith", "Johnson", "Williams", "Brown", "Jones", "Miller", "Davis", "Martin", "Clark", "King"};
        // Call the method to convert all the student names to upper case and display results
        for (int i=0;i<studentNames.length;i++){
            studentNames[i]=oakBridgeSchool.convertToUpperCase(studentNames[i]);
        }
        oakBridgeSchool.displayStudentNames(studentNames);

        // Call the method to sort names in alphabetical order and display results
        Arrays.toString(oakBridgeSchool.sortAlphabetically(studentNames));

        // Call the method to find the shortest surname and display results
        System.out.println();
        System.out.println("The shortest surname is:" +(oakBridgeSchool.shortestSurname(studentSurnames)));

        // Call the method to check if two names in the array are the same and display results
        System.out.println("There are repeated names in the name list : " +(oakBridgeSchool.checkIfNamesAreRepeated(studentNames)));

        // Call the method to concatenate name and surname with a space in between and display results
        String []  concatenatedNames = oakBridgeSchool.concatenateNameAndSurname(studentNames,studentSurnames);
        System.out.println("The student full names (name and surname) : ");
        oakBridgeSchool.displayStudentNames(concatenatedNames);

    }
}
