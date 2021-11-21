package ex10_3;

import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AnonymousClassListener {
	private JFrame frame;

	public AnonymousClassListener() {
		frame = new JFrame("Action 이벤트 작성 - 익명 클래스");
		frame.setBounds(100, 100, 350, 150);
		
		buildGUI();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	private void buildGUI() {
		Panel panel = new Panel(); // 기본 배치 관리자: FlowLayout
		JButton b = new JButton("Action");
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton)e.getSource();
				if(btn.getText().equals("Action"))
					btn.setText("액션");
				else
					btn.setText("Action");
				
				frame.setTitle(btn.getText());
			}
			
		});
		panel.add(b);
		frame.add(panel);
		
	}
}
