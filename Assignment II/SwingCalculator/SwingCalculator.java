import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;

public class SwingCalculator extends JFrame {

  private JTextField displayField;  //  TextField value
  private boolean wantNumber;       //  Boolean value
  private String prevOp;            //  String value
  private int currTotal;            //  Int value

  public SwingCalculator() {

    super("Swing Calculator");      //  Set title
    makeGUI();                      //  Call makeGUI
    resetCalculator();              //  Call resetCalculator

    setSize(280,200);               //  Set size
    setResizable(false);            //  Set resizable
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //  Set default close operation
    setLocationRelativeTo(null);    //  Set location relative
    setVisible(true);               //  Set visible
  }

  private void makeGUI() {          //  Method makeGUI

    JPanel content = new JPanel();                                      //  Panel value
    content.setLayout(new BorderLayout(4, 4));                          //  Set layout
    content.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); //  Set border
    displayField = new JTextField(10);                                  //  Set textField size 10
    displayField.setHorizontalAlignment(JTextField.RIGHT);              //  Set curser is right
    content.add(displayField, BorderLayout.NORTH);                      //  Set textField on north
    content.add( buildButtonPanel(), BorderLayout.CENTER);              //  Set number button on center
    content.add( buildOpPanel(), BorderLayout.EAST);                    //  Set operation button on east
    content.add( buildOp1Panel(), BorderLayout.SOUTH);                  //  Set operation1 button on south
    setContentPane(content);                                            //  Set content pane
  }  

  private JPanel buildButtonPanel() {                 //  Build number button
  
    ActionListener numListener = new NumListener();   //  Notice ActionListener

    JPanel buttonPanel = new JPanel();                //  Notice panel
    buttonPanel.setLayout(new GridLayout(3,3,5,5));   //  Set layout button in grid
    String[] buttonOrder = { "7", "8", "9",
                             "4", "5", "6",
                             "1", "2", "3" };

    for (int i = 0; i < buttonOrder.length; i++) {    //  Loop for create number button
      JButton b = new JButton(buttonOrder[i]);
      if (buttonOrder[i].equals(" ")) {       
        b.setEnabled(false);       
        b.setVisible(false);
      }
      else {  
        b.addActionListener(numListener);
        buttonPanel.add(b);
      }
    }
    return buttonPanel;
  } 

  private JPanel buildOpPanel() {                     //  Build operation button
    ActionListener opListener = new OpListener();
    JPanel opPanel = new JPanel();
    opPanel.setLayout(new GridLayout(3,1,5,5));
    opPanel.setPreferredSize(new Dimension(58, 58));

    String[] opOrder = { "+", "-", "*" };

    for (int i = 0; i < opOrder.length; i++) {        //  Loop for create operation button
      JButton b = new JButton(opOrder[i]);
      b.addActionListener(opListener);
      opPanel.add(b);
    }
    return opPanel;
  }  

  private JPanel buildOp1Panel() {                    //  Build operation1 button
    ActionListener numListener = new NumListener();
    ActionListener opListener = new OpListener();
  
    JPanel opPanel1 = new JPanel();
    opPanel1.setLayout(new GridLayout(1,3,5,5));

    String[] opOrder1 = { "c", "0", "=","/"};

    for (int i = 0; i < opOrder1.length; i++) {       //  Loop for create operation1 button
      JButton b = new JButton(opOrder[i]);
      JButton b = new JButton(opOrder1[i]);
        if (opOrder1[i].equals("0")) {   
          b.addActionListener(numListener);
          opPanel1.add(b);
        }  
        else {
          b.addActionListener(opListener);
          opPanel1.add(b);
        }
    }
    return opPanel1;
  }  

  private void resetCalculator() {    //  Method reset calculator
    wantNumber = true;   
    displayField.setText("0");
    prevOp = "=";
    currTotal = 0;
  }  

  class OpListener implements ActionListener {    //  Method operation calculator
    public void actionPerformed(ActionEvent e) {
      if (wantNumber) { 
        resetCalculator();
        displayField.setText("0");
      }
      else {  
        try {      
          int val = Integer.parseInt( displayField.getText() );
          if (prevOp.equals("="))
            currTotal = val;
          else if (prevOp.equals("+"))
            currTotal += val;
          else if (prevOp.equals("-"))
            currTotal -= val;
          else if (prevOp.equals("*"))
            currTotal *= val;
          else if (prevOp.equals("/"))
            currTotal /= val;
          displayField.setText("" + currTotal);
        }
        catch (NumberFormatException ex) {
          resetCalculator();
          displayField.setText("Format Error");
        }
        catch (ArithmeticException ex) {
          resetCalculator();
          displayField.setText("Arithmetic Error");
        }     
        prevOp = e.getActionCommand();
        wantNumber = true;
      }
    } 
  }

  class NumListener implements ActionListener {   //  Class for show solution
    public void actionPerformed(ActionEvent e) {
      String digit = e.getActionCommand();                               
      if (wantNumber) {   
        displayField.setText(digit);
        wantNumber = false;
      }
      else 
        displayField.setText(displayField.getText() + digit);
    }
  } 

  public static void main(String[] args) {        //  Method main of program
    new SwingCalculator(); 
  }
} 
