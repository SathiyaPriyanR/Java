package Sample;

import java.util.Arrays;

public class Sample4 {
    public static int ex1 (int[] a , int l , int r ,int s) {
        if (r>=l) {
            int m = (l+r) / 2;
            if (s==a[m]) {
                return m;
            } else if (s<a[m]) {
                return ex1(a , l , m-1,s );
            } else if (s>a[m]) {
                return ex1(a,m+1,r,s);
            }
        } return -1;

    }

    public static void main(String[] args) {
        int [] a = {5,4,3,2,1,0};
        Arrays.sort(a);
        int s = 4;
        int result = ex1(a,0,a.length-1,s);
        System.out.println(result);
    }
}
