package multithreading.javalessons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        NameList nameList = new NameList();
        nameList.add("first");
        class MyThread extends Thread {
            @Override
            public void run() {
                System.out.println(nameList.removeFirts());
            }
        }

        MyThread myThread = new MyThread();
        myThread.setName("one");
        myThread.start();

        new MyThread().start();
    }

    static class NameList {
        private List list = Collections.synchronizedList(new ArrayList<>());

        public void add(String name) {
            list.add(name);
        }

        public List removeFirts() {
            if(list.size() > 0) {
                if(Thread.currentThread().getName().equals("one")) {
                    Thread.yield();
                }
                list.remove(0);
                return list;
            }
            return null;
        }
    }
}
