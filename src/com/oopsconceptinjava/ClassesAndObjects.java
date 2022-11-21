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
        m.getDetails("MI",10000);
        m.getDetails("VIVO",20000);
        m.getDetails("SAMSUN",30000);

    }

}
