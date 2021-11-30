package ch15;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ex_2_ActionEventHandler implements ActionListener {

	private JTextField text;
	private JLabel label;
	
	public Ex_2_ActionEventHandler(JTextField text, JLabel label) {
		this.text = text;
		this.label = label;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String name = text.getText();
		text.setText("");
		
		label.setText("Hello, " + name);
	}
	
}
