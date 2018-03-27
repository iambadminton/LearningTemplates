package SharpenSkills.rank6;

/**
 * Created by a.shipulin on 26.03.18.
 */

import java.util.LinkedList;
import java.util.List;

public class SecretDetectiveFromOtherLearners {

    public String recoverSecret(char[][] triplets) {
        List<Character> wordList = new LinkedList<>();
        for (char[] triplet : triplets) {
            int pIndex = -1;
            for (int i = 0; i < 3; i++) {
                int cIndex = wordList.indexOf(triplet[i]);
                if (cIndex != -1) {
                    if (pIndex > cIndex) {
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
            }
        }

        return wordList.stream().map(ch -> ch.toString()).reduce((p, n) -> p + n).get();
    }

    public static void main(String[] args) {
        SecretDetectiveFromOtherLearners detective = new SecretDetectiveFromOtherLearners();
        char[][] triplets = {
                {'t', 'u', 'p'},
                {'w', 'h', 'i'},
                {'t', 's', 'u'},
                {'a', 't', 's'},
                {'h', 'a', 'p'},
                {'t', 'i', 's'},
                {'w', 'h', 's'}
        };

        System.out.println(detective.recoverSecret(triplets));
    }

}
