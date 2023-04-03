package SamplesW3r;

import java.util.Scanner;

public class Sample10 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("ENter input : ");
        int a = obj.nextInt();
        for (int i = 1 ; i<=a ; i++) {
            int b  = i*i*i;
            System.out.println("Cube of " + i + " is " + b);
        }
    }
}
