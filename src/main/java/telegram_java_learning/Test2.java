package telegram_java_learning;

/**
 * Задача: Дан блок кода(см картинку). Дополните его так, чтобы цикл стал бесконечным.
 *
 *  public static void main(String[] args) {
 *         for (int i = start; i <= start + 1; i++) {
 *         }
 *     }
 */

public class Test2 {
    public static void main(String[] args) {
        int start = Integer.MAX_VALUE - 1;
        for (int i = start; i <= start + 1; i++) {
            System.out.println(i);
        }
    }
}
