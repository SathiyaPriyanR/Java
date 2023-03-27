import java.util.Scanner;

public class Sample11 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a Character : ");
        char a = obj.next().charAt(0);
        if (a >= 'a' && a <= 'z') {
            System.out.println("Entered Character " + a + " is Lowercase");
        } else if (a >= 'A' && a <= 'Z') {
            System.out.println("Entered Charcter " + a + " is Uppercase");
        } else {
            System.out.println("Enter a Valid Charcter");
        }
    }
}
