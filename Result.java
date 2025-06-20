import javax.swing.*;
import java.util.*;

public class Result {
    static Map<String, Map<String, String>> resultData = new HashMap<>();

    public static void storeResult(String student, String course, int score, int total) {
        resultData.putIfAbsent(student, new HashMap<>());
        resultData.get(student).put(course, score + "/" + total);
    }

    public static void viewResultGUI(String student) {
        Map<String, String> results = resultData.get(student);
        if (results == null) {
            JOptionPane.showMessageDialog(null, "No results found.");
            return;
        }

        StringBuilder sb = new StringBuilder("Results for " + student + ":\n");
        results.forEach((course, result) -> sb.append(course).append(": ").append(result).append("\n"));
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    public static void showAllResultsGUI() {
        StringBuilder sb = new StringBuilder("All Results:\n");
        resultData.forEach((student, results) -> {
            sb.append(student).append(":\n");
            results.forEach((course, result) -> sb.append("  ").append(course).append(": ").append(result).append("\n"));
        });
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}