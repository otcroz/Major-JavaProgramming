package ex10_5;

import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseAdapterEx {
	private JFrame frame;
	private JLabel label = new JLabel("안녕");
	
	public MouseAdapterEx() {
		frame = new JFrame("Mouse 이벤트 예제 - Adapter");
		frame.setBounds(100,100,250,250);
		
		buildGUI();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	private void buildGUI() {
		Panel panel = new Panel();
		
		label.setLocation(50, 20);
		label.setSize(20,30);
		panel.addMouseListener(new MyMouseListener());
		
		panel.add(label);
		frame.add(panel);
		
	}
	
	public class MyMouseListener extends MouseAdapter {

		@Override
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			label.setLocation(x, y);
			System.out.println(x + ", " + y);
		}
	}
}

