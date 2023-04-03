package SamplesW3r;
public class Sample16 {
    public static void main(String[] args) {
       int a = 123456;
       int count = 0 ;
       for (int i = a ; i>0 ; i=i/10) {
           a = i%10;
           count++;

       } System.out.println(count);

    }
}
