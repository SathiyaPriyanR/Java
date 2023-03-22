import java.util.ArrayList;
public class Sample1 {
    public static void main(String[] args) {
        ArrayList <String> a = new ArrayList<>();
        a.add("monday");
        a.add("tuesday");
        a.add("wednesday");
        a.add("thursday");
        a.add("friday");
        a.add("saturday");
        a.add("Sunday");

        for (String b :a) {
            System.out.println(b);
        }
    }
}
