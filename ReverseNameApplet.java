// Create a GUL interface that take a number an show it table.

// Here import java.applet.Applet package from make it with applet. but it doesn't supported by current version of java. it supprot version 9 of java. 

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ReverseNameApplet extends JFrame implements ActionListener {
     // In applet here we will not use JTextField instance use only name like TextField.

    private JTextField nameInput;
    private JLabel nameLabel, resultLabel;
    private JButton resverseButton;

    // Whenever we want to use applet to code we will override initi() method and only setlayout, initilize component and add it. all code same.
    
    public ReverseNameApplet(){
        // Set up the frame
        setTitle("Reverse Name App");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        // Initialize componentes
        nameLabel = new JLabel("Enter Your name: ");
        nameInput = new JTextField(20);
        resverseButton = new JButton("Reverse");
        resultLabel = new JLabel();

        // Add components
        add(nameLabel);
        add(nameInput);
        add(resverseButton);
        add(resultLabel);

        resverseButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        String name = nameInput.getText();
        String reversedName = new StringBuilder(name).reverse().toString();
        resultLabel.setText("Reverse Name: "+reversedName);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(()-> {
            ReverseNameApplet app = new ReverseNameApplet();
            app.setVisible(true);
        });
    }
}
