package ch15;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex_5 {
	private JFrame frame;
	private JTextField text;
	private JLabel label;
	
	public Ex_5() {
		frame = new JFrame("익명 내부 클래스 임시 객체 사용");
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
		label = new JLabel("호호호~~~");
		JButton b = new JButton("버튼");
		
		p.add(label);
		p.add(text);
		p.add(b);
		
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = text.getText();
				text.setText("");
				
				label.setText(name);
				
			}
			
		
		});
		
		return p;
	}
	
	
}