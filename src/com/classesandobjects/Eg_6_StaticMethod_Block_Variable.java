package com.classesandobjects;

public class Eg_6_StaticMethod_Block_Variable {
    // non-static variable and method

     String  name = "tejashri";
     void show(){
         System.out.println("Name is : "+name);
     }

    public static void main(String[] args) {
         Eg_6_StaticMethod_Block_Variable s =new Eg_6_StaticMethod_Block_Variable();

        s.show();
    }

}
