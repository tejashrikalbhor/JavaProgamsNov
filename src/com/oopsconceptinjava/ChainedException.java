package com.oopsconceptinjava;

public class ChainedException {
    public static void main(String[] args) {
        int a=0,b;
        try {
            System.out.println("you are in the try block..");
            b =4/a;
            System.out.println("end of try block..");
        }
        catch (Exception e){
            System.out.println("you are in the catch block..");
            if(a<=0){
                e.initCause(new NumberFormatException("this is actual cause of exception.."));
            }
            System.out.println(e.getCause());
            throw e;
        }
    }
}
