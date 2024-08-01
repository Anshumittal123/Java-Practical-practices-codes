import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RoadLenghtCalculator extends JFrame implements ActionListener{
    private JTextField road1Input;
    private JTextField road2Input;
    private JLabel road1Label, road2Label;
    private JButton calculateButton;
    private JLabel resultLabel;

    public RoadLenghtCalculator(){
        setTitle("Road Lenght Calculator");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        road1Label = new JLabel("Length of Road 1 (meters):");
        road1Input = new JTextField(10);
        road2Label = new JLabel("Lenght of Road 2 (meters): ");
        road2Input = new JTextField(10);
        calculateButton = new JButton("Calculate Total lenght (KM)");
        resultLabel = new JLabel("Total Lenght (KM): ");

        calculateButton.addActionListener(this);

        add(road1Label);
        add(road1Input);
        add(road2Label);
        add(road2Input);
        add(calculateButton);
        add(resultLabel);

    }

    public void actionPerformed(ActionEvent e){
        try {
            double road1Lenght = Double.parseDouble(road1Input.getText());
            double road2Length = Double.parseDouble(road2Input.getText());

            double totalLenghtKM = (road1Lenght + road2Length) / 1000;

            resultLabel.setText("Total Lenght (KM): "+totalLenghtKM);
        } catch (Exception ex) {
            resultLabel.setText("Please Enter a valid number.");
        }
    }

    public static void main(String args[]){
        SwingUtilities.invokeLater(()->{
            RoadLenghtCalculator app = new RoadLenghtCalculator();
            app.setVisible(true);
        });
    }
}