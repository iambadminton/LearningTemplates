package sobes.sasha_lukin;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        //System.out.println(paths(5, 4));
        int arr[][] = new int[3][2];
        System.out.println(helper(3, 2, arr));

    }

    public static int paths(int n, int m) {
        if (n < 0 || m < 0) {
            return 0;
        }
        if (n == 1 || m == 1) {
            return 1;
        }

        return paths(n - 1, m) + paths(n, m - 1);
    }

    public static int helper(int n, int m, int[][] arr) {
        if (n < 0 || m < 0) {
            return 0;
        }
        if (n == 1 || m == 1) {
            return 1;
        }

        if (arr[n - 1][m - 1] != 0) {
            return arr[n - 1][m - 1];
        } else {
            arr[n - 1][m - 1] = helper(n - 1, m, arr) + helper(n, m - 1, arr);
            return arr[n - 1][m - 1];
        }


    }
}
