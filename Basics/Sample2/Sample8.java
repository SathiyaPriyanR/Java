package Sample;

public class Sample8 {
    public static void main(String[] args) {
        int[] a  = {60,54,63,24,14,8,19} ;
        int temp = 0 ;
        int j;

        for (int i = 1 ; i<a.length ; i++) {
            temp = a[i];
            j = i - 1 ;
            while ((j>=0) && (a[j]>temp)) {
                a[j+1] = a[j] ;
                j = j - 1 ;
            } a[j+1] = temp;

        }
        // for (int i = 0 ; i< a.length; i++) {
            for (int b : a)
                System.out.println(b);
      //  }
    }
}
