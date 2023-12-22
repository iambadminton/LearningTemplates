package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution118 {



    public static void main(String[] args) {
        Solution118 solution118 = new Solution118();
        System.out.println(solution118.generate(5));

    }

    public List<List<Integer>> generate(int numRows) {
        List<Integer> prevRow = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            if (i == 0) {
                list.add(Arrays.asList(1));
            } else if (i == 1) {
                prevRow = Arrays.asList(1, 1);
                list.add(prevRow);
            } else {
                List<Integer> currentRow = new ArrayList<>();
                currentRow.add(1);
                for (int j = 1; j <= prevRow.size()-1; j++) {
                    currentRow.add(prevRow.get(j) + prevRow.get(j - 1));
                }
                currentRow.add(1);
                list.add(currentRow);
                prevRow = currentRow;
            }
        }
        return list;

    }


}
