import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SimpleCalculator {

    JFrame frame;
    JLabel label1, label2, output, resultLabel;
    JTextField t1,t2;
    JButton b1,b2,b3,b4;
    
    SimpleCalculator(){
        frame = new JFrame("Simple calculator");
        frame.setSize(300,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 2, 10, 10));
        
        label1 = new JLabel("Number1: ");
        t1 = new JTextField();

        label2 = new JLabel("Number2: ");
        t2 = new JTextField();

        resultLabel = new JLabel("Result: ");
        output = new JLabel("");
        output.setForeground(Color.RED);

        b1 = new JButton("+");
        b2 = new JButton("-");
        b3 = new JButton("*");
        b4 = new JButton("/");

        frame.add(label1);
        frame.add(t1);
        frame.add(label2);
        frame.add(t2);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);

        frame.add(resultLabel);
        frame.add(output);

        b1.addActionListener(e -> doCalcOp(e));
        b2.addActionListener(e -> doCalcOp(e));
        b3.addActionListener(e -> doCalcOp(e));
        b4.addActionListener(e -> doCalcOp(e));

        frame.setVisible(true);
    }

    public static void main(String[] args){
        new SimpleCalculator();
    }

    public void doCalcOp(ActionEvent e){
        try{
            double num1 = Double.parseDouble(t1.getText());
            double num2 = Double.parseDouble(t2.getText());
            double result = 0;
            Object source = e.getSource();
            if(source == b1) result = num1 + num2;
            else if(source == b2) result = num1 - num2;
            else if(source ==  b3) result = num1 * num2;
            else if (source == b4) {
                if (num2 == 0) {
                    output.setText("Error: Divide by 0");
                    return;
                }
                result = num1 / num2;
            }
            output.setText(String.valueOf(result));
        }
        catch (NumberFormatException ex) {
            output.setText("Invalid input!");
        }
    }
}
