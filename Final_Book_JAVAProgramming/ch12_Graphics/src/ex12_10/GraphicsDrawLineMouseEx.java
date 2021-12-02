package ex12_10;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class GraphicsDrawLineMouseEx extends JFrame {

	
	public GraphicsDrawLineMouseEx() {
		super("drawing Line by Mouse 예제");
		this.setSize(300, 300);
		
		buildGUI();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	private void buildGUI() {
		Drawing d = new Drawing();
		this.add(d);
	}
	
	class Drawing extends JComponent{
		
		Vector<Point> vStart = new Vector<Point>(); // 시작점
		Vector<Point> vEnd = new Vector<Point>(); // 끝점
		
		public Drawing() {
			this.addMouseListener(new MouseAdapter() {

				@Override
				public void mousePressed(MouseEvent e) {
					//super.mousePressed(e);
					Point p = e.getPoint();
					vStart.add(p);
				}

				@Override
				public void mouseReleased(MouseEvent e) {
					//super.mouseReleased(e);
					Point p = e.getPoint();
					vEnd.add(p);
					
					repaint();
				}
				
			});
		}
		
		@Override
		public void paint(Graphics g) {
			//super.paint(g);
			g.setColor(Color.blue);
			
			for(int i=0;i<vStart.size();i++) {
				Point s = vStart.elementAt(i);
				Point e = vEnd.elementAt(i);
				
				g.drawLine((int)s.getX(), (int)s.getY(), (int)e.getX(), (int)e.getY());
			}
			
			
		}
		
	}
}
