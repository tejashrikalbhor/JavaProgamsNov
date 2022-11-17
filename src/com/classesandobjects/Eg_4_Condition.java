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
        name = sc.next();
        System.out.println("Enter the age:");
         age = sc.nextInt();
        validAge();
        System.out.println("Enter the percentage:");
         percentage =sc.nextFloat();
        validPercentage();
        System.out.println("----------------------------");
        System.out.println("New Record Added Successfully..");
        System.out.println("----------------------------");
    }
    void showDetails(){
        System.out.println("Name is : "+name);
        System.out.println("Age is : "+age);
        System.out.println("Percentage is : "+percentage);
    }
    void validAge(){
        int count =0;
        if(age<3){
            count = 3 - age ;
            System.out.println("Age criteria does not match.try again after " + count+" years.");
            }
        else if (age<=16){

        }
        else{
            System.out.println("Age criteria is eligible for higher studies.Good luck!");
        }
        }
        void validPercentage() {
        if(percentage <=0 ||percentage >100){
            System.out.println("Invalid percentage.Percentage range should be between 1 to 100.");
        }
        }
}

public class Eg_4_Condition {
    public static void main(String[] args) {
        Student s =new Student();
        s.addRecord();
        s.showDetails();
    }
}
