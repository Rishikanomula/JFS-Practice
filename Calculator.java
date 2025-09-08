import java.awt.*;
import javax.swing.*;
public class Calculator
{
    JFrame frame;
    JLabel input1,input2,result;
    JTextField text1,text2,textResult;
    JButton add,sub,mul,div;
    JPanel panel;

    Calculator() 
    {
        frame =new JFrame("Calculator");
        input1 = new JLabel("Input 1:");
        input2 = new JLabel("Input 2:");
        result = new JLabel("Result:");
        text1 = new JTextField(10);
        text2 = new JTextField(10);
        textResult = new JTextField(10);
        add = new JButton("Add");
        sub = new JButton("Subtract");
        mul = new JButton("Multiply");
        div = new JButton("Divide");
        panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2));
        panel.add(input1);
        panel.add(text1);
        panel.add(input2);
        panel.add(text2);
        panel.add(result);
        panel.add(textResult);
        panel.add(add);
        panel.add(sub);
        panel.add(mul);
        panel.add(div);
        frame.add(panel);
        frame.setSize(300,200);
        frame.setLocation(500,500);
        panel.setBackground(java.awt.Color.LIGHT_GRAY);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        //event registration:
        add.addActionListener(e -> add());
        sub.addActionListener(e -> subtract());
        mul.addActionListener(e -> multiply());
        div.addActionListener(e -> divide());
    }
    void add()
    {
        int num1=Integer.parseInt(text1.getText());
        int num2=Integer.parseInt(text2.getText());
        int sum=num1+num2;
        textResult.setText(Integer.toString(sum));
    }
    void subtract()
    {
        int num1=Integer.parseInt(text1.getText());
        int num2=Integer.parseInt(text2.getText());
        int difference=num1-num2;
        textResult.setText(Integer.toString(difference));
    }
    void multiply()
    {
        int num1=Integer.parseInt(text1.getText());
        int num2=Integer.parseInt(text2.getText());
        int product=num1*num2;
        textResult.setText(Integer.toString(product));
    }
    void divide()
    {
        int num1=Integer.parseInt(text1.getText());
        int num2=Integer.parseInt(text2.getText());
        int div=num1/num2;
        textResult.setText(Integer.toString(div));
    }
    public static void main(String[] args) 
    {
        new Calculator();
    }
    
}