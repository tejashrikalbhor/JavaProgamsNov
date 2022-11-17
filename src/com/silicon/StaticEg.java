package com.silicon;

public class StaticEg
{
    static int a =10;
     int b=20;

    static {
        System.out.println("this is static block...");
    int a=10;

    }
    {
        System.out.println("this is non static block..");
    }
    static {
        System.out.println("this is static block1...");
        int a=10;

    }
    static {
        System.out.println("this is static block2...");
        int a=10;

    }



    public static void main(String[] args) {
        System.out.println("this is main block..");
        System.out.println("this is A:"+a);
        StaticEg s = new StaticEg();

        System.out.println("this is A by calling obj:"+ s.a);
        System.out.println("this is B by calling obj:"+ s.b);
//        System.out.println("this is B:"+b);
        StaticEg s1 = new StaticEg();
        showStatic(10);
        s1.showStatic1();
    }
    static void showStatic(int a){
        int b =20;
        System.out.println("this is static method..");
    }
    void showStatic1(){
        System.out.println("this is non-static method..");
    }
}
