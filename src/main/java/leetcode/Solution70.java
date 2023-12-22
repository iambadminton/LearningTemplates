package leetcode;

public class Solution70 {
    public static void main(String[] args) {
        Solution70 solution70 = new Solution70();
        System.out.println(solution70.climbStairs(3));
    }

    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        if (n >= 1)
            dp[1] = 1;
        if (n >= 2)
            dp[2] = 2;
        return climbs(n, dp);

    }

    private int climbs(int n, int[] dp) {
        if (dp[n] != 0) {
            return dp[n];
        } else {
            dp[n] = climbs(n - 1, dp) + climbs(n - 2, dp);
            return dp[n];
        }


    }


}
