package java8features.methodreference;

interface Message{
    void getMessage(String name);
}
public class MethodReferenceConstructor {
    MethodReferenceConstructor(String name){
        System.out.println("you are in the constructor..");
        System.out.println(name);
    }
    public static void main(String[] args) {
        System.out.println("you are in the main..");
        Message m =MethodReferenceConstructor::new;
        m.getMessage("welcome to constructor reference..");
    }
}
