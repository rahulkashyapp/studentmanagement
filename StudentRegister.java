import javax.swing.*;

public class StudentRegister {
    public StudentRegister() {
        JTextField nameField = new JTextField();
        JTextField idField = new JTextField();
        Object[] fields = {
            "Name:", nameField,
            "ID:", idField
        };

        int option = JOptionPane.showConfirmDialog(null, fields, "Register Student", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            String name = nameField.getText();
            String id = idField.getText();
            StudentRegistry.registerStudent(id, name);
            JOptionPane.showMessageDialog(null, "Student Registered.");
        }
    }
}