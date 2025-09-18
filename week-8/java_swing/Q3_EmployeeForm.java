import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;

public class Q3_EmployeeForm extends JFrame {
    JTextField nameField, deptField, salaryField;
    JButton submitButton;
    JTable table;
    DefaultTableModel model;

    public Q3_EmployeeForm() {
        setTitle("Employee Management");
        setSize(500, 400);
        setLayout(null);

        JLabel nameLabel = new JLabel("Name:");
        JLabel deptLabel = new JLabel("Department:");
        JLabel salaryLabel = new JLabel("Salary:");

        nameField = new JTextField();
        deptField = new JTextField();
        salaryField = new JTextField();

        submitButton = new JButton("Submit");

        model = new DefaultTableModel();
        model.addColumn("Name");
        model.addColumn("Department");
        model.addColumn("Salary");

        table = new JTable(model);

        nameLabel.setBounds(20, 20, 100, 30);
        nameField.setBounds(120, 20, 150, 30);
        deptLabel.setBounds(20, 60, 100, 30);
        deptField.setBounds(120, 60, 150, 30);
        salaryLabel.setBounds(20, 100, 100, 30);
        salaryField.setBounds(120, 100, 150, 30);
        submitButton.setBounds(120, 140, 100, 30);
        table.setBounds(20, 200, 450, 150);

        add(nameLabel);
        add(nameField);
        add(deptLabel);
        add(deptField);
        add(salaryLabel);
        add(salaryField);
        add(submitButton);
        add(table);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String dept = deptField.getText();
                String salary = salaryField.getText();
                model.addRow(new Object[]{name, dept, salary});
                nameField.setText("");
                deptField.setText("");
                salaryField.setText("");
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Q3_EmployeeForm();
    }
}