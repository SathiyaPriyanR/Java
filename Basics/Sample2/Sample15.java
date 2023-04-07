package Sample;

public class Sample15 {
    public static void main(String[] args) {
        int[] a = {22,15,46,5,169,2,28};
        int min = a[0];
        for (int i = 1 ; i<a.length; i++) {
            if (a[i]>min) {
                min = a[i];
            }
        } System.out.println(min);
    }
}
