/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author Ajay Dharrsan T R
 */
public class Week8_Swing_q1 extends JFrame {

    JCheckBox laptop, phone, headphones;
    JButton billButton;
    JTextArea outputArea;

    public Week8_Swing_q1() {
        setTitle("Shopping Cart");
        setSize(900, 900);
        setLayout(null);

        laptop = new JCheckBox("Laptop - $800");
        phone = new JCheckBox("Phone - $500");
        headphones = new JCheckBox("Headphones - $150");
        billButton = new JButton("Generate Bill");
        outputArea = new JTextArea();

        laptop.setBounds(20, 20, 200, 30);
        phone.setBounds(20, 60, 200, 30);
        headphones.setBounds(20, 100, 200, 30);
        billButton.setBounds(20, 140, 150, 30);
        outputArea.setBounds(20, 180, 150, 150);

        add(laptop);
        add(phone);
        add(headphones);
        add(billButton);
        add(outputArea);

        billButton.addActionListener(e -> {
            String bill = "Selected Items:\n";
            int total = 0;
            if (laptop.isSelected()) {
                bill += "Laptop - $800\n";
                total += 800;
            }
            if (phone.isSelected()) {
                bill += "Phone - $500\n";
                total += 500;
            }
            if (headphones.isSelected()) {
                bill += "Headphones - $150\n";
                total += 150;
            }
            bill += "Total: $" + total;
            outputArea.setText(bill);
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Week8_Swing_q1();
    }
}