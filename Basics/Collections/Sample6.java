
import java.util.ArrayList;
public class Sample6 {
    public static void main(String[] args) {
        ArrayList <String> a = new ArrayList<>();
        a.add("Apple");
        a.add("Google");
        a.add("Microsoft");
        a.add("Amazon");
        a.add("Netflix");
        System.out.println("Before" + " " + a);
        a.remove(3);                        // remove the element of the list
        System.out.println("After" + " " + a);
    }
}
