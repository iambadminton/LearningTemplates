package leetcode.learn.hashtable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


// leetcode Solution1
public class TwoSumSolution {
    public static void main(String[] args) {
        TwoSumSolution solution = new TwoSumSolution();
        //int[] in = new int[]{2,7,11,15};
        //int target = 9;

        int[] in = new int[]{3,2, 4};
        int target = 6;

        System.out.println(Arrays.toString(solution.twoSum(in, target)));
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();
        int diff;
        for (int i = 0; i < nums.length ; i++) {
            diff = target - nums[i];
            if(map.get(diff) != null) {
                return new int[]{i, map.get(diff)};
            }
            map.put(nums[i], i);

        }
        return new int[]{};
    }
}
