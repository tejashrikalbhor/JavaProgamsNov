package com.oopsconceptinjava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {
    static void fileRead()throws FileNotFoundException
    {
        System.out.println("you are in the method block..");
        FileReader f = new FileReader("C:\\Users\\Austraxpc75\\Desktop\\fileException\\data.txt");
        BufferedReader bf = new BufferedReader(f);
        throw  new FileNotFoundException();


    }
    public static void main(String[] args) {
        try{
            System.out.println("you are in the try block..");
            fileRead();
            System.out.println("end of try block..");

        }
        catch (Exception e){
            System.out.println("you are in the catch block..");
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("end of catch block..");
        }
        System.out.println("end of the code..");
    }
}
