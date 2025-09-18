import javax.swing.*;
import java.awt.event.*;

public class Q4_Calculator extends JFrame {
    JTextField display;
    JButton[] numberButtons = new JButton[10];
    JButton addButton, subButton, mulButton, divButton, eqButton, clearButton;
    String operator = "";
    double firstValue = 0;

    public Q4_Calculator() {
        setTitle("Calculator");
        setSize(300, 400);
        setLayout(null);

        display = new JTextField();
        display.setBounds(20, 20, 250, 40);
        add(display);

        for(int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].setBounds(20 + (i%3)*60, 80 + (i/3)*60, 50, 50);
            add(numberButtons[i]);
            numberButtons[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JButton btn = (JButton)e.getSource();
                    display.setText(display.getText() + btn.getText());
                }
            });
        }

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        eqButton = new JButton("=");
        clearButton = new JButton("C");

        addButton.setBounds(200, 80, 50, 50);
        subButton.setBounds(200, 140, 50, 50);
        mulButton.setBounds(200, 200, 50, 50);
        divButton.setBounds(200, 260, 50, 50);
        eqButton.setBounds(120, 260, 50, 50);
        clearButton.setBounds(20, 260, 50, 50);

        add(addButton);
        add(subButton);
        add(mulButton);
        add(divButton);
        add(eqButton);
        add(clearButton);

        ActionListener opListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                firstValue = Double.parseDouble(display.getText());
                JButton btn = (JButton)e.getSource();
                operator = btn.getText();
                display.setText("");
            }
        };

        addButton.addActionListener(opListener);
        subButton.addActionListener(opListener);
        mulButton.addActionListener(opListener);
        divButton.addActionListener(opListener);

        eqButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double secondValue = Double.parseDouble(display.getText());
                double result = 0;
                switch(operator) {
                    case "+": result = firstValue + secondValue; break;
                    case "-": result = firstValue - secondValue; break;
                    case "*": result = firstValue * secondValue; break;
                    case "/": result = firstValue / secondValue; break;
                }
                display.setText(String.valueOf(result));
            }
        });

        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText("");
                firstValue = 0;
                operator = "";
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Q4_Calculator();
    }
}