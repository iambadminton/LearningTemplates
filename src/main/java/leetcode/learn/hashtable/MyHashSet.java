package leetcode.learn.hashtable;

import java.util.LinkedList;

//leetcode Solution705 {
public class MyHashSet {
    private Bucket[] buckets;
    private int bucketsSize = 200;

    public MyHashSet() {
        buckets = new Bucket[bucketsSize];
        for (int i = 0; i < this.bucketsSize; i++) {
            buckets[i] = new Bucket();
        }
    }

    public void add(int key) {
        int index = _hash(key);
        this.buckets[index].insert(key);
    }

    public void remove(int key) {
        int index = _hash(key);
        this.buckets[index].delete(key);
    }

    public boolean contains(int key) {
        int index = _hash(key);
        return this.buckets[index].exists(key);
    }

    private int _hash(int key) {
        return key % this.bucketsSize;
    }


    public static void main(String[] args) {
        Integer key = 2;
        MyHashSet obj = new MyHashSet();
        obj.add(key);
        obj.add(key);
        boolean exists = obj.contains(key);
        System.out.println(exists);
        obj.remove(key);
        boolean param_3 = obj.contains(key);
        System.out.println(param_3);
    }
}

class Bucket {
    private LinkedList<Integer> buckets;

    public Bucket() {
        this.buckets = new LinkedList<>();
    }

    public void insert(Integer key) {
        int index = this.buckets.indexOf(key);
        if(index == -1) {
            this.buckets.addFirst(key);
        }
    }

    public void delete(Integer key) {
        this.buckets.remove(key);
    }

    public boolean exists(Integer key) {
        int index = this.buckets.indexOf(key);
        return (index != -1);
    }


}
