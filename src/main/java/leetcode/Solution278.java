package leetcode;

public class Solution278 {
    public static void main(String[] args) {
        Solution278 solution = new Solution278();

        for (int i = 1; i <= 1 ; i++) {
            System.out.println(i + " => " + solution.isBadVersion(i));
        }
        System.out.println("=================");

        System.out.println(solution.firstBadVersion(2));
        //System.out.println(solution.isBadVersion(3));
        //System.out.println(solution.isBadVersion(4));
    }

    public int firstBadVersion(int n) {
        int middle = n/2;
        int low = 1;
        int high = n;
        while (low <= high) {
            middle = low + (high - low)/2;
            if(isBadVersion(middle))
                high = middle - 1;
            else
                low = middle +1;

        }
        return low;
    }

    public boolean isBadVersion(int n) {
        if(n<=1)
            return false;
        else
            return true;
    }
}
