package testmemory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.List;

public class StaticTest {
    public List<Double> list = new ArrayList<>();

    public void populateList() {
        for (int i = 0; i < 10000000; i++) {
            list.add(Math.random());
        }
        System.out.println("Debug Point 2");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(15000);
        System.out.println("Debug point 1");
        new StaticTest().populateList();
        Thread.sleep(30000);

        System.out.println("Debug point 3");
    }



}
