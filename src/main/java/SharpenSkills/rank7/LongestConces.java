package SharpenSkills.rank7;

import java.util.Arrays;


/**
 https://www.codewars.com/kata/56a5d994ac971f1ac500003e/train/java

 */
public class LongestConces {
    public static String longestConsec(String[] strarr, int k) {
        // your code
        int max_length = 0;
        int pos = 0;
        for(int i=0; i< strarr.length; i++){
            if(strarr[i].length() > max_length) {
                max_length = strarr[i].length();
                pos = i;
            }
        }
        //System.out.println("max_lenrth=" + max_length + " pos=" + pos);
        return String.join("", Arrays.copyOfRange(strarr, pos, pos+k));
        //return String.join("", new String[] {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"});

    }

    public static void main(String[] args) {
        LongestConces conces = new LongestConces();
        System.out.println(conces.longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2));
    }
}
