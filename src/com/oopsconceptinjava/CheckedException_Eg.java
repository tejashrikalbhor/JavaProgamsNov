package com.oopsconceptinjava;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverAction;
import java.sql.DriverManager;

public class CheckedException_Eg {
    static void exceptionMethod(String s)throws IOException,Exception{
        if(s == null){
            throw new IOException("this is ioException occured..");
        }
        else {
            System.out.println(s);
        }



    }
    public static void main(String[] args) {

        String s1=null;

        s1.length();





    }
}

