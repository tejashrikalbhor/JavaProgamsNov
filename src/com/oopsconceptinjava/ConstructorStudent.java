package com.oopsconceptinjava;

public class ConstructorStudent {
    String name;
    int age;
    ConstructorStudent()
    {
        System.out.println("you are in the constructor..");
    }

    public static void main(String[] args) {
        System.out.println("you are in main..");
        ConstructorStudent s = new ConstructorStudent();
        s.name="tejashri";
        s.age=20;
        System.out.println("Name is: "+s.name+" Age is : "+s.age);
    }
}
