package SamplesW3r;

import java.util.Scanner;

public class Sample8 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Year : ");
        int a = obj.nextInt();
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter Month : ");
        int b = obj1.nextInt();
        int feb =28;

        if (a%4==0) {
            feb = feb+1;
            System.out.println(feb);
        }
        switch (b) {
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                System.out.println(a + " has " + "31 Days");
                break;
            case 2 :
                System.out.println(a + " has " + feb + " Days");
                break;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                System.out.println(a + " has " + "30 Days");
                break;
        }

    }
}
