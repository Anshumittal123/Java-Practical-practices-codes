import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultiplicationTableApp extends JFrame implements ActionListener {
    private JTextField numberInput;
    private JLabel inputLabel, resultLabel;
    private JButton displayButton;
    private JTextArea resultArea;

    public MultiplicationTableApp() {
        // Set up the frame
        setTitle("Multiplication Table App");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Initialize components
        inputLabel = new JLabel("Enter a number:");
        numberInput = new JTextField(10);
        displayButton = new JButton("Display Table");
        resultLabel = new JLabel("Multiplication Table:");
        resultArea = new JTextArea(10, 20);
        resultArea.setEditable(false);

        // Add components to the frame
        add(inputLabel);
        add(numberInput);
        add(displayButton);
        add(resultLabel);
        add(resultArea);

        // Add action listener to the button
        displayButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int number = Integer.parseInt(numberInput.getText());
            StringBuilder table = new StringBuilder();
            for (int i = 1; i <= 10; i++) {
                table.append(number).append(" x ").append(i).append(" = ").append(number * i).append("\n");
            }
            resultArea.setText(table.toString());
        } catch (NumberFormatException ex) {
            resultArea.setText("Please enter a valid number.");
        }
    }

    public static void main(String[] args) {
        // Create and display the app window
        SwingUtilities.invokeLater(() -> {
            MultiplicationTableApp app = new MultiplicationTableApp();
            app.setVisible(true);
        });
    }
}
