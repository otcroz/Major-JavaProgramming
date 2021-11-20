package ex9_3;

import java.awt.FlowLayout;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx {
	private JFrame frame;
	
	public FlowLayoutEx() {
		frame = new JFrame("FlowLayout Sample");
		frame.setBounds(100,200,300,300);
		
		buildGUI();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	private void buildGUI() {
		//setLayout() 메서드 사용
		/*frame.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		frame.add(new JButton("add"));
		frame.add(new JButton("sub"));
		frame.add(new JButton("mul"));
		frame.add(new JButton("div"));
		frame.add(new JButton("Calculate"));*/
		
		//Panel 사용
		Panel panel = new Panel(new FlowLayout(FlowLayout.LEFT,30,40));
		panel.add(new JButton("add"));
		panel.add(new JButton("sub"));
		panel.add(new JButton("mul"));
		panel.add(new JButton("div"));
		panel.add(new JButton("Calculate"));
		
		frame.add(panel);
	}
}
