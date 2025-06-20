import javax.swing.*;

public class StudentLogin extends JFrame {
    public StudentLogin() {
        setTitle("Student Login");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        JTextField idField = new JTextField(10);
        JTextField nameField = new JTextField(10);
        JButton loginBtn = new JButton("Login");

        panel.add(new JLabel("ID:"));
        panel.add(idField);
        panel.add(new JLabel("Name:"));
        panel.add(nameField);
        panel.add(loginBtn);

        loginBtn.addActionListener(e -> {
            String id = idField.getText();
            String name = nameField.getText();
            if (StudentRegistry.isValidStudent(id, name)) {
                dispose();
                new StudentPanel(name);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Student Credentials.");
            }
        });

        add(panel);
        setVisible(true);
    }
}