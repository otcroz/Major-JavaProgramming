package ex11_9;

import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaEx {
	private JFrame frame;
	
	public TextAreaEx() {
		frame = new JFrame("텍스트영역 만들기 예제");
		frame.setSize(300,300);
		
		buildGUI();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	private void buildGUI() {
		Panel panel = new Panel();
		JTextField field = new JTextField(20);
		JTextArea area = new JTextArea(7,20);
		
		
		panel.add(field);
		panel.add(area);
		
		
	}
}
