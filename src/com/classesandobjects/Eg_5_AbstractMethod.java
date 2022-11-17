package com.classesandobjects;


abstract class Parent{
    void getdata(){
        System.out.println("you are in the getData() for parent class..");
    }
    abstract void showData();
}
class Child extends Parent{
    void get(){
        System.out.println("this is child class get()..");

    }
     void showData(){
        System.out.println("you are in the child class..");
    }
}
public class Eg_5_AbstractMethod {
    public static void main(String[] args) {
        Child c = new Child();
//        c.getdata();
//        c.get();
        c.showData();
//
    }





}
