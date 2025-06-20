import javax.swing.*;
import java.awt.event.*;

public class WelcomeScreen extends JFrame {
    public WelcomeScreen() {
        setTitle("Student Management System");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton adminBtn = new JButton("Admin Login");
        JButton studentBtn = new JButton("Student Login");

        adminBtn.addActionListener(e -> {
            dispose();
            new AdminPanel();
        });

        studentBtn.addActionListener(e -> {
            dispose();
            new StudentLogin();
        });

        JPanel panel = new JPanel();
        panel.add(adminBtn);
        panel.add(studentBtn);
        add(panel);
        setVisible(true);
    }
}