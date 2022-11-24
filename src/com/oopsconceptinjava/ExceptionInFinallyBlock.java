package com.oopsconceptinjava;

public class ExceptionInFinallyBlock {
    public static void main(String[] args) {
        try{
            System.out.println("you are in the try block..");
            System.out.println("end of try block..");
    }
        catch (Exception e){
            System.out.println("you are in the catch block..");
            System.out.println("end of the catch block..");
        }
        finally {
            System.out.println("you are in the finally block..");
            try
            {
                System.out.println("you are in the try block..");
                int a = 10;
                int b = 0;
                int result = a / b;
                System.out.println("the result is : " + result);
            }
            catch(Exception e){
                System.out.println("you are in catch block..");
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }
        System.out.println("ens of the code..");
        }
}
