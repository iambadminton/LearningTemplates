package udemy_java.collections;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class Test9 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        ListIterator<Integer> iterator = stack.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        /*System.out.println(stack );
        while(!stack.empty()) {
            System.out.println(stack.peek() );
        }

        System.out.println(stack );*/

    }
}
