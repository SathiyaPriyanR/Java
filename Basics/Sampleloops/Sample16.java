import java.util.Scanner;

public class Sample16 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter 1st value : ");
        int a = obj.nextInt();
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter 2nd value : ");
        int b = obj1.nextInt();
        int c = (int)Math.pow(a,b);
        System.out.println(c);
    }
}
