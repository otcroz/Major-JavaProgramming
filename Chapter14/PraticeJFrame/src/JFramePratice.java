import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JFramePratice {
	private JFrame frame;
	
	public JFramePratice() {
		frame = new JFrame("사원 등록");
		
		buildGUI(); // 프레임 구성
		
		frame.setSize(350, 420);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	private void buildGUI() {
		frame.add(createGridLayoutPanel(), BorderLayout.NORTH);
		frame.add(createBorderLayoutPanel(),BorderLayout.CENTER);
	}
	//레이블과 입력칸 배치(왼쪽정렬)(flow)
	private JPanel createInputPanel1() {
		JLabel label = new JLabel("성               명");
		JTextField text = new JTextField(8);
		JLabel label2 = new JLabel("성         별");
		JTextField text2 = new JTextField(3);
		
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel.add(label);
		panel.add(text);
		panel.add(label2);
		panel.add(text2);
		
		return panel;
	}
	
	private JPanel createInputPanel2() {
		JLabel label = new JLabel("주민등록번호");
		JTextField text = new JTextField(6);
		JLabel label2 = new JLabel(" - ");
		JTextField text2 = new JTextField(7);
		
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel.add(label);
		panel.add(text);
		panel.add(label2);
		panel.add(text2);
		
		return panel;
	}
	
	private JPanel createInputPanel3() {
		JLabel label = new JLabel("주               소");
		JTextField text = new JTextField(22);
		
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel.add(label);
		panel.add(text);
		
		return panel;
	}
	
	private JPanel createInputPanel4() {
		JLabel label = new JLabel("부      서      명");
		JTextField text = new JTextField(8);
		
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel.add(label);
		panel.add(text);
		
		return panel;
	}
	
	private JPanel createInputPanel5() {
		JLabel label = new JLabel("취               미");
		JTextField text = new JTextField(22);
		
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel.add(label);
		panel.add(text);
		
		return panel;
	}
	
	private JPanel createInputPanel6() { //자기소개 입력칸
		JLabel label = new JLabel("자   기   소   개");
		JTextField text = new JTextField(22);
		
		JPanel panel = new JPanel(new BorderLayout());
		panel.add(label, BorderLayout.NORTH);
		panel.add(text, BorderLayout.CENTER);
		
		return panel;
	}
	private JPanel createButtonPanel() {
		JButton btn1 = new JButton("저장");
		JButton btn2 = new JButton("종료");
		
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel.add(btn1);
		panel.add(btn2);
		
		return panel;
	}
	
	//묶어준 레이블과 입력칸 배치(grid)
	private JPanel createGridLayoutPanel() {
		JPanel panel = new JPanel(new GridLayout(5,0));
		panel.add(createInputPanel1());
		panel.add(createInputPanel2());
		panel.add(createInputPanel3());
		panel.add(createInputPanel4());
		panel.add(createInputPanel5());
		
		return panel;
	}
	
	private JPanel createBorderLayoutPanel() {
		JPanel panel = new JPanel(new BorderLayout());
		
		panel.add(createButtonPanel(), BorderLayout.SOUTH);
		panel.add(createInputPanel6(), BorderLayout.CENTER);
		
		return panel;
	}
	
	
	//자기소개 수직적 배치(border)
	
	//저장, 종료 버튼 배치(flow)(center)
	
	//자기소개 칸과 버튼 칸 배치(border)
	
	//전체 묶어주기(border)
}
