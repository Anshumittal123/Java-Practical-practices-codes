import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapeDrawer extends JFrame implements ActionListener {
    private JButton circleButton;
    private JButton triangleButton;
    private JPanel drawingPanel;
    private String shapeToDraw = "";

    public ShapeDrawer(){
        setTitle("Shape Drawer");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        circleButton = new JButton("Draw Circle");
        triangleButton = new JButton("Draw Triangle");
        drawingPanel = new DrawingPanel();

        circleButton.addActionListener(this);
        triangleButton.addActionListener(this);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(circleButton);
        buttonPanel.add(triangleButton);

        add(buttonPanel, BorderLayout.NORTH);
        add(drawingPanel, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == circleButton){
            shapeToDraw  = "Circle";
        }else if(e.getSource() == triangleButton){
            shapeToDraw = "Triangle";
        }
        drawingPanel.repaint();
    }

    private class DrawingPanel extends JPanel{
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            if (shapeToDraw.equals("Circle")) {
                int diameter = Math.min(getWidth(), getHeight()) - 20;
                int x = (getWidth() - diameter) / 2;
                int y = (getHeight() - diameter) / 2;
                g.drawOval(x, y, diameter, diameter);
            } else if(shapeToDraw.equals("Triangle")){
                int[] xPaints = {getWidth() / 2, getWidth() / 4, 3 * getWidth() / 4};
                int[] yPaints = {20, getHeight() - 20, getHeight() - 20};
                g.drawPolygon(xPaints, yPaints, 3);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            ShapeDrawer app = new ShapeDrawer();
            app.setVisible(true);
        });
    }

}