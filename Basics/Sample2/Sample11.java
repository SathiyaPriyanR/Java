package Sample;
import java.util.Arrays;

public class Sample11 {
    public static int ex1 (int[] a) {
        int i;
        int max = a[0];
        for ( i = 1 ; i<a.length; i++) {
            if (a[i]>max) {
                max = a[i];
            }
        } return max;
    }

    public static void main(String[] args) {
        int[] a = {43,56,12,42,14,6,2,36} ;
       int resultmax = ex1(a);
        System.out.println(resultmax);
    }
}


