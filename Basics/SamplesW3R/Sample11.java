package SamplesW3r;

import java.util.Scanner;

public class Sample11 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter input : ");
        int a = obj.nextInt();
        int sum = 0;
        for (int i = 1 ; i<=a+a ; i++) {
            if (i%2 != 0) {
                System.out.println(i);
                sum = sum + i;
            }

        }System.out.println("Sum of first " + a + " numbers is " + sum);

    }
}
