package OracleTutorial.DeckOfCards.LearnCollections;

import java.util.Arrays;

/**
 * Created by a.shipulin on 21.06.17.
 */
public class JavaApplication1 {

    public static void main(String[] args) {
        int[] array = {1,2,6,8,12,16,24,48,69,10,11,14, 13, 19, 15,29};
        int k = 2; //на сколько сдвинем влево
        int[] array2 = new int[k];
        for (int i = 0; i < array.length; i++) {
            if (i < k) {
                array2[i] = array[i];
                continue;
            }
            array[i - k] = array[i];
        }
        System.arraycopy(array2, 0, array, array.length - k, k);
        System.out.println(Arrays.toString(array));


        //System.out.format("Hello world name = %d \n",b-a+1);
    }


}
