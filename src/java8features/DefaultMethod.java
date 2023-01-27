package java8features;
interface Def{
    default void dispaly(){
        System.out.println(
                "you are in the default method.."
        );
    }
    void get(String name);
        }
public class DefaultMethod implements  Def{
  public void get(String name){
      System.out.println("you are in the get method..");
      System.out.println("name is : "+name);
    }
    public static void main(String[] args) {
        System.out.println("you are in the main..");
        DefaultMethod d = new DefaultMethod();
        d.get("tejashri");
        d.dispaly();

    }
}
