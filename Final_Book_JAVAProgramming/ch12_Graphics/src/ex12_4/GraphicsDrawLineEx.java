package ex12_4;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class GraphicsDrawLineEx extends JFrame {
	
	public GraphicsDrawLineEx() {
		super("drawLine 사용 예제");
		this.setSize(200,170);
		
		buildGUI();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	private void buildGUI() {
		Drawing d = new Drawing();
		this.add(d);
	}
	
	private class Drawing extends JComponent {

		@Override
		public void paint(Graphics g) {
			//super.paint(g);
			g.setColor(Color.red);
			g.drawLine(20, 20, 100, 100);
			
		}
		
	}
}
