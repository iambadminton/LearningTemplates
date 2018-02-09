package Skiena.Chapter3;

import java.util.Scanner;

/**
 * Created by a.shipulin on 09.02.18.
 * Упражнение 3.10 - 1
 * Разработать алгоритм для проверки правильности скобок в выражении.
 * Пример ((())())() - правильно, )()( - неправильно, ()) - неправильно
 */
public class BracketBalance {
    String bracketStr;

    public static void main(String[] args) {
        BracketBalance balance = new BracketBalance();
    }

    public boolean isBalanced() {
        int count = 0;
        for (int i = 0; i < this.bracketStr.length(); i++) {
            if (this.bracketStr.charAt(i) == '(') {
                count++;
            }
            if (this.bracketStr.charAt(i) == ')') {
                count--;
                if (count < 0) {
                    return false;
                }
            }
            System.out.println(count);
        }
        if (count == 0) return true;
        else return false;
    }

    public BracketBalance() {
        /*String str = new String();*/
        Scanner sc = new Scanner(System.in);
        System.out.println("введите строку скобок");
        if (sc.hasNext()) {
            this.bracketStr = sc.nextLine();

        }
        System.out.println("str=" + bracketStr);
        System.out.println(isBalanced());

    }
}
