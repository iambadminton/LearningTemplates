package leetcode;

import java.util.Arrays;

public class Solution55 {
    public static void main(String[] args) {
        Solution55 solution = new Solution55();
        //int[] arr = new int[]{2,3,1,1,4};
        //int[] arr = new int[]{3,2,1,0,4};
        //int[] arr = new int[]{2,0,0};
        //int[] arr = new int[]{1,1,0,1};
        //int[] arr = new int[]{1, 1, 0, 1};
        //int[] arr = new int[]{2, 5, 0, 0}; // true
        int[] arr = new int[]{2, 0, 1, 0, 1}; // false

        //System.out.println(solution.canJump(arr));
        System.out.println(solution.canJump2(arr));

    }

    public boolean canJump(int[] nums) {
        boolean[] dp = new boolean[nums.length];
        dp[nums.length - 1] = true;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] == 0) {
                dp[i] = false;
                int j = i;
                while (j > 0 && (j + nums[j] == i)) {
                    j--;
                    System.out.println("j = " + j + ", i = " + i);
                    if (j + nums[j] == i) {
                        dp[j] = false;
                    } else {
                        if (j + nums[j] >= nums.length - 1)
                            dp[j] = true;
                        else
                            dp[j] = dp[j + nums[j]];
                    }
                }
                i = j;
            } else {
                if (i + nums[i] >= nums.length - 1)
                    dp[i] = true;
                else
                    dp[i] = dp[i + nums[i]];
            }


        }

        System.out.println(Arrays.toString(dp));

        return dp[0];
    }

    public boolean canJump2(int[] nums) {
        System.out.println(Arrays.toString(nums));
        int lastPos = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + nums[i] >= lastPos) {
                lastPos = i;
            }
            System.out.println("i = " + i + ", lastPost = " + lastPos);
        }
        return lastPos == 0;
    }
}
