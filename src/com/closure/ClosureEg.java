package com.closure;
interface C{
    void getC();
}
public class ClosureEg {
    public static void main(String[] args) {
        System.out.println("you are in main..");
//        ClosureEg c = new ClosureEg();
        C c = new C() {
            @Override
            public void getC() {
                System.out.println("we are in c");
            }
        };
        c.getC();


    }
}
