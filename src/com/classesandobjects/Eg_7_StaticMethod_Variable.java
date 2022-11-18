package com.classesandobjects;

public class Eg_7_StaticMethod_Variable {
    static int count =10;       // static variable
    static {                   // static block
        count =count +10;
        System.out.println("you are in static block..");
        System.out.println("value of count is: "+count );
    }
     void show(){              //method
        System.out.println("you are in the method..");
        count = count *2 ;
        System.out.println(count);
    }
    Eg_7_StaticMethod_Variable(){
        System.out.println("you are in the constructor..");
    }

    public static void main(String[] args) {
        System.out.println("you are in the main..");
        System.out.println("value of count is: "+count );
        Eg_7_StaticMethod_Variable e =new Eg_7_StaticMethod_Variable();
        e.show();
    }
}
