import java.awt.Color;

import javax.swing.*;
public class SwingExample{
    JFrame frame;
    JLabel label;
    JTextField textField;
    JButton button;
    JButton rev_btn; // creating a button for reverseing the string
    JPanel panel;
    SwingExample(){
        frame = new JFrame("Swing Example");
        label = new JLabel("Enter your name");
        textField = new JTextField(20);
        button = new JButton("Submit"); //this button is for palindrome
        rev_btn = new JButton("Reverse");
        panel = new JPanel();
        panel.add(label);
        panel.add(textField);
        panel.add(button);
        panel.add(rev_btn); // adding rev button to panel 
        panel.setBackground(Color.BLUE);
        frame.add(panel);
        frame.setSize(300,350);
        frame.setLocation(0,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        button.addActionListener(e -> showName());
        rev_btn.addActionListener(e -> reverseName());

    }
    void showName(){
        String name = textField.getText();
        int j = name.length()-1;
        String msg="Palindrome";
        for(int i=0; i<j; i++,j--){
            if(name.charAt(i) != name.charAt(j)){
                msg = "Not a Palindrome";
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "My name is "+msg, name, JOptionPane.INFORMATION_MESSAGE);
    }
    void reverseName(){
        String name = textField.getText();
        StringBuilder sb = new StringBuilder(name);
        sb.reverse();
        JOptionPane.showMessageDialog(null, "My name is "+sb.toString(), "reverse", JOptionPane.INFORMATION_MESSAGE);
    }
    public static void main(String[] args){
        new SwingExample();
    }
}