package com.classesandobjects;
import com.oopsconceptinjava.AccessSpecifier;


public class Eg_1_ClassesAndObjects {
    int x=10,y=20;
    public void show(){
        System.out.println("Addition of 2 nos:"+(x+y));
    }
    public static void main(String[] args) {
        System.out.println("this is my first program..");
        Eg_1_ClassesAndObjects obj =new Eg_1_ClassesAndObjects();
        obj.show();
    }

}

