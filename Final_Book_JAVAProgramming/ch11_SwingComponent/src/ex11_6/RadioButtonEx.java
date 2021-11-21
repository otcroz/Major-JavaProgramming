package ex11_6;

import java.awt.Panel;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButtonEx {
	private JFrame frame;
	
	private String[] s = {"사과", "배", "체리"};
	private JRadioButton[] btn = new JRadioButton[3]; 
	
	public RadioButtonEx() {
		frame = new JFrame("라디오버튼 만들기 예제");
		frame.setSize(250,150);
		
		buildGUI();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	private void buildGUI() {
		Panel panel = new Panel();
		ButtonGroup g = new ButtonGroup();
		for(int i=0;i<s.length;i++) {
			btn[i] = new JRadioButton(s[i]);
			g.add(btn[i]);
			panel.add(btn[i]);
		}
		frame.add(panel);
	}
}
