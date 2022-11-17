package com.classesandobjects;

import java.util.Scanner;

class Student{
    String name;
    int age;
    float percentage;

    void addRecord(){
        Scanner sc =new Scanner(System.in);
        System.out.println("----------------------------");
        System.out.println("Create a new Record");
        System.out.println("----------------------------");
        System.out.println("Enter the name:");
        String name = sc.next();
        System.out.println("Enter the age:");
        int age = sc.nextInt();
        System.out.println("Enter the percentage:");
        float per =sc.nextFloat();
        System.out.println("----------------------------");
        System.out.println("New Record Added Successfully..");
        System.out.println("----------------------------");
    }
    void showDetails(){
        System.out.println("Name is : "+name);
        System.out.println("Age is : "+age);
        System.out.println("Percentage is : "+percentage);
    }
}
public class Eg_4_Condition {
    public static void main(String[] args) {
        Student s =new Student();
        s.addRecord();
        s.showDetails();

    }
}
