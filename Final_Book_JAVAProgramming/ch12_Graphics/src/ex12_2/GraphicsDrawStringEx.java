package ex12_2;

import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsDrawStringEx {
	private JFrame frame;
	
	public GraphicsDrawStringEx() {
		frame = new JFrame("drawString 사용 예제");
		frame.setSize(250,200);
		
		buildGUI();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	private void buildGUI() {
		Drawing d = new Drawing();
		frame.add(d);
	}
	
	private class Drawing extends JComponent{

		@Override
		public void paint(Graphics g) {
			g.drawString("자바는 재밌다.~~", 30, 30);
			g.drawString("얼마나? 하늘만큼 땅만큼 !!!", 60, 60);
			//super.paint(g);
		} //내부 클래스 외의 다른 방법도 있음.
		
	}
}
