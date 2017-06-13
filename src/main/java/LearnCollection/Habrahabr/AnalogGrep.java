package LearnCollection.Habrahabr;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by a.shipulin on 17.11.16.
 *
 * https://habrahabr.ru/post/44031/
 * Задача: Аналог grep
 * Необходимо реализовать консольную программу, которая бы фильтровала
 * поток текстовой информации подаваемой на вход и на выходе показывала лишь
 * те строчки, которые содержат слово передаваемое программе на вход в качестве аргумента.
 * Варианты усложнения:
 * Программа не должна учитывать регистр
 * В аргументах может быть передано не одно слово, а несколько
 * В качестве аргумента может быть задано не конкретное слово, а регулярное выражение
 */
public class AnalogGrep {
    public static void main(String[] args) {
        System.out.println("==>");
        Scanner in = new Scanner(System.in);
        ArrayList<String> txt = new ArrayList<>();
        while(in.hasNext()) {
            txt.add(in.nextLine());
            if(in.nextLine().isEmpty()) break;
        }
        in.close();
        /*System.out.println("проверка на выходе:");
        for (String item: txt) System.out.println(item);*/
        for(String word: txt) {
            /*if(word.equals("every")) {
                System.out.println(word);
            }*/
            System.out.println(word + "!");
        }


    }
}
