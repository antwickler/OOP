import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class TemperatureConverter extends JFrame {

	int callCount = 0;						//	callCount value
	JTextField celsius = new JTextField();	//	celsius value
	JTextField fahren = new JTextField();	//	fahrenheit value

	DocumentListener dl = new DocumentListener() {				//	Set DocumentListener
		public void insertUpdate(DocumentEvent e) {Convert(e);}
		public void removeUpdate(DocumentEvent e) {}
		public void changedUpdate(DocumentEvent e) {}
	};

	public TemperatureConverter() {		//	Set JFrame

		setTitle("Temperature Converter");							//	Set title of JFrame
		setSize(330, 80);											//	Set size of JFrame
		setLayout(new GridLayout(2,2));								//	Set GridLayout
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);	//	Set default close operation

		JLabel l_celsius = new JLabel("Celsius:");					//	Label for "Celsius:"
		JLabel l_fahren = new JLabel("Fahrenheit:");				//	Label for "Fahrenheit:"
		
		Container cp = getContentPane();							//	Set ContentPane
		cp.add(l_celsius);											//	add label celsius
		cp.add(celsius);											//	add textField celsius
		cp.add(l_fahren);											//	add label fahren
		cp.add(fahren);												//	add textField fahren

		celsius.getDocument().putProperty("owner",(Object)celsius);	
		fahren.getDocument().putProperty("owner",(Object)fahren);
		celsius.getDocument().addDocumentListener(dl);
		fahren.getDocument().addDocumentListener(dl);
	}

	public void Convert(DocumentEvent de) {		//	Method for convert value

		JTextField txt = (JTextField)de.getDocument().getProperty("owner");

			try {
				if(txt.getText().equals("") == false && txt.getText() != null) {
				    float src = Float.parseFloat(txt.getText());
				    if(txt.equals(celsius)) {
				        CtoF(src);	//	Celsius to Fahrenheit
				    }
				    else if(txt.equals(fahren)) {
				        FtoC(src);	//	Fahrenheit to Celsius
				    }
				}
			} catch(Exception ex){}
	}

	public void CtoF(float c) {				//	Method for Celsius to Fahrenheit
		float f = (9 * c + 160) / 5f;		//	Formula convert Celsius to Fahrenheit
		fahren.setText(Float.toString(f));	//	Set value to f
	}

	public void FtoC(float f) {				//	Method for Fahrenheit to Celsius
		float c = (5* (f - 32)) / 9f;		//	Formula convert Fahrenheit to Celsius
		celsius.setText(Float.toString(c));	//	Set value to c
	}

	public static void main(String args[]) {	//	Method main of program
		new TemperatureConverter().setVisible(true);
	}
}