import java.util.Scanner;
public class Samplecls1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a day : ");
        String a = obj.next();
      // String a = "Monday";

        switch (a) {
            case "Monday" :
                System.out.println("Day1");
                break;
            case "Tuesday" :
                System.out.println("Day2");
                break;
            case "Wednesday" :
                System.out.println("Day3");
                break;
            case "Thursday" :
                System.out.println("Day4");
                break;
            case "Friday" :
                System.out.println("Day5");
                break;
            case "Saturday" :
                System.out.println("Day6");
                break;
            case "Sunday" :
                System.out.println("Day7");
                break;
            default:
                System.out.println("Its not a Day");
        }
    }
}
