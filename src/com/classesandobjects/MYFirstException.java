package com.classesandobjects;

public class MYFirstException {
    public static void main(String[] args) {
        //eg:1 Exception NullPointerException
//        String name =null;
//        System.out.println("you are in main()..");
//        System.out.println(name.length());

        //eg:2 try - catch
        try {
            System.out.println("you are in the try block..");
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println("result is : " + c);
        }
        catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("ArithmeticException is catched..");
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println("you are in catch..");
            e.printStackTrace();
            System.out.println(e.getMessage());
        }



        finally {
            System.out.println("you are in finally block..");
        }
        System.out.println("you are at the end of the code..");
    }
}
