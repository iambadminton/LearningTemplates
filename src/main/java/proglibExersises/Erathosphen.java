package proglibExersises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by a.shipulin on 07.08.17.
 */
public class Erathosphen {
    public static void main(String[] args) {
        int i;
        int p = 2;
        List<Integer> list = new ArrayList();

        System.out.println("Решето Эратосфена.");
        System.out.println("Введите натуральное число:");
        Scanner in = new Scanner(System.in);
        i = in.nextInt();
        boolean[] b = new boolean[i];

        for(int j=2; j<= i; j++) {
            list.add(j);
        }
        while(p*p <= i){

        }

        System.out.println(list.toString());


    }
}
