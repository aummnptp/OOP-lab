import java.awt.*;
import javax.swing.*;
public class TellerGUI {
    private JFrame f;
    private JPanel p1, p2, p3, p4;
    private JTextField tf, tf2;
    private JButton bn1, bn2, bn3;
    private JLabel lb1, lb2;

    public TellerGUI() {
        f = new JFrame("My Calculator");
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        tf = new JTextField("6000");
        tf2 = new JTextField();
        lb1 = new JLabel("Balance");
        lb2 = new JLabel("Amout");

        bn1 = new JButton("Deposit");
        bn2 = new JButton("Withdraw");
        bn3 = new JButton("Exit");
        

        p1.setLayout(new GridLayout(4,1));
        p2.setLayout(new GridLayout(1,3));
        p3.setLayout(new GridLayout(1,2));
        p4.setLayout(new GridLayout(1,2));
        p2.add(bn1);
        p2.add(bn2);
        p2.add(bn3);
        
        
        p3.add(lb1);
        p3.add(tf);
        p4.add(lb2);
        p4.add(tf2);

        p1.add(p3);
        p1.add(p4);
        p1.add(p2);

        
        f.add(p1);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);
    }
}