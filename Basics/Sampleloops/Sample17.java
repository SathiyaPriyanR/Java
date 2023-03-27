import java.util.Scanner;

public class Sample17 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter input : ");
        int a = obj.nextInt();
        int b = 0;
        for (int i = a ; i!=0 ; i/=10) {
                int c = i % 10;
                b = b * 10 + c;

        } System.out.println(b);
    }
}
