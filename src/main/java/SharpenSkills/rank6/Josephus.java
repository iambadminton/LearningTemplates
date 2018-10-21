package SharpenSkills.rank6;

/**
 * https://www.codewars.com/kata/josephus-permutation/train/java
 * This problem takes its name by arguably the most important event in the life of the ancient historian Josephus:
 * according to his tale, he and his 40 soldiers were trapped in a cave by the Romans during a siege.
 * <p>
 * Refusing to surrender to the enemy, they instead opted for mass suicide, with a twist: they formed a circle and
 * proceeded to kill one man every three, until one last man was left (and that it was supposed to kill himself to end
 * the act).
 * <p>
 * Well, Josephus and another man were the last two and, as we now know every detail of the story, you may have correctly
 * guessed that they didn't exactly follow through the original idea.
 * <p>
 * You are now to create a function that returns a Josephus permutation, taking as parameters the initial array/list of
 * items to be permuted as if they were in a circle and counted out every k places until none remained.
 * <p>
 * Tips and notes: it helps to start counting from 1 up to n, instead of the usual range 0..n-1; k will always be >=1.
 * <p>
 * For example, with n=7 and k=3 josephus(7,3) should act this way.
 * <p>
 * [1,2,3,4,5,6,7] - initial sequence
 * [1,2,4,5,6,7] => 3 is counted out and goes into the result [3]
 * [1,2,4,5,7] => 6 is counted out and goes into the result [3,6]
 * [1,4,5,7] => 2 is counted out and goes into the result [3,6,2]
 * [1,4,5] => 7 is counted out and goes into the result [3,6,2,7]
 * [1,4] => 5 is counted out and goes into the result [3,6,2,7,5]
 * [4] => 1 is counted out and goes into the result [3,6,2,7,5,1]
 * [] => 4 is counted out and goes into the result [3,6,2,7,5,1,4]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Josephus {
    public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
        ArrayList<T> arr = new ArrayList<T>();
        ArrayList<T> res = new ArrayList<T>();
        int i = 0;
        arr.addAll(items);
        int ii = 0;
        while(arr.size() != 0) {
            ii = (ii +k)%(arr.size());
            i = (i -1 +k)%(arr.size());
            res.add(arr.get(i));
            System.out.println(arr.get(i));
            arr.remove(i);
        }
        return res;
    }

    public static void main(String[] args) {
        Josephus josephus = new Josephus();
        josephus.josephusPermutation(Arrays.asList(new Object[]{1, 2, 3, 4, 5, 6, 7}), 3);
    }
}
