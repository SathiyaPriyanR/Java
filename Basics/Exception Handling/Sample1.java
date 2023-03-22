public class Sample1 {
    public static void main(String[] args) {

        try {

            int b[] = new int[10] ;
            b[6] = 44;
            System.out.println(b[6]);
            int a = 50/0;
        }
        catch (Exception e) {
            System.out.println(e);
            int a = 50/5;
            System.out.println(a);
        }
    }
}
