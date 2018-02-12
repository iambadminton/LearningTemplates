package Skiena.Chapter3;

import java.util.Arrays;

/**
 * Created by Sanya on 10.02.2018.
 * Задача: проверить, как можно преобразовать изменить размер массива, допустим, после удаления одного элемента
 */
public class ShrinkArray {
    public static void main(String[] args) {
        int a[] = {10,20,30,35,37,14,5,6,78,995,55};
        for(int i=0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("==============================");
        a = Arrays.copyOf(a, 20);
        /*System.arraycopy(a, 2, a, 6, 5);*/
        for(int i=0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }

}
