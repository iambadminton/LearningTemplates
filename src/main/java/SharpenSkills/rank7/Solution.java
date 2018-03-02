package SharpenSkills.rank7;

/**
 * Created by a.shipulin on 02.03.18.
 */
public class Solution {
    public int solution(int number) {
        //TODO: Code stuff here
        int sum = 0;
        for (int i=0; i < 10; i++) {
            if (i % 3 == 0 || i % 5 == 0) {

                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(10));
    }

}
