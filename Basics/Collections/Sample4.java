
import java.util.ArrayList;
public class Sample4 {
    public static void main(String[] args) {
        ArrayList <String> a = new ArrayList<>();
        a.add("Amazon");
        a.add("Flipkart");
        a.add("Shopclues");
        a.add("Casify");
        System.out.println("Before" + " " + a);     // retrieve element
        System.out.println("After" + " ' " + a.get(1) + " ' ");
    }
}
