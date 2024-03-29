package leetcode;

/* Problem:
Given a string num that contains only digits and an integer target, return all possibilities to add the binary operators '+', '-', or '*' between the digits of num so that the resultant expression evaluates to the target value.

Example 1:

Input: num = "123", target = 6
Output: ["1*2*3","1+2+3"]
Example 2:

Input: num = "232", target = 8
Output: ["2*3+2","2+3*2"]
Example 3:

Input: num = "105", target = 5
Output: ["1*0+5","10-5"]
Example 4:

Input: num = "00", target = 0
Output: ["0*0","0+0","0-0"]
Example 5:

Input: num = "3456237490", target = 9191
Output: []
 */

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> addOperators(String num, int target) {
        return new ArrayList<>();

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> output = solution.addOperators("123", 6);
        System.out.print("[");
        for (int i = 0; i < output.size(); i++) {
            System.out.print(output.get(i));
        }
        System.out.println("]");
    }
}

