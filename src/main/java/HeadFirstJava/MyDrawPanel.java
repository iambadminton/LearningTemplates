package HeadFirstJava;

/**
 * Created by a.shipulin on 22.11.17.
 */

import javax.swing.*;
import java.awt.*;

/**
 * Created by a.shipulin on 22.11.17.
 */
public class MyDrawPanel extends JPanel {

    public void paintComponent(Graphics g) {
        GradientPaint gradient = new GradientPaint(70, 70, Color.CYAN, 150, 150, Color.getHSBColor(25, 25, 25));
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(gradient);
        g2d.fillOval(70, 70, 100, 100);


    }


    public static void main(String[] args) {
        MyDrawPanel panel = new MyDrawPanel();
        panel.go();
    }

    public void go() {
        MyDrawPanel panel = new MyDrawPanel();

        JFrame frame = new JFrame();

        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }


}

