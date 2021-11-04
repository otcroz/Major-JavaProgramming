import javax.swing.JFrame;

public class JBasicFrame1 {
	private JFrame frame;
	
	public JBasicFrame1() {
		frame = new JFrame("Frame Test1");
		//frame.setTitle("Frame Test1");
		
		//프레임 구성
		buildGUI();
		
		//frame.setSize(200, 300); //윈도우 크기
		//frame.setLocation(100, 200); //윈도우 위치
		frame.setBounds(100, 200, 200, 300); //윈도우 위치, 크기
	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기 버튼을 누를 때 프로그램 종료
		frame.setVisible(true);
	}
	private void buildGUI() {
		//...
	}
}
