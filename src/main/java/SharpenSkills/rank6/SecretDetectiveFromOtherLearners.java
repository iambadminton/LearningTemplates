package SharpenSkills.rank6;

/**
  https://www.codewars.com/kata/53f40dff5f9d31b813000774
 не сработало с моим примером
 */

import java.util.LinkedList;
import java.util.List;

public class SecretDetectiveFromOtherLearners {

    public String recoverSecret(char[][] triplets) {
        List<Character> wordList = new LinkedList<>();
        for (char[] triplet : triplets) {
            int pIndex = -1;
            for (int i = 0; i < 3; i++) {
                System.out.println("вставляем " + triplet[i]);
                int cIndex = wordList.indexOf(triplet[i]);
                System.out.println("  cIndex=" + cIndex);
                if (cIndex != -1) {
                    if (pIndex > cIndex) {
                        System.out.println("       pIndex>cIndex");
                        Character removed = wordList.remove(cIndex);
                        wordList.add(pIndex, removed);
                        cIndex = pIndex;
                    }
                    pIndex = cIndex;
                } else if (pIndex != -1) {
                    pIndex += 1;
                    wordList.add(pIndex, triplet[i]);
                } else {
                    wordList.add(0, triplet[i]);
                    pIndex = 0;
                }
                System.out.println("   -----");
                System.out.println("   wordList.toString()=" + wordList.toString() + " pIndex=" + pIndex);
            }
            System.out.println("==========================================");
            System.out.println("wordList.toString()=" + wordList.toString());
        }



        return wordList.stream().map(ch -> ch.toString()).reduce((p, n) -> p + n).get();
    }

    public static void main(String[] args) {
        SecretDetectiveFromOtherLearners detective = new SecretDetectiveFromOtherLearners();
        /*char[][] triplets = {
                {'t', 'u', 'p'},
                {'w', 'h', 'i'},
                {'t', 's', 'u'},
                {'a', 't', 's'},
                {'h', 'a', 'p'},
                {'t', 'i', 's'},
                {'w', 'h', 's'}
        };*/
        char[][] triplets = {
                {'y', 'i', 'g'},
                {'a', 'r', 'g'},
                {'u', 'h', 'n'},
                {'r', 'h', 'i'},
                {'e', 'o', 'u'},
                {'u', 'n', 'g'},
                {'o', 'n', 'g'}
        };

        System.out.println(detective.recoverSecret(triplets));
    }

}
