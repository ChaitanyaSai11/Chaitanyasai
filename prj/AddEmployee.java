package prj;

import java.awt.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import java.util.Random;

public class AddEmployee extends JFrame implements ActionListener {

    Random ran = new Random();
    int number = ran.nextInt(999999);

    JTextField tfname, tffname, tfaddress, tfphone, tfaadhar, tfemail, tfsalary, tfdesignation;
    JDateChooser dcdob;
    JComboBox<String> cbeducation;
    JLabel lblempId;
    JButton add, back;

    AddEmployee() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Add Employee Detail");
        heading.setBounds(320, 30, 500, 50);
        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
        add(heading);

        addLabelAndField("Name", 50, 150, tfname = new JTextField());
        addLabelAndField("Father's Name", 400, 150, tffname = new JTextField());
        addLabelAndField("Date of Birth", 50, 200, dcdob = new JDateChooser());
        addLabelAndField("Salary", 400, 200, tfsalary = new JTextField());
        addLabelAndField("Address", 50, 250, tfaddress = new JTextField());
        addLabelAndField("Phone", 400, 250, tfphone = new JTextField());
        addLabelAndField("Email", 50, 300, tfemail = new JTextField());
        addLabelAndField("Highest Education", 400, 300, cbeducation = new JComboBox<>(new String[] { "BBA", "BCA", "BA",
                "BSC", "B.COM", "BTech", "MBA", "MCA", "MA", "MTech", "MSC", "PHD" }));
        addLabelAndField("Designation", 50, 350, tfdesignation = new JTextField());
        addLabelAndField("Aadhar Number", 400, 350, tfaadhar = new JTextField());

        JLabel labelempId = new JLabel("Employee ID");
        labelempId.setBounds(50, 400, 150, 30);
        labelempId.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelempId);

        lblempId = new JLabel("" + number);
        lblempId.setBounds(200, 400, 150, 30);
        lblempId.setFont(new Font("serif", Font.PLAIN, 20));
        add(lblempId);

        add = new JButton("Add Details");
        add.setBounds(250, 550, 150, 40);
        add.addActionListener(this);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add(add);

        back = new JButton("Back");
        back.setBounds(450, 550, 150, 40);
        back.addActionListener(this);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        add(back);

        setSize(900, 700);
        setLocation(300, 50);
        setVisible(true);
    }

    private void addLabelAndField(String labelText, int x, int y, Component field) {
        JLabel label = new JLabel(labelText);
        label.setBounds(x, y, 150, 30);
        label.setFont(new Font("serif", Font.PLAIN, 20));
        add(label);

        field.setBounds(x + 150, y, 150, 30);
        add(field);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            String name = tfname.getText();
            String fname = tffname.getText();
            String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
            String salary = tfsalary.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String education = (String) cbeducation.getSelectedItem();
            String designation = tfdesignation.getText();
            String aadhar = tfaadhar.getText();
            String empId = lblempId.getText();

            try {
                Conn conn = new Conn();
                String query = "INSERT INTO employee VALUES('" + name + "', '" + fname + "', '" + dob + "', '" + salary
                        + "', '" + address + "', '" + phone + "', '" + email + "', '" + education + "', '" + designation
                        + "', '" + aadhar + "', '" + empId + "')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details added successfully");
                setVisible(false);
                new Home();
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            }
        } else {
            setVisible(false);
            new Home();
        }
    }

    public static void main(String[] args) {
        new AddEmployee();
    }
}
