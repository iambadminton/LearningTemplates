package LearnCollection.Habrahabr;

/**
 * Created by a.shipulin on 17.11.16.
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class AnalogGrepDecision1 {
    /*//вспомогательный класс, реализующий удобный нам формат строк
    static private class MyString implements Comparable {
        private String interString;
        private int sortIndex = -1;

        public MyString(String str, int wordNum) {
            this.interString = str;
            this.sortIndex = wordNum;
        }

        public String getStr() {
            return interString;
        }

        public int compareTo(MyString arg0) {
        //сортировка без учёта регистра
        //return str.toLowerCase().compareTo(arg0.getStr().toLowerCase());
        //сортировка по длинне (будет выполняться елси параметр не задан)
            if (sortIndex == -1) return interString.length() - arg0.getStr().length();
        //сортировка по sortIndex`овому слову в строке
            String str1 = null, str2 = null;
            try {
                str1 = interString.split(" ")[sortIndex];
            } catch (Exception e) {
        //если нет нужного слова в 1ой строке, то считаем что первое слово меньше 2ого.
                return -1;
            }
            try {
                str2 = arg0.getStr().split(" ")[sortIndex];
            } catch (Exception e) {
        //если нет нужного слова во 2ой строке, то считаем что 2ое слово меньше 1ого
                return 1;
            }
        //здесь сравниваем корректно
            return str1.compareTo(str2);
        }
    }

    ;

    // точка входа в программу
    public static void main(String[] args) {
    //устанавливаем номер слова в строке для сортировки (если не указал, то -1)
        int sortIndex = -1;
    //проверяем кол-во аргументов
        if (args.length != 0) sortIndex = Integer.valueOf(args[0]);
        Scanner in = new Scanner(System.in);
        ArrayList sortList = new ArrayList();
    //начинаем разбор по строчкам, и заполнение объекта контейнера
        while (in.hasNext())
            sortList.add(new MyString(in.nextLine(), sortIndex));
        Collections.sort(sortList);
    //печать на экранчик
        Iterator iter = sortList.iterator();
        while (iter.hasNext())
            System.out.println(iter.next().toString());
        in.close();
    }
    */
}
