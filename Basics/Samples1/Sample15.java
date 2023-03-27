import java.util.Scanner;

public class Sample15 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter input for getting Factorial : ");
        int a = obj.nextInt();
        int b = 1;
        for (int i = a ; i>=1 ; i--) {
            b = b * i;

        }
        System.out.println("Factorial of " + a + " is " + b);
    }
}
