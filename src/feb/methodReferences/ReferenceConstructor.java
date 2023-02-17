package feb.methodReferences;
interface say2{
    void saySomething(String name);
}
    class Message {
        Message(String name) {
            System.out.println("you are in the constructor");
            System.out.println(name);
        }
    }
public class ReferenceConstructor {
    public static void main(String[] args) {
        say2 s =Message::new;
        s.saySomething("tejashri");
    }
}
