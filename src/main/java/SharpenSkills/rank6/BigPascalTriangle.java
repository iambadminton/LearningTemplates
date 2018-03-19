package SharpenSkills.rank6;

import java.math.BigInteger;

/**
 * Created by a.shipulin on 19.03.18.
 */
public class BigPascalTriangle {
    private int ubound;
    private BigInteger C[][];

    //инициализация треугольника
    public BigPascalTriangle(int ubound){
        this.ubound = ubound;
        C = new BigInteger[ubound+1][ubound+1];
        for (int n = 0; n <= ubound; n++) {
            //первый и последний элемент в строке равен 1
            C[n][0] = C[n][n] = BigInteger.ONE;
            //далее вычисляем внутреннюю часть
            for (int k = 1; k < n; k++) {
                C[n][k] = C[n-1][k-1].add(C[n-1][k]);//аналог C[n][k] = C[n-1][k-1] + C[n-1][k] для длинной арифметики
            }
        }
    }

    //вывод треугольника в консоль
    public void show(){
        for (int n = 0; n <= ubound; n++) {
            System.out.print("i=" + n + " ");
            for (int k = 0; k <= n; k++) {
                System.out.print(C[n][k] + " ");
            }
            System.out.println();
        }
    }

    //метод, возвращающий кол-во сочетаний из n по k
    public BigInteger get(int n, int k){
        return C[n][k];
    }

    public static void main(String[] args) {
        BigPascalTriangle triangle = new BigPascalTriangle(17);
        triangle.show();
    }
}