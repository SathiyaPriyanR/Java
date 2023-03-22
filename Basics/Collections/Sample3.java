import java.util.ArrayList;

public class Sample3 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("Redmi");
        a.add("Oppo");
        a.add("Vivo");
        a.add("Samsung");
        System.out.println("Before" + " " + a);
        a.add(0,"Iphone");          // insert element at the first position
        System.out.println("After" + " " + a);
    }
}
