package OracleTutorial.DeckOfCards;

import java.util.Stack;

/**
 * Created by a.shipulin on 11.08.17.
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        for(int i=0; i<10; i++) {
            stack.add("" + i);
        }

        System.out.println(stack.toString());

    }
}
