package sobes.sasha_lukin;

import java.util.Arrays;
import java.util.Stack;

public class Task3 {
    public static void main(String[] args) {
        //int[] temps = {73,74,75,71,69,72,76,73};
        int[] temps = {30,40,50,60};
        System.out.println(Arrays.toString(temperatures(temps)));

    }

    public static int[] temperatures(int[] t) {
        Stack<C> stack = new Stack<>();
        int[] answer = new int[t.length];
        for (int i = t.length - 1; i >= 0; i--) {
            while(!stack.isEmpty() && stack.peek().value <= t[i]) {
                stack.pop();
            }
            if(!stack.isEmpty()) {
                answer[i] = stack.peek().index - i;
            }

            stack.push(new C(t[i],i));

        }
        return answer;
    }
}


class C {
    int value;
    int index;

    public C(int value, int index) {
        this.value = value;
        this.index = index;
    }
}