public class OverLoading {
     static int sample1(int a , int b) {

         return a+b;
     }
    static int sample1(int a , int b , int c) {

         return a+b+c;
     }
     static void sample1() {
        String a = "hello";
        String b = "world";
        System.out.println(a + " "  + b);
     }
     public static void main(String[] args) {
        System.out.println(sample1(2, 8));
         System.out.println(sample1(34, 18,45));
        sample1();
     }
}
