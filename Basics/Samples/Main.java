
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Length of the Rectangle is : ");
        int length = obj.nextInt();

        System.out.println("Breadth of the Rectangle is : ");
        int breadth = obj.nextInt();

        if (length == breadth) {
            System.out.println("Its Square");
        } else {
            System.out.println("Not a Square");
        }
    }
}