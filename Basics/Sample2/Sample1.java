package Sample;

public class Sample1 {
    public static int bsr (int[] a , int target) {
        for (int i = 0; i <= a.length-1; i++) {
            if (a[i] == target) {
                return i;
            }
        } return -1;
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5} ;
        System.out.println(bsr(a,4));
    }
}
