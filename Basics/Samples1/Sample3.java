import java.util.Scanner;

public class Sample3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Quantity of user buying : ");
        int a = obj.nextInt();
        int b = a*100;
        if (1000 < b) {
           int c;
           c = b/10;
            System.out.println("Cost after Discount 10% : " + (b-c));
            System.out.println("Discount Value : " + c);
        } else {
            System.out.println(b);
            System.out.println("Buy above 1000 for 10%");
        }

    }
}
