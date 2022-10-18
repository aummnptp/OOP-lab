
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculatorSample implements ActionListener {

    private JFrame f;
    private JPanel p1, p2;
    private JTextArea ta;
    private JButton bn1, bn2, bn3, bn4, bn5, bn6, bn7, bn8, bn9, bn10, bn11, bn12, bn13, bn14, bn15, bn16;
    String operator;
    double num1;
    double num2;

    public CalculatorSample() {
        f = new JFrame("My Calculator");
        p1 = new JPanel();
        p2 = new JPanel();
        ta = new JTextArea();
        bn1 = new JButton("7");
        bn2 = new JButton("8");
        bn3 = new JButton("9");
        bn4 = new JButton("+");
        bn5 = new JButton("4");
        bn6 = new JButton("5");
        bn7 = new JButton("6");
        bn8 = new JButton("-");
        bn9 = new JButton("1");
        bn10 = new JButton("2");
        bn11 = new JButton("3");
        bn12 = new JButton("x");
        bn13 = new JButton("0");
        bn14 = new JButton("c");
        bn15 = new JButton("=");
        bn16 = new JButton("/");
        p1.setLayout(new BorderLayout());
        p1.add(ta, BorderLayout.NORTH);
        p2.setLayout(new GridLayout(4, 4));
        p2.add(bn1);
        p2.add(bn2);
        p2.add(bn3);
        p2.add(bn4);
        p2.add(bn5);
        p2.add(bn6);
        p2.add(bn7);
        p2.add(bn8);
        p2.add(bn9);
        p2.add(bn10);
        p2.add(bn11);
        p2.add(bn12);
        p2.add(bn13);
        p2.add(bn14);
        p2.add(bn15);
        p2.add(bn16);

        bn1.addActionListener(this);
        bn2.addActionListener(this);
        bn3.addActionListener(this);
        bn4.addActionListener(this);
        bn5.addActionListener(this);
        bn6.addActionListener(this);
        bn7.addActionListener(this);
        bn8.addActionListener(this);
        bn9.addActionListener(this);
        bn10.addActionListener(this);
        bn11.addActionListener(this);
        bn12.addActionListener(this);
        bn13.addActionListener(this);
        bn14.addActionListener(this);
        bn15.addActionListener(this);
        bn16.addActionListener(this);

        p1.add(p2);
        f.add(p1);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(bn1)) {
            ta.setText(ta.getText() + "7");
        }
        else if (ae.getSource().equals(bn2)) {
            ta.setText(ta.getText() + "8");
        }
        else if (ae.getSource().equals(bn3)) {
            ta.setText(ta.getText() + "9");
        }
        else if (ae.getSource().equals(bn4)) {
            operator = "+";
            num1 = Double.parseDouble(ta.getText());
            ta.setText("");
        }
        else if (ae.getSource().equals(bn5)) {
            ta.setText(ta.getText() + "4");
        }
        else if (ae.getSource().equals(bn6)) {
            ta.setText(ta.getText() + "5");
        }
        else if (ae.getSource().equals(bn7)) {
            ta.setText(ta.getText() + "6");
        }
        else if (ae.getSource().equals(bn8)) {
            operator = "-";
            num1 = Double.parseDouble(ta.getText());
            ta.setText("");
        }
        else if (ae.getSource().equals(bn9)) {
            ta.setText(ta.getText() + "1");
        }
        else if (ae.getSource().equals(bn10)) {
            ta.setText(ta.getText() + "2");
        }
        else if (ae.getSource().equals(bn11)) {
            ta.setText(ta.getText() + "3");
        }
        else if (ae.getSource().equals(bn12)) {
            operator = "*";
            num1 = Double.parseDouble(ta.getText());
            ta.setText("");
        }
        else if (ae.getSource().equals(bn13)) {
            ta.setText(ta.getText() + "0");
        }
        else if (ae.getSource().equals(bn14)) {
            ta.setText("");
            num1 = 0;
            num2 = 0;
        }
        else if (ae.getSource().equals(bn15)) {
            num2 = Double.valueOf(ta.getText());
            ta.setText(String.valueOf(calc(operator, num1, num2)));
        }
        else if (ae.getSource().equals(bn16)) {
            operator = "/";
            num1 = Double.parseDouble(ta.getText());
            ta.setText("");
        }

    }

    public double calc(String op, double num1, double num2) {
        switch (op) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;

            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        new CalculatorSample();
    }
}