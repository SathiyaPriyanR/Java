import java.util.Scanner;

public class Sample5 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Student Mark : ");
        int a = obj.nextInt();
        if(a<25) {
            System.out.println("Fail");
        } else if (25<a && 45>a) {
            System.out.println("Grade E");
        } else if (45<a && 50>a) {
            System.out.println("Grade D");
        } else if (50<a && 60>a) {
            System.out.println("Grade C");
        } else if (60<a && 80>a) {
            System.out.println("Grade B");
        } else if (80<a && 100>a) {
            System.out.println("Grade A");
        } else {
            System.out.println("Invalid Mark");
        }
    }
}
