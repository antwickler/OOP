import java.awt.FlowLayout;
import java.awt.Scrollbar;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;

public class GuiComponents extends JFrame {		//	Notice class GuiComponents

	JButton button;								//	Button value
	JCheckBox box1, box2;						//	Box value
	JLabel label;								//	Label value
	JTextField text;							//	TextField value
	JTextArea textA, textA2;					//	TextArea value
	JScrollPane scroll;							//	ScrollPane value
	JComboBox combox;							//	ComboBox value
	JRadioButton radio1, radio2, radio3;		//	RadioButton value
	String[] combo = {"Yes", "No"};				//	String value
	
	public GuiComponents() {

	    button = new JButton("Button");				//	Create button "Button"
	    box1 =new JCheckBox();						//	Create check box
	    label = new JLabel("Label");				//	Create label "Label"
	    box2 =new JCheckBox();						//	Create check box
	    text = new JTextField("Text Field", 5);		//	Create textField "Text Field" width 5
	    textA = new JTextArea("Text Area", 5,20);	//	Create textArea "Text Area" high 5 width 20

	    //	Create textArea high 8 width 5
	    textA2 = new JTextArea("item 1"+"\nitem 2"+"\nitem 3"+"\nitem 4"+"\nitem 5"+"\nitem 6"+"\nitem 7"+"\nitem 8"+"\nitem 9"+"\nitem 10", 8,5);
	    scroll = new JScrollPane(textA2, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);	//	Set scrollbar vertical always
		scroll.setViewportView(textA2);	//	Set viewport view
		scroll.getVerticalScrollBar().setPreferredSize(new Dimension(15, 0));	//	Set scrollbar size
	    
	    combox = new JComboBox(combo);				//	Create combobox
	    radio1 = new JRadioButton("often");			//	Create radio button "often"
	    radio2 = new JRadioButton("sometimes");		//	Create radio button "sometimes"
	    radio3 = new JRadioButton("never");			//	Create radio button "never"

	    add(button);	//	add button
	    add(box1);		//	add box1
	    add(label);		//	add label
	    add(box2);		//	add box2
      	add(text);		//	add text
      	add(textA);		//	add textA
      	add(scroll);	//	add scroll
      	add(combox);	//	add combox
      	add(radio1);	//	add radio1
      	add(radio2);	//	add radio2
      	add(radio3);	//	add radio3

	    setTitle("GUI Components");						//	Set title
	    setSize(480,300);								//	Set size
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//	Set default close operation
	    getContentPane().setLayout(new FlowLayout());	//	Set layout
	    setVisible(true);								//	Set visible
	}

	public static void main(String[] args) {		//	Method main of program
		new GuiComponents();
	} 
}