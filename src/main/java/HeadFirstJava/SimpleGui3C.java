package HeadFirstJava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by a.shipulin on 22.11.17.
 */
public class SimpleGui3C implements ActionListener {
    JFrame frame;
   /* public void paintComponent(Graphics g) {
           GradientPaint gradient = new GradientPaint(70, 70, Color.CYAN, 150, 150, Color.getHSBColor(25,25,25));
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(gradient);
        g2d.fillOval(70, 70, 100, 100);


    }*/
   public static void main(String[] args) {
       SimpleGui3C panel = new SimpleGui3C();
       panel.go();
   }
    public void go() {
        SimpleGui3C gui = new SimpleGui3C();

        MyDrawPanel panel = new MyDrawPanel();
        frame = new JFrame();

        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Протестируем");
        button.addActionListener(this);
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, panel);


    }

    public void actionPerformed(ActionEvent event) {
        frame.repaint();
    }
}
