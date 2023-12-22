package leetcode;

import java.util.Arrays;

public class Solution198 {
    public static void main(String[] args) {
        //int[] arr = {1,2,3,1};
        int[] arr = {2, 7, 9, 3, 1};
        //int[] arr = {2,1,1,2};
        //int[] arr = {0, 0};
        //int[] arr = {1, 3, 1};
        //int[] arr = {1, 3, 1, 3, 100};
        Solution198 solution = new Solution198();
        System.out.println(solution.rob(arr));

    }

    public int rob(int[] nums) {
        int[] dp = new int[nums.length];

        dp[0] = nums[0];
        if (nums.length > 1)
            dp[1] = nums[1];
        if (nums.length > 2)
            dp[2] = nums[2] + nums[0];

        for (int i = 3; i < nums.length; i++) {
            dp[i] =  Math.max(dp[i - 2], dp[i-3]) + nums[i];
        }

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(dp));

        if (dp.length == 0)
            return 0;
        else if (dp.length == 1)
            return nums[0];
        else if(dp.length == 2)
            return Math.max(nums[0], nums[1]);
        else {
            return Math.max(dp[dp.length - 1], dp[dp.length - 2]);
        }


    }
}
