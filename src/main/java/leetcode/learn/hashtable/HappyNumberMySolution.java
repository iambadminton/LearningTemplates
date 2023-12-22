package leetcode.learn.hashtable;

import java.util.HashSet;
import java.util.Set;

public class HappyNumberMySolution {
    public static void main(String[] args) {
        HappyNumberMySolution solution = new HappyNumberMySolution();
        //System.out.println(solution.getNext(38));
        System.out.println(solution.isHappy(1));
    }

    private boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        if(n == 1) return true;
        while (n!= 1 && !set.contains(n)) {
            set.add(n);
            n = getNext(n);
            if(n == 1) return true;
        }
        return false;
    }

    private int getNext(int n) {
        int sum = 0;
        int d = n;
        while (n > 0) {
            d = n%10;
            sum += d *d;
            n = n /10;

        }
        return sum;
    }
}
