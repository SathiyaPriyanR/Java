
import java.util.LinkedList;
import java.util.HashSet;
public class Sample1 {
    public static void main(String[] args) {
       LinkedList <String> a = new LinkedList<>();
       a.add("Dhina");
       a.add("Naveen");
       a.add("Thangam");

       a.add("Naveen");
        HashSet <String> b = new HashSet<>(a);
        System.out.println(b);

    }
}
