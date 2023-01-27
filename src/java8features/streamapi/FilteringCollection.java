package java8features.streamapi;

import java.util.ArrayList;
import java.util.List;

class Product{
    int id;
    String name;
    float price;
    Product(int id,String name,float price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
}
public class FilteringCollection {
    public static void main(String[] args) {
        List<Product> pl =new ArrayList<>();
        pl.add(new Product(1,"lg",12000));
        pl.add(new Product(2,"hp",13000));
        pl.add(new Product(3,"mi",1000));
        pl.add(new Product(4,"samsun",1200));
        pl.add(new Product(5,"vivio",18000));
        pl.add(new Product(6,"apple",600000));
        System.out.println("Product list:");
        List<Float>f =new ArrayList<>();
        for (Product p:pl) {
            if(p.price<10000){
                f.add(p.price);
            }
        }
        System.out.println(f);

    }
}
