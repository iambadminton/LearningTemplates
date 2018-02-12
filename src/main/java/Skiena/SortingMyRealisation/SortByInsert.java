package Skiena.SortingMyRealisation;

/**
 * Created by Sanya on 11.02.2018.
 * Моя реализация сортировки вставками
 */
public class SortByInsert {
    int[] a;

    public static void main(String[] args) {
        SortByInsert sorting = new SortByInsert();
        sorting.display();
        sorting.sort();
        System.out.println("");
        sorting.display();

    }

    public void sort() {
        int temp;
        int j;
        int k;
        int num = 0;
        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                continue;
            }
            temp = a[i];
            for (j = 0; j < i; j++) {
                if (a[j] <= temp) {
                    continue;
                } else {
                    // вставим сюда элемент
                    for (k = i; k > j; k--) {
                        a[k] = a[k - 1];
                        num = k;
                    }
                    a[j] = temp;

                }
                break;
            }

        }

    }

    public void display() {
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public SortByInsert() {
        this.a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        /*a[0] = 1;
        a[1] = 10;
        a[2] = 21;
        a[3] = 15;
        a[4] = 14;
        a[5] = 12;
        a[6] = 19;
        a[7] = 8;
        a[8] = 30;
        a[9] = 2;*/


    }
}
