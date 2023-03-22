import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;
public class UseIterator {
    public static void main(String[] args) {
        LinkedList <String> a1 = new LinkedList<>();
        a1.add("Dhina");
        a1.add("Naveen");
        a1.add("Thangam");
        a1.add("Naveen");
        a1.add("Sharma");

        Iterator <String> b1 = a1.iterator();
       while (b1.hasNext()) {
           String c1 = b1.next();

           System.out.println(c1);
       }
        LinkedHashSet <String> c = new LinkedHashSet<>(a1);
        System.out.println(c);
    }
}









