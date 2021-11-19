import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class RegMember3 {
	
	private JFrame frame;
	
	//텍스트필드
	private JTextField text;
	private JTextField text2;
	private JTextField text3;
	private JTextField text4;
	private JTextField text5;
	
	//라디오버튼
	private String[] sex = {"남", "여"};
	private JRadioButton[] btn = new JRadioButton[2];
	private String s="";
	
	//체크박스
	private String[] habit = {"영화", "음악감상", "사진", "운동"};
	private JCheckBox[] check = new JCheckBox[4];
	private String h="";
	private String printHabit = "";
	
	//자기소개 란
	private JTextArea area;
	
	
	public RegMember3() {
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
		
		ButtonGroup g = new ButtonGroup();
		for (int i = 0; i < 2; i++) {
			btn[i] = new JRadioButton(sex[i]);
			btn[i].addItemListener(handler1);
			g.add(btn[i]);
			panel.add(btn[i]);
		}
		
		// 텍스트 필드 <Enter> 입력 시 발생하는 이벤트 처리
		text.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField text = (JTextField)e.getSource();
				
				area.append("이름: " + text.getText() + "\n");
				text.setText("");
			}
			
		});
		
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
		
		// 텍스트 필드 <Enter> 입력 시 발생하는 이벤트 처리 - 주민등록번호
		text3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField text = (JTextField)e.getSource();
				area.append("주민등록번호: " + text2.getText() + " - ");
				area.append(text.getText() + "\n");
				
				text.setText("");
				text2.setText("");
			}
		});
		
		return panel;
	}

	private JPanel createInputPanel3() {
		JLabel label = new JLabel("주               소");
		text4 = new JTextField(22);

		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel.add(label);
		panel.add(text4);

		// 텍스트 필드 <Enter> 입력 시 발생하는 이벤트 처리 - 주소 
		text4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField text = (JTextField)e.getSource();
				area.append("주소: " + text.getText() + "\n");
				text.setText("");
			}
		});
		
		return panel;
	}

	private JPanel createInputPanel4() {
		JLabel label = new JLabel("부      서      명");
		text5 = new JTextField(8);

		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel.add(label);
		panel.add(text5);
		
		// 텍스트 필드 <Enter> 입력 시 발생하는 이벤트 처리 - 부서명
		text5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField text = (JTextField)e.getSource();
				area.append("부서명: " + text.getText() + "\n");
				text.setText("");
			}
		});

		return panel;
	}

	private JPanel createInputPanel5() {
		JLabel label = new JLabel("취               미");
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel.add(label);
		
		for(int i=0;i<check.length;i++) {
			check[i] = new JCheckBox(habit[i]);
			check[i].addItemListener(handler2);
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

		panel.add(createInputPanel6(), BorderLayout.CENTER);

		return panel;
	}
	
	//버튼 이벤트 처리
	//Item 리스너 구현 - 라디오버튼
	private ItemListener handler1 = new ItemListener() {
		String ss = "";
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED) { // 라디오 버튼이 선택된 경우
				if(e.getItem() == btn[0])
					ss = btn[0].getText();
				else
					ss = btn[1].getText();
				
				area.append("성별: " + ss + " " + "\n");
			}
		}
	};
	
	//Item 리스너 구현 - 체크박스
	private ItemListener handler2 = new ItemListener() {
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED) { // 체크박스가 선택된 경우
				if(e.getItem() == check[0])
					printHabit = check[0].getText() + " ";
				else if(e.getItem() == check[1])
					printHabit = check[1].getText() + " ";
				else if(e.getItem() == check[2])
					printHabit = check[2].getText() + " ";
				else if(e.getItem() == check[3])
					printHabit = check[3].getText() + " ";
				
			}
			//체크박스가 해제된 경우?
			area.append(printHabit + " ");
		}
	};

}
