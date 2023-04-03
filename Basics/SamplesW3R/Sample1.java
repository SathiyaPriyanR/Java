package SamplesW3r;

public class Sample1 {
    public static void main(String[] args) {
        int a = 565;
        int sum = 0 ;
        int b;
        for (int i = a ; i>0 ; i = i/10 ) {
            sum = sum + (i%10);

        }System.out.print(sum);


    }
}
