
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Sample11 {
    public static void main(String[] args) {
        ArrayList <String> a = new ArrayList<>();
        a.add("Dell");
        a.add("Asus");
        a.add("Mackbook");
        a.add("Acer");
        ListIterator <String> b = a.listIterator(a.size());     // Reverse  String
        while (b.hasPrevious()) {
            String c = b.previous();
            System.out.println(c);
        }
    }
}
