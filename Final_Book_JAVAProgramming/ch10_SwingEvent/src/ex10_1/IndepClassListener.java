package ex10_1;

import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class IndepClassListener {
	private JFrame frame;
	
	public IndepClassListener() {
		frame = new JFrame("Action 이벤트 리스너 예제");
		frame.setBounds(100,200,350,150);
		
		buildGUI();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	private void buildGUI() {
		Panel panel = new Panel(new FlowLayout());
		JButton b = new JButton("Action");
		b.addActionListener(new MyActionListener()); //리스너 달기
		panel.add(b);
		frame.add(panel);
	}
}

class MyActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();
		if(btn.getText().equals("Action"))
			btn.setText("액션");
		else
			btn.setText("Action");
	}
	
}
