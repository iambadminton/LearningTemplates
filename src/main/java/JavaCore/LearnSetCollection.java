package JavaCore;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * Created by a.shipulin on 30.08.18.
 */
public class LearnSetCollection {
    public LearnSetCollection() {
        set = new TreeSet<String>();
        hashSet = new HashSet<String>();
    }

    public TreeSet<String> set;
    public HashSet<String> hashSet;

    public static void main(String[] args) {
        LearnSetCollection learnObj = new LearnSetCollection();
        learnObj.set.add(new String("mp"));
        learnObj.set.add(new String("aw"));
        learnObj.set.add(new String("strela"));
        learnObj.set.add(new String("dri"));
        learnObj.set.add(new String("vbtewk"));
        learnObj.set.add(new String("/jdfdi"));
        learnObj.set.add(new String("gazprom"));
        learnObj.set.add(new String("синий"));

        // -----------
        learnObj.hashSet.add(new String("mp"));
        learnObj.hashSet.add(new String("aw"));
        learnObj.hashSet.add(new String("strela"));
        learnObj.hashSet.add(new String("dri"));
        learnObj.hashSet.add(new String("vbtewk"));
        learnObj.hashSet.add(new String("/jdfdi"));
        learnObj.hashSet.add(new String("gazprom"));
        learnObj.hashSet.add(new String("синий"));

        System.out.println("set: ==================");
        for (String element : learnObj.set) {
            System.out.println(element);
        }

        System.out.println("hashSet: ==================");
        for (String element : learnObj.hashSet) {
            System.out.println(element);
        }


    }
}
