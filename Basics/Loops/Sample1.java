public class Sample1 {
   public static void main(String[] args) {

        int r;

        for(int n = 12345 ; n>0;n /=10){
            r = n%10;
           int k = (n-r)+r;

                System.out.println(k);
        }
   }
}

