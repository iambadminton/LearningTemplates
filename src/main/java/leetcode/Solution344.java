package leetcode;

import java.util.Arrays;

public class Solution344 {
    public static void main(String[] args) {
        char[] s = new char[] {'h','e','l','l','o'};
        Solution344 solution = new Solution344();
        solution.reverseString(s);
        System.out.println(Arrays.toString(s));

    }

    public void reverseString(char[] s) {
        char temp;
        for (int i = 0; i < s.length /2 ; i++) {
            temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }

    }
}
