package leetcode;

public class Solution309 {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 0, 2};
        Solution309 solution = new Solution309();
        System.out.println(solution.maxProfit(arr));
    }

    public int maxProfit(int[] prices) {
        int sold = Integer.MIN_VALUE;
        int held = Integer.MIN_VALUE;
        int reset = 0;
        int prevSold = Integer.MAX_VALUE;

        for (int currentPrice : prices ) {
            prevSold = sold;
            sold = held + currentPrice;
            held = Math.max(held, reset - currentPrice);
            reset = Math.max(reset, prevSold);
        }


        return Math.max(sold, reset);
    }
}
