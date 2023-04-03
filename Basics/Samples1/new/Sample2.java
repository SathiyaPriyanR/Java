package enums;
enum Mobile {Redmi,Vivo,Samsung,Apple,Realme}
public class Sample2 {
    public static void main(String[] args) {
        int a = Mobile.Apple.ordinal();
        System.out.println(a);
    }
}
