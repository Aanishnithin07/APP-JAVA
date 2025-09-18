import javax.swing.*;
import java.awt.event.*;

public class Q2_ATMSimulation extends JFrame {
    JRadioButton oneStar, twoStar, threeStar, fourStar, fiveStar;
    ButtonGroup group;
    JTextArea commentsArea;
    JButton submitButton;

    public Q2_ATMSimulation() {
        setTitle("Feedback Form");
        setSize(400, 300);
        setLayout(null);

        JLabel rateLabel = new JLabel("Rate our service:");
        rateLabel.setBounds(20, 20, 150, 30);

        oneStar = new JRadioButton("1 Star");
        twoStar = new JRadioButton("2 Stars");
        threeStar = new JRadioButton("3 Stars");
        fourStar = new JRadioButton("4 Stars");
        fiveStar = new JRadioButton("5 Stars");

        group = new ButtonGroup();
        group.add(oneStar);
        group.add(twoStar);
        group.add(threeStar);
        group.add(fourStar);
        group.add(fiveStar);

        oneStar.setBounds(20, 50, 100, 30);
        twoStar.setBounds(120, 50, 100, 30);
        threeStar.setBounds(220, 50, 100, 30);
        fourStar.setBounds(20, 80, 100, 30);
        fiveStar.setBounds(120, 80, 100, 30);

        JLabel commentLabel = new JLabel("Comments:");
        commentLabel.setBounds(20, 120, 100, 30);

        commentsArea = new JTextArea();
        commentsArea.setBounds(20, 150, 350, 60);

        submitButton = new JButton("Submit");
        submitButton.setBounds(150, 220, 100, 30);

        add(rateLabel);
        add(oneStar);
        add(twoStar);
        add(threeStar);
        add(fourStar);
        add(fiveStar);
        add(commentLabel);
        add(commentsArea);
        add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Thank you for your feedback!");
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Q2_ATMSimulation();
    }
}