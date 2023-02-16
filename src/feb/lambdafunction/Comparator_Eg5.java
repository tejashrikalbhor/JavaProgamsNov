package feb.lambdafunction;

import java.util.ArrayList;
import java.util.List;

class Product{
    String name;
    int price;
    int quantity;
    Product( String name, int price, int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
}
public class Comparator_Eg5 {
    public static void main(String[] args) {
        System.out.println("you are in the main");
        List<Product>l=new ArrayList();
        l.add(new Product("Good Day",25,2));
        l.add(new Product("Maggie ",125,20));
        l.add(new Product(" Chock",29,12));
        l.add(new Product(" chips",50,80));
        l.add(new Product("Pen ",25,21));
//        System.out.println(l);
        for(Product p:l)System.out.println(p);

    }
}
