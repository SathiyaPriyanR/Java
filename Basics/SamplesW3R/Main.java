import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      //  String a = "aeui";
        Scanner obj = new Scanner(System.in);
        System.out.println("Input a String : ");
        String a = obj.next();
        boolean b = false;
      String c = a.toLowerCase();

       for (int i = 0 ; i <= a.length()-1 ; i++) {
           char ch = c.charAt(i);
           if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

              // System.out.println("Vowels");
               b= true;

           } else {
               System.out.println(" Not a Vowels");
               //  b = true;
               //  System.out.println(b);
               b = false;
               break;
           }

       }  if (b) {
            System.out.println("Vowels");
        }
    }
}