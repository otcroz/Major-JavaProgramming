package ch15;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex_2 {
	private JFrame frame;
	private JTextField text;
	private JLabel label;
	
	public Ex_2() {
		frame = new JFrame("일반 클래스를 따로 만들어서 이벤트 처리하기");
		frame.setBounds(0,0,300,300);
		
		buildGUI();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	private void buildGUI() {
		frame.add(create());
	}
	
	private JPanel create() {
		JPanel p = new JPanel();
		text = new JTextField(10);
		label = new JLabel("호호호호~~~");
		JButton b = new JButton("버튼");
		
		p.add(label);
		p.add(text);
		p.add(b);
		
		b.addActionListener(new Ex_2_ActionEventHandler(text, label));
		
		return p;
		
	}
}
