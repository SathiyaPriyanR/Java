package SamplesW3r;

public class Sample5 {
    public static void main(String[] args) {
        int a = 123456;
        int b = 0;
        int c = 0;
        for (int i = a ; i>0 ; i = i / 10) {
            b =  (i%10);
            c = b;
            System.out.print(c + " ");

        }

    }
}
