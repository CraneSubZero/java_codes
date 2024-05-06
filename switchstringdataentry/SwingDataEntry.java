import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Vector;

public class SwingDataEntry extends JFrame {
    private JTextField idField, firstNameField, lastNameField, birthDateField, hourlyRateField;
    private JTable table;
    private DefaultTableModel tableModel;

    public SwingDataEntry() {
        setTitle("Record Entry");
        setSize(1000, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel for input fields and buttons
        JPanel inputPanel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(4, 4, 4, 4);
        c.anchor = GridBagConstraints.LINE_END;

        // Labels and TextFields
        addLabelAndField(inputPanel, new JLabel("ID: Number"), idField = new JTextField(), 0);
        addLabelAndField(inputPanel, new JLabel("First Name:"), firstNameField = new JTextField(), 1);
        addLabelAndField(inputPanel, new JLabel("Last Name:"), lastNameField = new JTextField(), 2);
        addLabelAndField(inputPanel, new JLabel("Birth Date:"), birthDateField = new JTextField(), 3);
        addLabelAndField(inputPanel, new JLabel("Hourly Rate:"), hourlyRateField = new JTextField(), 4);

        // Buttons
        JButton insertButton = new JButton("Insert");
        JButton updateButton = new JButton("Update");
        JButton deleteButton = new JButton("Delete");
        JButton exitButton = new JButton("Exit");

        // Adding buttons to the panel
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(insertButton);
        buttonPanel.add(updateButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(exitButton);

        // Setup main panel layout
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Table setup
        tableModel = new DefaultTableModel(new Object[]{"ID", "First Name", "Last Name", "Birth Date", "Hourly Rate"}, 0);
        table = new JTable(tableModel);
        mainPanel.add(new JScrollPane(table), BorderLayout.CENTER);

        add(mainPanel);

        // Action Listeners
        insertButton.addActionListener(e -> insertRecord());
        updateButton.addActionListener(e -> updateRecord());
        deleteButton.addActionListener(e -> deleteRecord());
        exitButton.addActionListener(e -> System.exit(0));
    }

    private void addLabelAndField(JPanel panel, JLabel label, JTextField field, int yPos) {
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = yPos;
        c.anchor = GridBagConstraints.EAST;
        panel.add(label, c);

        c.gridx = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1.0;
        field.setPreferredSize(new Dimension(200, 24));  // Set preferred size to make text fields rectangles
        panel.add(field, c);
    }

    private void insertRecord() {
        // Add record
        tableModel.addRow(new Object[]{idField.getText(), firstNameField.getText(), lastNameField.getText(), birthDateField.getText(), hourlyRateField.getText()});
        clearFields();
    }

    private void updateRecord() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow >= 0) {
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
        if (selectedRow >= 0) {
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
        SwingUtilities.invokeLater(() -> new SwingDataEntry().setVisible(true));
    }
}