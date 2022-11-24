package com.oopsconceptinjava;

public class Eg_Variables {
     int a=50;
       void data(){


        System.out.println("you are in method..");
        System.out.println("value of a is: "+a);

    }

    public static void main(String[] args) {
//        Eg_Variables v =new Eg_Variables();
        System.out.println("you are in main()..");
//        data();
       Eg_Variables v;
        v = new Eg_Variables(65);


    }
    Eg_Variables (int b){
//          int b= 28;
        System.out.println("you are in the constructor..");
        System.out.println("value of b is: "+b);
    }
}
