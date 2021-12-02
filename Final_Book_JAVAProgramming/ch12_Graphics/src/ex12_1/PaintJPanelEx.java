package ex12_1;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PaintJPanelEx {
	
	JFrame frame;
	
	public PaintJPanelEx() {
		frame = new JFrame("JPanel의 paint 예제");
		frame.setSize(250, 220);
		
		buildGUI();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	private void buildGUI() {
		Drawing d = new Drawing();
		frame.add(d);
	}
	
	private class Drawing extends JPanel{
		
		@Override
		public void paint(Graphics g) {
			g.setColor(Color.red);
			g.drawRect(10, 10, 50, 50);
			g.setColor(Color.blue);
			g.drawRect(50, 50, 50, 50);
			g.setColor(Color.yellow);
			g.drawRect(90, 90, 50, 50);
			
			//super.paint(g);
		}
	}
	
}
