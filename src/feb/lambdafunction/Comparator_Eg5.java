package feb.lambdafunction;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Product1{
    String name;
    int price;
    int quantity;
    Product1( String name, int price, int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity;
    }
}
public class Comparator_Eg5 {
    public static void main(String[] args) {
        System.out.println("you are in the main");
        List<Product1> l=new ArrayList<>();
        l.add(new Product1("Good Day",25,2));
        l.add(new Product1("Maggie ",125,20));
        l.add(new Product1("Chock",29,12));
        l.add(new Product1("Chips",50,80));
        l.add(new Product1("Pen ",25,21));
//        System.out.println(l.toString());
        Collections.sort(l,(p1,p2)->{
            return p1.name.compareTo(p2.name);
        });
        for(Product1 p:l)System.out.println(p.toString());

    }
}
