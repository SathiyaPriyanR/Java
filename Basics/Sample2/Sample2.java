package Sample;

import java.util.Arrays;

public class Sample2 {
    public static int[] find (int[][] a , int t) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == t) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[][] a = new int[][] { {1,2,3} , {5,6,4} , {8,9,7}} ; int t = 8;
        int[] result = find(a,t);
        System.out.println(Arrays.toString(result));
    }
}
