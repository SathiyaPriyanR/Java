import java.util.Scanner;

public class Sample9 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Number of Classes held : ");
        int a = obj.nextInt();
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Number of Classes attended : ");
        int b = obj1.nextInt();
        double c = (double)b/a;
        double d = c*100;
        System.out.println(d);
        if(75>d) {
            Scanner obj3 = new Scanner(System.in);
            System.out.println("Having any Medical issue or not : ");
            String e = obj3.next();
            if(e.contains("Y")) {
                System.out.println("Having Medical issue & So Your Allowed ");

            }  else {
                System.out.println("Attenence below 75% & your not Allowed to Write Exam");
            }
        } else {
            System.out.println("Your eligible for Exam");
        }
    }
}
