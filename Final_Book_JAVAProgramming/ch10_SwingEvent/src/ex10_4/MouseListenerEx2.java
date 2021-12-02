package ex10_4;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseListenerEx2 extends JFrame {
	
	private JLabel label;
	
	public MouseListenerEx2() {
		super("마우스 이벤트 연습");
		this.setBounds(30,30,250,250);
		
		buildGUI();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	private void buildGUI() {
		this.add(create());
	}
	
	private JPanel create() {
		JPanel p = new JPanel();
		p.setLayout(null);
		
		label = new JLabel("Hello");
		label.setBounds(50, 20, 30, 30);
		p.addMouseListener(new MyMouseListener());
		label.addMouseMotionListener(new MyMouseListener());
		p.add(label);
		
		return p;
	}
	
	class MyMouseListener extends MouseAdapter{

		@Override
		public void mouseClicked(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			label.setLocation(x, y);
			//super.mousePressed(e);
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			label.setLocation(x, y);
			//super.mouseDragged(e);
		}
		
		
	}
}
