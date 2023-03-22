
import java.util.ArrayList;
public class Sample5 {
    public static void main (String[] args) {
        ArrayList <Integer> a = new ArrayList<>();
        a.add(101);
        a.add(102);
        a.add(103);
        a.add(105);
        a.add(106);
        a.add(108);
        System.out.println("Before" + " " + a);
        a.add(3,104);               // update elements
        a.add(6,107);
        System.out.println("After" + " " + a);
    }
}
