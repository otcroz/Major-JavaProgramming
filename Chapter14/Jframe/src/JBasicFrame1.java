import javax.swing.JFrame;

public class JBasicFrame1 {
	private JFrame frame;
	
	public JBasicFrame1() {
		frame = new JFrame("Frame Test1");
		//frame.setTitle("Frame Test1");
		
		//������ ����
		buildGUI();
		
		//frame.setSize(200, 300); //������ ũ��
		//frame.setLocation(100, 200); //������ ��ġ
		frame.setBounds(100, 200, 200, 300); //������ ��ġ, ũ��
	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �ݱ� ��ư�� ���� �� ���α׷� ����
		frame.setVisible(true);
	}
	private void buildGUI() {
		//...
	}
}
