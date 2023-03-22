import java.util.ArrayList;

public class New2 {
    public static void main(String[] args) {
        ArrayList <String> a = new ArrayList<>();
        a.add("hello");
        a.add("hii");
        a.add("hello");

        int count = 0;
        for (int i = 0 ; i < a.size() ; i++) {
            if (a.get(i).contains("hello")) {
                count++;
            }
        }System.out.println(count);
    }
}
