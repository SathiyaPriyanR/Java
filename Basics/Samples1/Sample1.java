
import java.util.Scanner;
public class Sample1 {
    public static void main(String[] args) {
        Scanner Length = new Scanner(System.in);
        System.out.println("The value of Length is : ");
        int l = Length.nextInt();
        Scanner Breadth = new Scanner(System.in);
        System.out.println("The value of Breadth is : ");
        int b = Breadth.nextInt();

        if(l==b) {
            System.out.println("Given input is Square");
        }else {
            System.out.println("Given input is not a Square");
        }
    }
}
