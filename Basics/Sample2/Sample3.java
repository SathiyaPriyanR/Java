package Sample;

public class Sample3 {

    public static int ex1 (String b , char ch) {
        for (int i = 0 ; i<b.length(); i++) {
            if (b.charAt(i)==ch) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String a = "hello world";
        String b = a.toLowerCase();
        System.out.println(ex1(b,'l'));
    }
}
