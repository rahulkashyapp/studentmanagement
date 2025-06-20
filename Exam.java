import javax.swing.*;
import java.util.*;

public class Exam {
    public Exam(String studentName) {
        String course = (String) JOptionPane.showInputDialog(null, "Choose course:", "Select Course",
                JOptionPane.QUESTION_MESSAGE, null, Question.questionBank.keySet().toArray(), "Java");

        if (course == null) return;
        List<String[]> questions = Question.questionBank.get(course);
        int score = 0;

        for (String[] q : questions) {
            String answer = (String) JOptionPane.showInputDialog(null,
                q[0] + "\nA. " + q[1] + "\nB. " + q[2] + "\nC. " + q[3] + "\nD. " + q[4],
                "Question", JOptionPane.PLAIN_MESSAGE, null, new String[]{"A", "B", "C", "D"}, "A");
            if (answer != null && answer.equalsIgnoreCase(q[5])) score++;
        }

        Result.storeResult(studentName, course, score, questions.size());
        JOptionPane.showMessageDialog(null, "You scored: " + score + "/" + questions.size());
    }
}