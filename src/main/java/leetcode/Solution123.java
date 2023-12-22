package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution123 {
    public static void main(String[] args) {
        //int[] prices = new int[]{3,3,5,0,0,3,1,4};
        //int[] prices = new int[]{1, 2, 3, 4, 5};
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        Solution123 solution = new Solution123();
        System.out.println(solution.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        int diff = 0;
        int[] leftDP = new int[prices.length];
        int[] rightDP = new int[prices.length + 1];
        int leftMin = prices[0];
        int rightMax = prices[prices.length - 1];
        for (int i = 1; i < prices.length; i++) {
            leftDP[i] = Math.max(prices[i] - leftMin, leftDP[i - 1]);
            leftMin = Math.min(prices[i], leftMin);

            rightDP[prices.length - 1 - i] =
                    Math.max(rightDP[prices.length - i], rightMax - prices[prices.length - 1 - i]);
            rightMax = Math.max(rightMax, prices[prices.length - 1 - i]);

        }
        int result = 0;

        for (int i = 0; i < prices.length; i++) {
            result = Math.max(result, leftDP[i] + rightDP[i + 1]);
        }

        return result;


    }
}
