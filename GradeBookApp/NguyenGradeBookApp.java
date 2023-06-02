/*
 Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
 	Comprehensive Version (12th ed.). Pearson Education, Inc.
 Nguyen, L. (2023). CIS 505 Intermediate Java Programming. Bellevue University
*/
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

class GradeBookAppUI extends JFrame {
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField courseField;
    private JComboBox<String> gradeComboBox;
    private JTable gradesTable;
    private DefaultTableModel tableModel;

    private List<Student> students;

    public GradeBookAppUI() {
        super("Grade Book App");

        students = new ArrayList<>();

        // Form Fields
        JLabel firstNameLabel = new JLabel("FirstName: ");
        firstNameField = new JTextField(20);
        JLabel lastNameLabel = new JLabel("LastName: ");
        lastNameField = new JTextField(20);
        JLabel courseLabel = new JLabel("Course: ");
        courseField = new JTextField(20);
        JLabel gradeLabel = new JLabel("Grade:  ");
        gradeComboBox = new JComboBox<>(new String[]{"A", "B", "C", "D", "F"});

        // Buttons
        JButton clearButton = new JButton("Clear Form");
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearForm();
            }
        });

        JButton saveButton = new JButton("Save Entry");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveGradeEntry();
            }
        });

        JButton viewButton = new JButton("View Grades");
        viewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewGrades();
            }
        });

        // Table
        tableModel = new DefaultTableModel();
        tableModel.addColumn("FirstName");
        tableModel.addColumn("LastName ");
        tableModel.addColumn("Course   ");
        tableModel.addColumn("Grade    ");
        gradesTable = new JTable(tableModel);

        // Create a panel for the form fields
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new BoxLayout(formPanel, BoxLayout.PAGE_AXIS));
        formPanel.add(createFieldPanel(firstNameLabel, firstNameField));
        formPanel.add(createFieldPanel(lastNameLabel, lastNameField));
        formPanel.add(createFieldPanel(courseLabel, courseField));
        formPanel.add(createFieldPanelBox(gradeLabel, gradeComboBox));

        // Create a panel for the buttons
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.add(clearButton);
        buttonsPanel.add(saveButton);
        buttonsPanel.add(viewButton);

        // Create a panel for the form and buttons
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());
        inputPanel.add(formPanel, BorderLayout.NORTH);
        inputPanel.add(buttonsPanel, BorderLayout.CENTER);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(new JScrollPane(gradesTable), BorderLayout.CENTER);

        getContentPane().add(mainPanel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    // Helper method to create a panel with a label and text field
    private JPanel createFieldPanel(JLabel label, JTextField field) {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel.add(label);
        panel.add(field);
        return panel;
    }

    // Helper method to create a panel with a label and combo box
    private JPanel createFieldPanelBox(JLabel label, JComboBox<String> comboBox) {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel.add(label);
        panel.add(comboBox);
        return panel;
    }

    // Method to clear the input form
    private void clearForm() {
        firstNameField.setText("");
        lastNameField.setText("");
        courseField.setText("");
        gradeComboBox.setSelectedIndex(0);
    }

    // Method to save a grade entry
    private void saveGradeEntry() {
        String firstName = firstNameField.getText().trim();
        String lastName = lastNameField.getText().trim();
        String course = courseField.getText().trim();
        String grade = (String) gradeComboBox.getSelectedItem();

        // Validate that all fields are filled
        if (firstName.isEmpty() || lastName.isEmpty() || course.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields.");
            return;
        }

        Student student = new Student(firstName, lastName, course, grade);
        students.add(student);

        // Write to CSV file
        try (FileWriter writer = new FileWriter("grades.csv", true)) {
            // Check if the file is empty
            if (Files.size(Paths.get("grades.csv")) == 0) {
                writer.write("FirstName,LastName,Course,Grade\n"); // Header row
            }
            writer.write(firstName + "," + lastName + "," + course + "," + grade + "\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        clearForm();
        JOptionPane.showMessageDialog(this, "Grade entry saved successfully!");
    }

    // Method to view grades from the CSV file
    private void viewGrades() {
        try {
            List<String> lines = Files.readAllLines(Paths.get("grades.csv"));
            tableModel.setRowCount(0); // Clear existing table data

            // Check if the file has any lines
            if (!lines.isEmpty()) {
                String[] columnNames = lines.get(0).split(",");
                tableModel.setColumnIdentifiers(columnNames); // Set column names

                for (int i = 1; i < lines.size(); i++) {
                    String line = lines.get(i);
                    String[] parts = line.split(",");

                    if (parts.length == columnNames.length) {
                        tableModel.addRow(parts);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class NguyenGradeBookApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                GradeBookAppUI app = new GradeBookAppUI();
                app.setVisible(true);
            }
        });
    }
}
