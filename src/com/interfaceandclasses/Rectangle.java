package com.interfaceandclasses;


class Rectangle implements Area {
      int l,b;
      public void getArea(int l,int b){
          System.out.println("Area of rectangle is :"+(l*b));

      }
    public static void main(String[] args) {
          Rectangle r =new Rectangle();
        System.out.println("you are in the main..");
        r.getArea(3,2);



    }
}
