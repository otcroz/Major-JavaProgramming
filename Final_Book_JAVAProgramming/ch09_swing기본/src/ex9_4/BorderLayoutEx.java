package ex9_4;

import java.awt.BorderLayout;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx {
	private JFrame frame;
	
	public BorderLayoutEx() {
		frame = new JFrame("BorderLayout Sample");
		frame.setBounds(100,200,300,300);
		
		buildGUI();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	private void buildGUI() {
		//setLayout() 메서드를 사용한 방법
		/*frame.setLayout(new BorderLayout(30,20));
		frame.add(new JButton("Calculate"), BorderLayout.CENTER);
		frame.add(new JButton("div"), BorderLayout.WEST);
		frame.add(new JButton("mul"), BorderLayout.EAST);
		frame.add(new JButton("add"), BorderLayout.NORTH);
		frame.add(new JButton("sub"), BorderLayout.SOUTH);*/
		
		//Panel을 사용한 방법
		Panel panel = new Panel(new BorderLayout(30,20));
		
		panel.add(new JButton("Calculate"), BorderLayout.CENTER);
		panel.add(new JButton("div"), BorderLayout.WEST);
		panel.add(new JButton("mul"), BorderLayout.EAST);
		panel.add(new JButton("add"), BorderLayout.NORTH);
		panel.add(new JButton("sub"), BorderLayout.SOUTH);
		
		frame.add(panel);
		
	}
}
