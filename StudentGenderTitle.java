import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentGenderTitle {
    public static void main(String[] args){
        JFrame frame = new JFrame("Student Gender Title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,250);
        frame.setLayout(new GridLayout(5, 2, 5, 5));

        JLabel rollLabel= new JLabel("Roll No:");
        JTextField rollField = new JTextField();

        JLabel nameLabel =  new JLabel("Name:");
        JTextField nameField = new JTextField();

        JLabel genderLabel = new JLabel("Gender (M/F):");
        JTextField genderField = new JTextField();

        JButton submitButton = new JButton("Show Title");

        JLabel resultLabel = new JLabel("", SwingConstants.CENTER);

        frame.add(rollLabel);
        frame.add(rollField);

        frame.add(nameLabel);
        frame.add(nameField);

        frame.add(genderLabel);
        frame.add(genderField);

        frame.add(new JLabel("")); // place holder
        frame.add(submitButton);
        
        frame.add(new JLabel("Result:"));
        frame.add(resultLabel);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String name = nameField.getText().trim();
                String gender = genderField.getText().trim().toUpperCase();
                if(name.isEmpty() || gender.isEmpty()){
                    JOptionPane.showMessageDialog(frame, "Please fill all fields", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if(gender.equals("M")){
                    resultLabel.setText("Mr. "+name);
                }
                else if(gender.equals("F")){
                    resultLabel.setText("Ms. "+name);
                }
                else{
                    JOptionPane.showMessageDialog(frame, "Enter gender as M or F only!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        });
        frame.setVisible(true); // show frame
    }
}
