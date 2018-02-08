package HeadFirstJava;

import javax.swing.*;
import java.awt.*;

/**
 * Created by a.shipulin on 22.11.17.
 */
public class TestJFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        JButton button = new JButton("Click me");
        JButton button1 = new JButton("Just another button");
        JButton button2 = new JButton("East button");
        JButton button3 = new JButton("West button");
        JButton button4 = new JButton("Panel button");
        JButton button5 = new JButton("Panel button #2");
        JButton button6 = new JButton("Кнопка под номером 6");

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        /*panel.add(button4);
        panel.add(button5);
        panel.add(button6);*/

        JTextArea textArea = new JTextArea(10, 20);
        panel.add(textArea);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.NORTH, panel);
        frame.getContentPane().add(BorderLayout.CENTER, button);

        frame.getContentPane().add(BorderLayout.SOUTH, button1);
        frame.getContentPane().add(BorderLayout.EAST, button2);
        frame.getContentPane().add(BorderLayout.WEST, button3);
        frame.setSize(500, 500);
        frame.setVisible(true);


    }

    public void changeIt() {

    }
}
