package leetcode;

public class Solution74 {
    public static void main(String[] args) {
        Solution74 solution = new Solution74();

        //int target = 3;
        //int[][] matrix = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};

//        int target = 13;
//        int[][] matrix = new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}};

//        int target = 0;
//        int[][] matrix = new int[][]{{1}};

//        int target = 0;
//        int[][] matrix = new int[][]{{1}, {3}};




        int target = 4;
        int[][] matrix = new int[][]{{1, 3, 5}};


        //System.out.println((double)3/2);
        //System.out.println(Math.round((double)3/2));

        System.out.println(solution.getRow(matrix, target));
        System.out.println(solution.getCol(matrix, solution.getRow(matrix, target), target));

        System.out.println(solution.searchMatrix(matrix, target));
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int currentRow = getRow(matrix, target);
        int currentCol;
        if (currentRow != -1) {
            currentCol = getCol(matrix, currentRow, target);
            if (currentCol != -1) {
                return matrix[currentRow][currentCol] == target;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    private int getRow(int[][] matrix, int target) {
        if (matrix.length == 1) {
            return matrix.length - 1;
        }
        int currentRow = matrix.length - 1;
        while (true) {
            currentRow = (int) Math.round((double) currentRow / 2);
            if (matrix[currentRow][0] <= target
                    && matrix[currentRow][matrix[currentRow].length - 1] >= target) {
                return currentRow;
            } else if (currentRow == 0) {
                return currentRow;
            } else if (matrix[currentRow][0] > target) {
                currentRow = currentRow - (int) Math.round((double) currentRow / 2);
            } else {
                currentRow = currentRow + (int) Math.round((double) currentRow / 2);
            }
            if (currentRow < 0 || currentRow >= matrix.length) {
                break;
            }
        }
        return -1;
    }

    private int getCol(int[][] matrix, int row, int target) {
        if (matrix[row].length == 1) {
            return matrix[row].length - 1;
        }
        int currentCol = matrix[row].length - 1;

        while (true) {
            currentCol = (int) Math.round((double) currentCol / 2);
            if (matrix[row][currentCol] == target) {
                return currentCol;
            } else if (matrix[row][currentCol] > target) {
                currentCol = currentCol - (int) Math.round((double) currentCol / 2);
            } else {
                currentCol = currentCol + (int) Math.round((double) currentCol / 2);
            }
            if (currentCol < 0 || currentCol >= matrix[row].length) {
                break;
            }
            if ((matrix[row][currentCol] < target && matrix[row][matrix[row].length - 1] > target)
                    || (currentCol == 0 && matrix[row][currentCol] != target)) {
                return -1;
            }
        }
        return -1;
    }
}
