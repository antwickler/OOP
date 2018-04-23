import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingCounter extends JFrame implements ActionListener {

   JLabel label;        // Label value
   JTextField text;     // TextField value
   JButton button;      // Button value
   int count;           // Counts the number of clicks

   public SwingCounter() {

      // Set JFrame display
      this.setTitle("Swing Counter");                          // Set title of JFrame
      count = 0;                                               // Set count value default is 0
      label = new JLabel("Counter");                           // Create label is "Counter"
      text = new JTextField("0", 10);                          // Create textField default is 0 and width is 10
      button = new JButton("Count");                           // Create button is "Count"
      button.addActionListener(this);                          // Set action button
      this.add(label);                                         // add label in JFrame
      this.add(text);                                          // add textField in JFrame
      this.add(button);                                        // add button in JFrame
      this.setLocation(500, 500);                              // Set location default when run program
      this.setSize(280, 90);                                   // Set size of JFrame
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     // Set default close operation
      this.getContentPane().setLayout(new FlowLayout());       // Set layout
      this.setVisible(true);                                   // Set visible
   }
 
   public void actionPerformed(ActionEvent ae) {               // Method count when click button
      if (ae.getSource() == button) {
         count++;
         text.setText(String.valueOf(count));
         this.repaint();
      } 
   }
    
   public static void main(String[] args) {                    // Method main of program
      new SwingCounter();
   }
}