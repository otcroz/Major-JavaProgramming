package ex11_9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaEx2 extends JFrame implements ActionListener {
	
	private JTextField text = new JTextField(20);
	private JTextArea area = new JTextArea(7,20);
	
	public TextAreaEx2() {
		super("텍스트 영역 만들기 예제");
		this.setSize(300,300);
		
		buildGUI();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	private void buildGUI() {
		this.add(createPanel());
	}
	
	private JPanel createPanel() {
		JPanel p = new JPanel();
		text.addActionListener(this);
		
		p.add(new JLabel("입력 후 <Enter> 키를 입력하세요."));
		p.add(text);
		p.add(area);
		
		return p;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JTextField t = (JTextField)e.getSource();
		area.append(t.getText() + "\n");
		text.setText("");
		
	}
	
	
}
