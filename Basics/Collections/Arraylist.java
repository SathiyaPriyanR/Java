
import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList <String> a = new ArrayList <String>();
        a.add("Rowtho");
        a.add("Naveen");
        a.add("Dhina");
        a.add("Thangam");

        System.out.println(a);
        System.out.println(a.get(1));
        a.add(4,"John");
        System.out.println(a);
        System.out.println(a.clone());
        System.out.println(a.contains("Thangam"));
        a.clear();
        System.out.println(a.isEmpty());
    }
}
