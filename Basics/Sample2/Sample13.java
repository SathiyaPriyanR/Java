package Sample;

import java.util.Arrays;

public class Sample13 {

    public static void ex1() {
        int i = 0 ;
        int[] a = new int[100];
        for (; i < 100; i++) {
            a[i] = i + 1;

        }
        System.out.println(Arrays.toString(a));

        }
        public static void main (String[] args){
            // int[] a = {2}
            ex1();

        }
    }

