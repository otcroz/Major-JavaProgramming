package ex9_5;

import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridLayoutEx {
	private JFrame frame;
	
	public GridLayoutEx() {
		frame = new JFrame("GirdLayout Sample");
		frame.setBounds(100,200,300,200);
		
		buildGUI();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	private void buildGUI() {
		//setLayout() 메서드로 설정
		/*frame.setLayout(new GridLayout(4,2));
		frame.add(new JLabel("이름"));
		frame.add(new JTextField(""));
		frame.add(new JLabel("학번"));
		frame.add(new JTextField(""));
		frame.add(new JLabel("학과"));
		frame.add(new JTextField(""));
		frame.add(new JLabel("과목"));
		frame.add(new JTextField(""));*/
		
		//Panel로 설정
		Panel panel = new Panel(new GridLayout(4,3));
		panel.add(new JLabel("이름"));
		panel.add(new JTextField(""));
		panel.add(new JLabel("학번"));
		panel.add(new JTextField(""));
		panel.add(new JLabel("학과"));
		panel.add(new JTextField(""));
		panel.add(new JLabel("과목"));
		panel.add(new JTextField(""));
		
		frame.add(panel);
	}
}
