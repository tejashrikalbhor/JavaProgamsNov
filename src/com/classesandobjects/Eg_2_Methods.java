package com.classesandobjects;

public class Eg_2_Methods {
    String name;
    int age;
    void getDetails(String n,int a){
        name = n;
        age = a;
        System.out.println("Name is : "+name);
        System.out.println("Age is : " + age);
    }
    void getDetails(){
        System.out.println("you will get the details on calling getDetails() with passsing values..");
    }
    public static void main(String[] args) {
        Eg_2_Methods obj = new Eg_2_Methods();
        Eg_2_Methods obj1 = new Eg_2_Methods();
        obj1.getDetails();
        obj.getDetails("Tejashri",24);

    }
}
