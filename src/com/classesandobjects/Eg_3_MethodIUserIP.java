package com.classesandobjects;

import java.util.Scanner;

public class Eg_3_MethodIUserIP {
    String name;
    int age;
    void getData(String n,int a){
        name = n;
        age =a;
        System.out.println("****************************");
        System.out.println("Details of a Person ");
        System.out.println("****************************");
        System.out.println("Name is : "+name);
        System.out.println("Age is : "+age);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the name: ");
        String name = sc.nextLine();
        System.out.println("Please Enter the age: ");
        int age = sc.nextInt();
        Eg_3_MethodIUserIP obj = new Eg_3_MethodIUserIP();
        obj.getData(name,age);

    }
}
