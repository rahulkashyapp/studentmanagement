import java.util.*;
import javax.swing.*;

public class Course {
    static List<String> courseList = Arrays.asList("Java", "btech it", "btech cse", "BCA");

    public static void showCoursesGUI() {
        JOptionPane.showMessageDialog(null, String.join("\n", courseList), "Available Courses", JOptionPane.INFORMATION_MESSAGE);
    }
}