package leetcode;

public class Solution122 {
    public static void main(String[] args) {
        //int[] prices = new int[]{7,1,5,3,6,4};
        //int[] prices = new int[]{1,2,3,4,5};
        int[] prices = new int[]{7,6,4,3,1};
        Solution122 solution = new Solution122();
        System.out.println(solution.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        int diff = 0;

        for (int i = 1; i < prices.length ; i++) {
            if(prices[i] > prices[i-1]) {
                diff += prices[i] - prices[i-1];
            }
        }

        return diff;
    }
}
