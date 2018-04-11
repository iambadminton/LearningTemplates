package SharpenSkills.rank5;

import java.util.ArrayList;

/**
 * NOT RESOLVED
 * https://www.codewars.com/kata/52bb6539a4cf1b12d90005b7/train/java
 * Здесь вариант подсчета количества кораблей, реализованный на C# http://www.cyberforum.ru/csharp-beginners/thread1832886.html
 *
 * еще материала, касаемо морского боя https://habrahabr.ru/post/181151/
 *
 Write a method that takes a field for well-known board game "Battleship" as an argument and returns true if it has a
 valid disposition of ships, false otherwise. Argument is guaranteed to be 10*10 two-dimension array. Elements in the
 array are numbers, 0 if the cell is free and 1 if occupied by ship.

 Battleship (also Battleships or Sea Battle) is a guessing game for two players. Each player has a 10x10 grid
 containing several "ships" and objective is to destroy enemy's forces by targetting individual cells on his field.
 The ship occupies one or more cells in the grid. Size and number of ships may differ from version to version.
 In this kata we will use Soviet/Russian version of the game.


 Before the game begins, players set up the board and place the ships accordingly to the following rules:
 There must be single battleship (size of 4 cells), 2 cruisers (size 3), 3 destroyers (size 2) and 4 submarines
 (size 1). Any additional ships are not allowed, as well as missing ships.
 Each ship must be a straight line, except for submarines, which are just single cell.

 The ship cannot overlap or be in contact with any other ship, neither by edge nor by corner.

 This is all you need to solve this kata. If you're interested in more information about the game, visit this link.
 ALGORITHMS
 */

public class BattleField {

    public static boolean fieldValidator(int[][] field) {
        // your code here!
        int size = 0;
        int[] ships = {1, 1, 1, 1, 2, 2, 2, 3, 3, 4};
        ArrayList<Integer> result = new ArrayList<Integer>();
        int res_pos = 0;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.println("i=" + i + " j=" + j + " field[i][j] = " + field[i][j]);
                if (field[i][j] == 1) {
                    size = getShipSize(i, j, field, size);
                    System.out.println("size=" + size);
                    result.add(size);
                }

            }
        }
        System.out.println(result.toString());
        System.out.println("==================");
        for(int k=0; k< field.length; k++ ){
            for(int m=0; m< field.length; m++
                    ) {
                System.out.print(field[k][m] + " ");
            }
            System.out.println();
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] battleField = {
                {1, 0, 0, 0, 0, 1, 1, 0, 0, 0},
                {1, 0, 1, 0, 0, 0, 0, 0, 1, 0},
                {1, 0, 1, 0, 1, 1, 1, 0, 1, 0},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};

        int[] ships = {1, 1, 1, 1, 2, 2, 2, 3, 3, 4};
        fieldValidator(battleField);
    }

    public static int getShipSize(int i, int j, int[][] field, int size) {
        int i_e;
        int j_e;
        int res = 0;
        int length = 1;
        if (i == field.length) {
            i_e = field.length;
        } else {
            i_e = i + 1;
        }


        if (j == field.length) {
            j_e = field.length;
        } else {
            j_e = j + 1;
        }
        System.out.println("getShipSize:: i_e=" + i_e + " j_e=" + j_e);
        // смотрим ячейки снизу и справа
        for (int ii = i + 1; ii < i_e; ii++) {
            for (int jj = j + 1; jj < j_e; j++) {
                if (field[ii][jj] == 1 && (ii != jj)) {
                    // нашли в окружении единицу по диагонали
                    return -1;
                } else {
                    if (field[ii][jj] == 1) {
                        size++;
                        getShipSize(ii, jj, field, size);
                        field[ii][jj] = 2;
                    } else {
                        return 1;
                    }
                }

            }
        }

        return size;
    }
}
