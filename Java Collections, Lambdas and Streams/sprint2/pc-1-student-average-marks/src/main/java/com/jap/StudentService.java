package com.jap;

import java.util.*;

public class StudentService {

    public static Set<Student> getAllStudentData(){
        //create six student object by calling Student class parameterized constructor
        Student student;
        Student student1;
        Student student2;
        Student student3;
        Student student4;
        Student student5;
        Set<Student> studentSet;
        student = new Student("John",23,500);
        student1 = new Student("Bob",26,545);
        student2 = new Student("William",15,400);
        student3 = new Student("Kevin",29,489);
        student4 = new Student("Johnson",30,578);
        student5 = new Student("Catherine",25,490);

        //create HashSet object and add all the students object inside it
        studentSet = new HashSet<>();
        studentSet.add(student);
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        studentSet.add(student4);
        studentSet.add(student5);
        studentSet.add(student5);

        //return the HashSet object
        return studentSet;
    }


    public static Set<String> getAllStudentNameInSorted(Set<Student> studentSet){
        //Create a TreeSet object
        TreeSet<String> treeSet = new TreeSet<String>();

        //Use Iterator object of type <Student> to iterate through the studentSet
        Iterator iterator = studentSet.iterator();
        while(iterator.hasNext()){
            Student student = new Student();
            student = (Student)iterator.next();
            treeSet.add(student.getName());
        }
        //get all the name and add it inside the TreeSet object

      //return the TreeSet object;
        return treeSet;
    }

    public static Map<String,Integer> calculateAverage(Set<Student> studentSet){
        //create a HashMap object of type <String,Integer>
        Map<String,Integer> map = new HashMap<String,Integer>();
        //Use Iterator object of type <Student>to iterate through the studentSet
        for (Student element : studentSet) {
            int avg = element.getTotalMarks()/studentSet.size() ;
            map.put(element.getName(),avg);
        }

        //retrieve the Student object from the iterator

        //Use getter method to get TotalMarks of each student. calculate the average

        //add the student name and average marks in the HashMap object created in the
        //first line and return the map

        return map;
    }

    public static void main(String[] args) {
        Set studentName = getAllStudentData();
        System.out.println(getAllStudentNameInSorted(studentName));
        System.out.println(calculateAverage(studentName));
    }
}
