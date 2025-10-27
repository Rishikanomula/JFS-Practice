import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class FreeDrawing extends JFrame {
    int prevX, prevY; // last mouse position
    boolean drawing = false;
    BufferedImage canvas;
    Graphics2D canvasGraphics;

    public FreeDrawing() {
        setTitle("Free Drawing!");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        canvas = new BufferedImage(600, 400, BufferedImage.TYPE_INT_ARGB);
        canvasGraphics = canvas.createGraphics();
        canvasGraphics.setColor(Color.BLACK);
        canvasGraphics.setStroke(new BasicStroke(2));

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(canvas, 0, 0, null);
            }
        };

        panel.setBackground(Color.WHITE);

        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                drawing = true;
                prevX = e.getX();
                prevY = e.getY();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                drawing = false;
            }
        });

        panel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if (drawing) {
                    int x = e.getX();
                    int y = e.getY();
                    canvasGraphics.drawLine(prevX, prevY, x, y);
                    prevX = x;
                    prevY = y;
                    panel.repaint();
                }
            }
        });

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(FreeDrawing::new);
    }
}