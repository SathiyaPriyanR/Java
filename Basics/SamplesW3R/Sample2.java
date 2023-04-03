package SamplesW3r;

public class Sample2 {
    public static void main(String[] args) {
        long a = 60*24*365;
        Long b = 525700L;
       int c = (int) (b/a);
        System.out.println(c);
        int d = (int) (b/60*24)%365;
        System.out.println(d);

    }
}
