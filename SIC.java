import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SIC {
    public static void main(String[] args){
        JFrame jf = new JFrame("SIC");
        jf.setLayout(new GridLayout(4,2));
        JLabel l1 = new JLabel("Principal");
        JTextField t1 = new JTextField("0.0");
        JLabel l2 = new JLabel("Time");
        JTextField t2 = new JTextField("0");
        JLabel l3 = new JLabel("Rate");
        JTextField t3 = new JTextField("0");
        JButton b1 = new JButton("Calc SI");
        JTextField t4 = new JTextField();
        // adding components to layout(Grid layout)
        jf.add(l1);
        jf.add(t1);
        jf.add(l2);
        jf.add(t2);
        jf.add(l3);
        jf.add(t3);
        t4.setEditable(false); // in resuktant area we shouldnt type so we keep this seteditable as false so we can't type in there 
        jf.add(b1);
        jf.add(t4);

        jf.setSize(200, 200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        // event registration
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                try {
                    int p = Integer.parseInt(t1.getText());
                    int t = Integer.parseInt(t2.getText());
                    int r = Integer.parseInt(t3.getText());

                    // Validation check
                    if (p <= 0 || t <= 0 || r <= 0) {
                        JOptionPane.showMessageDialog(jf, "Invalid Data!", "Error", JOptionPane.ERROR_MESSAGE);
                        t4.setText(""); // clear result field
                        return; // stop calculation
                    }

                    float si = (p * t * r) / 100.0f;
                    t4.setText("" + si);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(jf, "Invalid Data!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
