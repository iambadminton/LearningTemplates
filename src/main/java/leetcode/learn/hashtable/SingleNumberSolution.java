package leetcode.learn.hashtable;

import java.util.HashSet;
import java.util.Set;

public class SingleNumberSolution {
    public static void main(String[] args) {
        SingleNumberSolution solution = new SingleNumberSolution();
        int[] arr = new int[]{4, 1, 2, 1, 2};
        System.out.println(solution.singleNumber(arr));

    }

    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet();

        for (int i = 0; i < nums.length ; i++) {
            if(set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        Object[] result = set.toArray();
        return (int)result[0];
    }


}
