import javax.swing.JFrame;

public class JBasicFrame2 extends JFrame {

	public JBasicFrame2() {
		super("Frame Test1"); // 부모클래스 명시적 생성자 호출
		
		//프레임 구성
		buildGUI();
		
		this.setBounds(100, 200, 200, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private void buildGUI() {
		//...
	}
}
