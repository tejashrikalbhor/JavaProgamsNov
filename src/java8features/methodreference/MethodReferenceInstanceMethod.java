package java8features.methodreference;

interface Sayable{
    void saySomething();
}
public class MethodReferenceInstanceMethod {
    void sayHi(){
        System.out.println("you are in the sayHi method..");
        System.out.println("hi..");
    }
    public static void main(String[] args) {
        System.out.println("you are in the main");
        MethodReferenceInstanceMethod mr =new MethodReferenceInstanceMethod();
        Sayable s =mr::sayHi;
        s.saySomething();

    }
}
