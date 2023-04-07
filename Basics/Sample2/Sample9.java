package Sample;

import java.util.Scanner;

public class Sample9 {
    public static void main(String[] args) {
      //  int[] a = {12,2,98,45,34,25};
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter input : ");
        int a = obj.nextInt();
        for (int i = 2 ; i<=a; i++) {
            if (i%2==0) {
                break;
            } for (int j = 2 ; j<=9 ; i++) {
                if (a%j==0) {
                    break;
                }  System.out.println(i);
            }

        }
    }
}
