package Array;

import java.util.Arrays;

public class TwoDimenstionalArray {

    public void declaration() {
        int[][] a;
        int[][] b;
        int c[][];
        int[] d[];
    }

    public static int[][] installation() {
        int[][] b = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        return b;
    }

    public static void main(String[] args) {
        int[][] a = new int[3][3];
        a[0][0] = 1;
        a[1][1] = 2;
        a[2][2] = 3;
        int[][] b = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(a));
        System.out.println(Arrays.deepToString(b));
        System.out.println(Arrays.deepToString(installation()));

    }
}
