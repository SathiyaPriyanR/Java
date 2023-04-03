package SamplesW3r;

import java.util.Scanner;

public class Sample15 {
    public static void main(String[] args) {
        /*Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter 1st input : ");
        int a = obj1.nextInt();
        Scanner obj2 = new Scanner(System.in);
        System.out.println("Enter 2nd input : ");
        int b = obj2.nextInt();
        Scanner obj3 = new Scanner(System.in);
        System.out.println("Enter 3rd input : ");
        int c = obj3.nextInt();*/

        int a = 34928;
        int b = 8309;
        int c = 98709;
        System.out.println(ex1(a,b,c));
    }

        public static int ex1 (int a , int b , int c) {
            return Math.min(Math.min(a,b),c);
        }
    }

