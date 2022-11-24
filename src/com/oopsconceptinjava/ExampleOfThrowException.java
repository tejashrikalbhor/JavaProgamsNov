package com.oopsconceptinjava;

public class ExampleOfThrowException {
    static void show(int n){
        System.out.println("you are in static method block..");
        if(n<=0){
            throw new ArithmeticException("The no is not valid..");
        }
        else {
            System.out.println("the no is : "+n);
        }
    }

    public static void main(String[] args) {
        System.out.println("you are in the main block..");
        show(-1);
        System.out.println("end of the code..");
    }

}
