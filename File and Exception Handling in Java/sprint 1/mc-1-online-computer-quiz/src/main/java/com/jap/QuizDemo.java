package com.jap;

import java.util.Arrays;

public class QuizDemo {
    public static void main(String[] args) {

        String nameOfSchools[] = {"DAV","RSK",null,"Candor","Oak","UAV","BCGS","BCBS","Baldwin","NPS"};
        String scores[] = {"86" , "78" , "95" ,"6" ,"44" , "33" , "82" , "77" ,"8" ,"90"};
        QuizDemo quizDemo =new QuizDemo();
        //System.out.println(Arrays.toString(quizDemo.convertAllNamesToCapital(nameOfSchools)));

        System.out.println(quizDemo.highestScore(nameOfSchools,scores));
        String [] array = quizDemo.convertAllNamesToCapital(nameOfSchools);
        for(int i =0; i< array.length;i++){
            System.out.print(array[i] + " ");
        }



    }

    //return the school name which has got the highest score in quiz
    //Handle the NumberFormatException
    public String highestScore(String []nameOfSchool , String[] scores ){
        String schoolWithHighestScore = nameOfSchool[0];
        int hgIndex=0;
//        try {
//            int highestScore = Integer.parseInt(scores[0]);
//            for (int i = 0; i < scores.length; i++) {
//                if (highestScore < Integer.parseInt(scores[i])){
//                    //schoolWithHighestScore=nameOfSchool[i];
//                    highestScore=Integer.parseInt(scores[i]);
//
//                   // highestScore = Integer.parseInt(scores[i]);
//                }
//            }
        try{
            for(int i=0;i<scores.length;i++)
            {
                for(int j=0;j<scores.length-i-1;j++)
                {
                    if(Integer.parseInt(scores[j])<Integer.parseInt(scores[j+1]))
                    {
                        String temp=scores[j];
                        scores[j]=scores[j+1];
                        scores[j+1]=temp;
                        String t1=nameOfSchool[j];
                        nameOfSchool[j]=nameOfSchool[j+1];
                        nameOfSchool[j+1]=t1;
                    }
                }
            }

        }catch (NumberFormatException e){
            return e.toString();
        }catch (NullPointerException e){
            return e.toString();

        }
        return nameOfSchool[0];

    }
    //convert all the names in uppercase
    //Handle the NullPointerException
    public String[] convertAllNamesToCapital(String name[]){
        try {
            for (int i = 0; i < name.length; i++) {
                name[i] = name[i].toUpperCase();
            }

        } catch (NullPointerException e) {
          String [] arr = new String[1];
          arr[0]=e.toString();
          return arr;
        }
        return name;
    }
}






