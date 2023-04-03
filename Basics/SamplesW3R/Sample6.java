package SamplesW3r;

import java.util.Scanner;

public class Sample6 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in) ;
        System.out.println("Enter input : ");
        int a = obj.nextInt();
        if (0<=a) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }
}
