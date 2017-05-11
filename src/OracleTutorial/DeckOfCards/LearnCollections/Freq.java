package OracleTutorial.DeckOfCards.LearnCollections;

import java.util.*;


/**
 * Created by a.shipulin on 21.11.16.
 */
public class Freq {
    public static void main(String[] args) {
        Map<String, Integer> mHm = new HashMap<String, Integer>();
        Map<String, Integer> mTm = new TreeMap<String, Integer>();

        for (String word : args) {
            Integer freq = mTm.get(word);
            mTm.put(word, (freq == null) ? 1 : freq + 1);
        }
        System.out.println(mTm);
        mHm.putAll(mTm);

        //m.put(null, 1000000);
        //

        if(mTm.entrySet().containsAll(mHm.entrySet())) {
            System.out.println("mHm - подмножество mTm");
        }

        if(mHm.keySet().equals(mTm.keySet())) {
            System.out.println("mHm полностью совпадает с mTm");
        }



        System.out.println(mTm.size() + " distinct words:");
        System.out.println("------------");
        System.out.println("Getting value from HashMap");
        System.out.println(mHm.toString());



        /*System.out.println(m.toString());*/
        /*if (m.containsValue("be")) {
            System.out.println("We are found be");
        }*/
    }
}
