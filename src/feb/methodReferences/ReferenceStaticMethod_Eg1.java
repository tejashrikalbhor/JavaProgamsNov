package feb.methodReferences;
interface say{
    void say();
}
public class ReferenceStaticMethod_Eg1 {
    public static void dispaly(){
        System.out.println("you are in the static method.");
    }

    public static void main(String[] args) {
        System.out.println("you are in the main method:");
        say s = ReferenceStaticMethod_Eg1::dispaly;
        s.say();

    }

}
