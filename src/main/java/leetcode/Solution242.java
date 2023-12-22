package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution242 {
    public static void main(String[] args) {
        //String s = "anagram", t = "nagaram";
        String s = "rat", t = "car";
        Solution242 solution = new Solution242();
        System.out.println(solution.isAnagram(s,t));
    }

    public boolean isAnagram(String s, String t) {
        boolean result = false;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length() ; i++) {
            char ch = s.charAt(i);
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if(!map.containsKey(ch)) {
                return false;
            }
            else {
                int count = map.get(ch);
                if(count == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, --count);
                }
            }
        }
        if(!map.isEmpty()) {
            return false;
        }
        return true;
    }
}
