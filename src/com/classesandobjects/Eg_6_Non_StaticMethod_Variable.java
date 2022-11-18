package com.classesandobjects;

public class Eg_6_Non_StaticMethod_Variable {
    // non-static variable and method

     String  name = "tejashri";
     int age =23;
      String country ="India";
    {
        System.out.println("you are in the non-static block..");
        show();
    }

      void show(){
         System.out.println("Name is : "+name);
         System.out.println("Age is : "+age);
         System.out.println("Country is : "+country);
     }

    public static void main(String[] args) {
         Eg_6_Non_StaticMethod_Variable s =new Eg_6_Non_StaticMethod_Variable();
       s.show();


    }

}

