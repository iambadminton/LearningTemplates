package SharpenSkills.rank6;

import java.util.Arrays;

/**
 * https://www.codewars.com/kata/matrix-determinant/train/java
 * Write a function that accepts a square matrix (n x n 2D array) and returns the determinant of the matrix.
 * How to take the determinant of a matrix -- it is simplest to start with the smallest cases: A 1x1 matrix |a| has
 * determinant a. A 2x2 matrix [[a, b], [c, d]] or
 * |a b|
 * |c d|
 * has determinant ad - bc.
 * The determinant of an n x n sized matrix is calculated by reducing the problem to the calculation of the determinants of n n-1 x n-1 matrices. For the 3x3 case, [[a, b, c], [d, e, f], [g, h, i]] or
 * |a b c|
 * |d e f|
 * |g h i|
 * the determinant is: a * det(a_minor) - b * det(b_minor) + c * det(c_minor) where det(a_minor) refers to taking the
 * determinant of the 2x2 matrix created by crossing out the row and column in which the element a occurs, or
 * |e f|
 * |h i|
 * Note the alternation of signs.
 * The determinant of larger matrices are calculated analogously, e.g. if M is a 4x4 matrix with first row
 * [a, b, c, d], det(M) = a * det(a_minor) - b * det(b_minor) + c * det(c_minor) - d * det(d_minor)
 */

public class MatrixDeterminant {

    public static int determinant(int[][] matrix) {
        int det = 0;
        int sign = 0;
        if (matrix.length == 1) {
            return matrix[0][0];
        } else {
            for (int i = 0; i < matrix.length; i++) {
                if (i % 2 == 1) {
                    sign = -1;
                } else {
                    sign = 1;
                }
                det = det + sign * matrix[i][0] * determinant(getTruncateMatrix(matrix, i, 0));
            }
            return det;
        }
    }

    public static int[][] getTruncateMatrix(int[][] matrix, int i, int j) {
        int size = matrix.length - 1;
        int new_i = 0;
        int new_j = 0;

        int[][] newMatrix = new int[size][size];
        for (int ii = 0; ii <= size; ii++) {
            if (ii != i) {

                int[] newLine = new int[size];
                new_j = 0;
                for (int jj = 0; jj <= size; jj++) {
                    if (jj != j) {
                        newLine[new_j] = matrix[ii][jj];
                        new_j++;
                    }
                }
                newMatrix[new_i] = newLine;
                new_i++;
            }
        }
        return newMatrix;
    }

    public static void main(String[] args) {
        MatrixDeterminant determinant = new MatrixDeterminant();
        /*System.out.println(determinant.determinant(new int[][]{{1, 2, 3}, {2, 3, 4}, {3, 4, 5}}));*/

        System.out.println(determinant.determinant(new int[][]{
                {2, 5, 3}, {1, -2, -1}, {1, 3, 4}
        }));


        /*int[][] aaa = new int[2][2];
        aaa = determinant.getTruncateMatrix(new int[][]{{1, 2, 3}, {2, 3, 4}, {3, 4, 5}}, 2, 2);
        for (int i = 0; i < aaa.length; i++) {
            System.out.println(Arrays.toString(aaa[i]));
        }*/
        /*System.out.println(Arrays.toString(new int[][]{{1, 2, 3}, {2,3,4}, {3,4,5} }));
        System.out.println(Arrays.toString(new int[] {1,2,3}));*/
    }
}
