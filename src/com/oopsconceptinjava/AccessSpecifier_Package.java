package com.oopsconceptinjava;

class C{
    int a=10;
    public int b=20;
    private int c=30;
    protected int d=40;
    void showDetails(){

    }
}
public class AccessSpecifier_Package {
    public static void main(String[] args) {
        C cc = new C();
        cc.showDetails();
        System.out.println("------------------");
        System.out.println(cc.a);
        System.out.println(cc.b);
//        System.out.println(cc.c);
        System.out.println(cc.d);

    }

}



