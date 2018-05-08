import javax.swing.*;
import javax.swing.event.*;

import java.awt.*;
import java.awt.event.*;

public class Calculate implements ActionListener {

    JFrame f = new JFrame();
    JLabel l1 = new JLabel("First number:");
    JLabel l2 = new JLabel("Second number:");
    JLabel l3 = new JLabel("Answer:");
    
    JTextField t1 = new JTextField("", 15);
    JTextField t2 = new JTextField("", 15);
    JTextField t3 = new JTextField("", 15);
    
    JButton b1 = new JButton("Multiply");
    JButton b2 = new JButton("Divide");
    JButton b3 = new JButton("Clear");
    
    Calculate() {
        
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        
        f.add(b1);
        f.add(b2);
        f.add(b3);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.setSize(310,150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
    
    public void actionPerformed(ActionEvent e) {

        int n1 = Integer.parseInt(t1.getText());
        int n2 = Integer.parseInt(t2.getText());
        
        if(e.getSource() == b1) {
            t3.setText(String.valueOf(n1 * n2));
        }
            
        else if(e.getSource() == b2) {
            t3.setText(String.valueOf(n1 / n2));
        }
        
        else if(e.getSource() == b3) {
            t1.setText("");
            t2.setText("");
            t3.setText("");
        }
    }
    
    public static void main(String[] args) {
        new Calculate();
    }
}