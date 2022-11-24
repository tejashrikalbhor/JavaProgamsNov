package com.oopsconceptinjava;

public class ConstructorStudent {
    String name;
    int age;
    ConstructorStudent()
    {
        System.out.println("you are in the Default constructor..");
    }
    ConstructorStudent(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("you are in Parameterised constructor..");
    }
    void getStudentData(){
        System.out.println("Name is: "+name+" Age is : "+age);
    }

    public static void main(String[] args) {
        System.out.println("you are in main..");
        ConstructorStudent s = new ConstructorStudent();
//        ConstructorStudent s1= new ConstructorStudent("preeti",23);
//        s1.getStudentData();
//        s.name="tejashri";
//        s.age=20;
//        System.out.println("Name is: "+s.name+" Age is : "+s.age);
    }
}
