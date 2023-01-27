package java8features;

interface Book{
    default void bookName(String name){
        System.out.println("you are in the default method");
        System.out.println("this is the book : "+name);
    }
    static void bookPrice(int price){
        System.out.println("you are in the static method..");
        System.out.println("the price of book is : "+price);
    }
    void getDetails(String name,int price);
}
public class StaticMethod implements Book {
    public void getDetails(String name,int price){
        System.out.println("you are in the getDetails method..");
        System.out.println("the name of book is : "+name);
        System.out.println("the price of book is : "+price);
    }

    public static void main(String[] args) {
        StaticMethod s = new StaticMethod();
        s.getDetails("c",224);
        s.bookName("java");
        Book.bookPrice(123);

    }
}
