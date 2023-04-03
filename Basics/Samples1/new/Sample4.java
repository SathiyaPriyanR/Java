package enums;

public class Sample4 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int i = 2;
        int c = 0;
        for (; i <= 50; i++) {
            a = i%2;
            c = i ;
            if (a==1) {
                System.out.print(i + " ");

            }

        }b = c%3;
        if (b==1) {
            System.out.print(c + " ");
        }
    }
}
