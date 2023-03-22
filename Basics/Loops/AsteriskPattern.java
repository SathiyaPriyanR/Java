public class AsteriskPattern {
    public static void main(String[] args) {
        int rows = 5;
        int spaces = 0;
        int stars = rows;

        for (int i = 1; i <= rows * 2; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            System.out.println();

            if (i < rows) {
                spaces++;
                stars--;
            } else {
                spaces--;
                stars++;
            }
        }
    }
}
