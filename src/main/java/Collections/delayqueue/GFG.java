package Collections.delayqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;

public class GFG {
    public static void main(String[] args) {
        BlockingQueue<DelayObject> DQ = new DelayQueue<>();

        DQ.add(new DelayObject("A", 20));
        DQ.add(new DelayObject("B", 40));
        DQ.add(new DelayObject("C", 30));
        DQ.add(new DelayObject("D", 50));

        System.out.println("DelayQueue: " + DQ);

//        BlockingQueue<DelayObject> DQ2 = new DelayQueue<>(DQ);
//        System.out.println("DelayQueue: " + DQ2);

        System.out.println("DQ size before peek: " + DQ.size());
        DQ.peek();

        System.out.println("DQ size after peek: " + DQ.size());

        DQ.poll();
        System.out.println("DQ size after poll: " + DQ.size());
        System.out.println("DelayQueue: " + DQ);

        DQ.poll();
        System.out.println("DQ size after another poll: " + DQ.size());
        System.out.println("DelayQueue: " + DQ);








    }
}
