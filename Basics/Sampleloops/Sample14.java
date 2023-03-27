import java.util.Scanner;

public class Sample14 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Input number for Multiply Table : ");
        int a = obj.nextInt();
        for (int i = 1 ; i<=10 ; i++) {
                int b = i*a;
                System.out.println(i + " x " + a + " = " + b);
        }
    }
}
