package leetcode;

/*
NOT SOLVED
You are given two strings, word1 and word2. You want to construct a string in the following manner:

Choose some non-empty subsequence subsequence1 from word1.
Choose some non-empty subsequence subsequence2 from word2.
Concatenate the subsequences: subsequence1 + subsequence2, to make the string.
Return the length of the longest palindrome that can be constructed in the described manner. If no palindromes can be constructed, return 0.

A subsequence of a string s is a string that can be made by deleting some (possibly none) characters from s without changing the order of the remaining characters.

A palindrome is a string that reads the same forward as well as backward.



Example 1:

Input: word1 = "cacb", word2 = "cbba"
Output: 5
Explanation: Choose "ab" from word1 and "cba" from word2 to make "abcba", which is a palindrome.
Example 2:

Input: word1 = "ab", word2 = "ab"
Output: 3
Explanation: Choose "ab" from word1 and "a" from word2 to make "aba", which is a palindrome.
Example 3:

Input: word1 = "aa", word2 = "bb"
Output: 0
Explanation: You cannot construct a palindrome from the described method, so return 0.


Constraints:

1 <= word1.length, word2.length <= 1000
word1 and word2 consist of lowercase English letters.
 */


public class Soolution1771 {
    public int longestPalindrome(String word1, String word2) {
        String substr1 = "";
        String substr2 = "";
        String currentStr = "";

        int maxLength = 0;
        int i = 0;
        int j = word2.length();
        while (i < word1.length()) {
            substr1 = substr1 + String.valueOf(word1.charAt(i));
            while (j < word2.length()) {
                substr2 = substr2 + String.valueOf(word1.charAt(j));
                if (substr1.concat(substr2).equals(new StringBuilder(substr2).reverse().toString().concat(substr1))) {
                    maxLength = substr1.concat(substr2).length();
                } else {
                    j--;
                }
            }
        }
        return 0;
    }
}