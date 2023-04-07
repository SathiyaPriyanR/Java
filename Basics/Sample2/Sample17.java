package Sample;

public class Sample17 {
    public static void main(String[] args) {
        int[] a = {22,11,16,27,19,6,2,14};
        int maxidx = 0;
        for (int i = 1 ; i<a.length; i++) {
            if (a[i] > a[maxidx]) {
                maxidx = i;
            }
        }
        System.out.println("Index of maximum element: " + maxidx);
    }
}
