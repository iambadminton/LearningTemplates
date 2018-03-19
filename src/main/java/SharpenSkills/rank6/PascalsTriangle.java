package SharpenSkills.rank6;

import java.util.Arrays;

/**
 * Here you will create the classic pascal's triangle. Your function will be passed the depth of the triangle and you
 * code has to return the corresponding pascal triangle upto that depth
 * The triangle should be returned as a nested array.
 * Note: For JavaScript version, your final result is a string representation of the array. Sorry for the inconvenience,
 * test cases are locked so this is the best I could do.
 * - V
 * for example:
 * PascalsTriangle.pascal(5); // should return [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 * To build the triangle, start with a single 1 at the top, for each number in the next row you just take the two numbers
 * above it and add them together (except for the edges, which are all "1"). eg
 * <p>
 * [1]
 * [1   1]
 * [1  2  1]
 * [1  3  3  1]
 * here you get the 3 by adding the 2 and 1 above it.
 */
public class PascalsTriangle {
    public static int[][] pascal(int depth) {
        // Your code here...
        int res[][] = new int[depth][depth];
        long cur_res = 0;
        for (int i = 0; i <= depth-1; i++) {
            int[] cur_arr = new int[i+1];
            for (int j = 0; j <= i; j++) {
                cur_res = ( fact(i) / (fact(j) * fact((i - j))));
                cur_arr[j] = (int)cur_res;
                /*if(i>=12 ) {
                    System.out.println("        fact(i)= " + fact(i) + " fact(j) = " + fact(j) + " fact(i-j)=" + fact((i-j)));
                }*/

            }
            res[i] = cur_arr;
            System.out.println("i=" + i + "   " + Arrays.toString(cur_arr));
        }

        return res;

    }


    public static long fact(int c) {
        if (c == 1 || c == 0) {
            return 1;
        } else {
            return c * fact(c - 1);
        }
    }


    public static void main(String[] args) {
        PascalsTriangle triangle = new PascalsTriangle();
        System.out.println(Arrays.toString(triangle.pascal(10)));
    }
}
