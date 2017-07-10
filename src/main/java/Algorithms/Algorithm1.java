package Algorithms;

import java.util.Arrays;

/**
 * Задача: Дан массив данных x(0), x(1), x(2)...x(N)
 * Необходим переместить первые M элементов переместить в конец так, чтобы получилась последовательность
 * x(M+1), x(M+2)...x(N), x(0), x(1)...x(M) за время, пропорциональное N, т.е. существует константа К,
 * для которой количество операций не превышает К*N. Использовать подмассив запрещено.
 * <p>
 * Тестируем алгоритм №1 на странице http://codelab.ru/task/cycle_shift/
 */
public class Algorithm1 {
    public static void main(String[] args) {
        int x[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}; // N=12
        int m = 3;
        int gcd = 3; // наибольший общий делитель для N и M ( для 5 и 16 gcd=1)
        int t;
        int j;
        int k;
        int n = x.length;


        System.out.println("n=" + n);
        System.out.println(Arrays.toString(x));
        for (int i = 0; i <= gcd; i++) {
            t = x[i];
            j = i;

            do {
                k = j + m;
                if (k >= n) {
                    k -= n;
                }
                if (k == i) {
                    break;
                }

                x[j] = x[k];
                j = k;
            } while (true);
            x[j] = t;


        }
        System.out.println(Arrays.toString(x));
    }
}
