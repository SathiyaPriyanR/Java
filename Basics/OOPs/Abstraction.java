
abstract class Sample21 {
    public abstract void secretmessage();

    public void hell() {
        System.out.println("hello");
    }
}
class  Sample22 extends Sample21 {
    public void secretmessage() {
        System.out.println("You won 1cr in Lottery");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Sample22 obj = new Sample22();
        obj.secretmessage();
        obj.hell();
    }
}