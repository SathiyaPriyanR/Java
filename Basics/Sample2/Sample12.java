package Sample;

import java.util.Arrays;

public class Sample12 {
    public static  void selectionsort(int[] a) {
        int temp;
        int n = a.length ;
        for (int i = 0 ; i<n; i++) {
            int min = i ;
            for (int j = i + 1 ; j<n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            } temp = a[min] ;
            a[min] = a[i] ;
            a[i] = temp ;
        }
    }
    public static void main(String[] args) {
        int[] a  = {12,34,3,20,8,11,2} ;
        selectionsort(a);
        System.out.println(Arrays.toString(a));

    }
}
