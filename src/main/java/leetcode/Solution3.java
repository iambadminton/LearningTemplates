package leetcode;

import java.util.HashMap;

public class Solution3 {
    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        //System.out.println(solution.lengthOfLongestSubstring("abcabcbb"));
        //System.out.println(solution.lengthOfLongestSubstring("bbbbb"));
        //System.out.println(solution.lengthOfLongestSubstring("pwwkew"));
        //System.out.println(solution.lengthOfLongestSubstring("dvdf"));
        //System.out.println(solution.lengthOfLongestSubstring("dvdvd"));
        System.out.println(solution.lengthOfLongestSubstring("wobgrovw"));
        //System.out.println(solution.lengthOfLongestSubstring("asjrgapa"));


    }

    public int lengthOfLongestSubstring(String s) {
        int begin = 0;
        int end = -1;
        int maxLength = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        int currPos = 0;
        while (currPos < s.length()) {
            char curLetter = s.charAt(currPos);
            if(map.get(curLetter) == null) {
                end++;
                map.put(curLetter, 1);
            } else {
                //begin = currPos;
                begin = s.substring(0, currPos).lastIndexOf(curLetter) + 1;
                map.clear();
                for (int i = begin; i <= currPos ; i++) {
                    map.put(s.charAt(i), 1);
                }
                end = currPos;
            }

            if(begin == end) {
                map.clear();
                map.put(curLetter, 1);
            }


            if (maxLength < end - begin + 1)
                maxLength = end - begin + 1;
            currPos++;

        }
        return maxLength;
    }
}
