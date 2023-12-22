package leetcode;

public class Solution121 {
    public static void main(String[] args) {
        //int[] prices = new int[]{7,1,5,3,6,4};
        int[] prices = new int[]{7,6,4,3,1};
        Solution121 solution = new Solution121();
        System.out.println(solution.maxProfit(prices));

    }

    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxDiff = 0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < minPrice ) {
                minPrice = prices[i];
            }
            if(maxDiff < prices[i] - minPrice) {
                maxDiff = prices[i] - minPrice;
            }

        }

        return maxDiff;


    }
}
