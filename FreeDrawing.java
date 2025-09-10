import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FreeDrawing {
    int prevX, prevY; // last mouse position
    boolean drawing = false;
    public FreeDrawing(){
        setTitle("Free Grawing!");
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
            }
        };
        panel.setBackground(Color.WHITE);
        //mouse event registration
        panel.addMouseListener(new MouseListener() {
            
        });
    }
}
