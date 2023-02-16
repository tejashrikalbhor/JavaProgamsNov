package feb.lambdafunction;

interface Student{
    void displayDetails(String name,int age,String address);
}
public class WithoutLambdaExpression_eg2 {
    public static void main(String[] args) {
        String name,address;
        int age;

        System.out.println("you are in the main");
        Student s=new Student() {
            @Override
            public void displayDetails(String name,int age,String address) {
                System.out.println("you are in the displayDetails method.");
                System.out.println("Name is : "+name);
                System.out.println("Age is : "+age);
                System.out.println("Address is : "+address);
            }
        };
        s.displayDetails("tejashri",24,"pune");
        s.displayDetails("raj",23,"pune");
        s.displayDetails("dev",34,"pune");
        s.displayDetails("shri",29  ,"pune");
    }
}
