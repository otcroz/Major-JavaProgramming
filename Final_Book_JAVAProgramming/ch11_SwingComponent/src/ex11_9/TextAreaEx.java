package ex11_9;

import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
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
		JLabel label = new JLabel("입력 후 <Enter>을 입력하세요");
		JTextField field = new JTextField(20);
		JTextArea area = new JTextArea(7,20);
		
		field.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				area.append(t.getText() + "\n");
				
				t.setText("");
			}
			
		});
		panel.add(label);
		panel.add(field);
		panel.add(area);
		
		frame.add(panel);
	}
}
