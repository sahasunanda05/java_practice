package com.jap.marksevaluation;

import java.util.Arrays;

public class OakBridgeSchool {


    public int[] calculateTotalMarks(int[] math, int science[], int[] english) {
        if (math.length == 0 || science.length == 0 || english.length == 0) {
            return null;
        }
        int[] totalMarks = new int[math.length];
        for (int i = 0; i < math.length; i++) {
            totalMarks[i] = math[i] + science[i] + english[i];
        }
        return totalMarks;
    }

    public int[] calculateTotalAverageMarksForEachStudent(int[] totalMarks, int noOfSubjects) {
        if (totalMarks.length == 0 || noOfSubjects <= 0) {
            return null;
        }
        int[] averageMarks = new int[totalMarks.length];
        for (int i = 0; i < totalMarks.length; i++) {
            averageMarks[i] = totalMarks[i] / noOfSubjects;
        }
        return averageMarks;
    }

    // Write the logic inside the method to calculate the grade based on the math mark of the student
    public char findGradeInMath(int math) {
        char mathGrade = '\u0000';
        if (math >= 90) {
            mathGrade = 'A';
        } else if (math >= 80 && math <= 89) {
            mathGrade = 'B';
        } else if (math >= 70 && math <= 79) {
            mathGrade = 'C';
        } else if (math >= 60 && math <= 69) {
            mathGrade = 'D';
        } else if (math <= 59) {
            mathGrade = 'F';
        }

        return mathGrade;
    }

    // Write the logic inside the method to calculate the grade based on the science mark of the student
    public char findGradeInScience(int science) {
        char scienceGrade = '\u0000';
        if (science >= 90) {
            scienceGrade = 'A';
        } else if (science >= 80 && science <= 89) {
            scienceGrade = 'B';
        } else if (science >= 70 && science <= 79) {
            scienceGrade = 'C';
        } else if (science >= 60 && science <= 69) {
            scienceGrade = 'D';
        } else if (science <= 59) {
            scienceGrade = 'F';
        }

        return scienceGrade;

    }

    // Write the logic inside the method to calculate the grade based on the english mark of the student
    public char findGradeInEnglish(int english) {
        char englishGrade = '\u0000';

        if (english >= 90) {
            englishGrade = 'A';
        } else if (english >= 80 && english <= 89) {
            englishGrade = 'B';
        } else if (english >= 70 && english <= 79) {
            englishGrade = 'C';
        } else if (english >= 60 && english <= 69) {
            englishGrade = 'D';
        } else if (english <= 59) {
            englishGrade = 'F';
        }

        return englishGrade;
    }

    // Write the logic to sort the total marks of the students of the class, use insertion-sort

    public int[] sortByTotalMarks(int[] totalMarks) {
        for (int i = 1; i < totalMarks.length; i++) {
            int key = totalMarks[i];
            int j = i - 1;
            while (j >= 0 && totalMarks[j] > key) {
                totalMarks[j + 1] = totalMarks[j];
                j = j - 1;
            }
            totalMarks[j + 1] = key;
        }
        return totalMarks;

    }

    //Display the details of the student
    public void displayDetails(int totalMark, int averageMark, char mathGrade, char scienceGrade, char englishGrade, String studentName, int rollNo) {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Grading and Evaluation");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("---------------------------------------------------------------");
        System.out.println("Student Name                                 Roll Number");
        System.out.println("---------------------------------------------------------------");
        System.out.println(studentName + "                                           " + rollNo);
        System.out.println("The total marks scored   : " + totalMark);
        System.out.println("The average marks scored : " + averageMark);
        System.out.println("---------------------------------------------------------------");
        System.out.println();
        System.out.println();
        System.out.println("Grade in Math    : " + mathGrade);
        System.out.println("Grade in Science : " + scienceGrade);
        System.out.println("Grade in English : " + englishGrade);
        System.out.println("---------------------------------------------------------------");


    }

    public static void main(String[] args) {

        // Declare and Initialize the object of OakBridgeSchool
        OakBridgeSchool oakBridgeSchool = new OakBridgeSchool();
        // Declare and Initialize values to the arrays to store marks of math, science, english
        int[] math = {88, 89, 100, 70, 60, 80, 35, 3, 25, 56};
        int[] science = {80, 83, 99, 67, 56, 84, 38, 9, 32, 65};
        int[] english = {90, 98, 100, 65, 54, 82, 40, 13, 45, 67};
        // Declare and Initialize a string array for storing student names
        String[] studentNames = {"Michelle", "Kate", "Ann", "Tina", "Tom", "Sam", "Ria", "Pam", "Leena", "Leo"};
        // Declare and Initialize an int array for storing roll numbers
        int[] rollNos = {102, 109, 101, 103, 104, 108, 110, 105, 106, 107};
        // Call the appropriate methods and display the results
        int[] totalMarks = oakBridgeSchool.calculateTotalMarks(math, science, english);
        int[] averageMarks = oakBridgeSchool.calculateTotalAverageMarksForEachStudent(totalMarks, 3);

        oakBridgeSchool.displayDetails(totalMarks[0], averageMarks[0],
                oakBridgeSchool.findGradeInMath(math[0]),
                oakBridgeSchool.findGradeInScience(science[0]),
                oakBridgeSchool.findGradeInEnglish(english[0]),
                studentNames[0], rollNos[0]);


        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Report");
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println("The total marks of the class in sorted order");

        //System.out.println( oakBridgeSchool.sortByTotalMarks(totalMarks));
        oakBridgeSchool.sortByTotalMarks(totalMarks);


        int[] arr = oakBridgeSchool.sortByTotalMarks(totalMarks);
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                //check adjacent elements
                if (arr[j] > arr[j + 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }

        for (int i=arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}
