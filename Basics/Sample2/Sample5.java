package Sample;


import java.util.Arrays;

class Sample55 {
    public static int ex1 (int[] a , int l , int r , int s) {
        if (r>=l) {
            int m = (l+r) / 2 ;
            if (s == a[m]) {
                return m;
            } else if (s < a[m]) {
                return ex1(a,l,m-1,s);
            } else if (s > a[m]) {
                return ex1(a,m+1,r,s);
            }
        } return -1;
    }
}

public class Sample5 {
    public static void main(String[] args) {
        int a[] = {0,1,2,3,4,5} ;
        Arrays.sort(a);
        int s = 2 ;
        //int result =
        System.out.println(Sample55.ex1(a , 0 , a.length,s));
    }
}
