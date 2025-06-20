import javax.swing.*;

public class StudentPanel extends JFrame {
    String studentName;

    public StudentPanel(String name) {
        this.studentName = name;

        setTitle("Student Panel - " + name);
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton viewCoursesBtn = new JButton("View Courses");
        JButton takeExamBtn = new JButton("Take Exam");
        JButton viewResultBtn = new JButton("View Result");
        JButton backBtn = new JButton("Back");

        viewCoursesBtn.addActionListener(e -> Course.showCoursesGUI());
        takeExamBtn.addActionListener(e -> new Exam(studentName));
        viewResultBtn.addActionListener(e -> Result.viewResultGUI(studentName));
        backBtn.addActionListener(e -> {
            dispose();
            new WelcomeScreen();
        });

        JPanel panel = new JPanel();
        panel.add(viewCoursesBtn);
        panel.add(takeExamBtn);
        panel.add(viewResultBtn);
        panel.add(backBtn);

        add(panel);
        setVisible(true);
    }
}