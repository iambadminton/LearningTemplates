package leetcode;

import java.util.Arrays;

public class Solution566 {
    public static void main(String[] args) {
        int[][] mat = new int[][]{{1, 2},{3, 4}};
        int r = 1;
        int c = 4;

/*        int[][] mat = new int[][]{{1, 2},{3, 4}};
        int r = 4;
        int c = 1;*/


        /*int[][] mat = new int[][]{{1, 2, 3, 4}};
        int r = 2;
        int c = 2;*/

        /*int[][] mat = new int[][]{{1}, {2}, {3}, {4}};
        int r = 2;
        int c = 2;*/


        Solution566 solution = new Solution566();
        System.out.println(Arrays.deepToString(mat));
        System.out.println(Arrays.deepToString(solution.matrixReshape(mat, r, c)));

    }

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length * mat[0].length != r*c) {
            return mat;
        }

        int[][] result = new int[r][c];


        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length ; j++) {

                int position = i*mat[0].length + j;
                System.out.println("i = " + i +", j = " + j + ",position = " + position);

                int curRow = (int)Math.ceil(position / c);
                int curCol = position - curRow*c;

                System.out.println("curRow = " + curRow);
                System.out.println("curCol = " + curCol);
                result[curRow][curCol] = mat[i][j];
            }
        }
        return result;
    }
}
