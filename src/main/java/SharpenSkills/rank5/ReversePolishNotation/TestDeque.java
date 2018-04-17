package SharpenSkills.rank5.ReversePolishNotation;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by a.shipulin on 12.04.18.
 */
public class TestDeque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        Integer curr_elem;
        deque.add(10);
        deque.add(25);
        deque.add(30);
        deque.add(154);
        for(Integer curr : deque) {
            System.out.println(curr);
        }


        System.out.println("Перебор удалением:");
        while(true) {
            curr_elem = deque.peek();
            System.out.println(curr_elem);
            deque.remove(curr_elem);
            if(deque.size() ==0) {
                break;
            }

        }

    }
}
