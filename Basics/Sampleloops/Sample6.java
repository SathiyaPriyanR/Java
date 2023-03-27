import java.util.Scanner;

public class Sample6 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Person 1 Age : ");
        int a = obj.nextInt();
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Person 2 Age : ");
        int b = obj1.nextInt();
        Scanner obj2 = new Scanner(System.in);
        System.out.println("Person 3Age : ");
        int c = obj2.nextInt();
        int Max = (a>b)?((a>c)?a:c):((b>c)?b:c);
        int Min = (a<b)?((a<c)?a:c):((b<c)?b:c);
        System.out.println("Older Person Age is : " + Max);
        System.out.println("Younger Person Age is : " + Min);
    }
}
