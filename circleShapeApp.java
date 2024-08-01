import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class circleShapeApp extends JFrame implements ActionListener {
    private JButton circleButton;
    private JPanel drawingPanel;
    private String shapeToDraw = "";

    public circleShapeApp(){
        setTitle("Draw Circle");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        circleButton = new JButton("Draw circle");
        drawingPanel = new DrawingPanel();

        circleButton.addActionListener(this);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(circleButton);

        add(buttonPanel, BorderLayout.NORTH);
        add(drawingPanel, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == circleButton){
            shapeToDraw = "Circle";
        }
        drawingPanel.repaint();
    }

    private class DrawingPanel extends JPanel{
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            if(shapeToDraw.equals("Circle")){
                int diameter = Math.min(getWidth(), getHeight()) - 20;
                int x = (getWidth() - diameter) /2;
                int y = (getHeight() - diameter) / 2;
                g.drawOval(x, y, diameter, diameter);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            circleShapeApp app = new circleShapeApp();
            app.setVisible(true);
        });
    }
}
