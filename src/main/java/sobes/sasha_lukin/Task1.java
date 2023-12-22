package sobes.sasha_lukin;

public class Task1 {
    /* Задача о знаменитостях:
    * Есть список людей(массив). В котором люди знаю друг друга. Знаменитость - тот человек, которого знают все,
    * но который никого другого не знает. */
    public static void main(String[] args) {
        int M[][] = {
                {0, 1, 1, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 0},
                {0, 0, 1, 0}
        };

        System.out.println(findCelebrity(M));
    }

    public static boolean knows(int[][] arr, int i, int j) {
        if (arr[i][j] == 1)
            return true;
        else
            return false;
    }

    public static int findCelebrity(int[][] arr) {
        /* используем метод двух указателей */
        int l = 0, r = arr.length - 1;
        while (l != r) {
            //if (persons[l].knows(persons[r])) {
            if (knows(arr, l, r)) {
                l++; // l знает r, поэтому он точно не знаменитость
            } else {
                r--;
            }
        }

        /* проверяем, что найденная знаменитость никого не знает */
        for (int i = 0; i < arr.length; i++) {
            if (i != l && (!knows(arr, i, l) || knows(arr, l, i))) {
                return -1;
            }
        }

        return l;

    }
}


