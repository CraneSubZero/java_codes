import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class SwingDataEntry extends JFrame {
    private JTextField idField, firstNameField, lastNameField, birthDateField, hourlyRateField;
    private DefaultTableModel tableModel;
    private JTable table; // Declaring table as a class member

    public SwingDataEntry() {
        setTitle("Record Entry");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Labels
        JLabel idLabel = new JLabel("ID: Number");
        JLabel firstNameLabel = new JLabel("First Name:");
        JLabel lastNameLabel = new JLabel("Last Name:");
        JLabel birthDateLabel = new JLabel("Birth Date:");
        JLabel hourlyRateLabel = new JLabel("Hourly Rate:");

        // TextFields
        idField = new JTextField(10);
        firstNameField = new JTextField(10);
        lastNameField = new JTextField(10);
        birthDateField = new JTextField(10);
        hourlyRateField = new JTextField(10);

        // Buttons
        JButton insertButton = new JButton("Insert");
        JButton updateButton = new JButton("Update");
        JButton deleteButton = new JButton("Delete");
        JButton exitButton = new JButton("Exit");

        // Table
        table = new JTable();
        tableModel = new DefaultTableModel();
        tableModel.addColumn("ID");
        tableModel.addColumn("First Name");
        tableModel.addColumn("Last Name");
        tableModel.addColumn("Birth Date");
        tableModel.addColumn("Hourly Rate");
        table.setModel(tableModel);

        // Left Panel
        JPanel leftPanel = new JPanel(new GridLayout(6, 2));
        leftPanel.add(idLabel);
        leftPanel.add(idField);
        leftPanel.add(firstNameLabel);
        leftPanel.add(firstNameField);
        leftPanel.add(lastNameLabel);
        leftPanel.add(lastNameField);
        leftPanel.add(birthDateLabel);
        leftPanel.add(birthDateField);
        leftPanel.add(hourlyRateLabel);
        leftPanel.add(hourlyRateField);
        leftPanel.add(insertButton);
        leftPanel.add(updateButton);
        leftPanel.add(deleteButton);
        leftPanel.add(exitButton);

        // Right Panel
        JPanel rightPanel = new JPanel(new BorderLayout());
        rightPanel.add(new JScrollPane(table), BorderLayout.CENTER);

        // Main Panel
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(leftPanel, BorderLayout.WEST);
        mainPanel.add(rightPanel, BorderLayout.CENTER);

        add(mainPanel);

        // Button Actions
        insertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                insertRecord();
            }
        });

        updateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateRecord();
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deleteRecord();
            }
        });

        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    private void insertRecord() {
        Vector<Object> row = new Vector<>();
        row.add(idField.getText());
        row.add(firstNameField.getText());
        row.add(lastNameField.getText());
        row.add(birthDateField.getText());
        row.add(hourlyRateField.getText());
        tableModel.addRow(row);
        clearFields();
    }

    private void updateRecord() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            tableModel.setValueAt(idField.getText(), selectedRow, 0);
            tableModel.setValueAt(firstNameField.getText(), selectedRow, 1);
            tableModel.setValueAt(lastNameField.getText(), selectedRow, 2);
            tableModel.setValueAt(birthDateField.getText(), selectedRow, 3);
            tableModel.setValueAt(hourlyRateField.getText(), selectedRow, 4);
            clearFields();
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
        }
    }

    private void deleteRecord() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            tableModel.removeRow(selectedRow);
            clearFields();
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
        }
    }

    private void clearFields() {
        idField.setText("");
        firstNameField.setText("");
        lastNameField.setText("");
        birthDateField.setText("");
        hourlyRateField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingDataEntry().setVisible(true);
            }
        });
    }
}