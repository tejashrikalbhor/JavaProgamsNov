package com.oopsconceptinjava;

public class UncheckedException {
     static void validation(int n){
         System.out.println("you are in the method block..");
         if(n<18){
             throw new ArithmeticException("you are not eligible for voting..");
         }

         else {
             System.out.println("you are eligible to vote..thank-you..");
         }
     }

    public static void main(String[] args) {
//        CheckedException c =new CheckedException();
        System.out.println("you are in the main()..");
        validation(30);
        System.out.println("End of the code..");
    }
}
