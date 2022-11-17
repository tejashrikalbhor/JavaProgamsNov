package com.silicon;

public class ThisKeyWord {

//    String name="tejashri";
    static String name ="pooja";


    public static void main(String[] args) {
        ThisKeyWord t =new ThisKeyWord();
        t.m1();
//        System.out.println(name);
    }

    void m1(){
        String name="narandra";
        System.out.println(this.name);
    }


}
