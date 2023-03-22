
import java.util.ArrayList;
public class Sample15 {
    public static void main(String[] args) {
        ArrayList <String> a = new ArrayList<>();
        a.add("CSE");
        a.add("IT");
        ArrayList <String> b = new ArrayList<>();
        a.add("ECE");
        a.add("Mechanical");
        a.addAll(b);
        System.out.println(a);
    }
}
