package com.oopsconceptinjava;

import java.io.IOException;

public class CheckedException_Eg {
    static void exceptionMethod(String s)throws IOException{
        if(s == null){
            throw new IOException("this is ioException occured..");
        }
        else {
            System.out.println(s);
        }

    }
    public static void main(String[] args) {
        try {
            String s1=null;
            System.out.println("you are in the try block..");
            exceptionMethod(s1);
        } catch (Exception e) {
            System.out.println("you are in the catch block..");
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("end of catch block..");
        }
        System.out.println("end of the code..");
    }
}
