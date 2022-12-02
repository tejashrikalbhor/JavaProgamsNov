package com.oopsconceptinjava;

import com.classesandobjects.MYFirstException;

public class EG_StaticVariable extends  MYFirstException {
    int rollno;
    static  String name;
    void getDetails(){
        System.out.println("Roll no is : "+rollno);
        System.out.println("Name is : "+name);
    }

    public static void main(String[] args) {
        EG_StaticVariable v = new EG_StaticVariable();
        v.rollno=2;
        v.name ="tejashri";
        v.getDetails();

        MYFirstException myFirstException= new MYFirstException();

        int a=10;
        int b[]= new int[10];


    }
}
