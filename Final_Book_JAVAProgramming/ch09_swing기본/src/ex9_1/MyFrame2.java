package ex9_1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyFrame2 {
	private JFrame frame;  //참조 변수 생성
	
	public MyFrame2() {
		frame = new JFrame("JFrame 생성자를 통한 300x300 프레임 생성하기");
		
		buildGUI();
		
		frame.setBounds(100,200,300,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //닫기 버튼을 누를 때 프로그램 종료
		frame.setVisible(true);
	}
	
	private void buildGUI() {
		JLabel name = new JLabel("이름");
		//JTextField text = new JTextField(10);
		
		frame.add(name);
		//frame.add(text);
	}
}
