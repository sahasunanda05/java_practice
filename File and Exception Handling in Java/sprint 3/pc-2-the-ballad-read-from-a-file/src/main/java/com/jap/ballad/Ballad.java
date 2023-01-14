package com.jap.ballad;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class Ballad {
    public static void main(String[] args) {
        Ballad ballad = new Ballad();
        String fileData = ballad.readPoemFromAFile("src/main/resources/ballad.txt");
        System.out.println(fileData);

    }
    public String readPoemFromAFile(String fileName){
        // Write the logic to read from a file
        String str = "";
        FileInputStream fileInputStream =null;
        try {
            fileInputStream = new FileInputStream(fileName);
            int data = 0;
            while((data = fileInputStream.read())!= -1){
                char readData = (char) data;
                str = str + readData;
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
            System.out.println(e);

        }
        str = str.replaceAll("\r","");
        return str;
    }

    }

