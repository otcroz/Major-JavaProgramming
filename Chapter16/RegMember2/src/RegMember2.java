import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class RegMember2 {
	
	private JFrame frame;
	
	//텍스트필드
	private JTextField text;
	private JTextField text2;
	private JTextField text3;
	private JTextField text4;
	private JTextField text5;
	
	//라디오버튼
	private JRadioButton[] btn = new JRadioButton[2];
	String s="";
	
	//체크박스
	String[] habit = {"영화", "음악감상", "사진", "운동"};
	private JCheckBox[] check = new JCheckBox[4];
	String h="";
	
	//자기소개 란
	private JTextArea area;
	
	
	public RegMember2() {
		frame = new JFrame("사원 등록");

		buildGUI(); // 프레임 구성

		frame.setSize(350, 420);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	private void buildGUI() {
		frame.add(createGridLayoutPanel(), BorderLayout.NORTH);
		frame.add(createBorderLayoutPanel(), BorderLayout.CENTER);
	}

	// 레이블과 입력칸 배치(왼쪽정렬)(flow)
	private JPanel createInputPanel1() {
		JLabel label = new JLabel("성               명");
		text = new JTextField(8);
		JLabel label2 = new JLabel("성         별");
		
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel.add(label);
		panel.add(text);
		panel.add(label2);
		
		// 라디오 버튼(나중에 메서드 따로 생성)
		String[] s = {"남", "여"};
		
		ButtonGroup g = new ButtonGroup();
		for (int i = 0; i < 2; i++) {
			btn[i] = new JRadioButton(s[i]);
			g.add(btn[i]);
			panel.add(btn[i]);
		}

		return panel;
	}

	private JPanel createInputPanel2() {
		JLabel label = new JLabel("주민등록번호");
		text2 = new JTextField(6);
		JLabel label2 = new JLabel(" - ");
		text3 = new JTextField(7);

		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel.add(label);
		panel.add(text2);
		panel.add(label2);
		panel.add(text3);

		return panel;
	}

	private JPanel createInputPanel3() {
		JLabel label = new JLabel("주               소");
		text4 = new JTextField(22);

		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel.add(label);
		panel.add(text4);

		return panel;
	}

	private JPanel createInputPanel4() {
		JLabel label = new JLabel("부      서      명");
		text5 = new JTextField(8);

		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel.add(label);
		panel.add(text5);

		return panel;
	}

	private JPanel createInputPanel5() {
		JLabel label = new JLabel("취               미");
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel.add(label);
		
		for(int i=0;i<check.length;i++) {
			check[i] = new JCheckBox(habit[i]);
			panel.add(check[i]);
		}

		return panel;
	}

	private JPanel createInputPanel6() { // 자기소개 입력칸
		JLabel label = new JLabel("자   기   소   개");
		area = new JTextArea();

		JPanel panel = new JPanel(new BorderLayout());
		panel.add(label, BorderLayout.NORTH);
		panel.add(new JScrollPane(area), BorderLayout.CENTER);

		return panel;
	}

	private JPanel createButtonPanel() {
		JButton btn1 = new JButton("저장");
		JButton btn2 = new JButton("종료");
		
		//버튼 이벤트 발생
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//라디오버튼 선택여부
				if(btn[0].isSelected())
					s="남";
				else
					s="여";
						
				//체크박스 선택여부
				if(check[0].isSelected())
					h += "영화 ";
				if(check[1].isSelected())
					h += "음악감상 ";
				if(check[2].isSelected())
					h += "사진 ";
				if(check[3].isSelected())
					h += "운동 ";
				
				// 자기소개란 초기화(작성한 새로운 자기소개란 업로드)
				if(area.getText() != null) {
					area.setText("");
				}
				
				area.append("이름: " + text.getText() + "\n");
				area.append("성별: " + s + "\n");
				area.append("주민등록번호: " + text2.getText() + " - " + text3.getText() + "\n");
				area.append("주소: " + text4.getText() + "\n");
				area.append("부서명: " + text5.getText() + "\n");
				area.append("취미: " + h + "\n");
				
				text.setText("");
				text2.setText("");
				text3.setText("");
				text4.setText("");
				text5.setText("");
				// 버튼과 체크박스를 초기화하는 방법?
			}
			
		});
		
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		});

		JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel.add(btn1);
		panel.add(btn2);

		return panel;
	}

	// 묶어준 레이블과 입력칸 배치(grid)
	private JPanel createGridLayoutPanel() {
		JPanel panel = new JPanel(new GridLayout(5, 0));
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
}
