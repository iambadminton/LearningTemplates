package proglibExersises;

import java.util.Scanner;

/**
 * Created by a.shipulin on 07.08.17.
 */
public class KollatcHipothesis {
    public static void main(String[] args) {
        int i;
        int res =0;

        System.out.println("Введите любое натуральное число, большее нуля:");
        Scanner in = new Scanner(System.in);
        i = in.nextInt();
        if(i <= 0 ) {
            System.out.println("Число должно быть положительным!");
            return;
        }
        while(i != 1) {
            res++;
            if(i%2 == 0) {
                i = i/2;
                //System.out.println("1: i= " + i);
            }
            else {
                i = i*3 +1;
                //System.out.println("2: i= " + i);
            }
        }
        System.out.println("Количество шагов:" + res);




    }
}
