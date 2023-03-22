
import java.util.ArrayList;
public class Sample18 {
    public static void main(String[] args) {
        ArrayList <String> a = new ArrayList<>();
        a.add("Redmi");
        a.add("Oppo");
        a.add("Vivo");
        a.add("Samsung");
        System.out.println(a.isEmpty());   // Checking Empty or not
        a.clear();
        System.out.println(a.isEmpty());

    }
}
