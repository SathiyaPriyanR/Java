
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {
     HashSet <String> a = new HashSet<>();
     a.add("Parker");
        a.add("Rorito");
     a.add("Cello");

     Iterator <String> b = a.iterator();
     while (b.hasNext()) {
         String c = b.next();
         System.out.println(c);
     }
     TreeSet <String> d =new TreeSet<>(a);
        System.out.println(d);
    }
}