package leetcode;

public class Solution557 {
    public static void main(String[] args) {
        String str = "Let's take LeetCode contest";
        Solution557 solution = new Solution557();
        System.out.println(solution.reverseWords(str));

    }

    public String reverseWords(String s) {
        StringBuffer result = new StringBuffer();
        for (String currentStr : s.split(" ")) {
            StringBuffer buffer = new StringBuffer();
            for (int i = 0; i < currentStr.length(); i++) {
                buffer.append(currentStr.substring(currentStr.length() - 1 - i, currentStr.length() - i));
            }
            buffer.append(" ");
            result.append(buffer);
        }
        result.delete(result.length() -1 , result.length());

        return result.toString();

    }

}
