package Sample;

public class Sample16 {
    public static void main(String[] args) {
        int[] a = {22,11,16,27,19,6,2,14};
        int maxidx = a[0];
        for (int i = 0 ; i<a.length; i++) {
            if (a[i] > a[maxidx]) {
                maxidx = i;
            }
        }
        System.out.println(maxidx);
    }
}
