package com.classesandobjects;

public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("we are in main method..");
        try{
            int n1= Integer.parseInt(args[0]);
            int n2=Integer.parseInt(args[1]);
            int result = n1/n2;
            System.out.println("Result is: "+result);
        }
        catch (Exception e){
            System.out.println("Exception occured !!");
            System.out.println(e.getMessage());
        }
        System.out.println("Ending code..");
    }
}
