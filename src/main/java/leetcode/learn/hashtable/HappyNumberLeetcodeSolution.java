package leetcode.learn.hashtable;

import java.util.HashSet;
import java.util.Set;

public class HappyNumberLeetcodeSolution {
    public static void main(String[] args) {
        HappyNumberLeetcodeSolution solution = new HappyNumberLeetcodeSolution();
        System.out.println(solution.isHappy(117));
    }

    private int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            totalSum += d * d;
        }
        return totalSum;
    }

    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getNext(n);
            System.out.println(n);
        }
        return n == 1;
    }
}
