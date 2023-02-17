package feb.lambdafunction;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Product{
    int id;
    String name;
    int price;
    Product(int id,String name,int price) {
        this.id=id;
        this.name=name;
        this.price=price;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price ;

    }
}
public class FilterCollectionData_Eg6 {
    public static void main(String[] args) {
        List<Product> l =new ArrayList<>();
        l.add(new Product(1,"car",1500000));
        l.add(new Product(2,"jupiter",150000));
        l.add(new Product(3,"Cycle",15000));
        l.add(new Product(4,"tv",150023));
        l.add(new Product(5,"Laptop",150000));
        l.add(new Product(6,"mobile",80000));
        Stream<Product> filterData =l.stream().filter(product -> product.price >150000);
        filterData.forEach(
                product -> System.out.println(product.toString()
                ));


    }
}
