package com.oopsconceptinjava;

public class UseOfSystemMethodInTry {
    public static void main(String[] args) {
        try{
            System.out.println("you are in try block..");
            System.out.println("we are using system.exit method in try block..");
            System.exit(0);
            System.out.println("end of try block..");

        }
        catch(Exception e){
            System.out.println("you are in the catch block..");
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("end of catch block..");

        }
        finally {
            System.out.println("you are in the finally block..");
            System.out.println("end of finally block..");
        }
        System.out.println("end of the code..");
    }

}
