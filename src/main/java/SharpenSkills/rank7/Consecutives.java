package SharpenSkills.rank7;
/**
 * Task:
 * You are given a list/array which contains only integers (positive and negative). Your job is to sum only the numbers
 * that are the same and consecutive. The result should be one list.
 * Extra credit if you solve it in one line. You can asume there is never an empty list/array and there will always be an
 * integer.
 * Same meaning: 1 == 1
 * 1 != -1
 * #Examples:
 * [1,4,4,4,0,4,3,3,1] # should return [1,12,0,4,6,1]
 * """So as you can see sum of consecutives 1 is 1
 * sum of 3 consecutives 4 is 12
 * sum of 0... and sum of 2
 * consecutives 3 is 6 ..."""
 * [1,1,7,7,3] # should return [2,14,3]
 * [-5,-5,7,7,12,0] # should return [-10,14,12,0]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Consecutives {

    public static List<Integer> sumConsecutives(List<Integer> s) {
        // your code
        /*System.out.println(s.stream().collect(groupingBy(f -> f, counting())));
        System.out.println("==================");
        System.out.println(s.stream().collect(groupingBy((a,b) -> b.equals(a), counting()))
                ;
                */
        Integer prev = null;
        ArrayList<Integer> res = new ArrayList<>();
        Integer cur = new Integer(0);
        int buff = 0;
        for (Integer elem : s
                ) {
            if (!(prev == null) && (!prev.equals(elem))) {
                res.add(cur);
                cur = 0;
                buff = 0;
            }
            cur += elem;
            prev = elem;
            buff++;
        }

        if(buff != 0 ) {
            res.add(cur);
        }

        return res;
    }


    public static void main(String[] args) {
        Consecutives consecutives = new Consecutives();
        System.out.println(Arrays.asList(-5,-5,7,7,12,0));
        System.out.println(consecutives.sumConsecutives(Arrays.asList(-5,-5,7,7,12,0)));


    }

}
