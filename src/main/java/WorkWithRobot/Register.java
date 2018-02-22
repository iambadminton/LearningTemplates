package WorkWithRobot;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

/**
 * Created by a.shipulin on 21.02.18.
 */
public class Register {


    public static void main(String[] args) {
        Register click = new Register();
        try {
            /*click.click(2646, 515);*/
            click.click(134, 1064); // будем запускать из панели быстрого запуска
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void click(int x, int y) throws AWTException, InterruptedException {

        int TIME_CONST = 10000;
        int DELAY_BEFORE = (int) (Math.random() * 10000);
        System.out.println("DELAY_BEFORE=" + DELAY_BEFORE);


        Robot bot = new Robot();
        Thread.sleep(DELAY_BEFORE);


        bot.keyPress(KeyEvent.VK_WINDOWS);
        bot.keyPress(KeyEvent.VK_D);
        // Win+d is now pressed (receiving application should see a "key down" event.)
        bot.keyRelease(KeyEvent.VK_D);
        bot.keyRelease(KeyEvent.VK_WINDOWS);
        // Win+d is now released (receiving application should now see a "key up" event - as well as a "key pressed" event).

        /* снова разворачиваем все окна
        Thread.sleep(TIME_CONST);
        bot.keyPress(KeyEvent.VK_WINDOWS);
        bot.keyPress(KeyEvent.VK_D);
        // Win+d is now pressed (receiving application should see a "key down" event.)
        bot.keyRelease(KeyEvent.VK_D);
        bot.keyRelease(KeyEvent.VK_WINDOWS);
        // Win+d is now released (receiving application should now see a "key up" event - as well as a "key pressed" event).*/

        bot.mouseMove(x, y);
        Thread.sleep(TIME_CONST);
        bot.mousePress(InputEvent.BUTTON1_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_MASK);
        /*
        для панели быстрого запуска делаем один клик
        bot.mousePress(InputEvent.BUTTON1_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_MASK);*/
        bot.mouseMove(950, 660);
        Thread.sleep(TIME_CONST);
        bot.mousePress(InputEvent.BUTTON1_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_MASK);
        bot.mouseMove(1000, 650); // пока жмем нет
        Thread.sleep(TIME_CONST);
        bot.mousePress(InputEvent.BUTTON1_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(TIME_CONST);
        bot.mouseMove(1350, 817); //  закрываем его приблуду
        bot.mousePress(InputEvent.BUTTON1_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_MASK);







    }



}