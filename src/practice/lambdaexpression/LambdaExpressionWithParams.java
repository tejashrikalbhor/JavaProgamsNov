package practice.lambdaexpression;

interface Write {
    public void wrie();
}
interface Print{
    public void printdata(String name);
}
interface ReadWrite{
    void readWrite(String name ,int age);
}
public class LambdaExpressionWithParams {
    public static void main(String[] args) {
        System.out.println("you are in the main..");
        System.out.println("i am in the Write class..");

        Write w =()->{
            System.out.println("i am writting java notes..");
        };
        Write w1=()->{
            System.out.println("i am writting c notes..");
        };
        w.wrie();
        w1.wrie();

        System.out.println("i am in Print class..");
        Print p =(name)->{
            System.out.println("my name is : "+name);
        };
        p.printdata("tejashri");

        System.out.println("i am in ReadWrite class..");
        ReadWrite rw =(String name,int age)->{
            System.out.println("name is : " +name);
            System.out.println("age is : "+age);
        };
        rw.readWrite("tejashri",24);

    }
}
