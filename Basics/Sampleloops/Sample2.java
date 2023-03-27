import java.util.Scanner;

public class Sample2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter 1st input : ");
        int aa = a.nextInt();
        Scanner b = new Scanner(System.in);
        System.out.println("Enter 2nd input : ");
        int bb = a.nextInt();
        int c;
      //  c = (aa>bb)?aa:bb;
       // System.out.println("The Max value is : " + c);
        if(aa>bb) {
            System.out.println("aa is greater : " + aa);
        }else {
            System.out.println("bb is greater : " + bb);
        }

    }
}
