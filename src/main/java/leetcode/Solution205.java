package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution205 {
    public static void main(String[] args) {
        Solution205 solution = new Solution205();
//        String s = "badc";
//        String t = "bada";
        String s = "paper";
        String t = "title";
        System.out.println(solution.isIsomorphic(s, t));

    }

    public boolean isIsomorphic(String s, String t) {
        Map<String, String> map = new HashMap<>();
        if (s.length() != t.length()) return false;
        for (int i = 0; i < s.length(); i++) {
            String curS = s.substring(i, i + 1);
            String curT = t.substring(i, i + 1);
            if (
                    (map.get(curS) != null && !map.get(curS).equals(curT))
                            || (map.get(curS) == null && map.containsValue(curT))) {
                return false;
            }
            map.put(curS, curT);
        }
        return true;
    }

}
