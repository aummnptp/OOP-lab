
import java.awt.*;
import javax.swing.*;

public class SimpleCalGUI {

    private JFrame f;
    private JPanel p1, p2;
    private JTextField tf, tf2, tf3;
    private JButton bn1, bn2, bn3, bn4;

    public SimpleCalGUI() {
        f = new JFrame("My Calculator");
        p1 = new JPanel();
        p2 = new JPanel();
        tf = new JTextField();
        tf3 = new JTextField();
        tf2 = new JTextField();

        bn1 = new JButton("+");
        bn2 = new JButton("-");
        bn3 = new JButton("*");
        bn4 = new JButton("/");

        p1.setLayout(new GridLayout(4, 1));
        p2.setLayout(new FlowLayout());
        p2.add(bn1);
        p2.add(bn2);
        p2.add(bn3);
        p2.add(bn4);

        p1.add(tf);
        p1.add(tf2);

        p1.add(p2);
        p1.add(tf3);
        f.add(p1);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleCalGUI();
    }
}