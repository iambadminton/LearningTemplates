package interviewbit;

import java.util.ArrayList;

/*
url: https://www.interviewbit.com/problems/nqueens/

The n-queens puzzle is the problem of placing n queens on an n×n chessboard such that no two queens attack each other.

N Queens: Example 1

Given an integer n, return all distinct solutions to the n-queens puzzle.

Each solution contains a distinct board configuration of the n-queens’ placement, where 'Q' and '.' both indicate a queen and an empty space respectively.

For example,

There exist two distinct solutions to the 4-queens puzzle:

[
 [".Q..",  // Solution 1
  "...Q",
  "Q...",
  "..Q."],

 ["..Q.",  // Solution 2
  "Q...",
  "...Q",
  ".Q.."]
]
 */

public class Solution {
    public ArrayList<ArrayList<String>> solveNQueens(int a) {
        String result = "";
        String point = ".";
        String queen = "Q";
        ArrayList<String> currentBoard = new ArrayList<String>();
        for (int i = 0; i < a; i++) {

        }

        return new ArrayList<ArrayList<String>>();

    }

    private ArrayList<String> addNextValidStep(ArrayList<String> list, int dimension, int step) {

        String currentString = "";

        if (list.size() == 0) {
            for (int i = 0; i < dimension; i++) {
                if (i == step) {
                    currentString += "Q,";
                } else {
                    currentString += ".,";
                }
            }

        } else {
            String prevString = list.get(list.size() - 1);
            String leftBottom = ".";
            String leftTop = ".";
            String left = "";
            for (int i = 0; i < dimension; i++) {
                if (i == 0) {
                    leftBottom = ".";
                } else {
                    leftBottom = list.get(list.size() - 2).split(",")[i - 1];
                }

                if (i == dimension - 1) {
                    leftTop = ".";
                } else {
                    leftTop = list.get(list.size() - 2).split(",")[i + 1];
                }

                if(list.size() == 0) {
                    left = ".";
                }
                else {
                    left = list.get(list.size() - 2).split(",")[i];
                }

                if(leftBottom.equals(".") && left.equals(".") && leftTop.equals(".")) {
                    currentString += "Q,";
                }
                else {
                    currentString += ".,";
                }
            }
        }
        currentString = currentString.substring(0, currentString.length() - 2);
        list.add(currentString);
        return list;
    }

    /*private boolean checkDanger(ArrayList<String> list, int a) {
        for (int i = 0; i < a; i++) {

        }
        return true;
    }*/
}
