package com.classesandobjects;

public class Eg_6_Non_StaticMethod_Variable {
    // non-static variable and method

     String  name = "tejashri";
     void show(){
         System.out.println("Name is : "+name);
     }

    public static void main(String[] args) {
         Eg_6_Non_StaticMethod_Variable s =new Eg_6_Non_StaticMethod_Variable();

        s.show();
    }

}

