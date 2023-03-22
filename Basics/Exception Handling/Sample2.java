
import java.io.*;
public class Sample2 {
        public static void main(String[] args) {
            try {
                File file = new File("C:\\Users\\99701\\Downloads\\bin");
                FileReader f = new FileReader(file);
                BufferedReader b = new BufferedReader(f);

                String line;
                line = b.readLine();
                System.out.println(line);
            }
           catch (Exception e) {
                    System.out.println(e);
            }
        }
    }

