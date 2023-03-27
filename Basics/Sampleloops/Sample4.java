
import java.util.Scanner;
public class Sample4 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Employee Salary : ");
        int a = obj.nextInt();
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Years of Experience : ");
        int b = obj1.nextInt();
        if (b>5) {
            double c = (double)5/100;
            System.out.println("Bounus Percentage : " + (c*100));
            int d = (int)(a*c);
            System.out.println("Net Bonus of the Employee is : " + d );
        } else {
            System.out.println("Your not work more than 5Years & not eligible for Bounus");
        }
    }
}
