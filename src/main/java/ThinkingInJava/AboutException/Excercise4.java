package ThinkingInJava.AboutException;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Sanya on 23.09.2018.
 * напишите код, который генерирует и перехватывает ArrayIndexOutOfBoundException
 */
public class Excercise4 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("Excercise4");
        logger.fine(logger.getLevel() + "начинаем работу");
        int a[] = {2,4,5,6,10};
        try {
            System.out.println(a[23]);

        }
        catch (ArrayIndexOutOfBoundsException e) {
            //System.err.println("поймали ошибку");
            logger.info("поймали ошибку");

        }



    }
}
