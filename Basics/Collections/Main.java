
import java.util.TreeMap;
public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> a = new TreeMap<>();
        a.put(1, "hello world");
        a.put(2, "hello");
        a.put(1, "hello");
        a.put(1,"hi");
        System.out.println(a);
    }
}