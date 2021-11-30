package ch15;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex_1 implements ActionListener {
	private JFrame frame;
	private JTextField text;
	private JLabel label;
	
	public Ex_1() {
		frame = new JFrame("현재 클래스에 이벤트 처리하기");
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
		label = new JLabel("호호호호~");
		JButton btn = new JButton("안녕!");
		
		p.add(text);
		p.add(label);
		p.add(btn);
		
		btn.addActionListener(this); // 클래스 내에 이벤트 핸들러 메서드가 존재
		
		return p;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String name = text.getText();
		text.setText("");
		
		label.setText("Hello, " + name);
		
	}
	
	
}	
