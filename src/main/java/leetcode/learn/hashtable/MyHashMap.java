package leetcode.learn.hashtable;

import java.util.Iterator;
import java.util.LinkedList;


// leetcode Solution706
public class MyHashMap {

    private HMBucket[] buckets;
    private int size = 200;

    public MyHashMap() {
        buckets = new HMBucket[size];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new HMBucket();
        }
    }

    public void put(int key, int value) {
        int index = _hash(key);
        //if (buckets[index].pairs.contains(key))
        buckets[index].insert(key, value);
    }

    public int get(int key) {
        int index = _hash(key);
        if (buckets[index].containsKey(key))
            return buckets[index].getValue(key);
        return -1;
    }

    public void remove(int key) {
        int index = _hash(key);
        if (buckets[index].containsKey(key))
            buckets[index].delete(key);
    }

    private int _hash(int key) {
        return key % size;
    }

    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(1, 1); // The map is now [[1,1]]
        System.out.println(myHashMap);
        myHashMap.put(2, 2); // The map is now [[1,1], [2,2]]
        System.out.println(myHashMap);
        myHashMap.get(1);    // return 1, The map is now [[1,1], [2,2]]
        System.out.println(myHashMap);
        myHashMap.get(3);    // return -1 (i.e., not found), The map is now [[1,1], [2,2]]
        System.out.println(myHashMap);
        myHashMap.put(2, 1); // The map is now [[1,1], [2,1]] (i.e., update the existing value)
        System.out.println(myHashMap);
        myHashMap.get(2);    // return 1, The map is now [[1,1], [2,1]]
        System.out.println(myHashMap);
        myHashMap.remove(2); // remove the mapping for 2, The map is now [[1,1]]
        System.out.println(myHashMap);
        myHashMap.get(2);    // return -1 (i.e., not found), The map is now [[1,1]]
        System.out.println(myHashMap);
    }
}

class HMBucket {
    LinkedList<Pair> pairs;

    public HMBucket() {
        this.pairs = new LinkedList<>();
    }

    public boolean containsKey(int key) {
        Iterator iterator = pairs.iterator();
        while (iterator.hasNext()) {
            if (((Pair) iterator.next()).key.equals(key))
                return true;
        }
        return false;
    }

    public int getValue(int key) {
        Iterator iterator = pairs.iterator();
        while (iterator.hasNext()) {
            Pair next = (Pair) iterator.next();
            if (next.key.equals(key))
                return next.value;
        }
        return -1;
    }

    public void delete(int key) {
        Iterator iterator = pairs.iterator();
        while (iterator.hasNext()) {
            Pair next = (Pair) iterator.next();
            if (next.key.equals(key))
                iterator.remove();
        }
    }

    public void insert(int key, int value) {
        boolean alreadyExists = false;
        Iterator iterator = pairs.iterator();
        while (iterator.hasNext()) {
            Pair currentPair = (Pair) iterator.next();
            if (currentPair.key.equals(key)) {
                currentPair.value = value;
                alreadyExists = true;
            }
        }
        if (!alreadyExists) {
            pairs.addFirst(new Pair(key, value));
        }
    }
}


class Pair {
    Integer key;
    Integer value;

    public Pair(Integer key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}


