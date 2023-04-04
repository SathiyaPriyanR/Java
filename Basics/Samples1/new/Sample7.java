package Sample;

public class Sample7 {
    public static void main(String[] args) {
        String a = "aei";
        boolean b = false;
        for (int i = 0 ; i<a.length() ; i++) {
            char ch = a.charAt(i);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                //  System.out.println("Vowels");
                b = true;
                break;
            default:
                System.out.println("Not a vowels");
                b = false;

        } } if (b) {
            System.out.println("Vowels");
        }
    }
}
