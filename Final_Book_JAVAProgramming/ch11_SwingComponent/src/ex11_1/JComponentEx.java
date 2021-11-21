package ex11_1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JComponentEx {
	private JFrame frame;
	
	public JComponentEx() {
		frame = new JFrame("JComponent 공통...");
		frame.setSize(260,200);
		
		buildGUI();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	private void buildGUI() {
		Panel panel = new Panel();
		JButton b1 = new JButton("Magenta/Yellow Button");
		JButton b2 = new JButton("Disable Button");
		JButton b3 = new JButton("getX(), getY()");
		
		b1.setBackground(Color.yellow);
		b1.setForeground(Color.magenta);
		b1.setFont(new Font("Arial", Font.ITALIC, 20));
		b2.setEnabled(false); // 버튼 비활성화
		b3.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				frame.setTitle(b.getX() + " + " + b.getY());
				
			}
			
		});
		
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		frame.add(panel);
	}
}
