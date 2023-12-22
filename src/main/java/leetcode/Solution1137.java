package leetcode;

public class Solution1137 {
    public static void main(String[] args) {
        Solution1137 solution = new Solution1137();
        System.out.println(solution.tribonacci(25));
    }

    private int tribonacci(int n) {
        int arr[] = new int[n + 1];
        arr[0] = 0;
        if (n >= 1)
            arr[1] = 1;
        if (n >= 2) {
            arr[2] = 1;
        }
        for (int i = 3; i <= n; i++) {
            arr[i] = arr[i - 3] + arr[i - 2] + arr[i - 1];
        }

        return arr[n];

    }
}
