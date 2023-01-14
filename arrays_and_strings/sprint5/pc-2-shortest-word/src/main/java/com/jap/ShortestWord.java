package com.jap;
public class ShortestWord{
    public static void main(String[] args) {

        //Declare and initialize a String array.
        String [] str;
        str = new String[] {"looped", "poodle", "student", "calmed"};

        // Create an object of the class ShortestWord
        ShortestWord sWord = new ShortestWord();

        //Call the method findShortestWord() and pass the array.
        String shortestWord = sWord.findShortestWord(str);

        System.out.println(shortestWord);
    }

    //Write the logic to find the shortest word from the String array inside
    // the below method and return the shortest word.
    public String findShortestWord(String[] words) {
        int minimumLength = words[0].length();
        String shortestWord = words[0];
        for (int i=0 ; i<words.length ; i++){
            String word = words[i];
            int length = word.length();
            if(minimumLength > length) {
                minimumLength = length;
                shortestWord = word;
            }
        }
        return shortestWord;
    }
}




