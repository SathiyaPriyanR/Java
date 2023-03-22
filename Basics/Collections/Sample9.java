
import java.util.ArrayList;
public class Sample9 {
    public static void main(String[] args) {
        ArrayList <String> a = new ArrayList<>();
        a.add("Dell");
        a.add("Asus");
        a.add("Mackbook");
        a.add("Acer");

        ArrayList <String> b = new ArrayList<>();
        b.addAll(a);                                // Copy elements of one list to another
        System.out.println(b);
    }
}
