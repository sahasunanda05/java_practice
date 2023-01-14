package com.marks;

public class StudentMarksImpl {
    public static void main(String[] args) {
        StudentMarks studentMarks= new StudentMarks();
        System.out.println("total marks = " + studentMarks.calculateMarks(90,55,70,95));
        System.out.println("total marks = " + studentMarks.calculateMarks(50,90,65));
        System.out.println("total marks = " + studentMarks.calculateMarks(100,100,100));

    }


}
