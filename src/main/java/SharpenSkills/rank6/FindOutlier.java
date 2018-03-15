package SharpenSkills.rank6;

import java.util.Arrays;

/**
 * Created by a.shipulin on 05.03.18.
 */
public class FindOutlier {
    /*
    мое решение
    static int find(int[] integers) {
        int odd_cnt = 0;
        int even_cnt = 0;
        for(int i=0; i<3; i++) {
            if(integers[i]%2 == 0)
                even_cnt++;
            else
                odd_cnt++;
        }
        if(odd_cnt >= even_cnt) {
            // четное среди ряда нечетных
            for (int j = 0; j < integers.length; j++) {
                if (integers[j] % 2 == 0) {
                    //System.out.println(integers[j]);
                    return integers[j];
                }
            }
        }
        else {
            // нечетное среди четных
            for(int k=0; k<integers.length; k++) {
                if(integers[k]%2==1 || integers[k]%2==-1 ) {
                    //System.out.println(integers[j]);
                    return integers[k];
                }
            }
        }


        return 0;
    }*/

    // отличный пример из solutions
    public static int find(int[] integers) {
        // Since we are warned the array may be very large, we should avoid counting values any more than we need to.

        // We only need the first 3 integers to determine whether we are chasing odds or evens.
        // So, take the first 3 integers and compute the value of Math.abs(i) % 2 on each of them.
        // It will be 0 for even numbers and 1 for odd numbers.
        // Now, add them. If sum is 0 or 1, then we are chasing odds. If sum is 2 or 3, then we are chasing evens.
        int sum = Arrays.stream(integers).limit(3).map(i -> Math.abs(i) % 2).sum();
        int mod = (sum == 0 || sum == 1) ? 1 : 0;

        return Arrays.stream(integers).parallel() // call parallel to get as much bang for the buck on a "large" array
                .filter(n -> Math.abs(n) % 2 == mod).findFirst().getAsInt();
    }

    public static void main(String[] args) {
        FindOutlier outlier = new FindOutlier();
        System.out.println(outlier.find(new int[]{1, -3, 8, 7, 11, 23, 87}));
    }

}
