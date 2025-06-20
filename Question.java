import java.util.*;

public class Question {
    static Map<String, List<String[]>> questionBank = new HashMap<>();

    static {
        List<String[]> javaQuestions = List.of(
            new String[]{"What does JVM stand for?", "Java Virtual Machine", "Java Volume Meter", "Just Virtual Memory", "Java Verified Module", "A"},
            new String[]{"What is the size of int in Java?", "2 bytes", "4 bytes", "8 bytes", "Depends on system", "B"},
            new String[]{"What keyword is used to create a class in Java?", "struct", "define", "class", "object", "C"},
            new String[]{"What is the extension of Java bytecode files?", ".java", ".class", ".exe", ".jar", "B"},
            new String[]{"Java is a:", "Low-level language", "Scripting language", "High-level programming language", "Machine language", "C"}
        );

        questionBank.put("Java", javaQuestions);
        questionBank.put("btech it", javaQuestions);
        questionBank.put("btech cse", javaQuestions);
        questionBank.put("BCA", javaQuestions);
    }
}