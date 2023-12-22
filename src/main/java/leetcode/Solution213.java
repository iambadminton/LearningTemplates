package leetcode;

import java.util.Arrays;

public class Solution213 {
    public static void main(String[] args) {
        //int[] arr = {7,4,1,9,3,8,6,5};
        //int[] arr = {1, 2, 3, 2};
        //int[] arr = {1,2,3};
        //int[] arr = {2, 3, 2};
        int[] arr = {1,2,3,1};

        Solution213 solution = new Solution213();
        System.out.println(solution.rob(arr));

    }

    public int rob(int[] nums) {
        return Math.max(rob(nums, 0, nums.length-2), rob(nums, 1, nums.length - 1));
    }

    private int rob(int[] nums, int start, int end) {
        int t1 = 0;
        int t2 = 0;

        for (int i = start; i <= end ; i++) {
            int temp = t1;
            t1 = Math.max(t2 + nums[i], t1);
            t2 = temp;

            /*int temp = t1;
            int current = nums[i];
            t1 = Math.max(current + t2, t1);
            t2 = temp;*/
        }
        return t1;
    }
}
