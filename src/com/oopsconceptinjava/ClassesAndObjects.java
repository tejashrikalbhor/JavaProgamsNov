package com.oopsconceptinjava;

class Mobile
{
    String company;
    float prise;


    void getDetails(String company,float prise) {
        this.company =company;
        this.prise=prise;
        System.out.println("Name of Company: "+company);
        System.out.println("Prise of smart phone is: "+prise);
    }
}
public class ClassesAndObjects {
    public static void main(String[] args) {
        Mobile m = new Mobile();
        Mobile m1 = new Mobile();

        System.out.println(m.company);
        System.out.println((m.prise));
        m.getDetails("MI",10000);
//        System.out.println(m1.company);
//        System.out.println((m1.prise));
        m.getDetails("VIVO",20000);
        System.out.println(m.company);
        System.out.println((m.prise));
        m.getDetails("SAMSUN",30000);

    }

}
