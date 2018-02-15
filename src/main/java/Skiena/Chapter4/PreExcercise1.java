package Skiena.Chapter4;

/**
 * Created by a.shipulin on 15.02.18.
 * попытка разобрать строки вида <ключ>=<значение>
 */
public class PreExcercise1 {
    public static void main(String[] args) {
        String str = new String("этоключ=этозначение");
        System.out.println(str.split("=")[0] + "->" + str.split("=")[1]);
    }

}
