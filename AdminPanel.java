import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdminPanel extends JFrame {
    public AdminPanel() {
        setTitle("Admin Panel");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton registerBtn = new JButton("Register Student");
        JButton viewResultsBtn = new JButton("View All Results");
        JButton backBtn = new JButton("Back");

        registerBtn.addActionListener(e -> new StudentRegister());
        viewResultsBtn.addActionListener(e -> Result.showAllResultsGUI());
        backBtn.addActionListener(e -> {
            dispose();
            new WelcomeScreen();
        });

        JPanel panel = new JPanel();
        panel.add(registerBtn);
        panel.add(viewResultsBtn);
        panel.add(backBtn);
        add(panel);

        setVisible(true);
    }
}