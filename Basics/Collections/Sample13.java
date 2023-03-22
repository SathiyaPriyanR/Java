
import java.util.ArrayList;
public class Sample13 {
    public static void main(String[] args) {

        ArrayList <String> a = new ArrayList<>();
        a.add("Redmi");
        a.add("Oppo");
        a.add("Vivo");
        a.add("Samsung");
        ArrayList <String> b = new ArrayList<>();
        b.add("Redmi");
        b.add("Oppo");
        b.add("Vivo");
       // b.add("Samsung");
        System.out.println(a.equals(b));        //compare two list
    }
}
