package ex9_2;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonEx {
	private JFrame frame;
	
	public ButtonEx() {
		frame = new JFrame("ContestPane과 JFrame");
		frame.setBounds(100,200,300,300);
		
		buildGUI();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	private void buildGUI() {
		//contentPane 사용하여 코드 작성
		/*Container contentPane = frame.getContentPane(); 
		contentPane.setBackground(Color.orange);
		contentPane.setLayout(new FlowLayout()); //FlowLayout 설정
		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));*/
		
		frame.setBackground(Color.orange); // 색깔은 contentPane값을 얻어와서 설정해줘야함.
		frame.setLayout(new FlowLayout());
		frame.add(new JButton("OK"));
		frame.add(new JButton("Cancel"));
		frame.add(new JButton("Ignore"));
	}
}
