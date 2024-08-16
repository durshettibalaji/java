package Array;

import java.util.Arrays;

public class ArrayBasics {

    public static void decleration() {
        int arr[];
        String[] str;
        boolean[] bol;
    }

    public static void installation() {
        int[] a = new int[5]; // it gives 5 int memories continuesly
        int[] ab = {1, 2, 3, 4};

    }

    public static void traversing() {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 12, 19};
        for (int ele : a) {
            System.out.println(ele);
        }
    }

    public static void anonymousArray(int[] a) {
        for (int ele : a) {
            System.out.println(ele);
        }
    }

    public static int[] arrayReturnType() {
        return new int[]{1, 2, 3, 4, 5};
    }

    public static void main(String[] args) {
        // traversing();
        // anonymousArray(new int[]{1,2,3,4,5,6,7});
        int[] a = new int[5];
        a[0] = 1;
        a[2] = 3;
        System.out.println(Arrays.toString(a));
    }
}
