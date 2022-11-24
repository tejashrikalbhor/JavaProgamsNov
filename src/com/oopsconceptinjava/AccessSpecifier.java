package com.oopsconceptinjava;

class C1{
    int a=10;
    public int b=20;
    private  int c =212;
    protected int d =211;

    void show(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
public class AccessSpecifier {

    public static void main(String[] args) {
       C1 c =new C1();
       c.show();

    }

}


