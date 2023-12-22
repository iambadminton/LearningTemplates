package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution120 {
    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();

        triangle.add(Arrays.asList(2));
        triangle.add(Arrays.asList(3,4));
        triangle.add(Arrays.asList(6,5,7));
        triangle.add(Arrays.asList(4,1,8,3));

        Solution120 solution = new Solution120();
        System.out.println(solution.minimumTotal(triangle));


    }

    public int minimumTotal(List<List<Integer>> triangle) {
        for (int i = 1; i < triangle.size() ; i++) {
            List<Integer> triangleLine = triangle.get(i);
            List<Integer> curLine = new ArrayList<Integer>();
            for (int j = 0; j < triangle.size() ; j++) {
                if(j==0) {
                    triangle.get(i-1).get(j);
                }

            }
        }
        return 0;

    }


}
