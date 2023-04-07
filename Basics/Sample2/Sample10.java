package Sample;

public class Sample10 {
    public static void main(String[] args) {
        int a = 31;
        boolean b = true;

        if (a < 2) {
            b = false;
        } else {
            for (int i = 2; i <= a/2; i++) {
                if (a % i == 0) {
                    b = false;
                    break;
                }
            }
        }
        if (b) {
            System.out.println(a + " is prime number");
        } else {
            System.out.println(a + " is not prime number");
        }
    }
}
