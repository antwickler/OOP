import javax.swing.*;
import javax.swing.event.*;

import java.awt.*;
import java.awt.event.*;

public class Calculate extends JFrame {

	private JPanel pn;
	private JLabel lb1, lb2, lb3;
	private JTextField tf1, tf2, tf3;
	private JButton bt1, bt2, bt3;

	public Calculate() {

    	makeGUI();
    	resetCalculate();

    	setSize(400,150);
    	setResizable(false);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setLocationRelativeTo(null);
    	setVisible(true); 
    }

    private void makeGUI() {

    	JPanel content = new JPanel();
		content.setLayout(new BorderLayout(4,4));
    	content.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    	content.add(buildPanel(), BorderLayout.CENTER);
    	content.add(buildOperationPanel(), BorderLayout.SOUTH);
    	setContentPane(content); 
    }

    private JPanel buildPanel() {

		JPanel panel = new JPanel();
    	panel.setLayout(new GridLayout(4,2));

		lb1 = new JLabel("First number:");
		tf1 = new JTextField("", 15);
		lb2 = new JLabel("Second number:");
		tf2 = new JTextField("", 15);
		lb3 = new JLabel("Answer:");
		tf3 = new JTextField("", 15);

		panel.add(lb1);
		panel.add(tf1);
		panel.add(lb2);
		panel.add(tf2);
		panel.add(lb3);
		panel.add(tf3);
    }

    private JPanel buildOperationPanel() {

    	JPanel opPanel = new JPanel();
		bt1 = new JButton("Multiply");
		bt2 = new JButton("Divide");
		bt3 = new JButton("Clear");

		bt1.addActionListener();
		bt2.addActionListener();
		bt3.addActionListener();

		opPanel.add(bt1);
		opPanel.add(bt2);
		opPanel.add(bt3);
    }

    private void resetCalculate() {

  	}

	public static void main(String[] args) {
		new Calculate();
	}
}