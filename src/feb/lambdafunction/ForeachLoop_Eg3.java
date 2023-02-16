package feb.lambdafunction;

import java.util.ArrayList;
import java.util.List;

public class ForeachLoop_Eg3 {
    public static void main(String[] args) {
        List<String>list =new ArrayList<>();
        list.add("Tejashri");
        list.add("Rajeshri");
        list.add("Arun");
        list.add("Pooja");
        System.out.println(list);
        list.forEach((n)-> System.out.println(n));
    }
}
