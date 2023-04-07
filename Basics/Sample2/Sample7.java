package Sample;

import java.util.Arrays;

public class Sample7 {
    public static void main(String[] args) {
        int [] a = {10,17,5,17,8,2,12} ;
        int temp = 0 ;
        for (int i = 0 ; i<a.length; i++) {
            for (int j = i+1 ; j<a.length; j++) {
                if (a[i]>a[j]) {
                   temp = a[i];
                   a[i] = a[j];
                   a[j] = temp;
                }
            }
           System.out.println(Arrays.toString(a));
        }
    }
}
