
import java.util.ArrayList;
import java.util.Iterator;
public class Sample2 {
    public static void main(String[] args) {
        ArrayList <String> a = new ArrayList<>();
        a.add("Jhon");
        a.add("Peter");
        a.add("Parker");
        a.add("Jhon");
        System.out.println("Before" + " " + a);
        System.out.println(" ' After ' ");
        Iterator <String> b = a.iterator();         // iterate elements
        while (b.hasNext()) {
            String c = b.next();
            System.out.println("  " +  c);
        }
    }
}
