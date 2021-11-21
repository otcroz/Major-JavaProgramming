package ex11_8;

import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TestFieldEx {
	private JFrame frame;
	
	public TestFieldEx() {
		frame = new JFrame("텍스트필드 만들기 예제");
		frame.setSize(300,150);
		
		buildGUI();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	private void buildGUI() {
		Panel panel = new Panel();
		
		panel.add(createPanel1());
		panel.add(createPanel2());
		panel.add(createPanel3());
		
		frame.add(panel);
	}
	
	private Panel createPanel1() {
		Panel panel = new Panel();
		JLabel label = new JLabel("이름");
		JTextField field = new JTextField(20);
		
		panel.add(label);
		panel.add(field);
		
		return panel;
	}
	
	private Panel createPanel2() {
		Panel panel = new Panel();
		JLabel label = new JLabel("학과");
		JTextField field = new JTextField("컴퓨터공학과",20);
		
		panel.add(label);
		panel.add(field);
		
		return panel;
	}
	
	private Panel createPanel3() {
		Panel panel = new Panel();
		JLabel label = new JLabel("주소");
		JTextField field = new JTextField("서울시..",20);
		
		panel.add(label);
		panel.add(field);
		
		return panel;
	}
}
