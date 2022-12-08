package java8features.methodreference;

interface Say{
    void say();
}
public class MethodReferenceStaticMethod {
    public static void saySomething(){
        System.out.println("hello,this is static method..");
    }
    public static void main(String[] args) {
        System.out.println("you are in the main..");
        Say s = MethodReferenceStaticMethod::saySomething;
        s.say();
    }
}
