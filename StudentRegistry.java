import java.util.*;
import javax.swing.*;

public class StudentRegistry {
    static Map<String, String> students = new HashMap<>();

    public static void registerStudent(String id, String name) {
        students.put(id, name);
    }

    public static boolean isValidStudent(String id, String name) {
        return students.containsKey(id) && students.get(id).equals(name);
    }
}