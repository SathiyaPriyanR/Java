
   import java.util.ArrayList;
 public class Main {
        public static void main(String[] args) {
            ArrayList<Integer> a = new ArrayList<>();
            a.add(4);
            a.add(2);
            a.add(5);
            a.add(1);
            a.add(3);

            System.out.println("Before sorting: " + a);

            for (int i = 0; i < a.size() - 1; i++) {
                for (int j = i + 1; j < a.size(); j++) {
                    if (a.get(i) > a.get(j)) {
                        // Swap elements
                        int temp = a.get(i);
                        a.set(i, a.get(j));
                        a.set(j, temp);
                    }
                }
            }

            System.out.println("After sorting: " + a);
        }
    }
